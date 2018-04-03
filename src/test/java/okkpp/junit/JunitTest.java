package okkpp.junit;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import okkpp.base.BaseTest;
import okkpp.model.propagate.TableData;
import okkpp.service.propagate.TableDataService;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午9:26:16
*/
public class JunitTest extends BaseTest{
	
//	@Autowired
//	TableDataService service;
	@Test
	public void test() {
		String fileName = "file.xml";
		String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
		File file = new File("/upload/"
				+new SimpleDateFormat("yyyyMMddHHmmss").format(System.currentTimeMillis())
				+"."+suffix);
		file.mkdirs();
		
		System.out.println("file path :"+file.getPath());
		System.out.println(suffix);
	}
}
