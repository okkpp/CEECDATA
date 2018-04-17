package okkpp.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
//		List<TableInfo> infoList = tableInfoService.list();
//		for(TableInfo ti : infoList) {
//			if(!check(ti.getTableName())) {
//				continue;
//			}
//			int catalogId = ti.getId();
//			Map<String, String> infoMap = new Gson().fromJson(ti.getFields(), new TypeToken<Map<String, String>>() {}.getType());
//			List<TableData> dataList = tableDataService.list(catalogId);
//			for(TableData td : dataList) {
//				Map<String, String> dataMap = new Gson().fromJson(td.getData(), new TypeToken<Map<String, String>>() {}.getType());
//				for(String key : infoMap.keySet()) {
//					dataMap.put(key, dataMap.get(infoMap.get(key)));
//					dataMap.remove(infoMap.get(key));
//				}
//				td.setData(new Gson().toJson(dataMap));
//				tableDataService.update(td);
//			}
//			System.out.println("已修复一张表单："+catalogId);
//			System.out.println("共有"+dataList.size()+"条数据。");
//		}
//		System.out.println("修复完毕！");
	}
	public boolean check(String tabName) {
		switch(tabName) {
		case "Completeness of death registration with cause-of-death information (%)":
		case "出生时的预期寿命，男性（岁）":
		case "Cause of death, by non-communicable diseases (% of total)":
		case "Specialist surgical workforce (per 100,000 population)":
		case "死亡率，五岁以下儿童（每千例活产儿）":
		case "DPT 免疫接种率（占 12 - 23 个月年龄组的百分比）":return false;//return true;
		default : return false;
		}
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
//		File f = new File("B:\\duck.png");
//		FileInputStream file = new FileInputStream(f);
//		FTPUtil ftp = new FTPUtil();
//		ftp.SFTPUpload(HOST, PORT, UserName, PassWord, BASE_PATH, file, "duck.png");
	}

	@Autowired
	SpiderUtil su;
	
	public void resolveData() throws InterruptedException {
//		String path = "B:\\resolve\\";
//		String[] files = {"Completeness of death registration with cause-of-death information (%)",
//				"出生时的预期寿命，男性（岁）",
//				"Cause of death, by non-communicable diseases (% of total)",
//				"Specialist surgical workforce (per 100,000 population)",
//				"死亡率，五岁以下儿童（每千例活产儿）",
//				"DPT 免疫接种率（占 12 - 23 个月年龄组的百分比）"};
//		ExcelUtil eu = new ExcelUtil();
//		int id = 8;
//		try {
//			for(String name : files) {
//				System.out.println("正在检查："+id+"/tableName="+name);
//				File f = new File(path+name+".xls");
//				if(f.exists()) {
//					eu.xls(f);
//					tableInfoService.resolveData415(id, eu.data);
//				}else {
//					System.out.println("未找到文件！");
//				}
//				id++;
//			}
//			System.out.println("修复结束！");
//		} catch (InvalidFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		/**
		 * 分界
		 */
		
//		try {
//			//跳过已有目录
//			int skip = 13;
//			List<Catalog> list = su.getCatalog();
//			int i = 0;
//			int t = 0;
//			for(Catalog c : list) {
//				if(i<skip) {
//					i++;
//					continue;
//				}
//				t+=su.resolveCatalog(c);
//				//new Thread().sleep(3000);
//			}
//			System.out.println("运行结束！");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
