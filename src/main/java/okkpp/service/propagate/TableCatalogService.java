package okkpp.service.propagate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.base.service.BaseService;
import okkpp.dao.propagate.TableCatalogMapper;
import okkpp.model.propagate.TableCatalog;

/**
* @author duck
* @date ����ʱ�䣺2018��3��28�� ����10:23:14
*/
@Service
@Transactional
public class TableCatalogService extends BaseService<TableCatalog>{

	@Autowired
	TableCatalogMapper mapper;
	
	public List<TableCatalog> list(){
		
		return mapper.selectAll();
	}
	public int saveCatalogReturnId(TableCatalog tableCatalog) {
		return mapper.insertReturnId(tableCatalog);
	}
}
