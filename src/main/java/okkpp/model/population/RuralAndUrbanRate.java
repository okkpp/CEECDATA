package okkpp.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_rural_and_urban_rate")
public class RuralAndUrbanRate implements Serializable {
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
     * 农村人口比重
     */
    private Double ruralrate;

    /**
     * 城市人口比重
     */
    private Double urbanrate;

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
     * 获取农村人口比重
     *
     * @return ruralrate - 农村人口比重
     */
    public Double getRuralrate() {
        return ruralrate;
    }

    /**
     * 设置农村人口比重
     *
     * @param ruralrate 农村人口比重
     */
    public void setRuralrate(Double ruralrate) {
        this.ruralrate = ruralrate;
    }

    /**
     * 获取城市人口比重
     *
     * @return urbanrate - 城市人口比重
     */
    public Double getUrbanrate() {
        return urbanrate;
    }

    /**
     * 设置城市人口比重
     *
     * @param urbanrate 城市人口比重
     */
    public void setUrbanrate(Double urbanrate) {
        this.urbanrate = urbanrate;
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