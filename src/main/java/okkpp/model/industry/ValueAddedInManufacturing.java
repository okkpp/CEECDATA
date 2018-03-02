package okkpp.model.industry;

import java.util.Date;

/**
 * 11-4 制造业增加值
 Value Added in Manufacturing
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class ValueAddedInManufacturing {
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 制造业增加值
     */
    private Double addedValue;

    /**
     * 食品、饮料和烟草行业所占比重
     */
    private Double foodBeveragesTobacco;

    /**
     * 纺织和服装行业所占比重
     */
    private Double textilesClothing;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新时间
     */
    private Date update;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Double getAddedValue() {
        return addedValue;
    }

    public void setAddedValue(Double addedValue) {
        this.addedValue = addedValue;
    }

    public Double getFoodBeveragesTobacco() {
        return foodBeveragesTobacco;
    }

    public void setFoodBeveragesTobacco(Double foodBeveragesTobacco) {
        this.foodBeveragesTobacco = foodBeveragesTobacco;
    }

    public Double getTextilesClothing() {
        return textilesClothing;
    }

    public void setTextilesClothing(Double textilesClothing) {
        this.textilesClothing = textilesClothing;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }
}