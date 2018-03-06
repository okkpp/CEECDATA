package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import okkpp.service.investment.CostOfBusinessService;
import okkpp.service.investment.DensityOfBusinessService;
import okkpp.service.investment.RankOfBusinessService;
import okkpp.service.investment.RegisteredOfBusinessService;
import okkpp.model.investment.*;

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
	
	@Autowired
	DensityOfBusinessService densityOfBusinessService;
	@RequestMapping("/DensityOfBusiness")
	public String DensityOfBusiness(Model model){
		List<DensityOfBusiness> list = densityOfBusinessService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
	
	@Autowired
	RankOfBusinessService rankOfBusinessService;
	@RequestMapping("/RankOfBusiness")
	public String RankOfBusiness(Model model){
		List<RankOfBusiness> list = rankOfBusinessService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
	
	@Autowired
	RegisteredOfBusinessService registeredOfBusinessService;
	@RequestMapping("/RegisteredOfBusiness")
	public String RegisteredOfBusiness(Model model){
		List<RegisteredOfBusiness> list = registeredOfBusinessService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
}
