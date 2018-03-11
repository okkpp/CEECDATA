package okkpp.model.economics;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_economics_growth_rate_gdppc")
public class GrowthOfGDPPC implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家编码
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 人均国内生产总值增长率(%)
     */
    private Double rate;

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
     * 获取国家编码
     *
     * @return country - 国家编码
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家编码
     *
     * @param country 国家编码
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
     * 获取人均国内生产总值增长率(%)
     *
     * @return rate - 人均国内生产总值增长率(%)
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 设置人均国内生产总值增长率(%)
     *
     * @param rate 人均国内生产总值增长率(%)
     */
    public void setRate(Double rate) {
        this.rate = rate;
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