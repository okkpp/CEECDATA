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
import okkpp.system.model.Role;
import okkpp.system.service.ResourceRoleService;
import okkpp.system.service.RoleService;
import okkpp.system.service.UserRoleService;
import okkpp.system.vo.Result;

/**
* @author duck
* @date 创建时间：2018年3月16日 下午4:43:51
*/
@RequestMapping("/role")
@Controller
public class RoleController extends BaseController<Role>{

	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserRoleService userRoleService;
	
	@Autowired
	private ResourceRoleService  resourceRoleService;

	@RequestMapping(value = "/list")
	@ResponseBody
	public PageInfo<Role> listRoles(@RequestParam int page,
			@RequestParam int rows,@ModelAttribute Role role) {
		return roleService.listRolesPaged(page,rows,role);
	}
	
	@RequestMapping(value = "/render")
	public String render() {
		return "system/role/list";
	}
	
	//获取用户的角色信息
	@RequestMapping(value = "/getRolesByUserId")
	@ResponseBody
	public List<Role> getRolesByUserId(@RequestParam int userId){
		return roleService.getRolesByUserId(userId);
	}
	
	@RequestMapping(value = "/roleSelect")
	public String roleSelect(Model model,@RequestParam int userId){
		model.addAttribute("userId", userId);
		return "select/roleSelect";
	}
	
	@RequestMapping(value = "/saveRoleUsers")
	@ResponseBody
	public Result saveRoleUsers(@ModelAttribute Role role){
		Result result = new Result();
		try {
			userRoleService.saveRoleUsers(role);
		} catch (Exception e) {
			System.out.println("saveRoleUsers : "+e);
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		return result;
	}
	
	@RequestMapping(value = "/saveRoleResources")
	@ResponseBody
	public Result saveRoleResources(@ModelAttribute Role role){
		Result result = new Result();
		try {
			resourceRoleService.saveRoleResources(role);
		} catch (Exception e) {
			System.out.println("saveRoleResources : "+e);
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		return result;
	}
}
