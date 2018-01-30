package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.JJZYDZS;
import tk.mybatis.mapper.common.Mapper;

public interface JJZYDZSMapper extends Mapper<JJZYDZS> {
	
	List<JJZYDZS> getJJZYDZS(String GJDM);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}