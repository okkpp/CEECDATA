package okkpp.model.economics;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_economics_indicators_of_na")
public class IndicatorsOfNA implements Serializable {
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
     * 国内生产总值（现价亿国际元）
     */
    private Double gdp;

    /**
     * 人均国民生产总值(现价国际元)
     */
    private Double gdppc;

    /**
     * 国民总收入（现价亿国际元）
     */
    private Double gni;

    /**
     * 人均国民总收入(现价国际元)
     */
    private Double gnipc;

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
     * 获取国内生产总值（现价亿国际元）
     *
     * @return gdp - 国内生产总值（现价亿国际元）
     */
    public Double getGdp() {
        return gdp;
    }

    /**
     * 设置国内生产总值（现价亿国际元）
     *
     * @param gdp 国内生产总值（现价亿国际元）
     */
    public void setGdp(Double gdp) {
        this.gdp = gdp;
    }

    /**
     * 获取人均国民生产总值(现价国际元)
     *
     * @return gdppc - 人均国民生产总值(现价国际元)
     */
    public Double getGdppc() {
        return gdppc;
    }

    /**
     * 设置人均国民生产总值(现价国际元)
     *
     * @param gdppc 人均国民生产总值(现价国际元)
     */
    public void setGdppc(Double gdppc) {
        this.gdppc = gdppc;
    }

    /**
     * 获取国民总收入（现价亿国际元）
     *
     * @return gni - 国民总收入（现价亿国际元）
     */
    public Double getGni() {
        return gni;
    }

    /**
     * 设置国民总收入（现价亿国际元）
     *
     * @param gni 国民总收入（现价亿国际元）
     */
    public void setGni(Double gni) {
        this.gni = gni;
    }

    /**
     * 获取人均国民总收入(现价国际元)
     *
     * @return gnipc - 人均国民总收入(现价国际元)
     */
    public Double getGnipc() {
        return gnipc;
    }

    /**
     * 设置人均国民总收入(现价国际元)
     *
     * @param gnipc 人均国民总收入(现价国际元)
     */
    public void setGnipc(Double gnipc) {
        this.gnipc = gnipc;
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