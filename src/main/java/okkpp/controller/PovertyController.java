package okkpp.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import okkpp.service.poverty.*;
import okkpp.utils.ChartInfo;
import okkpp.model.Msg;

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
			return ChartInfo.mapByCountry(householdConsumptionExpenditureService.selectAll());
		case "InternationalPovertyRatio":
			return ChartInfo.mapByCountry(internationalPovertyRatioService.selectAll());
		case "PersonalIncome":
			return ChartInfo.mapByCountry(personalIncomeService.selectAll());
		case "PovertyRate":
			return ChartInfo.mapByCountry(povertyRateService.selectAll());
		case "SocialIndicatorsOfPoverty":
			return ChartInfo.mapByCountry(socialIndicatorsOfPovertyService.selectAll());
		}
		return null;
	}

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.GET)
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
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 后台按条件查找
	@RequestMapping(value = "/getJsonByCondition/{info}", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "HouseholdConsumptionExpenditure":
			pageInfo = householdConsumptionExpenditureService.getPageInfoByCondition(pn, column, condition);
			break;
		case "InternationalPovertyRatio":
			pageInfo = internationalPovertyRatioService.getPageInfoByCondition(pn, column, condition);
			break;
		case "PersonalIncome":
			pageInfo = personalIncomeService.getPageInfoByCondition(pn, column, condition);
			break;
		case "PovertyRate":
			pageInfo = povertyRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "SocialIndicatorsOfPoverty":
			pageInfo = socialIndicatorsOfPovertyService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

}
