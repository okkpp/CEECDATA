package okkpp.service.propagate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.propagate.TableCatalogMapper;
import okkpp.model.propagate.TableCatalog;

/**
* @author duck
* @date ����ʱ�䣺2018��3��28�� ����10:23:14
*/
@Service
@Transactional
public class TableCatalogService {

	@Autowired
	TableCatalogMapper mapper;
	
	public int saveCatalogReturnId(TableCatalog tableCatalog) {
		return mapper.insertReturnId(tableCatalog);
	}
}