package okkpp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.service.agriculture.*;
import okkpp.utils.CountryMap;

/**
* @author duck
* @date 创建时间：2018年3月20日 上午11:22:07
*/
@Controller
@RequestMapping("/agriculture")
public class AgricultureController {

	@Autowired
	HarvestAreasService HarvestAreasService;
	@Autowired
	LivestockService LivestockService;
	@Autowired
	OutputOfForestProductsServiece OutputOfForestProductsServiece;
	@Autowired
	OutputOfLivestockProductsService OutputOfLivestockProductsService;
	@Autowired
	ProductionOfFarmCropsService ProductionOfFarmCropsService;
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		case "HarvestAreas":
			return CountryMap.mapByCountry(HarvestAreasService.selectAll());
		case "Livestock":
			return CountryMap.mapByCountry(LivestockService.selectAll());
		case "OutputOfForestProducts":
			return CountryMap.mapByCountry(OutputOfForestProductsServiece.selectAll());
		case "OutputOfLivestockProducts":
			return CountryMap.mapByCountry(OutputOfLivestockProductsService.selectAll());
		case "ProductionOfFarmCrops":
			return CountryMap.mapByCountry(ProductionOfFarmCropsService.selectAll());
		}
		return null;
	}
}
