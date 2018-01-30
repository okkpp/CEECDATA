package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.SHHJ;
import tk.mybatis.mapper.common.Mapper;

public interface SHHJMapper extends Mapper<SHHJ> {
	
	List<SHHJ> getSHHJ(String GJDM);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}