package okkpp.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.system.dao.RoleMapper;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午4:44:52
*/
@Service
@Transactional
public class RoleService {

	@Autowired
	RoleMapper mapper;
}
