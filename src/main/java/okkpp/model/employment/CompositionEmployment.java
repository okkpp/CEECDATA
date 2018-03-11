package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_composition_employment")
public class CompositionEmployment implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 第一产业
     */
    private Double primary;

    /**
     * 第二产业
     */
    private Double secondary;

    /**
     * 第三产业
     */
    private Double tertiary;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新时间
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
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
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
     * 获取第一产业
     *
     * @return primary - 第一产业
     */
    public Double getPrimary() {
        return primary;
    }

    /**
     * 设置第一产业
     *
     * @param primary 第一产业
     */
    public void setPrimary(Double primary) {
        this.primary = primary;
    }

    /**
     * 获取第二产业
     *
     * @return secondary - 第二产业
     */
    public Double getSecondary() {
        return secondary;
    }

    /**
     * 设置第二产业
     *
     * @param secondary 第二产业
     */
    public void setSecondary(Double secondary) {
        this.secondary = secondary;
    }

    /**
     * 获取第三产业
     *
     * @return tertiary - 第三产业
     */
    public Double getTertiary() {
        return tertiary;
    }

    /**
     * 设置第三产业
     *
     * @param tertiary 第三产业
     */
    public void setTertiary(Double tertiary) {
        this.tertiary = tertiary;
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
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}