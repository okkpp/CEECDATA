package okkpp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

import okkpp.base.controller.BaseController;
import okkpp.model.Content;
import okkpp.model.Table;
import okkpp.service.ContentService;
import okkpp.utils.StaticVariable;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月18日 上午10:53:11 
 * @version 1.0 
 */
@Controller
public class ContentController extends BaseController<Content>{

	@Autowired
	private ContentService service;
	
	@RequestMapping("/indexcontent")
	public String map(Model model){
		model.addAttribute("data", service.Content());
		return "/zdoDB";
	}
	@RequestMapping("/content")
	public String content(Model model,String GJDM){
		return "/content";
	}
	@RequestMapping("/updateContent")
	public String updateContent(Model model){
		return "/content1";
	}
	
	@RequestMapping("/showTables")
	@ResponseBody
	public Map<String, List<String>> showTables(Model model) {	
		return service.showTables();
	}

	@RequestMapping(value = "/showColumns",method = RequestMethod.GET)
	@ResponseBody
	public List<HashMap<String, String>> showColumns(Model model,@RequestParam("tab")String tab) {
		model.addAttribute("data",new Gson().toJson(service.showColumns(tab)));
		return service.showColumns(tab);
	}
	
	@RequestMapping(value = "/showTablesWithComment",method = RequestMethod.GET)
	@ResponseBody
	public List<Table> showTablesWithComment(){
		return service.showTablesWithComment();
	}
}
