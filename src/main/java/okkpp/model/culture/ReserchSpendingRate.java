package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_reserch_spending_rate")
public class ReserchSpendingRate implements Serializable {
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
     * 研究与开发经费支出占国内生产总值比重
     */
    @Column(name = "research_rate")
    private Double researchRate;

    /**
     * 公共教育经费支出占国内生产总值比重
     */
    @Column(name = "public_rate")
    private Double publicRate;

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
     * 获取研究与开发经费支出占国内生产总值比重
     *
     * @return research_rate - 研究与开发经费支出占国内生产总值比重
     */
    public Double getResearchRate() {
        return researchRate;
    }

    /**
     * 设置研究与开发经费支出占国内生产总值比重
     *
     * @param researchRate 研究与开发经费支出占国内生产总值比重
     */
    public void setResearchRate(Double researchRate) {
        this.researchRate = researchRate;
    }

    /**
     * 获取公共教育经费支出占国内生产总值比重
     *
     * @return public_rate - 公共教育经费支出占国内生产总值比重
     */
    public Double getPublicRate() {
        return publicRate;
    }

    /**
     * 设置公共教育经费支出占国内生产总值比重
     *
     * @param publicRate 公共教育经费支出占国内生产总值比重
     */
    public void setPublicRate(Double publicRate) {
        this.publicRate = publicRate;
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