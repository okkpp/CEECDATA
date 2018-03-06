package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import okkpp.service.population.*;
import okkpp.model.population.*;

@Controller
@RequestMapping("/population")
public class populationController {

	@Autowired
	BirthAndDeathRateService birthAndDeathRateService;
	@RequestMapping("/BirthAndDeathRate")
	public String BirthAndDeathRate(Model model) {
		List<BirthAndDeathRate> list = birthAndDeathRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	CompositionDependencyRatioService compositionDependencyRatioService;
	@RequestMapping("/CompositionDependencyRatio")
	public String CompositionDependencyRatio(Model model) {
		List<CompositionDependencyRatio> list = compositionDependencyRatioService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	DensityService densityService;
	@RequestMapping("/Density")
	public String Density(Model model) {
		List<Density> list = densityService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	FemalePercentService femalePercentService;
	@RequestMapping("/FemalePercent")
	public String FemalePercent(Model model) {
		List<FemalePercent> list = femalePercentService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	InfantMortalityRateService infantMortalityRateService;
	@RequestMapping("/InfantMortalityRate")
	public String InfantMortalityRate(Model model) {
		List<InfantMortalityRate> list = infantMortalityRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	LifeExpectancyAtBirthService lifeExpectancyAtBirthService;
	@RequestMapping("/LifeExpectancyAtBirth")
	public String LifeExpectancyAtBirth(Model model) {
		List<LifeExpectancyAtBirth> list = lifeExpectancyAtBirthService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	MidYearPoplationService midYearPoplationService;
	@RequestMapping("/MidYearPoplation")
	public String MidYearPoplation(Model model) {
		List<MidYearPoplation> list = midYearPoplationService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ReproductiveHealthService reproductiveHealthService;
	@RequestMapping("/ReproductiveHealth")
	public String ReproductiveHealth(Model model) {
		List<ReproductiveHealth> list = reproductiveHealthService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	RuralAndUrbanRateService ruralAndUrbanRateService;
	@RequestMapping("/RuralAndUrbanRate")
	public String RuralAndUrbanRate(Model model) {
		List<RuralAndUrbanRate> list = ruralAndUrbanRateService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
}
