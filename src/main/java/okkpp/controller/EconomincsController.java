package okkpp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.service.economics.*;
import okkpp.utils.CountryMap;

@Controller
@RequestMapping("/economics")
public class EconomincsController {

	@Autowired
	FinalConsumptionService FinalConsumptionService;
	@Autowired
	GDPPCService GDPPCService;
	@Autowired
	GDPService GDPService;
	@Autowired
	GNIPCService GNIPCService;
	@Autowired
	GrowthOfGDPPCService GrowthOfGDPPCService;
	@Autowired
	GrowthOfGDPService GrowthOfGDPService;
	@Autowired
	IndicatorsOfNAService IndicatorsOfNAService;
	@Autowired
	PercentageOfAgricultureService PercentageOfAgricultureService;
	@Autowired
	PercentageOfIndicesService PercentageOfIndicesService;
	@Autowired
	PercentageOfServiceService PercentageOfServiceService;
	@Autowired
	RateOfConsumptionService RateOfConsumptionService;
	@Autowired
	RateOfFormationService RateOfFormationService;
	@Autowired
	ShareOfFormationService ShareOfFormationService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		case "FinalConsumption":
			return CountryMap.mapByCountry(FinalConsumptionService.selectAll());
		case "GDPPC":
			return CountryMap.mapByCountry(GDPPCService.selectAll());
		case "GDP":
			return CountryMap.mapByCountry(GDPService.selectAll());
		case "GNIPC":
			return CountryMap.mapByCountry(GNIPCService.selectAll());
		case "GrowthOfGDPPC":
			return CountryMap.mapByCountry(GrowthOfGDPPCService.selectAll());
		case "IndicatorsOfNA":
			return CountryMap.mapByCountry(IndicatorsOfNAService.selectAll());
		case "PercentageOfAgriculture":
			return CountryMap.mapByCountry(PercentageOfAgricultureService.selectAll());
		case "PercentageOfIndices":
			return CountryMap.mapByCountry(PercentageOfIndicesService.selectAll());
		case "PercentageOfService":
			return CountryMap.mapByCountry(PercentageOfServiceService.selectAll());
		case "RateOfConsumption":
			return CountryMap.mapByCountry(RateOfConsumptionService.selectAll());
		case "RateOfFormation":
			return CountryMap.mapByCountry(RateOfFormationService.selectAll());
		case "ShareOfFormation":
			return CountryMap.mapByCountry(ShareOfFormationService.selectAll());
		}
		return null;
	}
	@RequestMapping("/FinalConsumption")
	public String FinalConsumption(Model model) {
		model.addAttribute("data",FinalConsumptionService.selectAll());
		return "economics/FinalConsumption";
	}
}
