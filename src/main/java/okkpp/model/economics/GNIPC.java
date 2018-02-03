package okkpp.model.economics;

import java.util.Date;

/**
 * 人均国民总收入（美元）
GNI per Capita（USD）
 * 
 * @author wcyong
 * 
 * @date 2018-02-03
 */
public class GNIPC {
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
     * 人均国民总收入(美元)
     */
    private Integer gni;

    /**
     * 更新日期
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

    public Integer getGni() {
        return gni;
    }

    public void setGni(Integer gni) {
        this.gni = gni;
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