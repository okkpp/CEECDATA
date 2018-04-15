package okkpp.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mysql.jdbc.Field;

import okkpp.base.BaseTest;
import okkpp.model.propagate.TableData;
import okkpp.model.propagate.TableInfo;
import okkpp.service.propagate.TableDataService;
import okkpp.service.propagate.TableInfoService;
import okkpp.utils.Catalog;
import okkpp.utils.FTPUtil;
import okkpp.utils.SpiderUtil;


/**
* @author duck
* @date 创建时间：2018年3月28日 上午9:26:16
*/
public class JunitTest extends BaseTest{

	@Autowired
	TableInfoService tableInfoService;
	@Autowired
	TableDataService tableDataService;
	
	public void updateInfo() {
		List<TableInfo> infoList = tableInfoService.list();
		for(TableInfo ti : infoList) {
			int catalogId = ti.getId();
			Map<String, String> infoMap = new Gson().fromJson(ti.getFields(), new TypeToken<Map<String, String>>() {}.getType());
			List<TableData> dataList = tableDataService.list(catalogId);
			for(TableData td : dataList) {
				Map<String, String> dataMap = new Gson().fromJson(td.getData(), new TypeToken<Map<String, String>>() {}.getType());
				for(String key : infoMap.keySet()) {
					dataMap.put(key, dataMap.get(infoMap.get(key)));
					dataMap.remove(infoMap.get(key));
				}
				td.setData(new Gson().toJson(dataMap));
				tableDataService.update(td);
			}
			System.out.println("已修复一张表单："+catalogId);
			System.out.println("共有"+dataList.size()+"条数据。");
		}
		System.out.println("修复完毕！");
	}
	
	@Value(value = "${ftp.HOST}")
	private String HOST;
	@Value(value = "${ftp.PORT}")
	private int PORT;
	@Value(value = "${ftp.UserName}")
	private String UserName;
	@Value(value = "${ftp.PassWord}")
	private String PassWord;
	@Value(value = "${ftp.BASE_PATH}")
	private String BASE_PATH;
	
	@Test
	public void test() throws FileNotFoundException {
		File f = new File("E:\\5.png");
		FileInputStream file = new FileInputStream(f);
		FTPUtil ftp = new FTPUtil();
		ftp.SFTPUpload(HOST, PORT, UserName, PassWord, BASE_PATH, file, "5.png");
	}

	@Autowired
	SpiderUtil su;
	
	public void resolveData() throws InterruptedException {
		try {
			//跳过已有目录
			int skip = 20;
			List<Catalog> list = su.getCatalog();
			int i = 0;
			for(Catalog c : list) {
				if(i<skip) {
					i++;
					continue;
				}
				su.resolveCatalog(c);
				new Thread().sleep(3000);
			}
			System.out.println("运行结束！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
