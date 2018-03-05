package okkpp.model.payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_payment")
public class Payment implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 经常账户
     */
    @Column(name = "current_account")
    private Double currentAccount;

    /**
     * 货物贷方
     */
    @Column(name = "goods_credit")
    private Double goodsCredit;

    /**
     * 货物借方
     */
    @Column(name = "goods_debit")
    private Double goodsDebit;

    /**
     * 服务贷方
     */
    @Column(name = "services_credit")
    private Double servicesCredit;

    /**
     * 服务借方
     */
    @Column(name = "services_debit")
    private Double servicesDebit;

    /**
     * 收入贷方
     */
    @Column(name = "income_credit")
    private Double incomeCredit;

    /**
     * 收入借方
     */
    @Column(name = "income_debit")
    private Double incomeDebit;

    /**
     * 资本账户
     */
    @Column(name = "capital_account")
    private Double capitalAccount;

    /**
     * 贷方
     */
    private Double credit;

    /**
     * 金融账户
     */
    @Column(name = "financial_account")
    private Double financialAccount;

    /**
     * 直接投资资产
     */
    @Column(name = "direct_assets")
    private Double directAssets;

    /**
     * 直接投资负债
     */
    @Column(name = "direct_liabilities")
    private Double directLiabilities;

    /**
     * 证券投资资产
     */
    @Column(name = "portfolio_assets")
    private Double portfolioAssets;

    /**
     * 证券投资负债
     */
    @Column(name = "portfolio_liabilities")
    private Double portfolioLiabilities;

    /**
     * 金融衍生工具资产
     */
    @Column(name = "financial_assets")
    private Double financialAssets;

    /**
     * 金融衍生工具负债
     */
    @Column(name = "financial_liabilities")
    private Double financialLiabilities;

    /**
     * 其他投资负债
     */
    @Column(name = "other_liabilities")
    private Double otherLiabilities;

    /**
     * 储备资产
     */
    @Column(name = "reserves_assets")
    private Double reservesAssets;

    /**
     * 净误差和遗漏
     */
    @Column(name = "errors_omissions")
    private Double errorsOmissions;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新日期
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取国家代码
     *
     * @return country - 国家代码
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家代码
     *
     * @param country 国家代码
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取经常账户
     *
     * @return current_account - 经常账户
     */
    public Double getCurrentAccount() {
        return currentAccount;
    }

    /**
     * 设置经常账户
     *
     * @param currentAccount 经常账户
     */
    public void setCurrentAccount(Double currentAccount) {
        this.currentAccount = currentAccount;
    }

    /**
     * 获取货物贷方
     *
     * @return goods_credit - 货物贷方
     */
    public Double getGoodsCredit() {
        return goodsCredit;
    }

    /**
     * 设置货物贷方
     *
     * @param goodsCredit 货物贷方
     */
    public void setGoodsCredit(Double goodsCredit) {
        this.goodsCredit = goodsCredit;
    }

    /**
     * 获取货物借方
     *
     * @return goods_debit - 货物借方
     */
    public Double getGoodsDebit() {
        return goodsDebit;
    }

    /**
     * 设置货物借方
     *
     * @param goodsDebit 货物借方
     */
    public void setGoodsDebit(Double goodsDebit) {
        this.goodsDebit = goodsDebit;
    }

    /**
     * 获取服务贷方
     *
     * @return services_credit - 服务贷方
     */
    public Double getServicesCredit() {
        return servicesCredit;
    }

    /**
     * 设置服务贷方
     *
     * @param servicesCredit 服务贷方
     */
    public void setServicesCredit(Double servicesCredit) {
        this.servicesCredit = servicesCredit;
    }

    /**
     * 获取服务借方
     *
     * @return services_debit - 服务借方
     */
    public Double getServicesDebit() {
        return servicesDebit;
    }

    /**
     * 设置服务借方
     *
     * @param servicesDebit 服务借方
     */
    public void setServicesDebit(Double servicesDebit) {
        this.servicesDebit = servicesDebit;
    }

    /**
     * 获取收入贷方
     *
     * @return income_credit - 收入贷方
     */
    public Double getIncomeCredit() {
        return incomeCredit;
    }

    /**
     * 设置收入贷方
     *
     * @param incomeCredit 收入贷方
     */
    public void setIncomeCredit(Double incomeCredit) {
        this.incomeCredit = incomeCredit;
    }

    /**
     * 获取收入借方
     *
     * @return income_debit - 收入借方
     */
    public Double getIncomeDebit() {
        return incomeDebit;
    }

    /**
     * 设置收入借方
     *
     * @param incomeDebit 收入借方
     */
    public void setIncomeDebit(Double incomeDebit) {
        this.incomeDebit = incomeDebit;
    }

    /**
     * 获取资本账户
     *
     * @return capital_account - 资本账户
     */
    public Double getCapitalAccount() {
        return capitalAccount;
    }

    /**
     * 设置资本账户
     *
     * @param capitalAccount 资本账户
     */
    public void setCapitalAccount(Double capitalAccount) {
        this.capitalAccount = capitalAccount;
    }

    /**
     * 获取贷方
     *
     * @return credit - 贷方
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * 设置贷方
     *
     * @param credit 贷方
     */
    public void setCredit(Double credit) {
        this.credit = credit;
    }

    /**
     * 获取金融账户
     *
     * @return financial_account - 金融账户
     */
    public Double getFinancialAccount() {
        return financialAccount;
    }

    /**
     * 设置金融账户
     *
     * @param financialAccount 金融账户
     */
    public void setFinancialAccount(Double financialAccount) {
        this.financialAccount = financialAccount;
    }

    /**
     * 获取直接投资资产
     *
     * @return direct_assets - 直接投资资产
     */
    public Double getDirectAssets() {
        return directAssets;
    }

    /**
     * 设置直接投资资产
     *
     * @param directAssets 直接投资资产
     */
    public void setDirectAssets(Double directAssets) {
        this.directAssets = directAssets;
    }

    /**
     * 获取直接投资负债
     *
     * @return direct_liabilities - 直接投资负债
     */
    public Double getDirectLiabilities() {
        return directLiabilities;
    }

    /**
     * 设置直接投资负债
     *
     * @param directLiabilities 直接投资负债
     */
    public void setDirectLiabilities(Double directLiabilities) {
        this.directLiabilities = directLiabilities;
    }

    /**
     * 获取证券投资资产
     *
     * @return portfolio_assets - 证券投资资产
     */
    public Double getPortfolioAssets() {
        return portfolioAssets;
    }

    /**
     * 设置证券投资资产
     *
     * @param portfolioAssets 证券投资资产
     */
    public void setPortfolioAssets(Double portfolioAssets) {
        this.portfolioAssets = portfolioAssets;
    }

    /**
     * 获取证券投资负债
     *
     * @return portfolio_liabilities - 证券投资负债
     */
    public Double getPortfolioLiabilities() {
        return portfolioLiabilities;
    }

    /**
     * 设置证券投资负债
     *
     * @param portfolioLiabilities 证券投资负债
     */
    public void setPortfolioLiabilities(Double portfolioLiabilities) {
        this.portfolioLiabilities = portfolioLiabilities;
    }

    /**
     * 获取金融衍生工具资产
     *
     * @return financial_assets - 金融衍生工具资产
     */
    public Double getFinancialAssets() {
        return financialAssets;
    }

    /**
     * 设置金融衍生工具资产
     *
     * @param financialAssets 金融衍生工具资产
     */
    public void setFinancialAssets(Double financialAssets) {
        this.financialAssets = financialAssets;
    }

    /**
     * 获取金融衍生工具负债
     *
     * @return financial_liabilities - 金融衍生工具负债
     */
    public Double getFinancialLiabilities() {
        return financialLiabilities;
    }

    /**
     * 设置金融衍生工具负债
     *
     * @param financialLiabilities 金融衍生工具负债
     */
    public void setFinancialLiabilities(Double financialLiabilities) {
        this.financialLiabilities = financialLiabilities;
    }

    /**
     * 获取其他投资负债
     *
     * @return other_liabilities - 其他投资负债
     */
    public Double getOtherLiabilities() {
        return otherLiabilities;
    }

    /**
     * 设置其他投资负债
     *
     * @param otherLiabilities 其他投资负债
     */
    public void setOtherLiabilities(Double otherLiabilities) {
        this.otherLiabilities = otherLiabilities;
    }

    /**
     * 获取储备资产
     *
     * @return reserves_assets - 储备资产
     */
    public Double getReservesAssets() {
        return reservesAssets;
    }

    /**
     * 设置储备资产
     *
     * @param reservesAssets 储备资产
     */
    public void setReservesAssets(Double reservesAssets) {
        this.reservesAssets = reservesAssets;
    }

    /**
     * 获取净误差和遗漏
     *
     * @return errors_omissions - 净误差和遗漏
     */
    public Double getErrorsOmissions() {
        return errorsOmissions;
    }

    /**
     * 设置净误差和遗漏
     *
     * @param errorsOmissions 净误差和遗漏
     */
    public void setErrorsOmissions(Double errorsOmissions) {
        this.errorsOmissions = errorsOmissions;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取更新日期
     *
     * @return updated - 更新日期
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新日期
     *
     * @param updated 更新日期
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}