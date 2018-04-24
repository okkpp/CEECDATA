package okkpp.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.util.StringUtils;

/**
* @author duck
* @date 创建时间：2018年3月8日 下午3:17:42
* 说明：在applicationContext-security.xml的filterChainDefinitions下 描述为 urlPerms的路径将结果此拦截器。
* 最终本方法调用sampleRealm.java下的isPermitted方法。
* 关于权限分配方案可在上述方法中修改。
*/
public class CustomRolesAuthorizationFilter extends AuthorizationFilter{

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		String uri = WebUtils.getPathWithinApplication(WebUtils.toHttp(request)).substring(1);
		if(StringUtils.isEmpty(uri)) {
			return true;
		}else {
			Subject subject = getSubject(request, response);
			return subject.isPermitted(uri);
		}
	}

}
