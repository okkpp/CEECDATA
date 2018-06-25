package okkpp.utils;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import okkpp.model.propagate.TableInfo;

public class ReadFileSystemUtil {

	public static void main(String[] args) {
		String path = "B:\\11";
		readFiles(path);
	}

	public static void readFiles(String path) {
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
	public static void resolveFile(File file,String tabName,String cn) {
		System.out.println("table name = "+tabName+"- cn = "+cn);
		ExcelUtil eu = new ExcelUtil();
		try {
			eu.xls(file, 0, 3);
			TableInfo ti = new TableInfo(tabName, eu.info);
			System.out.println(ti.getFields());
//			for(Map<String, Object> data : eu.data) {
//				TableData td = new TableData(-1, data);
//				System.out.println(td.getData());
//			}
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
