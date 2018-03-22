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
import okkpp.utils.ChartInfo;

@Controller
@RequestMapping("/economics")
public class EconomicsController {

	@Autowired
	FinalConsumptionService FinalConsumptionService;
	@Autowired
	GdppcService GDPPCService;
	@Autowired
	GdpService GDPService;
	@Autowired
	GnipcService GNIPCService;
	@Autowired
	GrowthRateGdppcService GrowthOfGDPPCService;
	@Autowired
	GrowthRateGdpService GrowthOfGDPService;
	@Autowired
	IndicatorsOfNaService IndicatorsOfNAService;
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
			return ChartInfo.mapByCountry(FinalConsumptionService.selectAll());
		case "Gdppc":
			return ChartInfo.mapByCountry(GDPPCService.selectAll());
		case "Gdp":
			return ChartInfo.mapByCountry(GDPService.selectAll());
		case "Gnipc":
			return ChartInfo.mapByCountry(GNIPCService.selectAll());
		case "GrowthRateGdp" :
			return ChartInfo.mapByCountry(GrowthOfGDPService.selectAll());
		case "GrowthRateGdppc":
			return ChartInfo.mapByCountry(GrowthOfGDPPCService.selectAll());
		case "IndicatorsOfNa":
			return ChartInfo.mapByCountry(IndicatorsOfNAService.selectAll());
		case "PercentageOfAgriculture":
			return ChartInfo.mapByCountry(PercentageOfAgricultureService.selectAll());
		case "PercentageOfIndices":
			return ChartInfo.mapByCountry(PercentageOfIndicesService.selectAll());
		case "PercentageOfService":
			return ChartInfo.mapByCountry(PercentageOfServiceService.selectAll());
		case "RateOfConsumption":
			return ChartInfo.mapByCountry(RateOfConsumptionService.selectAll());
		case "RateOfFormation":
			return ChartInfo.mapByCountry(RateOfFormationService.selectAll());
		case "ShareOfFormation":
			return ChartInfo.mapByCountry(ShareOfFormationService.selectAll());
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
