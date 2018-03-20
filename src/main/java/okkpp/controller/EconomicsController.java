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
import okkpp.service.economics.*;
import okkpp.utils.CountryMap;

@Controller
@RequestMapping("/economics")
public class EconomicsController {

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
		switch (info) {
		case "FinalConsumption":
			return CountryMap.mapByCountry(FinalConsumptionService.selectAll());
		case "GDPPC":
			return CountryMap.mapByCountry(GDPPCService.selectAll());
		case "GDP":
			return CountryMap.mapByCountry(GDPService.selectAll());
		case "GNIPC":
			return CountryMap.mapByCountry(GNIPCService.selectAll());
		case "GrowthRateGdppc":
			return CountryMap.mapByCountry(GrowthOfGDPPCService.selectAll());
		case "IndicatorsOfNa":
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

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.POST)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("info") String info) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "FinalConsumption":
			pageInfo = FinalConsumptionService.getPageInfo(pn);
			break;
		case "Gdppc":
			pageInfo = GDPPCService.getPageInfo(pn);
			break;
		case "Gdp":
			pageInfo = GDPService.getPageInfo(pn);
			break;
		case "Gnipc":
			pageInfo = GNIPCService.getPageInfo(pn);
			break;
		case "GrowthRateGdp":
			pageInfo = GrowthOfGDPPCService.getPageInfo(pn);
			break;
		case "IndicatorsOfNa":
			pageInfo = IndicatorsOfNAService.getPageInfo(pn);
			break;
		case "PercentageOfAgriculture":
			pageInfo = PercentageOfAgricultureService.getPageInfo(pn);
			break;
		case "PercentageOfIndices":
			pageInfo = PercentageOfIndicesService.getPageInfo(pn);
			break;
		case "PercentageOfService":
			pageInfo = PercentageOfServiceService.getPageInfo(pn);
			break;
		case "RateOfConsumption":
			pageInfo = RateOfConsumptionService.getPageInfo(pn);
			break;
		case "RateOfFormation":
			pageInfo = RateOfFormationService.getPageInfo(pn);
			break;
		case "ShareOfFormation":
			pageInfo = ShareOfFormationService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/FinalConsumption")
	public String FinalConsumption(Model model) {
		model.addAttribute("data", FinalConsumptionService.selectAll());
		return "economics/FinalConsumption";
	}
}
