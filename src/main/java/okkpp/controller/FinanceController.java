package okkpp.controller;

import java.util.List;
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
import okkpp.model.finance.DepositRateAndLendingRate;
import okkpp.service.finance.*;
import okkpp.utils.ChartInfo;

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
		switch (info) {
		case "BankCapital":
			return ChartInfo.mapByCountry(BankCapitalService.selectAll());
		case "BankNonPerformingLoans":
			return ChartInfo.mapByCountry(BankNonPerformingLoansService.selectAll());
		case "CentralGovernmentRevenue":
			return ChartInfo.mapByCountry(CentralGovernmentRevenueService.selectAll());
		case "Debt":
			return ChartInfo.mapByCountry(DebtService.selectAll());
		case "DepositRateAndLendingRate":
			return ChartInfo.mapByCountry(DepositRateAndLendingRateService.selectAll());
		case "DomesticCredit":
			return ChartInfo.mapByCountry(DomesticCreditService.selectAll());
		case "GlobalEquityIndices":
			return ChartInfo.mapByCountry(GlobalEquityIndicesService.selectAll());
		case "GrowthRateOfMoney":
			return ChartInfo.mapByCountry(GrowthRateOfMoneyService.selectAll());
		case "ListedDomesticCompanies":
			return ChartInfo.mapByCountry(ListedDomesticCompaniesService.selectAll());
		case "MoneySupply":
			return ChartInfo.mapByCountry(MoneySupplyService.selectAll());
		case "QuasiMoney":
			return ChartInfo.mapByCountry(QuasiMoneyService.selectAll());
		case "SocialContributions":
			return ChartInfo.mapByCountry(SocialContributionsService.selectAll());
		case "StocksTradedValue":
			return ChartInfo.mapByCountry(StocksTradedValueService.selectAll());
		case "Surplus":
			return ChartInfo.mapByCountry(SurplusService.selectAll());
		case "TaxAsPercentageOfEvenue":
			return ChartInfo.mapByCountry(TaxAsPercentageOfEvenueService.selectAll());
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
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 后台按条件获取数据
	@RequestMapping(value = "/getJsonByCondition/{info}", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "BankCapital":
			pageInfo = BankCapitalService.getPageInfoByCondition(pn, column, condition);
			break;
		case "BankNonPerformingLoans":
			pageInfo = BankNonPerformingLoansService.getPageInfoByCondition(pn, column, condition);
			break;
		case "CentralGovernmentRevenue":
			pageInfo = CentralGovernmentRevenueService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Debt":
			pageInfo = DebtService.getPageInfoByCondition(pn, column, condition);
			break;
		case "DepositRateAndLendingRate":
			pageInfo = DepositRateAndLendingRateService.getPageInfoByCondition(pn, column, condition);
			break;
		case "DomesticCredit":
			pageInfo = DomesticCreditService.getPageInfoByCondition(pn, column, condition);
			break;
		case "GlobalEquityIndices":
			pageInfo = GlobalEquityIndicesService.getPageInfoByCondition(pn, column, condition);
			break;
		case "GrowthRateOfMoney":
			pageInfo = GrowthRateOfMoneyService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ListedDomesticCompanies":
			pageInfo = ListedDomesticCompaniesService.getPageInfoByCondition(pn, column, condition);
			break;
		case "MoneySupply":
			pageInfo = MoneySupplyService.getPageInfoByCondition(pn, column, condition);
			break;
		case "QuasiMoney":
			pageInfo = QuasiMoneyService.getPageInfoByCondition(pn, column, condition);
			break;
		case "SocialContributions":
			pageInfo = SocialContributionsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "StocksTradedValue":
			pageInfo = StocksTradedValueService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Surplus":
			pageInfo = SurplusService.getPageInfoByCondition(pn, column, condition);
			break;
		case "TaxAsPercentageOfEvenue":
			pageInfo = TaxAsPercentageOfEvenueService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("annualAverageDepositRateAndLendingRate")
	public String annual_average_deposit_rate_and_lending_rate(Model model) {
		List<DepositRateAndLendingRate> list = DepositRateAndLendingRateService.selectAll();
		model.addAttribute("data", ChartInfo.mapByCountry(list));
		model.addAttribute("jsondata", ChartInfo.mapByCountryToJson(list));
		return "/finance/annual_average_deposit_rate_and_lending_rate";
	}

}
