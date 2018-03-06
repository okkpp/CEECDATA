package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.service.traffic.*;
import okkpp.model.traffic.*;

@Controller
@RequestMapping("/traffic")
public class TrafficController {
	
	@Autowired
	AirFreightService airFreightService;	
	@RequestMapping("/AirFreight")
	public String AirFreight(Model model) {
		List<AirFreight> list = airFreightService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	BroadbandService broadbandService;
	@RequestMapping("/Broadband")
	public String Broadband(Model model) {
		List<Broadband> list = broadbandService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ContainerService containerService;
	@RequestMapping("/Container")
	public String Container(Model model) {
		List<Container> list = containerService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	FreightService freightService;
	@RequestMapping("/Freight")
	public String Freight(Model model) {
		List<Freight> list = freightService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}

	@Autowired
	InternetServersService internetServersService;
	@RequestMapping("/InternetServers")
	public String InternetServers(Model model) {
		List<InternetServers> list = internetServersService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	InternetUsersService internetUsersService;
	@RequestMapping("/InternetUsers")
	public String InternetUsers(Model model) {
		List<InternetUsers> list = internetUsersService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	PhoneService phoneService;
	@RequestMapping("/Phone")
	public String Phone(Model model) {
		List<Phone> list = phoneService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	RailLinesService railLinesService;
	@RequestMapping("/RailLines")
	public String RailLines(Model model) {
		List<RailLines> list = railLinesService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
}
