package okkpp.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.system.dao.RoleMapper;

/**
* @author duck
* @date ����ʱ�䣺2018��3��16�� ����4:44:52
*/
@Service
@Transactional
public class RoleService {

	@Autowired
	RoleMapper mapper;
}
