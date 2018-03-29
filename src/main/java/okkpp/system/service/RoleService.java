package okkpp.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.base.service.BaseService;
import okkpp.system.dao.RoleMapper;
import okkpp.system.model.Role;
import okkpp.utils.ExampleBuilder;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午4:44:52
*/
@Service
@Transactional
public class RoleService extends BaseService<Role>{

	@Autowired
	RoleMapper mapper;
	
	public List<Role> listRoles(Role role) {
		ExampleBuilder example = new ExampleBuilder(role.getClass());
		example.andEqualTo(role);
		return mapper.selectByExample(example);
	}

	public List<Role> getRolesByUserId(int userId) {
		return mapper.getRolesByUserId(userId);
	}

	public PageInfo<Role> listRolesPaged(int page, int pageSize, Role role) {
		ExampleBuilder example = new ExampleBuilder(role.getClass());
		example.andEqualTo(role);
		PageHelper.startPage(page, pageSize);
		List<Role> roles = mapper.selectByExample(example);
		return new PageInfo<Role>(roles);
	}
}
