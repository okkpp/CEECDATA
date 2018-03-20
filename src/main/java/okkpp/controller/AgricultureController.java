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
		switch (info) {
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

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.POST)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("info") String info) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "HarvestAreas":
			pageInfo = HarvestAreasService.getPageInfo(pn);
			break;
		case "Livestock":
			pageInfo = LivestockService.getPageInfo(pn);
			break;
		case "OutputOfForestProducts":
			pageInfo = OutputOfForestProductsServiece.getPageInfo(pn);
			break;
		case "OutputOfLivestockProducts":
			pageInfo = OutputOfLivestockProductsService.getPageInfo(pn);
			break;
		case "ProductionOfFarmCrops":
			pageInfo = ProductionOfFarmCropsService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
