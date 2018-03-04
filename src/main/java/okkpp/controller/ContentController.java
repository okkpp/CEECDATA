package okkpp.controller;

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
}
