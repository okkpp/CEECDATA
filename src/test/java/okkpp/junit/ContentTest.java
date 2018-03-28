package okkpp.junit;
/**
* @author duck
* @date 创建时间：2018年3月28日 上午9:26:16
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
