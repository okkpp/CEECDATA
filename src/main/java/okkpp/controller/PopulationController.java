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
import okkpp.service.population.*;
import okkpp.utils.CountryMap;
import okkpp.model.Msg;

@Controller
@RequestMapping("/population")
public class PopulationController {

	@Autowired
	BirthRateDeathRateService birthRateDeathRateService;
	@Autowired
	CompositionDependencyRatioService compositionDependencyRatioService;
	@Autowired
	DensityService densityService;
	@Autowired
	FemalePercentService femalePercentService;
	@Autowired
	InfantMortalityRateService infantMortalityRateService;
	@Autowired
	LifeExpectancyAtBirthService lifeExpectancyAtBirthService;
	@Autowired
	MidYearPoplationService midYearPoplationService;
	@Autowired
	ReproductiveHealthService reproductiveHealthService;
	@Autowired
	RuralAndUrbanRateService ruralAndUrbanRateService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
		case "BirthRateDeathRate":
			return CountryMap.mapByCountry(birthRateDeathRateService.selectAll());
		case "CompositionDependencyRatio":
			return CountryMap.mapByCountry(compositionDependencyRatioService.selectAll());
		case "Density":
			return CountryMap.mapByCountry(densityService.selectAll());
		case "FemalePercent":
			return CountryMap.mapByCountry(femalePercentService.selectAll());
		case "InfantMortalityRate":
			return CountryMap.mapByCountry(infantMortalityRateService.selectAll());
		case "LifeExpectancyAtBirth":
			return CountryMap.mapByCountry(lifeExpectancyAtBirthService.selectAll());
		case "MidYearPoplation":
			return CountryMap.mapByCountry(midYearPoplationService.selectAll());
		case "ReproductiveHealth":
			return CountryMap.mapByCountry(reproductiveHealthService.selectAll());
		case "RuralAndUrbanRate":
			return CountryMap.mapByCountry(ruralAndUrbanRateService.selectAll());
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
		case "BirthRateDeathRate":
			pageInfo = birthRateDeathRateService.getPageInfo(pn);
			break;
		case "CompositionDependencyRatio":
			pageInfo = compositionDependencyRatioService.getPageInfo(pn);
			break;
		case "Density":
			pageInfo = densityService.getPageInfo(pn);
			break;
		case "FemalePercent":
			pageInfo = femalePercentService.getPageInfo(pn);
			break;
		case "InfantMortalityRate":
			pageInfo = infantMortalityRateService.getPageInfo(pn);
			break;
		case "LifeExpectancyAtBirth":
			pageInfo = lifeExpectancyAtBirthService.getPageInfo(pn);
			break;
		case "MidYearPoplation":
			pageInfo = midYearPoplationService.getPageInfo(pn);
			break;
		case "ReproductiveHealth":
			pageInfo = reproductiveHealthService.getPageInfo(pn);
			break;
		case "RuralAndUrbanRate":
			pageInfo = ruralAndUrbanRateService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
