package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_patent_applications")
public class PatentApplications implements Serializable {
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
     * 居民专利申请数量
     */
    private Integer residents;

    /**
     * 非居民专利申请数量
     */
    @Column(name = "non-residents")
    private Integer nonResidents;

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
     * 获取居民专利申请数量
     *
     * @return residents - 居民专利申请数量
     */
    public Integer getResidents() {
        return residents;
    }

    /**
     * 设置居民专利申请数量
     *
     * @param residents 居民专利申请数量
     */
    public void setResidents(Integer residents) {
        this.residents = residents;
    }

    /**
     * 获取非居民专利申请数量
     *
     * @return non-residents - 非居民专利申请数量
     */
    public Integer getNonResidents() {
        return nonResidents;
    }

    /**
     * 设置非居民专利申请数量
     *
     * @param nonResidents 非居民专利申请数量
     */
    public void setNonResidents(Integer nonResidents) {
        this.nonResidents = nonResidents;
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