package okkpp.controller;

import okkpp.service.ContentService;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.google.gson.Gson;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月18日 上午10:53:11 
 * @version 1.0 
 */
@Controller
public class ContentController {

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
	public String showTables(Model model) {
		model.addAttribute("data",new Gson().toJson(service.showTables()));
		System.out.println(new Gson().toJson(service.showTables()));
		return "404";
	}
	

	@RequestMapping("/showColumns")
	public String showColumns(Model model,@RequestParam("tab")String tab) {
		model.addAttribute("data",new Gson().toJson(service.showColumns(tab)));
		System.out.println(new Gson().toJson(service.showColumns(tab)));
		return "404";
	}
	
	
}
