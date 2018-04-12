package okkpp.service.propagate;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.base.service.BaseService;
import okkpp.dao.propagate.TableDataMapper;
import okkpp.dao.propagate.TableInfoMapper;
import okkpp.model.propagate.TableData;
import okkpp.model.propagate.TableInfo;

/**
* @author duck
* @date 创建时间：2018年3月28日 上午10:23:14
*/
@Service
@Transactional
public class TableInfoService extends BaseService<TableInfo>{

	@Autowired
	TableInfoMapper tableInfoMapper;
	@Autowired
	TableDataMapper tableDataMapper;
	
	public int saveInfo(String tableName,Map<String, Object> data) {
		TableInfo ti = new TableInfo(tableName, data);
		tableInfoMapper.insertReturnId(ti);
		return ti.getId();
	}
	public List<TableInfo> list(){
		return tableInfoMapper.selectAll();
	}
	public void createTabWithData(String tableName,Map<String, Object> info,Map<String, Object> data) {
		TableInfo ti = new TableInfo(tableName, info);
		tableInfoMapper.insertReturnId(ti);
		TableData td = new TableData(ti.getId(),data);
		tableDataMapper.insertReturnId(td);
	}
}
