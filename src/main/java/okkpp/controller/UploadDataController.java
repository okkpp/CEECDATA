package okkpp.controller;

import okkpp.service.UploadDataService;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @version 1.0 
 */
@Controller
@RequestMapping("/upload")
public class UploadDataController {
	@Autowired
	UploadDataService service;
	
	@RequestMapping("/page")
	public String page(Model model){
		return "/upload/page";
	}
	@RequestMapping("/import")
	public String importFile(@RequestParam(value="uploadFile")MultipartFile mfile,Model model,HttpServletRequest request){
		String path=request.getSession().getServletContext().getRealPath("images/");
		String fileName = mfile.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		try {
			File file = new File(
					path
					+new SimpleDateFormat("yyyyMMddHHmmss").format(System.currentTimeMillis())
					+suffix);
			file.mkdirs();
			mfile.transferTo(file);
			System.out.println(file.getPath());
		}catch (Exception e) {
			System.out.println("error");
		}
		return "redirect:/upload/page.do";
	}
}
