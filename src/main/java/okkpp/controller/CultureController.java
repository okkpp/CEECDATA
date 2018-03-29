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

import okkpp.base.Msg;
import okkpp.service.culture.*;
import okkpp.utils.ChartInfo;

/**
 * @author duck
 * @date 创建时间：2018年3月20日 下午2:00:51
 */
@RequestMapping("/culture")
@Controller
public class CultureController {

	@Autowired
	AdultLiteracyRateService AdultLiteracyRateService;
	@Autowired
	ExpenditureStudentGDPRateService ExpenditureStudentGDPRateService;
	@Autowired
	HealthTotalRateService HealthTotalRateService;
	@Autowired
	HightechnologyRateService HightechnologyRateService;
	@Autowired
	HospitalService HospitalService;
	@Autowired
	PatentApplicationsService PatentApplicationsService;
	@Autowired
	ResearchersAndTechniciansService ResearchersAndTechniciansService;
	@Autowired
	ReserchSpendingRateService ReserchSpendingRateService;
	@Autowired
	SchoolEnrollmentRatioService SchoolEnrollmentRatioService;
	@Autowired
	WaterPeopleRateService WaterPeopleRateService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
		case "AdultLiteracyRate":
			return ChartInfo.mapByCountry(AdultLiteracyRateService.selectAll());
		case "ExpenditureStudentGDPRate":
			return ChartInfo.mapByCountry(ExpenditureStudentGDPRateService.selectAll());
		case "HealthTotalRate":
			return ChartInfo.mapByCountry(HealthTotalRateService.selectAll());
		case "HightechnologyRate":
			return ChartInfo.mapByCountry(HightechnologyRateService.selectAll());
		case "Hospital":
			return ChartInfo.mapByCountry(HospitalService.selectAll());
		case "PatentApplications":
			return ChartInfo.mapByCountry(PatentApplicationsService.selectAll());
		case "ResearchersAndTechnicians":
			return ChartInfo.mapByCountry(ResearchersAndTechniciansService.selectAll());
		case "ReserchSpendingRate":
			return ChartInfo.mapByCountry(ReserchSpendingRateService.selectAll());
		case "SchoolEnrollmentRatio":
			return ChartInfo.mapByCountry(SchoolEnrollmentRatioService.selectAll());
		case "WaterPeopleRate":
			return ChartInfo.mapByCountry(WaterPeopleRateService.selectAll());
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
		case "AdultLiteracyRate":
			pageInfo = AdultLiteracyRateService.getPageInfo(pn);
			break;
		case "ExpenditureStudentGDPRate":
			pageInfo = ExpenditureStudentGDPRateService.getPageInfo(pn);
			break;
		case "HealthTotalRate":
			pageInfo = HealthTotalRateService.getPageInfo(pn);
			break;
		case "HightechnologyRate":
			pageInfo = HightechnologyRateService.getPageInfo(pn);
			break;
		case "Hospital":
			pageInfo = HospitalService.getPageInfo(pn);
			break;
		case "PatentApplications":
			pageInfo = PatentApplicationsService.getPageInfo(pn);
			break;
		case "ResearchersAndTechnicians":
			pageInfo = ResearchersAndTechniciansService.getPageInfo(pn);
			break;
		case "SchoolEnrollmentRatio":
			pageInfo = SchoolEnrollmentRatioService.getPageInfo(pn);
			break;
		case "WaterPeopleRate":
			pageInfo = WaterPeopleRateService.getPageInfo(pn);
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
		case "AdultLiteracyRate":
			pageInfo = AdultLiteracyRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ExpenditureStudentGDPRate":
			pageInfo = ExpenditureStudentGDPRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "HealthTotalRate":
			pageInfo = HealthTotalRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "HightechnologyRate":
			pageInfo = HightechnologyRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Hospital":
			pageInfo = HospitalService.getPageInfoByCondition(pn, column, condition);
			break;
		case "PatentApplications":
			pageInfo = PatentApplicationsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ResearchersAndTechnicians":
			pageInfo = ResearchersAndTechniciansService.getPageInfoByCondition(pn, column, condition);
			break;
		case "SchoolEnrollmentRatio":
			pageInfo = SchoolEnrollmentRatioService.getPageInfoByCondition(pn, column, condition);
			break;
		case "WaterPeopleRate":
			pageInfo = WaterPeopleRateService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
