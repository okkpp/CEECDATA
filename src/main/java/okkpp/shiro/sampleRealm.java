package okkpp.shiro;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import okkpp.system.dao.ResourceMapper;
import okkpp.system.dao.RoleMapper;
import okkpp.system.dao.UserMapper;
import okkpp.system.model.Resource;
import okkpp.system.model.Role;
import okkpp.system.model.User;

/**
 * @author duck
 * @date ����ʱ�䣺2018��3��8�� ����10:44:03
 */
public class sampleRealm extends AuthorizingRealm {

	private RoleMapper roleMapper;
	private UserMapper userMapper;
	private ResourceMapper resourceMapper;

	// ������Ȩ����
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String uid = (String) getAvailablePrincipal(principals);
		List<Role> roles = roleMapper.getRolesByUId(uid);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		for (Role role : roles) {
			// ����Role��Ȩ����Ϣ
			info.addRole(role.getRoid());
			// ����Permission��Ȩ����Ϣ
			List<Resource> resources = resourceMapper.getResourcesByRoleId(role.getId());
			for (Resource resource : resources) {
				if (resource.getValue() != null && !resource.getValue().equals(""))
					info.addStringPermission(resource.getValue());
			}
		}

		System.out.println("������Ȩ����");
		return info;
	}

	// ������֤����
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String uid = (String) token.getPrincipal();
		User user = userMapper.getUserByUid(uid);
		if (user == null) {
			throw new UnknownAccountException();
		}
		if (Boolean.FALSE.equals(user.getEnabled())) {
			throw new LockedAccountException();
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUid(), user.getPassword(), getName());
		SecurityUtils.getSubject().getSession().setAttribute("user", user);
		System.out.println("������֤����");
		// throw new UnknownAccountException();
		return info;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public void setRoleMapper(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

	public void setResourceMapper(ResourceMapper resourceMapper) {
		this.resourceMapper = resourceMapper;
	}
}
