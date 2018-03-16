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
import okkpp.model.Msg;
import okkpp.model.population.*;

@Controller
@RequestMapping("/population")
public class populationController {

	@Autowired
	BirthRateDeathRateService bRateDeathRateService;
	@RequestMapping("/BirthRateDeathRate")
	public String BirthAndDeathRate(Model model) {
		List<BirthRateDeathRate> list = bRateDeathRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/birth_rate_death_rate",method = RequestMethod.POST)
	@ResponseBody
	public Msg birthAndDeathRate(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<BirthRateDeathRate> list = bRateDeathRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}

	@Autowired
	CompositionDependencyRatioService compositionDependencyRatioService;
	@RequestMapping("/CompositionDependencyRatio")
	public String CompositionDependencyRatio(Model model) {
		List<CompositionDependencyRatio> list = compositionDependencyRatioService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/composition_dependency_ratio",method = RequestMethod.POST)
	@ResponseBody
	public Msg compositionDependencyRatio(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<CompositionDependencyRatio> list = compositionDependencyRatioService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	DensityService densityService;
	@RequestMapping("/Density")
	public String Density(Model model) {
		List<Density> list = densityService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/density",method = RequestMethod.POST)
	@ResponseBody
	public Msg density(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Density> list = densityService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	FemalePercentService femalePercentService;
	@RequestMapping("/FemalePercent")
	public String FemalePercent(Model model) {
		List<FemalePercent> list = femalePercentService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/female_percent",method = RequestMethod.POST)
	@ResponseBody
	public Msg femalePercent(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<FemalePercent> list = femalePercentService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	InfantMortalityRateService infantMortalityRateService;
	@RequestMapping(value = "/InfantMortalityRate",method = RequestMethod.POST)
	public String InfantMortalityRate(Model model) {
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping("/infant_mortality_rate")
	@ResponseBody
	public Msg infantMortalityRate(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	LifeExpectancyAtBirthService lifeExpectancyAtBirthService;
	@RequestMapping("/LifeExpectancyAtBirth")
	public String LifeExpectancyAtBirth(Model model) {
		List<LifeExpectancyAtBirth> list = lifeExpectancyAtBirthService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/life_expectancy_at_birth",method = RequestMethod.POST)
	@ResponseBody
	public Msg lifeExpectancyAtBirth(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<LifeExpectancyAtBirth> list = lifeExpectancyAtBirthService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	MidYearPoplationService midYearPoplationService;
	@RequestMapping("/MidYearPoplation")
	public String MidYearPoplation(Model model) {
		List<MidYearPoplation> list = midYearPoplationService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/mid_year_poplation",method = RequestMethod.POST)
	@ResponseBody
	public Msg midYearPoplation(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<MidYearPoplation> list = midYearPoplationService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	ReproductiveHealthService reproductiveHealthService;
	@RequestMapping("/ReproductiveHealth")
	public String ReproductiveHealth(Model model) {
		List<ReproductiveHealth> list = reproductiveHealthService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/reproductive_health",method = RequestMethod.POST)
	@ResponseBody
	public Msg reproductiveHealth(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<ReproductiveHealth> list = reproductiveHealthService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	RuralAndUrbanRateService ruralAndUrbanRateService;
	@RequestMapping("/RuralAndUrbanRate")
	public String RuralAndUrbanRate(Model model) {
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/rural_and_urban_rate",method = RequestMethod.POST)
	@ResponseBody
	public Msg ruralAndUrbanRate(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
}
