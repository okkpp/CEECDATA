package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.service.poverty.*;
import okkpp.model.poverty.*;

@Controller
@RequestMapping("/poverty")
public class PovertyController {

	@Autowired
	HouseholdConsumptionExpenditureService householdConsumptionExpenditureService;
	@RequestMapping("/HouseholdConsumptionExpenditure")
	public String HouseholdConsumptionExpenditure(Model model) {
		List<HouseholdConsumptionExpenditure> list = householdConsumptionExpenditureService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	InternationalPovertyRatioService internationalPovertyRatioService;
	@RequestMapping("/InternationalPovertyRatio")
	public String InternationalPovertyRatio(Model model) {
		List<InternationalPovertyRatio> list = internationalPovertyRatioService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	PersonalIncomeService personalIncomeService;
	@RequestMapping("/PersonalIncome")
	public String PersonalIncome(Model model) {
		List<PersonalIncome> list = personalIncomeService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	PovertyRateService povertyRateService;
	@RequestMapping("/PovertyRate")
	public String PovertyRate(Model model) {
		List<PovertyRate> list = povertyRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	SocialIndicatorsOfPovertyService socialIndicatorsOfPovertyService;
	@RequestMapping("/SocialIndicatorsOfPoverty")
	public String SocialIndicatorsOfPoverty(Model model) {
		List<SocialIndicatorsOfPoverty> list = socialIndicatorsOfPovertyService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
}
