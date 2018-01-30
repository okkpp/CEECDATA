package okkpp.controller;

import java.util.List;

import okkpp.model.GTMJ;
import okkpp.model.SHHJ;
import okkpp.service.SHHJService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月18日 下午4:05:40 
 * @version 1.0 
 */
@Controller
@RequestMapping("/SHHJ")
public class SHHJController {

	@Autowired
	private SHHJService service;
	
	@RequestMapping("/NL65ZB")
	public String NL65ZB(Model model,String GJDM){
		List<SHHJ> list = service.getSHHJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("SHHJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/社会环境/社会环境—65岁及以上人口占总人口占比";
	}
	@RequestMapping("/LDLRK")
	public String LDLRK(Model model,String GJDM){
		List<SHHJ> list = service.getSHHJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("SHHJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/社会环境/社会环境—劳动力人口";
	}
	@RequestMapping("/LDLRKZB")
	public String LDLRKZB(Model model,String GJDM){
		List<SHHJ> list = service.getSHHJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("SHHJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/社会环境/社会环境—劳动力人口占比";
	}
	@RequestMapping("/RKMD")
	public String RKMD(Model model,String GJDM){
		List<SHHJ> list = service.getSHHJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("SHHJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/社会环境/社会环境—人口密度";
	}
	@RequestMapping("/ZRK")
	public String ZRK(Model model,String GJDM){
		List<SHHJ> list = service.getSHHJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("SHHJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/社会环境/社会环境—总人口";
	}
	@RequestMapping("/GTMJ")
	public String GTMJ(Model model,String GJDM){
		List<GTMJ> list = service.getGTMJ(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("GTMJ",new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/社会环境/社会环境—面积";
	}
}
