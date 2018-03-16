package okkpp.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.system.service.UserService;

/**
* @author duck
* @date ����ʱ�䣺2018��3��16�� ����2:43:54
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
