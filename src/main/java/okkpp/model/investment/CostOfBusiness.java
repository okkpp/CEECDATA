package okkpp.model.investment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_investment_cost_of_business")
public class CostOfBusiness implements Serializable {
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
     * 获取开办企业所需手续数(个)
     *
     * @return number - 开办企业所需手续数(个)
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置开办企业所需手续数(个)
     *
     * @param number 开办企业所需手续数(个)
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取开办企业所需时间（天)
     *
     * @return days - 开办企业所需时间（天)
     */
    public Double getDays() {
        return days;
    }

    /**
     * 设置开办企业所需时间（天)
     *
     * @param days 开办企业所需时间（天)
     */
    public void setDays(Double days) {
        this.days = days;
    }

    /**
     * 获取开办企业成本占人均收入比重（%）
     *
     * @return percentage - 开办企业成本占人均收入比重（%）
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * 设置开办企业成本占人均收入比重（%）
     *
     * @param percentage 开办企业成本占人均收入比重（%）
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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