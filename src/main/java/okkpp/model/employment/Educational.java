package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_educational")
public class Educational implements Serializable {
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
     * 初等教育
     */
    private Double primary;

    /**
     * 中等教育
     */
    private Double secondary;

    /**
     * 高等教育
     */
    private Double tertiary;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新时间
     */
    private Date update;

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
     * 获取初等教育
     *
     * @return primary - 初等教育
     */
    public Double getPrimary() {
        return primary;
    }

    /**
     * 设置初等教育
     *
     * @param primary 初等教育
     */
    public void setPrimary(Double primary) {
        this.primary = primary;
    }

    /**
     * 获取中等教育
     *
     * @return secondary - 中等教育
     */
    public Double getSecondary() {
        return secondary;
    }

    /**
     * 设置中等教育
     *
     * @param secondary 中等教育
     */
    public void setSecondary(Double secondary) {
        this.secondary = secondary;
    }

    /**
     * 获取高等教育
     *
     * @return tertiary - 高等教育
     */
    public Double getTertiary() {
        return tertiary;
    }

    /**
     * 设置高等教育
     *
     * @param tertiary 高等教育
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
     * @return update - 更新时间
     */
    public Date getUpdate() {
        return update;
    }

    /**
     * 设置更新时间
     *
     * @param update 更新时间
     */
    public void setUpdate(Date update) {
        this.update = update;
    }
}