package okkpp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.service.finance.DepositRateAndLendingRateService;
import okkpp.utils.CountryMap;

/**
* @author duck
* @date 创建时间：2018年3月19日 下午3:24:20
*/
@RequestMapping("/finance")
@Controller
public class FinanceController {

	@Autowired
	DepositRateAndLendingRateService depositRateAndLendingRateService;
	
	@RequestMapping("dralr")
	public String page1(Model model) {
		List<DepositRateAndLendingRate> list = depositRateAndLendingRateService.selectAll();
		model.addAttribute("data", CountryMap.mapByCountry(list));
		model.addAttribute("jsondata", CountryMap.mapByCountryToJson(list));
		return "/finance/annual_average_deposit_rate_and_lending_rate";
	}
}
