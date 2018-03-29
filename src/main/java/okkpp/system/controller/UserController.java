package okkpp.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import okkpp.base.controller.BaseController;
import okkpp.system.model.User;
import okkpp.system.service.UserRoleService;
import okkpp.system.service.UserService;
import okkpp.system.vo.Result;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午2:43:54
*/
@RequestMapping("/user")
@Controller
public class UserController extends BaseController<User>{

	@Autowired
	private UserService userService;

	@Autowired
	private UserRoleService userRoleService;

	@RequestMapping("user")
	public String user(Model model) {
		model.addAttribute("users", userService.listUsers());
		return "/mui/user";
	}
	
	@RequestMapping(value = "/page")
	public String page() {
		return "/mui/user";
	}
	

	@RequestMapping(value = "/list")
	@ResponseBody
	public PageInfo<User> listUsers(@RequestParam int page,
			@RequestParam int rows, @ModelAttribute User condition) {
		PageInfo<User> pageInfo = userService.listUsersPaged(page, rows,
				condition);
		return pageInfo;
	}

	@RequestMapping(value = "/render")
	public String render() {
		return "system/user/list";
	}

	@RequestMapping(value = "/saveUserRoles")
	@ResponseBody
	public Result saveUserRoles(@ModelAttribute User user) {
		Result result = new Result();
		try {
			userRoleService.saveUserRoles(user);
		} catch (Exception e) {
			System.out.println("saveUserRoles : "+e);
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		return result;
	}

	@RequestMapping(value = "/getUsersByRoleId")
	@ResponseBody
	public List<User> getUsersByUserId(@RequestParam int roleId) {
		return userService.getUsersByRoleId(roleId);
	}

	@RequestMapping(value = "/userSelect")
	public String roleSelect(Model model, @RequestParam int roleId) {
		model.addAttribute("roleId", roleId);
		return "select/userSelect";
	}
}
