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

import okkpp.model.Msg;
import okkpp.service.employment.*;
import okkpp.utils.ChartInfo;

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
			return ChartInfo.mapByCountry(CompositionEmploymentService.selectAll());
		case "Educational":
			return ChartInfo.mapByCountry(EducationalService.selectAll());
		case "EducationalUnemployment":
			return ChartInfo.mapByCountry(EducationalUnemploymentService.selectAll());
		case "EmploymentGDP":
			return ChartInfo.mapByCountry(EmploymentGDPService.selectAll());
		case "Employment":
			return ChartInfo.mapByCountry(EmploymentService.selectAll());
		case "LaborForceParticipationRate":
			return ChartInfo.mapByCountry(LaborForceParticipationRateService.selectAll());
		case "LaborForce":
			return ChartInfo.mapByCountry(LaborForceService.selectAll());
		case "UnemploymentRate":
			return ChartInfo.mapByCountry(UnemploymentRateService.selectAll());
		case "Unemployment":
			return ChartInfo.mapByCountry(UnemploymentService.selectAll());
		case "Wages":
			return ChartInfo.mapByCountry(WagesService.selectAll());
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
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 后台按条件获取数据
	@RequestMapping(value = "/getJsonByCondition/{info}", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "CompositionEmployment":
			pageInfo = CompositionEmploymentService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Educational":
			pageInfo = EducationalService.getPageInfoByCondition(pn, column, condition);
			break;
		case "EducationalUnemployment":
			pageInfo = EducationalUnemploymentService.getPageInfoByCondition(pn, column, condition);
			break;
		case "EmploymentGDP":
			pageInfo = EmploymentGDPService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Employment":
			pageInfo = EmploymentService.getPageInfoByCondition(pn, column, condition);
			break;
		case "LaborForceParticipationRate":
			pageInfo = LaborForceParticipationRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "LaborForce":
			pageInfo = LaborForceService.getPageInfoByCondition(pn, column, condition);
			break;
		case "UnemploymentRate":
			pageInfo = UnemploymentRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Unemployment":
			pageInfo = UnemploymentService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Wages":
			pageInfo = WagesService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
