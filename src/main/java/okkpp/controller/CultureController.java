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
		case "SchoolEnrollmentRatio":
			return ChartInfo.mapByCountry(SchoolEnrollmentRatioService.selectAll());
		case "WaterPeopleRate":
			return ChartInfo.mapByCountry(WaterPeopleRateService.selectAll());
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
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
