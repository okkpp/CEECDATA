package okkpp.controller;

import java.util.List;

import okkpp.model.IMANDEX;
import okkpp.model.MYQK;
import okkpp.model.WLJXZS;
import okkpp.service.MYHZService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月22日 下午2:56:20 
 * @version 1.0 
 */
@Controller
@RequestMapping("/MYHZ")
public class MYHZController {

	@Autowired
	private MYHZService service;
	
	@RequestMapping("/IMANDEX")
	public String getIMANDEX(Model model,String GJDM){
		List<IMANDEX> list = service.getIMANDEX(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("IMANDEX", new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/贸易合作/贸易合作—进出口量";
	}
	@RequestMapping("/MYQK")
	public String getMYQK(Model model,String GJDM){
		List<MYQK> list = service.getMYQK(GJDM);
		if(list.isEmpty())return "/404";
		model.addAttribute("MYQK", new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/贸易合作/贸易合作—贸易情况";
	}
	@RequestMapping("/WLJXZS")
	public String getWLJXZS(Model model,String GJDM,String NF){
		List<WLJXZS> list = service.getWLJXZS(GJDM, NF);
		if(list.isEmpty())return "/404";
		model.addAttribute("WLJXZS", new Gson().toJson(list));
		model.addAttribute("GJ", list.get(0).getGJ());
		return "/贸易合作/贸易合作—物流绩效指数";
	}
}
