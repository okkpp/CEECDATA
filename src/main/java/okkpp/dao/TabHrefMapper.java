package okkpp.dao;

import java.util.List;

import okkpp.model.TabHref;
import tk.mybatis.mapper.common.Mapper;

public interface TabHrefMapper extends Mapper<TabHref> {
	
	public List<String> getCEECCODE();
	public int search(TabHref th);
	public List<TabHref> getTabHref();
}