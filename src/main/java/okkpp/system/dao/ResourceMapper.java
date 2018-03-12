package okkpp.system.dao;

import java.util.List;

import okkpp.system.model.Resource;
import tk.mybatis.mapper.common.Mapper;

public interface ResourceMapper extends Mapper<Resource> {
	
	List<Resource> getResourcesByRoleId(int roleId);
}