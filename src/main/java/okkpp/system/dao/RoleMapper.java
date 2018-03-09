package okkpp.system.dao;

import java.util.List;

import okkpp.system.model.Role;
import tk.mybatis.mapper.common.Mapper;

public interface RoleMapper extends Mapper<Role> {
	
	List<Role> getRolesByUserId(int userId);
	
	List<Role> getRolesByUId(String uid);
}