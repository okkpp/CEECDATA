package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.HGJJ;
import tk.mybatis.mapper.common.Mapper;

public interface HGJJMapper extends Mapper<HGJJ> {
	
	List<HGJJ> getHGJJ(String GJDM);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}