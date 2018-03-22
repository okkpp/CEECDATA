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
import okkpp.service.industry.IndicesOfIndustrialService;
import okkpp.service.industry.IndicesOfManufacturingService;
import okkpp.service.industry.IndicesOfMiningService;
import okkpp.service.industry.ValueAddedInManufacturingService;
import okkpp.utils.ChartInfo;

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
		switch (info) {
		case "IndicesOfIndustrial":
			return ChartInfo.mapByCountry(indicesOfIndustrialService.selectAll());
		case "IndicesOfManufacturing":
			return ChartInfo.mapByCountry(indicesOfManufacturingService.selectAll());
		case "IndicesOfMining":
			return ChartInfo.mapByCountry(indicesOfMiningService.selectAll());
		case "ValueAddedInManufacturing":
			return ChartInfo.mapByCountry(valueAddedInManufacturingService.selectAll());
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
		case "IndicesOfIndustrial":
			pageInfo = indicesOfIndustrialService.getPageInfo(pn);
			break;
		case "IndicesOfManufacturing":
			pageInfo = indicesOfManufacturingService.getPageInfo(pn);
			break;
		case "IndicesOfMining":
			pageInfo = indicesOfMiningService.getPageInfo(pn);
			break;
		case "ValueAddedInManufacturing":
			pageInfo = valueAddedInManufacturingService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

}
