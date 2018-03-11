package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_health_total_rate")
public class HealthTotalRate implements Serializable {
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
     * 医疗支出占国内生产总值比重
     */
    @Column(name = "health_total")
    private Double healthTotal;

    /**
     * 人均医疗支出
     */
    @Column(name = "health_cost_per")
    private Double healthCostPer;

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
     * 获取医疗支出占国内生产总值比重
     *
     * @return health_total - 医疗支出占国内生产总值比重
     */
    public Double getHealthTotal() {
        return healthTotal;
    }

    /**
     * 设置医疗支出占国内生产总值比重
     *
     * @param healthTotal 医疗支出占国内生产总值比重
     */
    public void setHealthTotal(Double healthTotal) {
        this.healthTotal = healthTotal;
    }

    /**
     * 获取人均医疗支出
     *
     * @return health_cost_per - 人均医疗支出
     */
    public Double getHealthCostPer() {
        return healthCostPer;
    }

    /**
     * 设置人均医疗支出
     *
     * @param healthCostPer 人均医疗支出
     */
    public void setHealthCostPer(Double healthCostPer) {
        this.healthCostPer = healthCostPer;
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