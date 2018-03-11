package okkpp.model.population;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_population_birth_rate_death_rate")
public class BirthAndDeathRate implements Serializable {
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
     * 出生率
     */
    private Double birthrate;

    /**
     * 死亡率
     */
    private Double deathrate;

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
     * 获取出生率
     *
     * @return birthrate - 出生率
     */
    public Double getBirthrate() {
        return birthrate;
    }

    /**
     * 设置出生率
     *
     * @param birthrate 出生率
     */
    public void setBirthrate(Double birthrate) {
        this.birthrate = birthrate;
    }

    /**
     * 获取死亡率
     *
     * @return deathrate - 死亡率
     */
    public Double getDeathrate() {
        return deathrate;
    }

    /**
     * 设置死亡率
     *
     * @param deathrate 死亡率
     */
    public void setDeathrate(Double deathrate) {
        this.deathrate = deathrate;
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