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
* @date ����ʱ�䣺2018��3��8�� ����10:44:03
*/
public class sampleRealm extends AuthorizingRealm{

	//������Ȩ����
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) getAvailablePrincipal(principals);
		//TODO ͨ���û�������û���������Դ��������Դ����info��
		Set<String> roles = new HashSet<>();
		roles.add("admin");
	    SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
	    info.addRoles(roles);
//	    info.setStringPermissions(set����);  
//	    info.setRoles(set����);  
//	    info.setObjectPermissions(set����);
	    System.out.println("������Ȩ����");
	    return info;
	}

	//������֤����
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//token�д�����������û���������  
	    UsernamePasswordToken upToken = (UsernamePasswordToken)token;
	    //����û���������  
	    String username = upToken.getUsername();  
	    String password = String.valueOf(upToken.getPassword());
	    Object principal = username;
	    Object pas = "123456";
	    
	    SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, password, getName());
	    System.out.println("������֤����");
	    //throw new UnknownAccountException();
		return info;
	}

	
}
