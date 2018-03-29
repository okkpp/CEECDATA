package okkpp.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.base.service.BaseService;
import okkpp.system.dao.UserMapper;
import okkpp.system.model.User;
import okkpp.utils.ExampleBuilder;

/**
* @author duck
* @date 创建时间：2018年3月9日 上午9:15:52
* 主要用于查询用户
*/
@Service
@Transactional
public class UserService extends BaseService<User>{
	
	@Autowired
	UserMapper mapper;

	static int constNum = getNum();
	public static int getNum() {
		int i = 0;
		
		return i;
	}
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
