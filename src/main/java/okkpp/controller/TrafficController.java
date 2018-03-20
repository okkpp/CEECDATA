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
import okkpp.service.traffic.*;
import okkpp.utils.CountryMap;
import okkpp.model.Msg;

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

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.POST)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("info") String info) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "AirFreight":
			pageInfo = AirFreightService.getPageInfo(pn);
			break;
		case "Broadband":
			pageInfo = BroadbandService.getPageInfo(pn);
			break;
		case "Container":
			pageInfo = ContainerService.getPageInfo(pn);
			break;
		case "Freight":
			pageInfo = FreightService.getPageInfo(pn);
			break;
		case "InternetServers":
			pageInfo = InternetServersService.getPageInfo(pn);
			break;
		case "InternetUsers":
			pageInfo = InternetUsersService.getPageInfo(pn);
			break;
		case "Phone":
			pageInfo = PhoneService.getPageInfo(pn);
			break;
		case "RailLines":
			pageInfo = RailLinesService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

}
