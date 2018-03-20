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
		switch (info) {
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

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.POST)
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
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

}
