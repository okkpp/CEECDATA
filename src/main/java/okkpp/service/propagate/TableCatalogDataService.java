package okkpp.service.propagate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.dao.propagate.TableCatalogDataMapper;

/**
* @author duck
* @date ����ʱ�䣺2018��3��28�� ����10:25:29
*/
@Service
@Transactional
public class TableCatalogDataService {

	@Autowired
	TableCatalogDataMapper mapper;
}
