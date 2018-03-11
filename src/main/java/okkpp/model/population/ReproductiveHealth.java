package okkpp.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_reproductive_health")
public class ReproductiveHealth implements Serializable {
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
     * 总和生育率
     */
    @Column(name = "total_rate")
    private Double totalRate;

    /**
     * 15-19岁少女生育率
     */
    @Column(name = "rate15_19")
    private Double rate1519;

    /**
     * 15-49岁妇女避孕普及率
     */
    @Column(name = "rate15_49")
    private Double rate1549;

    /**
     * 产妇死亡率
     */
    private Double ratio;

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
     * 获取总和生育率
     *
     * @return total_rate - 总和生育率
     */
    public Double getTotalRate() {
        return totalRate;
    }

    /**
     * 设置总和生育率
     *
     * @param totalRate 总和生育率
     */
    public void setTotalRate(Double totalRate) {
        this.totalRate = totalRate;
    }

    /**
     * 获取15-19岁少女生育率
     *
     * @return rate15_19 - 15-19岁少女生育率
     */
    public Double getRate1519() {
        return rate1519;
    }

    /**
     * 设置15-19岁少女生育率
     *
     * @param rate1519 15-19岁少女生育率
     */
    public void setRate1519(Double rate1519) {
        this.rate1519 = rate1519;
    }

    /**
     * 获取15-49岁妇女避孕普及率
     *
     * @return rate15_49 - 15-49岁妇女避孕普及率
     */
    public Double getRate1549() {
        return rate1549;
    }

    /**
     * 设置15-49岁妇女避孕普及率
     *
     * @param rate1549 15-49岁妇女避孕普及率
     */
    public void setRate1549(Double rate1549) {
        this.rate1549 = rate1549;
    }

    /**
     * 获取产妇死亡率
     *
     * @return ratio - 产妇死亡率
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * 设置产妇死亡率
     *
     * @param ratio 产妇死亡率
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
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