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
 * @date 创建时间：2018年3月8日 上午10:44:03
 */
public class sampleRealm extends AuthorizingRealm {

	private RoleMapper roleMapper;
	private UserMapper userMapper;
	private ResourceMapper resourceMapper;

	// 这是授权方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String uid = (String) getAvailablePrincipal(principals);
		List<Role> roles = roleMapper.getRolesByUId(uid);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		for (Role role : roles) {
			// 基于Role的权限信息
			info.addRole(role.getRoid());
			// 基于Permission的权限信息
			List<Resource> resources = resourceMapper.getResourcesByRoleId(role.getId());
			for (Resource resource : resources) {
				if (resource.getValue() != null && !resource.getValue().equals(""))
					info.addStringPermission(resource.getValue());
			}
		}

		System.out.println("这是授权方法");
		return info;
	}

	// 这是认证方法
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
		System.out.println("这是认证方法");
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
