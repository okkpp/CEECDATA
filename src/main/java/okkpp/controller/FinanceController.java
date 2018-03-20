package okkpp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.service.finance.*;
import okkpp.utils.CountryMap;

/**
* @author duck
* @date 创建时间：2018年3月19日 下午3:24:20
*/
@RequestMapping("/finance")
@Controller
public class FinanceController {

	@Autowired
	BankCapitalService BankCapitalService;
	@Autowired
	BankNonPerformingLoansService BankNonPerformingLoansService;
	@Autowired
	CentralGovernmentRevenueService CentralGovernmentRevenueService;
	@Autowired
	DebtService DebtService;
	@Autowired
	DepositRateAndLendingRateService DepositRateAndLendingRateService;
	@Autowired
	DomesticCreditService DomesticCreditService;
	@Autowired
	GlobalEquityIndicesService GlobalEquityIndicesService;
	@Autowired
	GrowthRateOfMoneyService GrowthRateOfMoneyService;
	@Autowired
	ListedDomesticCompaniesService ListedDomesticCompaniesService;
	@Autowired
	MoneySupplyService MoneySupplyService;
	@Autowired
	QuasiMoneyService QuasiMoneyService;
	@Autowired
	SocialContributionsService SocialContributionsService;
	@Autowired
	StocksTradedValueService StocksTradedValueService;
	@Autowired
	SurplusService SurplusService;
	@Autowired
	TaxAsPercentageOfEvenueService TaxAsPercentageOfEvenueService;
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		case "BankCapital":
			return CountryMap.mapByCountry(BankCapitalService.selectAll());
		case "BankNonPerformingLoans":
			return CountryMap.mapByCountry(BankNonPerformingLoansService.selectAll());
		case "CentralGovernmentRevenue":
			return CountryMap.mapByCountry(CentralGovernmentRevenueService.selectAll());
		case "Debt":
			return CountryMap.mapByCountry(DebtService.selectAll());
		case "DepositRateAndLendingRate":
			return CountryMap.mapByCountry(DepositRateAndLendingRateService.selectAll());
		case "DomesticCredit":
			return CountryMap.mapByCountry(DomesticCreditService.selectAll());
		case "GlobalEquityIndices":
			return CountryMap.mapByCountry(GlobalEquityIndicesService.selectAll());
		case "GrowthRateOfMoney":
			return CountryMap.mapByCountry(GrowthRateOfMoneyService.selectAll());
		case "ListedDomesticCompanies":
			return CountryMap.mapByCountry(ListedDomesticCompaniesService.selectAll());
		case "MoneySupply":
			return CountryMap.mapByCountry(MoneySupplyService.selectAll());
		case "QuasiMoney":
			return CountryMap.mapByCountry(QuasiMoneyService.selectAll());
		case "SocialContributions":
			return CountryMap.mapByCountry(SocialContributionsService.selectAll());
		case "StocksTradedValue":
			return CountryMap.mapByCountry(StocksTradedValueService.selectAll());
		case "Surplus":
			return CountryMap.mapByCountry(SurplusService.selectAll());
		case "TaxAsPercentageOfEvenue":
			return CountryMap.mapByCountry(TaxAsPercentageOfEvenueService.selectAll());
		}
		return null;
	}
	@RequestMapping("annualAverageDepositRateAndLendingRate")
	public String annual_average_deposit_rate_and_lending_rate(Model model) {
		List<DepositRateAndLendingRate> list = DepositRateAndLendingRateService.selectAll();
		model.addAttribute("data", CountryMap.mapByCountry(list));
		model.addAttribute("jsondata", CountryMap.mapByCountryToJson(list));
		return "/finance/annual_average_deposit_rate_and_lending_rate";
	}

}
