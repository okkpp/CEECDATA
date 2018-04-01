package okkpp.system.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.base.service.BaseService;
import okkpp.system.dao.ResourceRoleMapper;
import okkpp.system.model.Resource;
import okkpp.system.model.ResourceRole;
import okkpp.system.model.Role;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午4:49:37
*/
@Service
@Transactional
public class ResourceRoleService extends BaseService<ResourceRole>{

	@Autowired
	ResourceRoleMapper mapper;
	
	public void saveRoleResources(Role role) {
		mapper.deleteRoleResourcesByRoleId(role.getId());
		for (Resource resource : new HashSet<Resource>(role.getResources())) {
			ResourceRole roleResource = new ResourceRole();
			roleResource.setRoleId(role.getId());
			roleResource.setResourceId(resource.getId());
			mapper.insert(roleResource);
		}
	}
}
