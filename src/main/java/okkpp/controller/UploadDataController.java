package okkpp.controller;

import okkpp.service.UploadDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date ����ʱ�䣺2018��1��19�� ����9:02:37 
 * @version 1.0 
 */
@Controller
@RequestMapping("/upload")
public class UploadDataController {
	@Autowired
	UploadDataService service;
	
	@RequestMapping("/page")
	public String page(Model model){
		model.addAttribute("msg", "�ȴ��ϴ��ļ�!");
		return "/upload/page";
	}
	
	@RequestMapping("/import")
	public String importFile(@RequestParam(value="uploadFile")MultipartFile file,Model model){
		
		
		model.addAttribute("msg", service.importFile(file));
		return "/upload/page";
	}
}
