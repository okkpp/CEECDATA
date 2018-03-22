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
import okkpp.service.traffic.*;
import okkpp.utils.ChartInfo;
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
			return ChartInfo.mapByCountry(AirFreightService.selectAll());
		case "Broadband":
			return ChartInfo.mapByCountry(BroadbandService.selectAll());
		case "Container":
			return ChartInfo.mapByCountry(ContainerService.selectAll());
		case "Freight":
			return ChartInfo.mapByCountry(FreightService.selectAll());
		case "InternetServers":
			return ChartInfo.mapByCountry(InternetServersService.selectAll());
		case "InternetUsers":
			return ChartInfo.mapByCountry(InternetUsersService.selectAll());
		case "Phone":
			return ChartInfo.mapByCountry(PhoneService.selectAll());
		case "RailLines":
			return ChartInfo.mapByCountry(RailLinesService.selectAll());
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
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 后台按条件查找
	@RequestMapping(value = "/getJsonByCondition/{info}", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJsonByCondition(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "AirFreight":
			pageInfo = AirFreightService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Broadband":
			pageInfo = BroadbandService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Container":
			pageInfo = ContainerService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Freight":
			pageInfo = FreightService.getPageInfoByCondition(pn, column, condition);
			break;
		case "InternetServers":
			pageInfo = InternetServersService.getPageInfoByCondition(pn, column, condition);
			break;
		case "InternetUsers":
			pageInfo = InternetUsersService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Phone":
			pageInfo = PhoneService.getPageInfoByCondition(pn, column, condition);
			break;
		case "RailLines":
			pageInfo = RailLinesService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
