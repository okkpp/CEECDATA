package okkpp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import okkpp.model.Msg;
import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.service.finance.*;
import okkpp.utils.CountryMap;

/**
* @author duck
* @date ����ʱ�䣺2018��3��19�� ����3:24:20
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
	
	// ��̨��ȡ����
		@RequestMapping(value = "/getJson", method = RequestMethod.POST)
		@ResponseBody
		public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
				@RequestParam("info") String info) {
			PageInfo<E> pageInfo = null;
			switch (info) {
			case "BankCapital":
				pageInfo = BankCapitalService.getPageInfo(pn);
				break;
			case "BankNonPerformingLoans":
				pageInfo = BankNonPerformingLoansService.getPageInfo(pn);
				break;
			case "CentralGovernmentRevenue":
				pageInfo = CentralGovernmentRevenueService.getPageInfo(pn);
				break;
			case "Debt":
				pageInfo = DebtService.getPageInfo(pn);
				break;
			case "DepositRateAndLendingRate":
				pageInfo = DepositRateAndLendingRateService.getPageInfo(pn);
				break;
			case "DomesticCredit":
				pageInfo = DomesticCreditService.getPageInfo(pn);
				break;
			case "GlobalEquityIndices":
				pageInfo = GlobalEquityIndicesService.getPageInfo(pn);
				break;
			case "GrowthRateOfMoney":
				pageInfo = GrowthRateOfMoneyService.getPageInfo(pn);
				break;
			case "ListedDomesticCompanies":
				pageInfo = ListedDomesticCompaniesService.getPageInfo(pn);
				break;
			case "MoneySupply":
				pageInfo = MoneySupplyService.getPageInfo(pn);
				break;
			case "QuasiMoney":
				pageInfo = QuasiMoneyService.getPageInfo(pn);
				break;
			case "SocialContributions":
				pageInfo = SocialContributionsService.getPageInfo(pn);
				break;
			case "StocksTradedValue":
				pageInfo = StocksTradedValueService.getPageInfo(pn);
				break;
			case "Surplus":
				pageInfo = SurplusService.getPageInfo(pn);
				break;
			case "TaxAsPercentageOfEvenue":
				pageInfo = TaxAsPercentageOfEvenueService.getPageInfo(pn);
				break;
			default:
				break;
			}
			return Msg.success().add("pageInfo", pageInfo);
		}
	
	@RequestMapping("annualAverageDepositRateAndLendingRate")
	public String annual_average_deposit_rate_and_lending_rate(Model model) {
		List<DepositRateAndLendingRate> list = DepositRateAndLendingRateService.selectAll();
		model.addAttribute("data", CountryMap.mapByCountry(list));
		model.addAttribute("jsondata", CountryMap.mapByCountryToJson(list));
		return "/finance/annual_average_deposit_rate_and_lending_rate";
	}

}
