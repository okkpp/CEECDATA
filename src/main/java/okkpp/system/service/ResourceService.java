package okkpp.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import okkpp.system.dao.ResourceMapper;
import okkpp.system.model.Resource;
import tk.mybatis.mapper.entity.Example;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午4:48:41
*/
@Service
@Transactional
public class ResourceService {

	@Autowired
	ResourceMapper mapper;
	
	private void updateParent(Resource resource){
		Integer pid = resource.getPid();
		if (pid != null) {
			Resource parentResource = mapper.selectByPrimaryKey(pid);
			parentResource.setLeaf("N");
			mapper.updateByPrimaryKey(parentResource);
		}
	}
	
	public int save(Resource resource) {
		updateParent(resource);
		return mapper.insert(resource);
	}

	public int update(Resource resource) {
		updateParent(resource);
		return mapper.updateByPrimaryKey(resource);
	}

	public int delete(Object key) {
		Resource resource = mapper.selectByPrimaryKey(key);
		int result = mapper.deleteByPrimaryKey(key);
		Integer pid = resource.getPid();
		if (pid != null) {
			Example example = new Example(Resource.class);
			example.createCriteria().andEqualTo("pid", pid);
			int count = mapper.selectCountByExample(example);
			Resource parentResource = mapper
					.selectByPrimaryKey(pid);
			if (count > 0) {
				parentResource.setLeaf("N");	
			}else{
				parentResource.setLeaf("Y");
			}
			mapper.updateByPrimaryKey(parentResource);
		}
		return result;
	}

	public List<Resource> listResources() {
		return mapper.selectAll();
	}

	public List<Resource> getResourcesByPidAndType(Resource resource) {
		return mapper.getResourcesByPidAndType(resource);
	}

	public List<Resource> getResourcesByRoleId(Integer roleId) {
		return mapper.getResourcesByRoleId(roleId);
	}
}
