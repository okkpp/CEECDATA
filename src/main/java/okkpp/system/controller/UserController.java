package okkpp.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.system.service.UserService;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午2:43:54
*/
@RequestMapping("/system")
@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping("user")
	public String user(Model model) {
		model.addAttribute("users", service.listUsers());
		return "/mui/user";
	}
}
