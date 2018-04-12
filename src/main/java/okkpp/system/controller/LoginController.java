package okkpp.system.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.base.Msg;
import okkpp.system.dao.UserMapper;
import okkpp.system.model.User;

/**
 * @author duck
 * @date 创建时间：2018年3月8日 上午10:52:23
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
				System.out.println("登录失败:" + e.getMessage());
				if(e.getMessage()==null||e.getMessage()=="")
					model.addAttribute("msg", "请确认账号密码。");
				else
					model.addAttribute("msg", "密码错误。");
				return "/mui/login";
			}

		}
		model.addAttribute("msg", "登录成功！");
		return "/mui/login";
	}

	@RequestMapping("logout")
	public String logout(Model model) {
		Subject currentUser = SecurityUtils.getSubject();
		currentUser.logout();
		model.addAttribute("msg", "退出登录！");
		return "/mui/login";
	}

	@RequestMapping("/index")
	public String index() {
		return "/mui/index";
	}

	@Autowired
	UserMapper usermapper;
	@RequestMapping("renewpsw")
	public String renewPass(Model model,String mpass,String newpass,String renewpass) {
		User user = (User) SecurityUtils.getSubject().getSession().getAttribute("user");
		if(newpass.equals(renewpass)&&user.getPassword().equals(newpass)) {
			user.setPassword(newpass);
			usermapper.updateByPrimaryKey(user);
			model.addAttribute("msg", "修改密码成功！");
		}else {
			model.addAttribute("msg", "修改密码失败！");
		}
		return "/mui/pass";
	}
	@RequestMapping("/mui")
	public String info(String str) {
		str = "/mui/" + str;
		return str;
	}
	
	@RequestMapping(value = "loginApp", method = RequestMethod.POST)
	@ResponseBody
	public Msg loginApp(String username, String password) {
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			token.setRememberMe(true);
			try {
				currentUser.login(token);
			} catch (AuthenticationException e) {
				System.out.println("登录失败:" + e.getMessage());
				if(e.getMessage()==null||e.getMessage()=="")
					return Msg.fail().add("msg", "请确认账号密码。");
				else
				return Msg.fail().add("msg", "密码错误。");	
			}
		}
		return Msg.success().add("msg", "登录成功！");
	}

}
