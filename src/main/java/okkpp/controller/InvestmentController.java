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

import okkpp.base.Msg;
import okkpp.service.investment.*;
import okkpp.utils.ChartInfo;

@Controller
@RequestMapping("/investment")
public class InvestmentController {

	@Autowired
	CostOfBusinessService costOfBusinessService;
	@Autowired
	DensityOfBusinessService densityOfBusinessService;
	@Autowired
	RankOfBusinessService rankOfBusinessService;
	@Autowired
	RegisteredOfBusinessService registeredOfBusinessService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
		case "CostOfBusiness":
			return ChartInfo.mapByCountry(costOfBusinessService.selectAll());
		case "DensityOfBusiness":
			return ChartInfo.mapByCountry(densityOfBusinessService.selectAll());
		case "RankOfBusiness":
			return ChartInfo.mapByCountry(rankOfBusinessService.selectAll());
		case "RegisteredOfBusiness":
			return ChartInfo.mapByCountry(registeredOfBusinessService.selectAll());
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
		case "CostOfBusiness":
			pageInfo = costOfBusinessService.getPageInfo(pn);
			break;
		case "DensityOfBusiness":
			pageInfo = densityOfBusinessService.getPageInfo(pn);
			break;
		case "RankOfBusiness":
			pageInfo = rankOfBusinessService.getPageInfo(pn);
			break;
		case "RegisteredOfBusiness":
			pageInfo = registeredOfBusinessService.getPageInfo(pn);
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
		case "CostOfBusiness":
			pageInfo = costOfBusinessService.getPageInfoByCondition(pn, column, condition);
			break;
		case "DensityOfBusiness":
			pageInfo = densityOfBusinessService.getPageInfoByCondition(pn, column, condition);
			break;
		case "RankOfBusiness":
			pageInfo = rankOfBusinessService.getPageInfoByCondition(pn, column, condition);
			break;
		case "RegisteredOfBusiness":
			pageInfo = registeredOfBusinessService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
