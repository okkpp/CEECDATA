package okkpp.service.propagate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.propagate.TableCatalogMapper;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午10:23:14
*/
@Service
@Transactional
public class TableCatalogService {

	@Autowired
	TableCatalogMapper mapper;
}
