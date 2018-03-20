package okkpp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.service.culture.*;
import okkpp.utils.CountryMap;

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
		switch(info) {
		case "AdultLiteracyRate":
			return CountryMap.mapByCountry(AdultLiteracyRateService.selectAll());
		case "ExpenditureStudentGDPRate":
			return CountryMap.mapByCountry(ExpenditureStudentGDPRateService.selectAll());
		case "HealthTotalRate":
			return CountryMap.mapByCountry(HealthTotalRateService.selectAll());
		case "HightechnologyRate":
			return CountryMap.mapByCountry(HightechnologyRateService.selectAll());
		case "Hospital":
			return CountryMap.mapByCountry(HospitalService.selectAll());
		case "PatentApplications":
			return CountryMap.mapByCountry(PatentApplicationsService.selectAll());
		case "ResearchersAndTechnicians":
			return CountryMap.mapByCountry(ResearchersAndTechniciansService.selectAll());
		case "SchoolEnrollmentRatio":
			return CountryMap.mapByCountry(SchoolEnrollmentRatioService.selectAll());
		case "WaterPeopleRate":
			return CountryMap.mapByCountry(WaterPeopleRateService.selectAll());
		}
		return null;
	}
}
