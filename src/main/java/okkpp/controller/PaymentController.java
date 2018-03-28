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
import okkpp.service.payment.*;
import okkpp.utils.ChartInfo;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	ExchangeService exchangeService;
	@Autowired
	ExternalService externalService;
	@Autowired
	ForeignService foreignService;
	@Autowired
	PaymentService paymentService;
	@Autowired
	ReservesService reservesService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
		case "Exchange":
			return ChartInfo.mapByCountry(exchangeService.selectAll());
		case "External":
			return ChartInfo.mapByCountry(externalService.selectAll());
		case "Foreign":
			return ChartInfo.mapByCountry(foreignService.selectAll());
		case "Payment":
			return ChartInfo.mapByCountry(paymentService.selectAll());
		case "Reserves":
			return ChartInfo.mapByCountry(reservesService.selectAll());
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
		case "Exchange":
			pageInfo = exchangeService.getPageInfo(pn);
			break;
		case "External":
			pageInfo = externalService.getPageInfo(pn);
			break;
		case "Foreign":
			pageInfo = foreignService.getPageInfo(pn);
			break;
		case "Payment":
			pageInfo = paymentService.getPageInfo(pn);
			break;
		case "Reserves":
			pageInfo = reservesService.getPageInfo(pn);
			break;
		default:
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
		case "Exchange":
			pageInfo = exchangeService.getPageInfoByCondition(pn, column, condition);
			break;
		case "External":
			pageInfo = externalService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Foreign":
			pageInfo = foreignService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Payment":
			pageInfo = paymentService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Reserves":
			pageInfo = reservesService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
