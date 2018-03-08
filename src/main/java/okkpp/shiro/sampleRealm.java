package okkpp.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
* @author duck
* @date 创建时间：2018年3月8日 上午10:44:03
*/
public class sampleRealm extends AuthorizingRealm{

	//这是授权方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) getAvailablePrincipal(principals);
		//TODO 通过用户名获得用户的所有资源，并把资源存入info中
		Set<String> roles = new HashSet<>();
		roles.add("admin");
	    SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
	    info.addRoles(roles);
//	    info.setStringPermissions(set集合);  
//	    info.setRoles(set集合);  
//	    info.setObjectPermissions(set集合);
	    System.out.println("这是授权方法");
	    return info;
	}

	//这是认证方法
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//token中储存着输入的用户名和密码  
	    UsernamePasswordToken upToken = (UsernamePasswordToken)token;
	    //获得用户名与密码  
	    String username = upToken.getUsername();  
	    String password = String.valueOf(upToken.getPassword());
	    Object principal = username;
	    Object pas = "123456";
	    
	    SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password, getName());
	    System.out.println("这是认证方法");
	    //throw new UnknownAccountException();
		return info;
	}

	
}
