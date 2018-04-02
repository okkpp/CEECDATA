package okkpp.service.propagate;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.base.service.BaseService;
import okkpp.dao.propagate.TableInfoMapper;
import okkpp.model.propagate.TableInfo;

/**
* @author duck
* @date ����ʱ�䣺2018��3��28�� ����10:23:14
*/
@Service
@Transactional
public class TableInfoService extends BaseService<TableInfo>{

	@Autowired
	TableInfoMapper mapper;
	
	public int saveInfo(String tableName,Map<String, Object> data) {
		TableInfo ti = new TableInfo(tableName, data);
		mapper.insertReturnId(ti);
		return ti.getId();
	}
	public List<TableInfo> list(){
		
		return mapper.selectAll();
	}
}
