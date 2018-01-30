package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.WLJXZS;
import tk.mybatis.mapper.common.Mapper;

public interface WLJXZSMapper extends Mapper<WLJXZS> {
	
	List<WLJXZS> getWLJXZS(@Param("GJDM")String GJDM,@Param("NF")String NF);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}