package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_school_enrollment_ratio")
public class SchoolEnrollmentRatio implements Serializable {
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
     * 高等教育粗入学率
     */
    @Column(name = "school_enrollment_tertiary")
    private Double schoolEnrollmentTertiary;

    /**
     * 中等教育粗入学率
     */
    @Column(name = "school_enrollment_secondary")
    private Double schoolEnrollmentSecondary;

    /**
     * 初等教育粗入学率
     */
    @Column(name = "school_enrollment_primary")
    private Double schoolEnrollmentPrimary;

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
     * 获取高等教育粗入学率
     *
     * @return school_enrollment_tertiary - 高等教育粗入学率
     */
    public Double getSchoolEnrollmentTertiary() {
        return schoolEnrollmentTertiary;
    }

    /**
     * 设置高等教育粗入学率
     *
     * @param schoolEnrollmentTertiary 高等教育粗入学率
     */
    public void setSchoolEnrollmentTertiary(Double schoolEnrollmentTertiary) {
        this.schoolEnrollmentTertiary = schoolEnrollmentTertiary;
    }

    /**
     * 获取中等教育粗入学率
     *
     * @return school_enrollment_secondary - 中等教育粗入学率
     */
    public Double getSchoolEnrollmentSecondary() {
        return schoolEnrollmentSecondary;
    }

    /**
     * 设置中等教育粗入学率
     *
     * @param schoolEnrollmentSecondary 中等教育粗入学率
     */
    public void setSchoolEnrollmentSecondary(Double schoolEnrollmentSecondary) {
        this.schoolEnrollmentSecondary = schoolEnrollmentSecondary;
    }

    /**
     * 获取初等教育粗入学率
     *
     * @return school_enrollment_primary - 初等教育粗入学率
     */
    public Double getSchoolEnrollmentPrimary() {
        return schoolEnrollmentPrimary;
    }

    /**
     * 设置初等教育粗入学率
     *
     * @param schoolEnrollmentPrimary 初等教育粗入学率
     */
    public void setSchoolEnrollmentPrimary(Double schoolEnrollmentPrimary) {
        this.schoolEnrollmentPrimary = schoolEnrollmentPrimary;
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