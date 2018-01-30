package okkpp.controller;

import java.util.List;
import java.util.Map;

import okkpp.model.Content;
import okkpp.service.ContentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月18日 上午10:53:11 
 * @version 1.0 
 */
@Controller
public class ContentController {

	@Autowired
	private ContentService service;
	
	@RequestMapping("/index")
	public String map(){
		return "/map";
	}
	@RequestMapping("/content")
	public String content(Model model,String GJDM){
		Map<String,List<Content>> map = service.getContent(GJDM);
		model.addAttribute("HGJJ", map.get("HGJJ"));
		model.addAttribute("SHHJ", map.get("SHHJ"));
		model.addAttribute("MYHZ", map.get("MYHZ"));
		model.addAttribute("TZYS", map.get("TZYS"));
		model.addAttribute("GJ", service.GJDM2GJ(GJDM));
		return "/content";
	}
	@RequestMapping("/updateContent")
	public String updateContent(Model model){
		int count = service.update();
		model.addAttribute("count", "一共更新了"+count+"条数据。");
		model.addAttribute("content", service.getAllContent());
		return "/content1";
	}
}
