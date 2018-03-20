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
import okkpp.service.payment.*;
import okkpp.utils.CountryMap;
import okkpp.model.Msg;

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
			return CountryMap.mapByCountry(exchangeService.selectAll());
		case "External":
			return CountryMap.mapByCountry(externalService.selectAll());
		case "Foreign":
			return CountryMap.mapByCountry(foreignService.selectAll());
		case "Payment":
			return CountryMap.mapByCountry(paymentService.selectAll());
		case "Reserves":
			return CountryMap.mapByCountry(reservesService.selectAll());
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
		return Msg.success().add("pageInfo", pageInfo);
	}
}
