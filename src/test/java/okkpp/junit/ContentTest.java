package okkpp.junit;
/**
* @author duck
* @date ����ʱ�䣺2018��3��28�� ����9:26:16
*/

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import okkpp.base.BaseTest;
import okkpp.service.ContentService;

public class ContentTest extends BaseTest{

	@Autowired
	ContentService service;
	
	@Test
	public void test() {
		Map<String, List<String>> map = service.showTables();
	}
}
