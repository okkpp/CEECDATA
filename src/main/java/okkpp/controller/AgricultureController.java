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
import okkpp.service.agriculture.*;
import okkpp.utils.ChartInfo;

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
			return ChartInfo.mapByCountry(HarvestAreasService.selectAll());
		case "Livestock":
			return ChartInfo.mapByCountry(LivestockService.selectAll());
		case "OutputOfForestProducts":
			return ChartInfo.mapByCountry(OutputOfForestProductsServiece.selectAll());
		case "OutputOfLivestockProducts":
			return ChartInfo.mapByCountry(OutputOfLivestockProductsService.selectAll());
		case "ProductionOfFarmCrops":
			return ChartInfo.mapByCountry(ProductionOfFarmCropsService.selectAll());
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
		case "HarvestAreas":
			pageInfo = HarvestAreasService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Livestock":
			pageInfo = LivestockService.getPageInfoByCondition(pn, column, condition);
			break;
		case "OutputOfForestProducts":
			pageInfo = OutputOfForestProductsServiece.getPageInfoByCondition(pn, column, condition);
			break;
		case "OutputOfLivestockProducts":
			pageInfo = OutputOfLivestockProductsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ProductionOfFarmCrops":
			pageInfo = ProductionOfFarmCropsService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
