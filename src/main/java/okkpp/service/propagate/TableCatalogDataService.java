package okkpp.service.propagate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.base.service.BaseService;
import okkpp.dao.propagate.TableCatalogDataMapper;
import okkpp.model.propagate.TableCatalogData;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午10:25:29
*/
@Service
@Transactional
public class TableCatalogDataService extends BaseService<TableCatalogData>{

	@Autowired
	TableCatalogDataMapper mapper;
}
