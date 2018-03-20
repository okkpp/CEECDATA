package okkpp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		switch(info) {
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
}
