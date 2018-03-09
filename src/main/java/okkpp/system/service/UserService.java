package okkpp.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.system.dao.UserMapper;

/**
* @author duck
* @date 创建时间：2018年3月9日 上午9:15:52
*/
@Service
@Transactional
public class UserService {
	
	@Autowired
	UserMapper mapper;
	
}
