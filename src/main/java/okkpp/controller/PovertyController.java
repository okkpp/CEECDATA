package okkpp.controller;

import java.util.List;
import java.util.Map;

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
import okkpp.utils.CountryMap;
import okkpp.model.Msg;
import okkpp.model.poverty.*;

@Controller
@RequestMapping("/poverty")
public class PovertyController {

	@Autowired
	HouseholdConsumptionExpenditureService householdConsumptionExpenditureService;
	@Autowired
	InternationalPovertyRatioService internationalPovertyRatioService;
	@Autowired
	PersonalIncomeService personalIncomeService;
	@Autowired
	PovertyRateService povertyRateService;
	@Autowired
	SocialIndicatorsOfPovertyService socialIndicatorsOfPovertyService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
			case "HouseholdConsumptionExpenditure" :
				return CountryMap.mapByCountry(householdConsumptionExpenditureService.selectAll());
			case "InternationalPovertyRatio" :
				return CountryMap.mapByCountry(internationalPovertyRatioService.selectAll());
			case "PersonalIncome" :
				return CountryMap.mapByCountry(personalIncomeService.selectAll());
			case "PovertyRate" :
				return CountryMap.mapByCountry(povertyRateService.selectAll());
			case "SocialIndicatorsOfPoverty" :
				return CountryMap.mapByCountry(socialIndicatorsOfPovertyService.selectAll());
		}
		return null;
	}

	@RequestMapping("/HouseholdConsumptionExpenditure")
	public String HouseholdConsumptionExpenditure(Model model) {
		List<HouseholdConsumptionExpenditure> list = householdConsumptionExpenditureService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/HouseholdConsumptionExpenditure",method = RequestMethod.POST)
	@ResponseBody
	public Msg household_consumption_expenditure(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<HouseholdConsumptionExpenditure> list = householdConsumptionExpenditureService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/InternationalPovertyRatio")
	public String InternationalPovertyRatio(Model model) {
		List<InternationalPovertyRatio> list = internationalPovertyRatioService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/InternationalPovertyRatio",method = RequestMethod.POST)
	@ResponseBody
	public Msg international_poverty_ratio(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<InternationalPovertyRatio> list = internationalPovertyRatioService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/PersonalIncome")
	public String PersonalIncome(Model model) {
		List<PersonalIncome> list = personalIncomeService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/PersonalIncome",method = RequestMethod.POST)
	@ResponseBody
	public Msg personal_income(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<PersonalIncome> list = personalIncomeService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
		
	
	@RequestMapping("/PovertyRate")
	public String PovertyRate(Model model) {
		List<PovertyRate> list = povertyRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/PovertyRate",method = RequestMethod.POST)
	@ResponseBody
	public Msg poverty_rate(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<PovertyRate> list = povertyRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/SocialIndicatorsOfPoverty")
	public String SocialIndicatorsOfPoverty(Model model) {
		List<SocialIndicatorsOfPoverty> list = socialIndicatorsOfPovertyService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/SocialIndicatorsOfPoverty",method = RequestMethod.POST)
	@ResponseBody
	public Msg social_indicators_of_poverty(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<SocialIndicatorsOfPoverty> list = socialIndicatorsOfPovertyService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
}
