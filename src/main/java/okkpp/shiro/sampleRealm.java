package okkpp.shiro;

import java.util.Collection;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

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

	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ResourceMapper resourceMapper;

	@Override
	protected boolean isPermitted(Permission permission, AuthorizationInfo info) {
		Collection<Permission> perms = getPermissions(info);
		if (perms != null && !perms.isEmpty()) {
			for (Permission perm : perms) {
				/** 支持通配符[/**] */
				if (perm.toString().endsWith("/**")) {
					if (permission.toString().matches("^" + perm.toString().replace("/**", ".*"))) {
						return true;
					}
				}
				/** Permission的implies方法被调用到了 */
				if (perm.implies(permission)) {
					return true;
				}
			}
		}
		return false;
	}

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
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUid(), user.getPassword()
				, ByteSource.Util.bytes(uid), getName());
		// 将用户信息写入session
		SecurityUtils.getSubject().getSession().setAttribute("USER", user);
		// throw new UnknownAccountException();
		return info;
	}
}
