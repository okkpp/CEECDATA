package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_researchers_and_technicians")
public class ResearchersAndTechnicians implements Serializable {
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
     * 每百万人中研究人员数
     */
    private Double researchers;

    /**
     * 每百万人中技术人员数
     */
    private Double technicians;

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
     * 获取每百万人中研究人员数
     *
     * @return researchers - 每百万人中研究人员数
     */
    public Double getResearchers() {
        return researchers;
    }

    /**
     * 设置每百万人中研究人员数
     *
     * @param researchers 每百万人中研究人员数
     */
    public void setResearchers(Double researchers) {
        this.researchers = researchers;
    }

    /**
     * 获取每百万人中技术人员数
     *
     * @return technicians - 每百万人中技术人员数
     */
    public Double getTechnicians() {
        return technicians;
    }

    /**
     * 设置每百万人中技术人员数
     *
     * @param technicians 每百万人中技术人员数
     */
    public void setTechnicians(Double technicians) {
        this.technicians = technicians;
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