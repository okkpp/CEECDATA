package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_adult_literacy_rate")
public class AdultLiteracyRate implements Serializable {
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
     * 总计
     */
    private Double total;

    /**
     * 男性
     */
    private Double male;

    /**
     * 女性
     */
    private Double female;

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
     * 获取总计
     *
     * @return total - 总计
     */
    public Double getTotal() {
        return total;
    }

    /**
     * 设置总计
     *
     * @param total 总计
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * 获取男性
     *
     * @return male - 男性
     */
    public Double getMale() {
        return male;
    }

    /**
     * 设置男性
     *
     * @param male 男性
     */
    public void setMale(Double male) {
        this.male = male;
    }

    /**
     * 获取女性
     *
     * @return female - 女性
     */
    public Double getFemale() {
        return female;
    }

    /**
     * 设置女性
     *
     * @param female 女性
     */
    public void setFemale(Double female) {
        this.female = female;
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