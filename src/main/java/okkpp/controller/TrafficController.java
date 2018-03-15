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
import okkpp.service.traffic.*;
import okkpp.model.Msg;
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
	@RequestMapping(value = "/air_freight",method = RequestMethod.POST)
	@ResponseBody
	public Msg airFreight(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<AirFreight> list = airFreightService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	BroadbandService broadbandService;
	@RequestMapping("/Broadband")
	public String Broadband(Model model) {
		List<Broadband> list = broadbandService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/broadband",method = RequestMethod.POST)
	@ResponseBody
	public Msg broadband(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Broadband> list = broadbandService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	ContainerService containerService;
	@RequestMapping("/Container")
	public String Container(Model model) {
		List<Container> list = containerService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/container",method = RequestMethod.POST)
	@ResponseBody
	public Msg container(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Container> list = containerService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	FreightService freightService;
	@RequestMapping("/Freight")
	public String Freight(Model model) {
		List<Freight> list = freightService.selectAll();
		model.addAttribute("data",list);
		return "404";	
	}
	@RequestMapping(value = "/freight",method = RequestMethod.POST)
	@ResponseBody
	public Msg freight(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Freight> list = freightService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	InternetServersService internetServersService;
	@RequestMapping("/InternetServers")
	public String InternetServers(Model model) {
		List<InternetServers> list = internetServersService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/internet_servers",method = RequestMethod.POST)
	@ResponseBody
	public Msg internetServers(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<InternetServers> list = internetServersService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	InternetUsersService internetUsersService;
	@RequestMapping("/InternetUsers")
	public String InternetUsers(Model model) {
		List<InternetUsers> list = internetUsersService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/internet_users",method = RequestMethod.POST)
	@ResponseBody
	public Msg internetUsers(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<InternetUsers> list = internetUsersService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}

	@Autowired
	PhoneService phoneService;
	@RequestMapping("/Phone")
	public String Phone(Model model) {
		List<Phone> list = phoneService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/phone",method = RequestMethod.POST)
	@ResponseBody
	public Msg phone(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Phone> list = phoneService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}

	@Autowired
	RailLinesService railLinesService;
	@RequestMapping("/RailLines")
	public String RailLines(Model model) {
		List<RailLines> list = railLinesService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/rail_lines",method = RequestMethod.POST)
	@ResponseBody
	public Msg railLines(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<RailLines> list = railLinesService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
}
