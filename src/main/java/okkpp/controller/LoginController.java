package okkpp.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author duck
 * @date ����ʱ�䣺2018��3��8�� ����10:52:23
 */
@Controller
@RequestMapping("/system")
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "/mui/login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(String username, String password, Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				System.out.println("��¼ʧ��:" + e.getMessage());
				if(e.getMessage()==null||e.getMessage()=="")
					model.addAttribute("msg", "�������");
				else
					model.addAttribute("msg", "��ȷ���˺����롣");
				return "/mui/login";
			}

		}
		model.addAttribute("msg", "��¼�ɹ���");
		return "/mui/login";
	}

	@RequestMapping("logout")
	public String logout() {
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		return "/mui/login";
	}

	@RequestMapping("/index")
	public String index() {
		return "/mui/index";
	}

	@RequestMapping("/mui")
	public String info(String str) {
		str = "/mui/" + str;
		return str;
	}

}
