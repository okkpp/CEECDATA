package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.service.poverty.*;
import okkpp.model.Msg;
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
	@RequestMapping(value = "/household_consumption_expenditure",method = RequestMethod.POST)
	@ResponseBody
	public Msg household_consumption_expenditure(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<HouseholdConsumptionExpenditure> list = householdConsumptionExpenditureService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	InternationalPovertyRatioService internationalPovertyRatioService;
	@RequestMapping("/InternationalPovertyRatio")
	public String InternationalPovertyRatio(Model model) {
		List<InternationalPovertyRatio> list = internationalPovertyRatioService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/international_poverty_ratio",method = RequestMethod.POST)
	@ResponseBody
	public Msg international_poverty_ratio(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<InternationalPovertyRatio> list = internationalPovertyRatioService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	PersonalIncomeService personalIncomeService;
	@RequestMapping("/PersonalIncome")
	public String PersonalIncome(Model model) {
		List<PersonalIncome> list = personalIncomeService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/personal_income",method = RequestMethod.POST)
	@ResponseBody
	public Msg personal_income(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<PersonalIncome> list = personalIncomeService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
		
	@Autowired
	PovertyRateService povertyRateService;
	@RequestMapping("/PovertyRate")
	public String PovertyRate(Model model) {
		List<PovertyRate> list = povertyRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/poverty_rate",method = RequestMethod.POST)
	@ResponseBody
	public Msg poverty_rate(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<PovertyRate> list = povertyRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	SocialIndicatorsOfPovertyService socialIndicatorsOfPovertyService;
	@RequestMapping("/SocialIndicatorsOfPoverty")
	public String SocialIndicatorsOfPoverty(Model model) {
		List<SocialIndicatorsOfPoverty> list = socialIndicatorsOfPovertyService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/social_indicators_of_poverty",method = RequestMethod.POST)
	@ResponseBody
	public Msg social_indicators_of_poverty(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<SocialIndicatorsOfPoverty> list = socialIndicatorsOfPovertyService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
}
