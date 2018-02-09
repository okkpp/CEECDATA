package okkpp.model.investment;

import java.util.Date;

/**
 * 新注册企业密度（15至64岁间每1000人中的新注册）
New Business Density
 * 
 * @author wcyong
 * 
 * @date 2018-02-09
 */
public class DensityOfBusiness {
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 新注册企业密度(个/万人)
     */
    private Double density;

    /**
     * 更新时间
     */
    private Date update;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}