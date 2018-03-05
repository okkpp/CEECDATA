package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_expenditure_student_gdp_rate")
public class ExpenditureStudentGDPRate implements Serializable {
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
     * 大学生教育支出占人均国内生产总值比重
     */
    @Column(name = "tertiary_school_student")
    private Double tertiarySchoolStudent;

    /**
     * 中学生教育支出占人均国内生产总值比重
     */
    @Column(name = "secondary_school_student")
    private Double secondarySchoolStudent;

    /**
     * 小学生教育支出占人均国内生产总值比重
     */
    @Column(name = "primary_school_student")
    private Double primarySchoolStudent;

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
     * 获取大学生教育支出占人均国内生产总值比重
     *
     * @return tertiary_school_student - 大学生教育支出占人均国内生产总值比重
     */
    public Double getTertiarySchoolStudent() {
        return tertiarySchoolStudent;
    }

    /**
     * 设置大学生教育支出占人均国内生产总值比重
     *
     * @param tertiarySchoolStudent 大学生教育支出占人均国内生产总值比重
     */
    public void setTertiarySchoolStudent(Double tertiarySchoolStudent) {
        this.tertiarySchoolStudent = tertiarySchoolStudent;
    }

    /**
     * 获取中学生教育支出占人均国内生产总值比重
     *
     * @return secondary_school_student - 中学生教育支出占人均国内生产总值比重
     */
    public Double getSecondarySchoolStudent() {
        return secondarySchoolStudent;
    }

    /**
     * 设置中学生教育支出占人均国内生产总值比重
     *
     * @param secondarySchoolStudent 中学生教育支出占人均国内生产总值比重
     */
    public void setSecondarySchoolStudent(Double secondarySchoolStudent) {
        this.secondarySchoolStudent = secondarySchoolStudent;
    }

    /**
     * 获取小学生教育支出占人均国内生产总值比重
     *
     * @return primary_school_student - 小学生教育支出占人均国内生产总值比重
     */
    public Double getPrimarySchoolStudent() {
        return primarySchoolStudent;
    }

    /**
     * 设置小学生教育支出占人均国内生产总值比重
     *
     * @param primarySchoolStudent 小学生教育支出占人均国内生产总值比重
     */
    public void setPrimarySchoolStudent(Double primarySchoolStudent) {
        this.primarySchoolStudent = primarySchoolStudent;
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