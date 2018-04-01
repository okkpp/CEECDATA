package okkpp.junit;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import okkpp.base.BaseTest;
import okkpp.model.propagate.PropagateObject;
import okkpp.model.propagate.TableCatalog;
import okkpp.service.propagate.TableCatalogService;
import okkpp.service.propagate.TableDataService;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午9:26:16
*/
public class JunitTest extends BaseTest{

	@Autowired
	TableCatalogService tableCatalogService;
	@Autowired
	TableDataService tableDataService;
	
	@Test
	public void test() {
//		TableCatalog tableCatalog = new TableCatalog();
//		tableCatalog.setCatalog("[{id},{country},{yeay},{health_total}]");
//		tableCatalogService.saveCatalogReturnId(tableCatalog);
//		System.out.println("returned tableCatalogId : "+tableCatalog.getId());
//		PropagateObject propagateObject = new PropagateObject();
//		propagateObject.setCountry("asny");
//		propagateObject.setSort(1);
//		propagateObject.setUpdated(new Date());
//		propagateObject.setDataByKey("health_total", "6.24878186");
//		tableDataService.saveData(tableCatalog, propagateObject);
		
	}
}
