package okkpp.model.overall;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_overall_freshwater")
public class FreshWater implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 人均可再生淡水资源
     */
    private Double renewable;

    /**
     * 占水资源的总量的比重
     */
    private Double internal;

    /**
     * 农业用水
     */
    private Double agriculture;

    /**
     * 工业用水
     */
    private Double industry;

    /**
     * 生活用水
     */
    private Double domestic;

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
     * 获取人均可再生淡水资源
     *
     * @return renewable - 人均可再生淡水资源
     */
    public Double getRenewable() {
        return renewable;
    }

    /**
     * 设置人均可再生淡水资源
     *
     * @param renewable 人均可再生淡水资源
     */
    public void setRenewable(Double renewable) {
        this.renewable = renewable;
    }

    /**
     * 获取占水资源的总量的比重
     *
     * @return internal - 占水资源的总量的比重
     */
    public Double getInternal() {
        return internal;
    }

    /**
     * 设置占水资源的总量的比重
     *
     * @param internal 占水资源的总量的比重
     */
    public void setInternal(Double internal) {
        this.internal = internal;
    }

    /**
     * 获取农业用水
     *
     * @return agriculture - 农业用水
     */
    public Double getAgriculture() {
        return agriculture;
    }

    /**
     * 设置农业用水
     *
     * @param agriculture 农业用水
     */
    public void setAgriculture(Double agriculture) {
        this.agriculture = agriculture;
    }

    /**
     * 获取工业用水
     *
     * @return industry - 工业用水
     */
    public Double getIndustry() {
        return industry;
    }

    /**
     * 设置工业用水
     *
     * @param industry 工业用水
     */
    public void setIndustry(Double industry) {
        this.industry = industry;
    }

    /**
     * 获取生活用水
     *
     * @return domestic - 生活用水
     */
    public Double getDomestic() {
        return domestic;
    }

    /**
     * 设置生活用水
     *
     * @param domestic 生活用水
     */
    public void setDomestic(Double domestic) {
        this.domestic = domestic;
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