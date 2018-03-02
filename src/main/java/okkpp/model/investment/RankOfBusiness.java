package okkpp.model.investment;

import java.util.Date;

/**
 * 企业经营环境排名（2017年）
East of Doing Business Rank（2017）
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class RankOfBusiness {
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
    private Integer businessRank;

    /**
     * 开办企业排名
     */
    private Integer startRank;

    /**
     * 申请建筑许可排名
     */
    private Integer constructionRank;

    /**
     * 申请建筑许可手续(个)
     */
    private Integer constructionNumber;

    /**
     * 申请建筑许可时间(天)
     */
    private Double constructionDays;

    /**
     * 注册资产排名
     */
    private Integer propertyRank;

    /**
     * 注册资产手续(个)
     */
    private Integer propertyNumber;

    /**
     * 注册资产时间(天)
     */
    private Double propertyDays;

    /**
     * 获得信贷排名
     */
    private Integer creditRank;

    /**
     * 缴纳税款排名
     */
    private Integer taxesRank;

    /**
     * 中小投资者保护排名
     */
    private Integer investorsRank;

    /**
     * 中小投资者保护指数
     */
    private Double investorsIndex;

    /**
     * 跨境贸易排名
     */
    private Integer tradingRank;

    /**
     * 合同执行排名
     */
    private Integer contractsRank;

    /**
     * 合同执行时间(天)
     */
    private Double contractsDays;

    /**
     * 解决破产排名
     */
    private Integer insolvencyRank;

    /**
     * 解决破产时间(天)
     */
    private Double insolcenvyDays;

    /**
     * 解决破产收回率(美分/美元)
     */
    private Double insolvencyRate;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新时间
     */
    private Date update;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Integer getBusinessRank() {
        return businessRank;
    }

    public void setBusinessRank(Integer businessRank) {
        this.businessRank = businessRank;
    }

    public Integer getStartRank() {
        return startRank;
    }

    public void setStartRank(Integer startRank) {
        this.startRank = startRank;
    }

    public Integer getConstructionRank() {
        return constructionRank;
    }

    public void setConstructionRank(Integer constructionRank) {
        this.constructionRank = constructionRank;
    }

    public Integer getConstructionNumber() {
        return constructionNumber;
    }

    public void setConstructionNumber(Integer constructionNumber) {
        this.constructionNumber = constructionNumber;
    }

    public Double getConstructionDays() {
        return constructionDays;
    }

    public void setConstructionDays(Double constructionDays) {
        this.constructionDays = constructionDays;
    }

    public Integer getPropertyRank() {
        return propertyRank;
    }

    public void setPropertyRank(Integer propertyRank) {
        this.propertyRank = propertyRank;
    }

    public Integer getPropertyNumber() {
        return propertyNumber;
    }

    public void setPropertyNumber(Integer propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public Double getPropertyDays() {
        return propertyDays;
    }

    public void setPropertyDays(Double propertyDays) {
        this.propertyDays = propertyDays;
    }

    public Integer getCreditRank() {
        return creditRank;
    }

    public void setCreditRank(Integer creditRank) {
        this.creditRank = creditRank;
    }

    public Integer getTaxesRank() {
        return taxesRank;
    }

    public void setTaxesRank(Integer taxesRank) {
        this.taxesRank = taxesRank;
    }

    public Integer getInvestorsRank() {
        return investorsRank;
    }

    public void setInvestorsRank(Integer investorsRank) {
        this.investorsRank = investorsRank;
    }

    public Double getInvestorsIndex() {
        return investorsIndex;
    }

    public void setInvestorsIndex(Double investorsIndex) {
        this.investorsIndex = investorsIndex;
    }

    public Integer getTradingRank() {
        return tradingRank;
    }

    public void setTradingRank(Integer tradingRank) {
        this.tradingRank = tradingRank;
    }

    public Integer getContractsRank() {
        return contractsRank;
    }

    public void setContractsRank(Integer contractsRank) {
        this.contractsRank = contractsRank;
    }

    public Double getContractsDays() {
        return contractsDays;
    }

    public void setContractsDays(Double contractsDays) {
        this.contractsDays = contractsDays;
    }

    public Integer getInsolvencyRank() {
        return insolvencyRank;
    }

    public void setInsolvencyRank(Integer insolvencyRank) {
        this.insolvencyRank = insolvencyRank;
    }

    public Double getInsolcenvyDays() {
        return insolcenvyDays;
    }

    public void setInsolcenvyDays(Double insolcenvyDays) {
        this.insolcenvyDays = insolcenvyDays;
    }

    public Double getInsolvencyRate() {
        return insolvencyRate;
    }

    public void setInsolvencyRate(Double insolvencyRate) {
        this.insolvencyRate = insolvencyRate;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }
}