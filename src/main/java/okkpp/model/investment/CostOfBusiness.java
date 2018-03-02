package okkpp.model.investment;

import java.util.Date;

/**
 * 企业开业成本 
Cost of Business Start-up
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class CostOfBusiness {
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
     * 开办企业所需手续数(个)
     */
    private Integer number;

    /**
     * 开办企业所需时间（天)
     */
    private Double days;

    /**
     * 开办企业成本占人均收入比重（%）
     */
    private Double percentage;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新日期
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getDays() {
        return days;
    }

    public void setDays(Double days) {
        this.days = days;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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