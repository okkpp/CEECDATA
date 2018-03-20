package okkpp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.service.energy.*;
import okkpp.utils.CountryMap;
/**
* @author duck
* @date 创建时间：2018年3月20日 下午2:53:22
*/
@RequestMapping("/energy")
@Controller
public class EnergyController {

	@Autowired
	BalanceSheetService BalanceSheetService;
	@Autowired
	CombustibleRenewalsService CombustibleRenewalsService;
	@Autowired
	ElectricityGenerationService ElectricityGenerationService;
	@Autowired
	EnergyImportsService EnergyImportsService;
	@Autowired
	EnergyUseOfGDPService EnergyUseOfGDPService;
	@Autowired
	NuclearPercentageService NuclearPercentageService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		case "BalanceSheet":
			return CountryMap.mapByCountry(BalanceSheetService.selectAll());
		case "CombustibleRenewals":
			return CountryMap.mapByCountry(CombustibleRenewalsService.selectAll());
		case "ElectricityGeneration":
			return CountryMap.mapByCountry(ElectricityGenerationService.selectAll());
		case "EnergyImports":
			return CountryMap.mapByCountry(EnergyImportsService.selectAll());
		case "EnergyUseOfGDP":
			return CountryMap.mapByCountry(EnergyUseOfGDPService.selectAll());
		case "NuclearPercentage":
			return CountryMap.mapByCountry(NuclearPercentageService.selectAll());
		}
		return null;
	}
}
