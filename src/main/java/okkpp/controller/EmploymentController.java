package okkpp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import okkpp.model.Msg;
import okkpp.service.employment.*;
import okkpp.utils.CountryMap;

/**
 * @author duck
 * @date 创建时间：2018年3月20日 下午2:45:25
 */
@RequestMapping("/employment")
@Controller
public class EmploymentController {

	@Autowired
	CompositionEmploymentService CompositionEmploymentService;
	@Autowired
	EducationalService EducationalService;
	@Autowired
	EducationalUnemploymentService EducationalUnemploymentService;
	@Autowired
	EmploymentGDPService EmploymentGDPService;
	@Autowired
	EmploymentService EmploymentService;
	@Autowired
	LaborForceParticipationRateService LaborForceParticipationRateService;
	@Autowired
	LaborForceService LaborForceService;
	@Autowired
	UnemploymentRateService UnemploymentRateService;
	@Autowired
	UnemploymentService UnemploymentService;
	@Autowired
	WagesService WagesService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
		case "CompositionEmployment":
			return CountryMap.mapByCountry(CompositionEmploymentService.selectAll());
		case "Educational":
			return CountryMap.mapByCountry(EducationalService.selectAll());
		case "EducationalUnemployment":
			return CountryMap.mapByCountry(EducationalUnemploymentService.selectAll());
		case "EmploymentGDP":
			return CountryMap.mapByCountry(EmploymentGDPService.selectAll());
		case "Employment":
			return CountryMap.mapByCountry(EmploymentService.selectAll());
		case "LaborForceParticipationRate":
			return CountryMap.mapByCountry(LaborForceParticipationRateService.selectAll());
		case "LaborForce":
			return CountryMap.mapByCountry(LaborForceService.selectAll());
		case "UnemploymentRate":
			return CountryMap.mapByCountry(UnemploymentRateService.selectAll());
		case "Unemployment":
			return CountryMap.mapByCountry(UnemploymentService.selectAll());
		case "Wages":
			return CountryMap.mapByCountry(WagesService.selectAll());
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
		case "CompositionEmployment":
			pageInfo = CompositionEmploymentService.getPageInfo(pn);
			break;
		case "Educational":
			pageInfo = EducationalService.getPageInfo(pn);
			break;
		case "EducationalUnemployment":
			pageInfo = EducationalUnemploymentService.getPageInfo(pn);
			break;
		case "EmploymentGDP":
			pageInfo = EmploymentGDPService.getPageInfo(pn);
			break;
		case "Employment":
			pageInfo = EmploymentService.getPageInfo(pn);
			break;
		case "LaborForceParticipationRate":
			pageInfo = LaborForceParticipationRateService.getPageInfo(pn);
			break;
		case "LaborForce":
			pageInfo = LaborForceService.getPageInfo(pn);
			break;
		case "UnemploymentRate":
			pageInfo = UnemploymentRateService.getPageInfo(pn);
			break;
		case "Unemployment":
			pageInfo = UnemploymentService.getPageInfo(pn);
			break;
		case "Wages":
			pageInfo = WagesService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
