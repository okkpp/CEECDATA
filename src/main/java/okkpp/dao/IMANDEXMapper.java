package okkpp.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import okkpp.model.IMANDEX;
import tk.mybatis.mapper.common.Mapper;

public interface IMANDEXMapper extends Mapper<IMANDEX> {
	
	List<IMANDEX> getIMANDEX(String GJDM);
	public void uploadData(@Param("data")List<Map<String,String>> data);
}