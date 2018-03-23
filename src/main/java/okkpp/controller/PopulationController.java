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
<<<<<<< HEAD
import okkpp.model.population.*;
import okkpp.model.price.Consumer;
=======
>>>>>>> 7e436f732b564afbf42a151accf7c5eeccf454c3

@Controller
@RequestMapping("/population")
public class PopulationController {

	@Autowired
	BirthRateDeathRateService birthRateDeathRateService;
<<<<<<< HEAD

	@RequestMapping("/BirthRateDeathRate")
	public String BirthAndDeathRate(Model model) {
		List<BirthRateDeathRate> list = birthRateDeathRateService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/BirthRateDeathRate", method = RequestMethod.POST)
	@ResponseBody
	public Msg birthAndDeathRate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<BirthRateDeathRate> list = birthRateDeathRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找
	@RequestMapping("/selectBirthRateDeathRateByExample")
	@ResponseBody
	public Msg selectBirthRateDeathRateByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model, @RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<BirthRateDeathRate> list = birthRateDeathRateService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	CompositionDependencyRatioService compositionDependencyRatioService;

	@RequestMapping("/CompositionDependencyRatio")
	public String CompositionDependencyRatio(Model model) {
		List<CompositionDependencyRatio> list = compositionDependencyRatioService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/CompositionDependencyRatio", method = RequestMethod.POST)
	@ResponseBody
	public Msg compositionDependencyRatio(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<CompositionDependencyRatio> list = compositionDependencyRatioService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找
	@RequestMapping("/selectCompositionDependencyRatioByExample")
	@ResponseBody
	public Msg selectCompositionDependencyRatioByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model, @RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<CompositionDependencyRatio> list = compositionDependencyRatioService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	DensityService densityService;

	@RequestMapping("/Density")
	public String Density(Model model) {
		List<Density> list = densityService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/Density", method = RequestMethod.POST)
	@ResponseBody
	public Msg density(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Density> list = densityService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找
	@RequestMapping("/selectDensityByExample")
	@ResponseBody
	public Msg selectDensityByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<Density> list = densityService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	FemalePercentService femalePercentService;

	@RequestMapping("/FemalePercent")
	public String FemalePercent(Model model) {
		List<FemalePercent> list = femalePercentService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/FemalePercent", method = RequestMethod.POST)
	@ResponseBody
	public Msg femalePercent(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<FemalePercent> list = femalePercentService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/selectFemalePercentByExample")
	@ResponseBody
	public Msg selectFemalePercentByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<FemalePercent> list = femalePercentService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	InfantMortalityRateService infantMortalityRateService;

	@RequestMapping("/InfantMortalityRate")
	public String InfantMortalityRate(Model model) {
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/InfantMortalityRate", method = RequestMethod.POST)
	@ResponseBody
	public Msg infantMortalityRate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/selectInfantMortalityRateByExample")
	@ResponseBody
	public Msg selectInfantMortalityRateByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model, @RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<InfantMortalityRate> list = infantMortalityRateService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	LifeExpectancyAtBirthService lifeExpectancyAtBirthService;

	@RequestMapping("/LifeExpectancyAtBirth")
	public String LifeExpectancyAtBirth(Model model) {
		List<LifeExpectancyAtBirth> list = lifeExpectancyAtBirthService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/LifeExpectancyAtBirth", method = RequestMethod.POST)
	@ResponseBody
	public Msg lifeExpectancyAtBirth(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<LifeExpectancyAtBirth> list = lifeExpectancyAtBirthService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/selectLifeExpectancyAtBirthByExample")
	@ResponseBody
	public Msg selectLifeExpectancyAtBirthByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model, @RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<LifeExpectancyAtBirth> list = lifeExpectancyAtBirthService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	MidYearPoplationService midYearPoplationService;

	@RequestMapping("/MidYearPoplation")
	public String MidYearPoplation(Model model) {
		List<MidYearPoplation> list = midYearPoplationService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/MidYearPoplation", method = RequestMethod.POST)
	@ResponseBody
	public Msg midYearPoplation(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<MidYearPoplation> list = midYearPoplationService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/selectMidYearPoplationByExample")
	@ResponseBody
	public Msg selectMidYearPoplationByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<MidYearPoplation> list = midYearPoplationService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	ReproductiveHealthService reproductiveHealthService;

	@RequestMapping("/ReproductiveHealth")
	public String ReproductiveHealth(Model model) {
		List<ReproductiveHealth> list = reproductiveHealthService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/ReproductiveHealth", method = RequestMethod.POST)
	@ResponseBody
	public Msg reproductiveHealth(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<ReproductiveHealth> list = reproductiveHealthService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/selectReproductiveHealthByExample")
	@ResponseBody
	public Msg selectReproductiveHealthByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model, @RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<ReproductiveHealth> list = reproductiveHealthService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@Autowired
	RuralAndUrbanRateService ruralAndUrbanRateService;

	@RequestMapping("/RuralAndUrbanRate")
	public String RuralAndUrbanRate(Model model) {
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/RuralAndUrbanRate", method = RequestMethod.POST)
	@ResponseBody
	public Msg ruralAndUrbanRate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

=======
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
>>>>>>> 7e436f732b564afbf42a151accf7c5eeccf454c3
}
