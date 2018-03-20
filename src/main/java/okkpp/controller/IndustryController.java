package okkpp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.service.industry.IndicesOfIndustrialService;
import okkpp.service.industry.IndicesOfManufacturingService;
import okkpp.service.industry.IndicesOfMiningService;
import okkpp.service.industry.ValueAddedInManufacturingService;
import okkpp.utils.CountryMap;

@Controller
@RequestMapping("/industry")
public class IndustryController {
	
	@Autowired
	IndicesOfIndustrialService indicesOfIndustrialService;
	@Autowired
	IndicesOfManufacturingService indicesOfManufacturingService;
	@Autowired
	IndicesOfMiningService indicesOfMiningService;
	@Autowired
	ValueAddedInManufacturingService valueAddedInManufacturingService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		 	case "IndicesOfIndustrial" :
		 		return CountryMap.mapByCountry(indicesOfIndustrialService.selectAll());
		 	case "IndicesOfManufacturing" :
		 		return CountryMap.mapByCountry(indicesOfManufacturingService.selectAll());
		 	case "IndicesOfMining" :
		 		return CountryMap.mapByCountry(indicesOfMiningService.selectAll());
		 	case "ValueAddedInManufacturing" :
		 		return CountryMap.mapByCountry(valueAddedInManufacturingService.selectAll());
		}
		return null;
	}
	
}
