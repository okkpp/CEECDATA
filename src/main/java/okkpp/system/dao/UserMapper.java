package okkpp.system.dao;

import java.util.List;

import okkpp.system.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
	User getUserByUid(String uid);
	
	User getUserByRoleId(int roleId);
	
	User getUserWithRolesByUid(String uid);
	
	List<User> getUsersByRoleId(int roleId);
	
}