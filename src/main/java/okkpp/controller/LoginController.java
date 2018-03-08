package okkpp.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
* @author duck
* @date 创建时间：2018年3月8日 上午10:52:23
*/
@Controller
public class LoginController {

	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login() {
		return "/mui/login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username,String password) {
		Subject currentUser = SecurityUtils.getSubject();
		if(!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				System.out.println("faild");
			}
			
		}
		return "/mui/index";
	}
	@RequestMapping("/sys_index")
	public String index() {
		return "/mui/index";
	}
}
