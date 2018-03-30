package okkpp.service.propagate;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import okkpp.dao.propagate.TableCatalogDataMapper;
import okkpp.dao.propagate.TableCatalogMapper;
import okkpp.dao.propagate.TableDataMapper;
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
	
	public void saveData(int catalogId,Map<String, Object> data) {
		TableData tableData = new TableData();
		tableData.setJson(new Gson().toJson(data));
		dataMapper.insertReturnId(tableData);
		TableCatalogData tableCatalogData = new TableCatalogData();
		tableCatalogData.setCatalogId(catalogId);
		tableCatalogData.setDataId(tableData.getId());
		CatalogDataMapper.insert(tableCatalogData);
	}
}
