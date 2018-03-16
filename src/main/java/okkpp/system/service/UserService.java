package okkpp.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.system.dao.UserMapper;
import okkpp.system.model.User;
import okkpp.utils.ExampleBuilder;

/**
* @author duck
* @date 创建时间：2018年3月9日 上午9:15:52
*/
@Service
@Transactional
public class UserService {
	
	@Autowired
	UserMapper mapper;

	public List<User> listUsers() {
		return mapper.selectAll();
	}

	public User getUserByUid(String uid) {
		return mapper.getUserByUid(uid);
	}
	
	public List<User> getUsersByRoleId(int roleId) {
		return mapper.getUsersByRoleId(roleId);
	}

	public PageInfo<User> listUsersPaged(int page,int pageSize,User user) {
		ExampleBuilder example = new ExampleBuilder(user.getClass());
		example.andEqualTo(user);
		PageHelper.startPage(page, pageSize);
		List<User> users = mapper.selectByExample(example);
		return new PageInfo<User>(users);
	}
}
