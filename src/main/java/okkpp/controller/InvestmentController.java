package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.service.investment.*;
import okkpp.service.population.BirthAndDeathRateService;
import okkpp.model.Msg;
import okkpp.model.investment.*;
import okkpp.model.population.BirthAndDeathRate;

@Controller
@RequestMapping("/investment")
public class InvestmentController {
	
	@Autowired
	CostOfBusinessService costOfBusinessService;
	@RequestMapping("/CostOfBusiness")
	public String CostOfBusiness(Model model){
		List<CostOfBusiness> list = costOfBusinessService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
	@RequestMapping("/cost_of_business")
	@ResponseBody
	public Msg cost_of_business(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<CostOfBusiness> list = costOfBusinessService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	DensityOfBusinessService densityOfBusinessService;
	@RequestMapping("/DensityOfBusiness")
	public String DensityOfBusiness(Model model){
		List<DensityOfBusiness> list = densityOfBusinessService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
	@RequestMapping("/density_of_business")
	@ResponseBody
	public Msg density_of_business(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<DensityOfBusiness> list = densityOfBusinessService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}

	@Autowired
	RankOfBusinessService rankOfBusinessService;
	@RequestMapping("/RankOfBusiness")
	public String RankOfBusiness(Model model){
		List<RankOfBusiness> list = rankOfBusinessService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
	@RequestMapping("/rank_of_business")
	@ResponseBody
	public Msg rank_of_business(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<RankOfBusiness> list = rankOfBusinessService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	RegisteredOfBusinessService registeredOfBusinessService;
	@RequestMapping("/RegisteredOfBusiness")
	public String RegisteredOfBusiness(Model model){
		List<RegisteredOfBusiness> list = registeredOfBusinessService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
	@RequestMapping("/registered_of_business")
	@ResponseBody
	public Msg registered_of_business(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<RegisteredOfBusiness> list = registeredOfBusinessService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
}
