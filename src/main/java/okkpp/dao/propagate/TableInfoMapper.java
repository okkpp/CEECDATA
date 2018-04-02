package okkpp.dao.propagate;

import okkpp.model.propagate.TableInfo;
import tk.mybatis.mapper.common.Mapper;

public interface TableInfoMapper extends Mapper<TableInfo> {
	
	public int insertReturnId(TableInfo tableInfo);
}