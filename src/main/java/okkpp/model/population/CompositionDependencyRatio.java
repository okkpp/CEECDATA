package okkpp.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_composition_dependency_ratio")
public class CompositionDependencyRatio implements Serializable {
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
     * 抚养比
     */
    @Column(name = "dependency_ratio")
    private Double dependencyRatio;

    /**
     * 14岁以下占比
     */
    @Column(name = "ages_14_rate")
    private Double ages14Rate;

    /**
     * 15-64岁占比
     */
    @Column(name = "ages_15_to64")
    private Double ages15To64;

    /**
     * 65岁以上占比
     */
    @Column(name = "ages_65_and_above")
    private Double ages65AndAbove;

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
     * 获取抚养比
     *
     * @return dependency_ratio - 抚养比
     */
    public Double getDependencyRatio() {
        return dependencyRatio;
    }

    /**
     * 设置抚养比
     *
     * @param dependencyRatio 抚养比
     */
    public void setDependencyRatio(Double dependencyRatio) {
        this.dependencyRatio = dependencyRatio;
    }

    /**
     * 获取14岁以下占比
     *
     * @return ages_14_rate - 14岁以下占比
     */
    public Double getAges14Rate() {
        return ages14Rate;
    }

    /**
     * 设置14岁以下占比
     *
     * @param ages14Rate 14岁以下占比
     */
    public void setAges14Rate(Double ages14Rate) {
        this.ages14Rate = ages14Rate;
    }

    /**
     * 获取15-64岁占比
     *
     * @return ages_15_to64 - 15-64岁占比
     */
    public Double getAges15To64() {
        return ages15To64;
    }

    /**
     * 设置15-64岁占比
     *
     * @param ages15To64 15-64岁占比
     */
    public void setAges15To64(Double ages15To64) {
        this.ages15To64 = ages15To64;
    }

    /**
     * 获取65岁以上占比
     *
     * @return ages_65_and_above - 65岁以上占比
     */
    public Double getAges65AndAbove() {
        return ages65AndAbove;
    }

    /**
     * 设置65岁以上占比
     *
     * @param ages65AndAbove 65岁以上占比
     */
    public void setAges65AndAbove(Double ages65AndAbove) {
        this.ages65AndAbove = ages65AndAbove;
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