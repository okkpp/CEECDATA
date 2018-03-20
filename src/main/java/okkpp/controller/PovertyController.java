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
		case "HouseholdConsumptionExpenditure":
			return CountryMap.mapByCountry(householdConsumptionExpenditureService.selectAll());
		case "InternationalPovertyRatio":
			return CountryMap.mapByCountry(internationalPovertyRatioService.selectAll());
		case "PersonalIncome":
			return CountryMap.mapByCountry(personalIncomeService.selectAll());
		case "PovertyRate":
			return CountryMap.mapByCountry(povertyRateService.selectAll());
		case "SocialIndicatorsOfPoverty":
			return CountryMap.mapByCountry(socialIndicatorsOfPovertyService.selectAll());
		}
		return null;
	}

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.POST)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("info") String info) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "HouseholdConsumptionExpenditure":
			pageInfo = householdConsumptionExpenditureService.getPageInfo(pn);
			break;
		case "InternationalPovertyRatio":
			pageInfo = internationalPovertyRatioService.getPageInfo(pn);
			break;
		case "PersonalIncome":
			pageInfo = personalIncomeService.getPageInfo(pn);
			break;
		case "PovertyRate":
			pageInfo = povertyRateService.getPageInfo(pn);
			break;
		case "SocialIndicatorsOfPoverty":
			pageInfo = socialIndicatorsOfPovertyService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

}
