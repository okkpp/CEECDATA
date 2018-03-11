package okkpp.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_infant_mortality_rate")
public class InfantMortalityRate implements Serializable {
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
     * 婴儿死亡率
     */
    private Double rate;

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
     * 获取婴儿死亡率
     *
     * @return rate - 婴儿死亡率
     */
    public Double getRate() {
        return rate;
    }

    /**
     * 设置婴儿死亡率
     *
     * @param rate 婴儿死亡率
     */
    public void setRate(Double rate) {
        this.rate = rate;
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