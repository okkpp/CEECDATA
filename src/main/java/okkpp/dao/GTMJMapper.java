package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.GTMJ;
import tk.mybatis.mapper.common.Mapper;

public interface GTMJMapper extends Mapper<GTMJ> {
	
	List<GTMJ> getGTMJ(String GJDM);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}