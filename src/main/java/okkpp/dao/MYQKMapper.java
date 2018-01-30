package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.MYQK;
import tk.mybatis.mapper.common.Mapper;

public interface MYQKMapper extends Mapper<MYQK> {
	
	List<MYQK> getMYQK(String GJDM);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}