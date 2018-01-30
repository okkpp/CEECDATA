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
 * @date 创建时间：2018年1月19日 上午9:02:37 
 * @version 1.0 
 */
@Controller
@RequestMapping("/upload")
public class UploadDataController {

	@Autowired
	UploadDataService service;
	
	@RequestMapping("/page")
	public String page(Model model){
		model.addAttribute("msg", "等待上传文件!");
		return "/upload/page";
	}
	
	@RequestMapping("/import")
	public String importFile(@RequestParam(value="uploadFile")MultipartFile file,Model model){
		
		
		model.addAttribute("msg", service.importFile(file));
		return "/upload/page";
	}
}
