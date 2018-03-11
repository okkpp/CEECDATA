package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_water_people_rate")
public class WaterPeopleRate implements Serializable {
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
     * 享有卫生设施人口占总人口比重
     */
    @Column(name = "sanitation_facilities")
    private Double sanitationFacilities;

    /**
     * 享有清洁饮用水源人口占总人口比重
     */
    @Column(name = "water_source")
    private Double waterSource;

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
     * 获取享有卫生设施人口占总人口比重
     *
     * @return sanitation_facilities - 享有卫生设施人口占总人口比重
     */
    public Double getSanitationFacilities() {
        return sanitationFacilities;
    }

    /**
     * 设置享有卫生设施人口占总人口比重
     *
     * @param sanitationFacilities 享有卫生设施人口占总人口比重
     */
    public void setSanitationFacilities(Double sanitationFacilities) {
        this.sanitationFacilities = sanitationFacilities;
    }

    /**
     * 获取享有清洁饮用水源人口占总人口比重
     *
     * @return water_source - 享有清洁饮用水源人口占总人口比重
     */
    public Double getWaterSource() {
        return waterSource;
    }

    /**
     * 设置享有清洁饮用水源人口占总人口比重
     *
     * @param waterSource 享有清洁饮用水源人口占总人口比重
     */
    public void setWaterSource(Double waterSource) {
        this.waterSource = waterSource;
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