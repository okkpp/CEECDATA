package okkpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.service.economics.FinalConsumptionService;

@Controller
@RequestMapping("/economics")
public class EconomincsController {

	@Autowired
	FinalConsumptionService finalConsumptionService;
	@RequestMapping("/FinalConsumption")
	public String FinalConsumption(Model model) {
		model.addAttribute("data",finalConsumptionService.selectAll());
		return "economics/FinalConsumption";
	}
}
