package okkpp.system.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.system.dao.UserRoleMapper;
import okkpp.system.model.Role;
import okkpp.system.model.User;
import okkpp.system.model.UserRole;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午4:46:31
*/
@Service
@Transactional
public class UserRoleService {

	@Autowired
	UserRoleMapper mapper;
	
	public void saveUserRoles(User user) {
		mapper.deleteUserRolesByUserId(user.getId());
		for(Role role:new HashSet<Role>(user.getRoles())){
			UserRole userRole = new UserRole();
			userRole.setUserId(user.getId());
			userRole.setRoleId(role.getId());
			mapper.insert(userRole);
		}
	}

	public void saveRoleUsers(Role role) {
		mapper.deleteRoleUsersByRoleId(role.getId());
		for (User user : new HashSet<User>(role.getUsers())) {
			UserRole userRole = new UserRole();
			userRole.setUserId(user.getId());
			userRole.setRoleId(role.getId());
			mapper.insert(userRole);
		}
	}
}
