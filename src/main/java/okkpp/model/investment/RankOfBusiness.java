package okkpp.model.investment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_investment_rank_of_business")
public class RankOfBusiness implements Serializable {
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
     * 企业经营环境排名
     */
    @Column(name = "business_rank")
    private Integer businessRank;

    /**
     * 开办企业排名
     */
    @Column(name = "start_rank")
    private Integer startRank;

    /**
     * 申请建筑许可排名
     */
    @Column(name = "construction_rank")
    private Integer constructionRank;

    /**
     * 申请建筑许可手续(个)
     */
    @Column(name = "construction_number")
    private Integer constructionNumber;

    /**
     * 申请建筑许可时间(天)
     */
    @Column(name = "construction_days")
    private Double constructionDays;

    /**
     * 注册资产排名
     */
    @Column(name = "property_rank")
    private Integer propertyRank;

    /**
     * 注册资产手续(个)
     */
    @Column(name = "property_number")
    private Integer propertyNumber;

    /**
     * 注册资产时间(天)
     */
    @Column(name = "property_days")
    private Double propertyDays;

    /**
     * 获得信贷排名
     */
    @Column(name = "credit_rank")
    private Integer creditRank;

    /**
     * 缴纳税款排名
     */
    @Column(name = "taxes_rank")
    private Integer taxesRank;

    /**
     * 中小投资者保护排名
     */
    @Column(name = "investors_rank")
    private Integer investorsRank;

    /**
     * 中小投资者保护指数
     */
    @Column(name = "investors_index")
    private Double investorsIndex;

    /**
     * 跨境贸易排名
     */
    @Column(name = "trading_rank")
    private Integer tradingRank;

    /**
     * 合同执行排名
     */
    @Column(name = "contracts_rank")
    private Integer contractsRank;

    /**
     * 合同执行时间(天)
     */
    @Column(name = "contracts_days")
    private Double contractsDays;

    /**
     * 解决破产排名
     */
    @Column(name = "insolvency_rank")
    private Integer insolvencyRank;

    /**
     * 解决破产时间(天)
     */
    @Column(name = "insolcenvy_days")
    private Double insolcenvyDays;

    /**
     * 解决破产收回率(美分/美元)
     */
    @Column(name = "insolvency_rate")
    private Double insolvencyRate;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新时间
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
     * 获取企业经营环境排名
     *
     * @return business_rank - 企业经营环境排名
     */
    public Integer getBusinessRank() {
        return businessRank;
    }

    /**
     * 设置企业经营环境排名
     *
     * @param businessRank 企业经营环境排名
     */
    public void setBusinessRank(Integer businessRank) {
        this.businessRank = businessRank;
    }

    /**
     * 获取开办企业排名
     *
     * @return start_rank - 开办企业排名
     */
    public Integer getStartRank() {
        return startRank;
    }

    /**
     * 设置开办企业排名
     *
     * @param startRank 开办企业排名
     */
    public void setStartRank(Integer startRank) {
        this.startRank = startRank;
    }

    /**
     * 获取申请建筑许可排名
     *
     * @return construction_rank - 申请建筑许可排名
     */
    public Integer getConstructionRank() {
        return constructionRank;
    }

    /**
     * 设置申请建筑许可排名
     *
     * @param constructionRank 申请建筑许可排名
     */
    public void setConstructionRank(Integer constructionRank) {
        this.constructionRank = constructionRank;
    }

    /**
     * 获取申请建筑许可手续(个)
     *
     * @return construction_number - 申请建筑许可手续(个)
     */
    public Integer getConstructionNumber() {
        return constructionNumber;
    }

    /**
     * 设置申请建筑许可手续(个)
     *
     * @param constructionNumber 申请建筑许可手续(个)
     */
    public void setConstructionNumber(Integer constructionNumber) {
        this.constructionNumber = constructionNumber;
    }

    /**
     * 获取申请建筑许可时间(天)
     *
     * @return construction_days - 申请建筑许可时间(天)
     */
    public Double getConstructionDays() {
        return constructionDays;
    }

    /**
     * 设置申请建筑许可时间(天)
     *
     * @param constructionDays 申请建筑许可时间(天)
     */
    public void setConstructionDays(Double constructionDays) {
        this.constructionDays = constructionDays;
    }

    /**
     * 获取注册资产排名
     *
     * @return property_rank - 注册资产排名
     */
    public Integer getPropertyRank() {
        return propertyRank;
    }

    /**
     * 设置注册资产排名
     *
     * @param propertyRank 注册资产排名
     */
    public void setPropertyRank(Integer propertyRank) {
        this.propertyRank = propertyRank;
    }

    /**
     * 获取注册资产手续(个)
     *
     * @return property_number - 注册资产手续(个)
     */
    public Integer getPropertyNumber() {
        return propertyNumber;
    }

    /**
     * 设置注册资产手续(个)
     *
     * @param propertyNumber 注册资产手续(个)
     */
    public void setPropertyNumber(Integer propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    /**
     * 获取注册资产时间(天)
     *
     * @return property_days - 注册资产时间(天)
     */
    public Double getPropertyDays() {
        return propertyDays;
    }

    /**
     * 设置注册资产时间(天)
     *
     * @param propertyDays 注册资产时间(天)
     */
    public void setPropertyDays(Double propertyDays) {
        this.propertyDays = propertyDays;
    }

    /**
     * 获取获得信贷排名
     *
     * @return credit_rank - 获得信贷排名
     */
    public Integer getCreditRank() {
        return creditRank;
    }

    /**
     * 设置获得信贷排名
     *
     * @param creditRank 获得信贷排名
     */
    public void setCreditRank(Integer creditRank) {
        this.creditRank = creditRank;
    }

    /**
     * 获取缴纳税款排名
     *
     * @return taxes_rank - 缴纳税款排名
     */
    public Integer getTaxesRank() {
        return taxesRank;
    }

    /**
     * 设置缴纳税款排名
     *
     * @param taxesRank 缴纳税款排名
     */
    public void setTaxesRank(Integer taxesRank) {
        this.taxesRank = taxesRank;
    }

    /**
     * 获取中小投资者保护排名
     *
     * @return investors_rank - 中小投资者保护排名
     */
    public Integer getInvestorsRank() {
        return investorsRank;
    }

    /**
     * 设置中小投资者保护排名
     *
     * @param investorsRank 中小投资者保护排名
     */
    public void setInvestorsRank(Integer investorsRank) {
        this.investorsRank = investorsRank;
    }

    /**
     * 获取中小投资者保护指数
     *
     * @return investors_index - 中小投资者保护指数
     */
    public Double getInvestorsIndex() {
        return investorsIndex;
    }

    /**
     * 设置中小投资者保护指数
     *
     * @param investorsIndex 中小投资者保护指数
     */
    public void setInvestorsIndex(Double investorsIndex) {
        this.investorsIndex = investorsIndex;
    }

    /**
     * 获取跨境贸易排名
     *
     * @return trading_rank - 跨境贸易排名
     */
    public Integer getTradingRank() {
        return tradingRank;
    }

    /**
     * 设置跨境贸易排名
     *
     * @param tradingRank 跨境贸易排名
     */
    public void setTradingRank(Integer tradingRank) {
        this.tradingRank = tradingRank;
    }

    /**
     * 获取合同执行排名
     *
     * @return contracts_rank - 合同执行排名
     */
    public Integer getContractsRank() {
        return contractsRank;
    }

    /**
     * 设置合同执行排名
     *
     * @param contractsRank 合同执行排名
     */
    public void setContractsRank(Integer contractsRank) {
        this.contractsRank = contractsRank;
    }

    /**
     * 获取合同执行时间(天)
     *
     * @return contracts_days - 合同执行时间(天)
     */
    public Double getContractsDays() {
        return contractsDays;
    }

    /**
     * 设置合同执行时间(天)
     *
     * @param contractsDays 合同执行时间(天)
     */
    public void setContractsDays(Double contractsDays) {
        this.contractsDays = contractsDays;
    }

    /**
     * 获取解决破产排名
     *
     * @return insolvency_rank - 解决破产排名
     */
    public Integer getInsolvencyRank() {
        return insolvencyRank;
    }

    /**
     * 设置解决破产排名
     *
     * @param insolvencyRank 解决破产排名
     */
    public void setInsolvencyRank(Integer insolvencyRank) {
        this.insolvencyRank = insolvencyRank;
    }

    /**
     * 获取解决破产时间(天)
     *
     * @return insolcenvy_days - 解决破产时间(天)
     */
    public Double getInsolcenvyDays() {
        return insolcenvyDays;
    }

    /**
     * 设置解决破产时间(天)
     *
     * @param insolcenvyDays 解决破产时间(天)
     */
    public void setInsolcenvyDays(Double insolcenvyDays) {
        this.insolcenvyDays = insolcenvyDays;
    }

    /**
     * 获取解决破产收回率(美分/美元)
     *
     * @return insolvency_rate - 解决破产收回率(美分/美元)
     */
    public Double getInsolvencyRate() {
        return insolvencyRate;
    }

    /**
     * 设置解决破产收回率(美分/美元)
     *
     * @param insolvencyRate 解决破产收回率(美分/美元)
     */
    public void setInsolvencyRate(Double insolvencyRate) {
        this.insolvencyRate = insolvencyRate;
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
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}