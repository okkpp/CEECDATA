package okkpp.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import okkpp.model.Content;
import okkpp.model.TableField;
import tk.mybatis.mapper.common.Mapper;

public interface ContentMapper extends Mapper<Content> {
	
	public List<HashMap<String, String>> showColumns(@Param("tab")String tab);
	
	public List<String> showTables();

	public List<TableField> showTablesWithComment();
	
	public List<HashMap<String, String>> showColumnsWithComment(@Param("tab")String tab);
}