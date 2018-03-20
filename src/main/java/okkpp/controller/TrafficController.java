package okkpp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.service.traffic.*;
import okkpp.utils.CountryMap;
import okkpp.model.Msg;
import okkpp.model.traffic.*;

@Controller
@RequestMapping("/traffic")
public class TrafficController {

	@Autowired
	AirFreightService AirFreightService;
	@Autowired
	BroadbandService BroadbandService;
	@Autowired
	ContainerService ContainerService;
	@Autowired
	FreightService FreightService;
	@Autowired
	InternetServersService InternetServersService;
	@Autowired
	InternetUsersService InternetUsersService;
	@Autowired
	PhoneService PhoneService;
	@Autowired
	RailLinesService RailLinesService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
			case "AirFreight":
				return CountryMap.mapByCountry(AirFreightService.selectAll());
			case "Broadband":
				return CountryMap.mapByCountry(BroadbandService.selectAll());
			case "Container":
				return CountryMap.mapByCountry(ContainerService.selectAll());
			case "Freight":
				return CountryMap.mapByCountry(FreightService.selectAll());
			case "InternetServers":
				return CountryMap.mapByCountry(InternetServersService.selectAll());
			case "InternetUsers":
				return CountryMap.mapByCountry(InternetUsersService.selectAll());
			case "Phone":
				return CountryMap.mapByCountry(PhoneService.selectAll());
			case "RailLines":
				return CountryMap.mapByCountry(RailLinesService.selectAll());
		}
		return null;
	}

	@RequestMapping("/AirFreight")
	public String AirFreight(Model model) {
		List<AirFreight> list = AirFreightService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/AirFreight", method = RequestMethod.POST)
	@ResponseBody
	public Msg airFreight(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<AirFreight> list = AirFreightService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/Broadband")
	public String Broadband(Model model) {
		List<Broadband> list = BroadbandService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/Broadband", method = RequestMethod.POST)
	@ResponseBody
	public Msg broadband(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Broadband> list = BroadbandService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/Container")
	public String Container(Model model) {
		List<Container> list = ContainerService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/Container", method = RequestMethod.POST)
	@ResponseBody
	public Msg container(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Container> list = ContainerService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/Freight")
	public String Freight(Model model) {
		List<Freight> list = FreightService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/Freight", method = RequestMethod.POST)
	@ResponseBody
	public Msg freight(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Freight> list = FreightService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/InternetServers")
	public String InternetServers(Model model) {
		List<InternetServers> list = InternetServersService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/InternetServers", method = RequestMethod.POST)
	@ResponseBody
	public Msg internetServers(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<InternetServers> list = InternetServersService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/InternetUsers")
	public String InternetUsers(Model model) {
		List<InternetUsers> list = InternetUsersService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/InternetUsers", method = RequestMethod.POST)
	@ResponseBody
	public Msg internetUsers(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<InternetUsers> list = InternetUsersService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/Phone")
	public String Phone(Model model) {
		List<Phone> list = PhoneService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/Phone", method = RequestMethod.POST)
	@ResponseBody
	public Msg phone(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Phone> list = PhoneService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/RailLines")
	public String RailLines(Model model) {
		List<RailLines> list = RailLinesService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	@RequestMapping(value = "/RailLines", method = RequestMethod.POST)
	@ResponseBody
	public Msg railLines(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<RailLines> list = RailLinesService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}

}
