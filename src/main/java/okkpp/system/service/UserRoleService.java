package okkpp.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.system.dao.UserRoleMapper;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午4:46:31
*/
@Service
@Transactional
public class UserRoleService {

	@Autowired
	UserRoleMapper mapper;
	
}
