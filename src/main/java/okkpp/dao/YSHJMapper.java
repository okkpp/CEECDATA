package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.YSHJ;
import tk.mybatis.mapper.common.Mapper;

public interface YSHJMapper extends Mapper<YSHJ> {
	
	List<YSHJ> getYSHJ(String GJDM);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}