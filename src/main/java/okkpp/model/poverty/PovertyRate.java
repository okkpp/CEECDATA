package okkpp.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_poverty_rate")
public class PovertyRate implements Serializable {
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
     * 全国贫困率
     */
    private Double national;

    /**
     * 农村贫困率
     */
    private Double rural;

    /**
     * 城市贫困率
     */
    private Double urban;

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
     * 获取全国贫困率
     *
     * @return national - 全国贫困率
     */
    public Double getNational() {
        return national;
    }

    /**
     * 设置全国贫困率
     *
     * @param national 全国贫困率
     */
    public void setNational(Double national) {
        this.national = national;
    }

    /**
     * 获取农村贫困率
     *
     * @return rural - 农村贫困率
     */
    public Double getRural() {
        return rural;
    }

    /**
     * 设置农村贫困率
     *
     * @param rural 农村贫困率
     */
    public void setRural(Double rural) {
        this.rural = rural;
    }

    /**
     * 获取城市贫困率
     *
     * @return urban - 城市贫困率
     */
    public Double getUrban() {
        return urban;
    }

    /**
     * 设置城市贫困率
     *
     * @param urban 城市贫困率
     */
    public void setUrban(Double urban) {
        this.urban = urban;
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