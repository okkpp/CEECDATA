package okkpp.junit;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import okkpp.base.BaseTest;
import okkpp.service.propagate.TableDataService;
import okkpp.service.propagate.TableInfoService;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午9:26:16
*/
public class JunitTest extends BaseTest{
	
	@Autowired
	TableDataService service;
	@Test
	public void test() {
		Map<String, Object> data = new HashMap<>();
		data.put("1", "f1");
		data.put("2", "f2");
		
		service.saveData(0, data);
	}
}
