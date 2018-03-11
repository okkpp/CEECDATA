package okkpp.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_social_indicators_of_poverty")
public class SocialIndicatorsOfPoverty implements Serializable {
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
     * 5岁以内儿童死亡率
     */
    private Double national;

    /**
     * 12-23个月儿童麻疹
     */
    private Double rural;

    /**
     * 在熟练医护人员护理
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
     * 获取5岁以内儿童死亡率
     *
     * @return national - 5岁以内儿童死亡率
     */
    public Double getNational() {
        return national;
    }

    /**
     * 设置5岁以内儿童死亡率
     *
     * @param national 5岁以内儿童死亡率
     */
    public void setNational(Double national) {
        this.national = national;
    }

    /**
     * 获取12-23个月儿童麻疹
     *
     * @return rural - 12-23个月儿童麻疹
     */
    public Double getRural() {
        return rural;
    }

    /**
     * 设置12-23个月儿童麻疹
     *
     * @param rural 12-23个月儿童麻疹
     */
    public void setRural(Double rural) {
        this.rural = rural;
    }

    /**
     * 获取在熟练医护人员护理
     *
     * @return urban - 在熟练医护人员护理
     */
    public Double getUrban() {
        return urban;
    }

    /**
     * 设置在熟练医护人员护理
     *
     * @param urban 在熟练医护人员护理
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