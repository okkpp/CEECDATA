package okkpp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.service.finance.BankCapitalService;
import okkpp.service.finance.CentralGovernmentRevenueService;
import okkpp.service.finance.DepositRateAndLendingRateService;
import okkpp.service.finance.DomesticCreditService;
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
	@Autowired
	BankCapitalService bankCapitalService;
	@Autowired
	CentralGovernmentRevenueService centralGovernmentRevenueService;
	@Autowired
	DomesticCreditService domesticCreditService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String str) {
		switch(str) {
		case "annual_average_deposit_rate_and_lending_rate":
			return CountryMap.mapByCountry(depositRateAndLendingRateService.selectAll());
			
		}
		return null;
	}
	@RequestMapping("annualAverageDepositRateAndLendingRate")
	public String annual_average_deposit_rate_and_lending_rate(Model model) {
		List<DepositRateAndLendingRate> list = depositRateAndLendingRateService.selectAll();
		model.addAttribute("data", CountryMap.mapByCountry(list));
		model.addAttribute("jsondata", CountryMap.mapByCountryToJson(list));
		return "/finance/annual_average_deposit_rate_and_lending_rate";
	}

}
