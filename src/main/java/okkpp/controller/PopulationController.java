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
public class PopulationController {

	@Autowired
	BirthRateDeathRateService birthRateDeathRateService;
	@RequestMapping("/BirthRateDeathRate")
	public String BirthAndDeathRate(Model model) {
		List<BirthRateDeathRate> list = birthRateDeathRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/BirthRateDeathRate",method = RequestMethod.POST)
	@ResponseBody
	public Msg birthAndDeathRate(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<BirthRateDeathRate> list = birthRateDeathRateService.selectAll();
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
	@RequestMapping(value = "/CompositionDependencyRatio",method = RequestMethod.POST)
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
	@RequestMapping(value = "/Density",method = RequestMethod.POST)
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
	@RequestMapping(value = "/FemalePercent",method = RequestMethod.POST)
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
	@RequestMapping("/InfantMortalityRate")
	public String InfantMortalityRate(Model model) {
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/InfantMortalityRate",method = RequestMethod.POST)
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
	@RequestMapping(value = "/LifeExpectancyAtBirth",method = RequestMethod.POST)
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
	@RequestMapping(value = "/MidYearPoplation",method = RequestMethod.POST)
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
	@RequestMapping(value = "/ReproductiveHealth",method = RequestMethod.POST)
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
	@RequestMapping(value = "/RuralAndUrbanRate",method = RequestMethod.POST)
	@ResponseBody
	public Msg ruralAndUrbanRate(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
}
