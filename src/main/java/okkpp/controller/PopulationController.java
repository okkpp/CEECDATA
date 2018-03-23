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
import okkpp.service.population.*;
import okkpp.utils.ChartInfo;
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
			return ChartInfo.mapByCountry(birthRateDeathRateService.selectAll());
		case "CompositionDependencyRatio":
			return ChartInfo.mapByCountry(compositionDependencyRatioService.selectAll());
		case "Density":
			return ChartInfo.mapByCountry(densityService.selectAll());
		case "FemalePercent":
			return ChartInfo.mapByCountry(femalePercentService.selectAll());
		case "InfantMortalityRate":
			return ChartInfo.mapByCountry(infantMortalityRateService.selectAll());
		case "LifeExpectancyAtBirth":
			return ChartInfo.mapByCountry(lifeExpectancyAtBirthService.selectAll());
		case "MidYearPoplation":
			return ChartInfo.mapByCountry(midYearPoplationService.selectAll());
		case "ReproductiveHealth":
			return ChartInfo.mapByCountry(reproductiveHealthService.selectAll());
		case "RuralAndUrbanRate":
			return ChartInfo.mapByCountry(ruralAndUrbanRateService.selectAll());
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
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 后台按条件查找
	@RequestMapping(value = "/getJsonByCondition/{info}", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "BirthRateDeathRate":
			pageInfo = birthRateDeathRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "CompositionDependencyRatio":
			pageInfo = compositionDependencyRatioService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Density":
			pageInfo = densityService.getPageInfoByCondition(pn, column, condition);
			break;
		case "FemalePercent":
			pageInfo = femalePercentService.getPageInfoByCondition(pn, column, condition);
			break;
		case "InfantMortalityRate":
			pageInfo = infantMortalityRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "LifeExpectancyAtBirth":
			pageInfo = lifeExpectancyAtBirthService.getPageInfoByCondition(pn, column, condition);
			break;
		case "MidYearPoplation":
			pageInfo = midYearPoplationService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ReproductiveHealth":
			pageInfo = reproductiveHealthService.getPageInfoByCondition(pn, column, condition);
			break;
		case "RuralAndUrbanRate":
			pageInfo = ruralAndUrbanRateService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
