package okkpp.junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import okkpp.base.BaseTest;
import okkpp.dao.propagate.TableDataMapper;
import okkpp.dao.propagate.TableInfoMapper;
import okkpp.model.propagate.TableData;
import okkpp.model.propagate.TableInfo;
import okkpp.utils.ExcelUtil;
import okkpp.utils.FTPUtil;


/**
* @author duck
* @date 鍒涘缓鏃堕棿锛�2018骞�3鏈�28鏃� 涓婂崍9:26:16
*/
public class JunitTest extends BaseTest{

	@Test
	public void loadData() {
		String path = "B:\\11";
		readFiles(path);
		System.out.println("over");
	}
	public void readFiles(String path) {
		File root = new File(path);
		for(File f : root.listFiles()) {
			if(f.isDirectory()) {
				readFiles(f.getPath());
			}else {
				String tabName = f.getName().substring(0, f.getName().indexOf("."));
				String cn = f.getParent().substring(f.getParent().lastIndexOf("\\")+1);
				resolveFile(f,tabName,cn);
			}
		}
	}
	@Autowired
	TableInfoMapper timapper;
	@Autowired
	TableDataMapper tdmapper;
	public void resolveFile(File file,String tabName,String cn) {
		System.out.println("table name = "+tabName+" - cn = "+cn);
		ExcelUtil eu = new ExcelUtil();
		try {
			eu.xls(file, 0, 3);
			TableInfo ti = new TableInfo(tabName, eu.info);
			ti.setCatalogCn(cn);
			ti.setCatalogEn("-");
			ti.setSource("涓栫晫鍙戝睍鎸囨爣");
			ti.setUpdated(new Date());
			timapper.insertReturnId(ti);
			int infoid = ti.getId();
			System.out.println("鑾峰緱id="+infoid);
			int count = 0;
			for(Map<String, Object> data : eu.data) {
				TableData td = new TableData(infoid, data);
				td.setUpdated(new Date());
				tdmapper.insertReturnId(td);
				count++;
			}
			System.out.println("鎻掑叆"+count+"鏉℃暟鎹�");
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
	
	public void test() throws FileNotFoundException {
		File f = new File("E:\\1.png");
		FileInputStream file = new FileInputStream(f);
		FTPUtil ftp = new FTPUtil();
		ftp.SFTPUpload(HOST, PORT, UserName, PassWord, BASE_PATH, file, "test1.png");
	}


}
