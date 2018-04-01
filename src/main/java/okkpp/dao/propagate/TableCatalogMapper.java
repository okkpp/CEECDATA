package okkpp.dao.propagate;

import okkpp.model.propagate.TableCatalog;
import tk.mybatis.mapper.common.Mapper;

public interface TableCatalogMapper extends Mapper<TableCatalog> {
	
	public int insertReturnId(TableCatalog tableCatalog);
}