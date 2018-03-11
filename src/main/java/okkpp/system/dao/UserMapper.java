package okkpp.system.dao;

import okkpp.system.model.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
	
	User getUserByUid(String uid);
	User getUserByRoleId(int roleId);
}