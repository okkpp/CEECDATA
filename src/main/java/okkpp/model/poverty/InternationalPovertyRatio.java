package okkpp.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_international_poverty_ratio")
public class InternationalPovertyRatio implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家/地区
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 日均收入不足1.9的贫困人口占人口比重
     */
    @Column(name = "radio1_9")
    private Double radio19;

    /**
     * 日均收入不足3.1美元的贫困人口占总人口比重
     */
    @Column(name = "radio3_1")
    private Double radio31;

    /**
     * 序号
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
     * 获取国家/地区
     *
     * @return country - 国家/地区
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家/地区
     *
     * @param country 国家/地区
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
     * 获取日均收入不足1.9的贫困人口占人口比重
     *
     * @return radio1_9 - 日均收入不足1.9的贫困人口占人口比重
     */
    public Double getRadio19() {
        return radio19;
    }

    /**
     * 设置日均收入不足1.9的贫困人口占人口比重
     *
     * @param radio19 日均收入不足1.9的贫困人口占人口比重
     */
    public void setRadio19(Double radio19) {
        this.radio19 = radio19;
    }

    /**
     * 获取日均收入不足3.1美元的贫困人口占总人口比重
     *
     * @return radio3_1 - 日均收入不足3.1美元的贫困人口占总人口比重
     */
    public Double getRadio31() {
        return radio31;
    }

    /**
     * 设置日均收入不足3.1美元的贫困人口占总人口比重
     *
     * @param radio31 日均收入不足3.1美元的贫困人口占总人口比重
     */
    public void setRadio31(Double radio31) {
        this.radio31 = radio31;
    }

    /**
     * 获取序号
     *
     * @return sort - 序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置序号
     *
     * @param sort 序号
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