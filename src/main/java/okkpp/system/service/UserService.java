package okkpp.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.system.dao.UserMapper;

/**
* @author duck
* @date ����ʱ�䣺2018��3��9�� ����9:15:52
*/
@Service
@Transactional
public class UserService {
	
	@Autowired
	UserMapper mapper;
	
}
