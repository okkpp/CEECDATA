package okkpp.dao;

import java.util.List;
import java.util.Map;

import okkpp.model.Content;
import tk.mybatis.mapper.common.Mapper;

public interface ContentMapper extends Mapper<Content> {
	
	public List<Content> getAllContent();
	public List<Content> getContent(String GJDM);
	
	public void deleteExist(Content c);
	public void update(Content c);
	
	public String GJDM2GJ(String GDJM);
	
	public List<String> showTables();
	public List<Map<String,String>> showColumns(String tab);
}