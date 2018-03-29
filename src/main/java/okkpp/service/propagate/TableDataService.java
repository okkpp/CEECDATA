package okkpp.service.propagate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.propagate.TableCatalogDataMapper;
import okkpp.dao.propagate.TableCatalogMapper;
import okkpp.dao.propagate.TableDataMapper;
import okkpp.model.propagate.PropagateObject;
import okkpp.model.propagate.TableCatalog;
import okkpp.model.propagate.TableCatalogData;
import okkpp.model.propagate.TableData;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午10:26:08
*/
@Service
@Transactional
public class TableDataService {

	@Autowired
	TableDataMapper dataMapper;
	@Autowired
	TableCatalogMapper catalogMapper;
	@Autowired
	TableCatalogDataMapper CatalogDataMapper;
	
	public void saveData(TableCatalog tableCatalog,PropagateObject data) {
		TableData tableData = new TableData();
		tableData.setJson(data.toJson());
		dataMapper.insertReturnId(tableData);
		TableCatalogData tableCatalogData = new TableCatalogData();
		tableCatalogData.setCatalogId(tableCatalog.getId());
		tableCatalogData.setDataId(tableData.getId());
		CatalogDataMapper.insert(tableCatalogData);
	}
}
