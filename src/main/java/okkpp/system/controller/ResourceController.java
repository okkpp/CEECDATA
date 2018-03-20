package okkpp.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.system.model.Resource;
import okkpp.system.service.ResourceService;


/**
* @author duck
* @date 创建时间：2018年3月19日 上午9:57:13
*/
@RequestMapping("/resource")
@Controller
public class ResourceController {

	@Autowired
	private ResourceService service;

	@RequestMapping(value = "/render")
	public String render() {
		return "system/resource/list";
	}
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public List<Resource> listResources() {
		return service.listResources();
	}
	
	@RequestMapping(value = "/getResourcesByPidAndType")
	@ResponseBody
	public List<Resource> getResourcesByPidAndType(@ModelAttribute Resource resource){
		return service.getResourcesByPidAndType(resource);
	}
	
	@RequestMapping(value = "/getResourcesByRoleId")
	@ResponseBody
	public List<Resource> getResourcesByRoleId(@RequestParam Integer roleId){
		return service.getResourcesByRoleId(roleId);
	}
	
	@RequestMapping(value = "/resourceSelect")
	public String roleSelect(Model model, @RequestParam int roleId) {
		model.addAttribute("roleId", roleId);
		return "select/resourceSelect";
	}
}
