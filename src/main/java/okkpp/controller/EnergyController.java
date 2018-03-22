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
import okkpp.service.energy.*;
import okkpp.utils.ChartInfo;

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
		switch (info) {
		case "BalanceSheet":
			return ChartInfo.mapByCountry(BalanceSheetService.selectAll());
		case "CombustibleRenewals":
			return ChartInfo.mapByCountry(CombustibleRenewalsService.selectAll());
		case "ElectricityGeneration":
			return ChartInfo.mapByCountry(ElectricityGenerationService.selectAll());
		case "EnergyImports":
			return ChartInfo.mapByCountry(EnergyImportsService.selectAll());
		case "EnergyUseOfGDP":
			return ChartInfo.mapByCountry(EnergyUseOfGDPService.selectAll());
		case "NuclearPercentage":
			return ChartInfo.mapByCountry(NuclearPercentageService.selectAll());
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
		case "BalanceSheet":
			pageInfo = BalanceSheetService.getPageInfo(pn);
			break;
		case "CombustibleRenewals":
			pageInfo = CombustibleRenewalsService.getPageInfo(pn);
			break;
		case "ElectricityGeneration":
			pageInfo = ElectricityGenerationService.getPageInfo(pn);
			break;
		case "EnergyImports":
			pageInfo = EnergyImportsService.getPageInfo(pn);
			break;
		case "EnergyUseOfGDP":
			pageInfo = EnergyUseOfGDPService.getPageInfo(pn);
			break;
		case "NuclearPercentage":
			pageInfo = NuclearPercentageService.getPageInfo(pn);
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
		case "BalanceSheet":
			pageInfo = BalanceSheetService.getPageInfoByCondition(pn, column, condition);
			break;
		case "CombustibleRenewals":
			pageInfo = CombustibleRenewalsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ElectricityGeneration":
			pageInfo = ElectricityGenerationService.getPageInfoByCondition(pn, column, condition);
			break;
		case "EnergyImports":
			pageInfo = EnergyImportsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "EnergyUseOfGDP":
			pageInfo = EnergyUseOfGDPService.getPageInfoByCondition(pn, column, condition);
			break;
		case "NuclearPercentage":
			pageInfo = NuclearPercentageService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

}
