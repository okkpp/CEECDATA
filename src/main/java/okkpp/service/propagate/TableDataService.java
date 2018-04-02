package okkpp.service.propagate;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.base.service.BaseService;
import okkpp.dao.propagate.TableDataMapper;
import okkpp.model.propagate.TableData;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午10:26:08
*/
@Service
@Transactional
public class TableDataService extends BaseService<TableData>{

	@Autowired
	TableDataMapper mapper;
	
	public int saveData(int tableId,Map<String, Object> data) {
		TableData td = new TableData(tableId,data);
		mapper.insertReturnId(td);
		return td.getId();
	}
}
