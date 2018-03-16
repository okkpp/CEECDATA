package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import okkpp.service.population.*;
import okkpp.service.traffic.AirFreightService;
import okkpp.model.Msg;
import okkpp.model.population.*;
import okkpp.model.price.Producer;
import okkpp.model.traffic.AirFreight;

@Controller
@RequestMapping("/population")
public class populationController {

	@Autowired
	BirthAndDeathRateService birthAndDeathRateService;

	@RequestMapping("/BirthAndDeathRate")
	public String BirthAndDeathRate(Model model) {
		List<BirthAndDeathRate> list = birthAndDeathRateService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/birth_rate_death_rate", method = RequestMethod.POST)
	@ResponseBody
	public Msg birthAndDeathRate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<BirthAndDeathRate> list = birthAndDeathRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找birthAndDeathRate
	@RequestMapping("/selectBirthAndDeathRateByExample")
	@ResponseBody
	public Msg selectBirthAndDeathRateByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<BirthAndDeathRate> list = birthAndDeathRateService.selectByExample(column, condition);
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

	@RequestMapping(value = "/composition_dependency_ratio", method = RequestMethod.POST)
	@ResponseBody
	public Msg compositionDependencyRatio(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<CompositionDependencyRatio> list = compositionDependencyRatioService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找birthAndDeathRate
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

	@RequestMapping(value = "/density", method = RequestMethod.POST)
	@ResponseBody
	public Msg density(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Density> list = densityService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找density
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

	@RequestMapping(value = "/female_percent", method = RequestMethod.POST)
	@ResponseBody
	public Msg femalePercent(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<FemalePercent> list = femalePercentService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找femalePercent
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

	@RequestMapping(value = "/InfantMortalityRate", method = RequestMethod.POST)
	public String InfantMortalityRate(Model model) {
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping("/infant_mortality_rate")
	@ResponseBody
	public Msg infantMortalityRate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找InfantMortalityRate
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

	@RequestMapping(value = "/life_expectancy_at_birth", method = RequestMethod.POST)
	@ResponseBody
	public Msg lifeExpectancyAtBirth(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<LifeExpectancyAtBirth> list = lifeExpectancyAtBirthService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找lifeExpectancyAtBirth
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

	@RequestMapping(value = "/mid_year_poplation", method = RequestMethod.POST)
	@ResponseBody
	public Msg midYearPoplation(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<MidYearPoplation> list = midYearPoplationService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找midYearPoplation
	@RequestMapping("/selectMidYearPoplationBirthByExample")
	@ResponseBody
	public Msg selectMidYearPoplationBirthByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model, @RequestParam("column") String column, @RequestParam("condition") String condition) {
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

	@RequestMapping(value = "/reproductive_health", method = RequestMethod.POST)
	@ResponseBody
	public Msg reproductiveHealth(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<ReproductiveHealth> list = reproductiveHealthService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找reproductiveHealth
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

	@RequestMapping(value = "/rural_and_urban_rate", method = RequestMethod.POST)
	@ResponseBody
	public Msg ruralAndUrbanRate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 按条件查找ruralAndUrbanRate
	@RequestMapping("/selectRuralAndUrbanRateByExample")
	@ResponseBody
	public Msg selectRuralAndUrbanRateByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

}
