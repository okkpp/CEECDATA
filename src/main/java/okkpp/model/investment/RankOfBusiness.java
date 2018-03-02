package okkpp.model.investment;

import java.util.Date;

/**
 * ��ҵ��Ӫ����������2017�꣩
East of Doing Business Rank��2017��
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class RankOfBusiness {
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ��ҵ��Ӫ��������
     */
    private Integer businessRank;

    /**
     * ������ҵ����
     */
    private Integer startRank;

    /**
     * ���뽨���������
     */
    private Integer constructionRank;

    /**
     * ���뽨���������(��)
     */
    private Integer constructionNumber;

    /**
     * ���뽨�����ʱ��(��)
     */
    private Double constructionDays;

    /**
     * ע���ʲ�����
     */
    private Integer propertyRank;

    /**
     * ע���ʲ�����(��)
     */
    private Integer propertyNumber;

    /**
     * ע���ʲ�ʱ��(��)
     */
    private Double propertyDays;

    /**
     * ����Ŵ�����
     */
    private Integer creditRank;

    /**
     * ����˰������
     */
    private Integer taxesRank;

    /**
     * ��СͶ���߱�������
     */
    private Integer investorsRank;

    /**
     * ��СͶ���߱���ָ��
     */
    private Double investorsIndex;

    /**
     * �羳ó������
     */
    private Integer tradingRank;

    /**
     * ��ִͬ������
     */
    private Integer contractsRank;

    /**
     * ��ִͬ��ʱ��(��)
     */
    private Double contractsDays;

    /**
     * ����Ʋ�����
     */
    private Integer insolvencyRank;

    /**
     * ����Ʋ�ʱ��(��)
     */
    private Double insolcenvyDays;

    /**
     * ����Ʋ��ջ���(����/��Ԫ)
     */
    private Double insolvencyRate;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ����ʱ��
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