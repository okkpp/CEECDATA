package okkpp.model.industry;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_industry_value_added_in_manufacturing")
public class ValueAddedInManufacturing implements Serializable {
    @Id
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
    @Column(name = "added_value")
    private Double addedValue;

    /**
     * 食品、饮料和烟草行业所占比重
     */
    @Column(name = "food_beverages_tobacco")
    private Double foodBeveragesTobacco;

    /**
     * 纺织和服装行业所占比重
     */
    @Column(name = "textiles_clothing")
    private Double textilesClothing;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新时间
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
     * 获取制造业增加值
     *
     * @return added_value - 制造业增加值
     */
    public Double getAddedValue() {
        return addedValue;
    }

    /**
     * 设置制造业增加值
     *
     * @param addedValue 制造业增加值
     */
    public void setAddedValue(Double addedValue) {
        this.addedValue = addedValue;
    }

    /**
     * 获取食品、饮料和烟草行业所占比重
     *
     * @return food_beverages_tobacco - 食品、饮料和烟草行业所占比重
     */
    public Double getFoodBeveragesTobacco() {
        return foodBeveragesTobacco;
    }

    /**
     * 设置食品、饮料和烟草行业所占比重
     *
     * @param foodBeveragesTobacco 食品、饮料和烟草行业所占比重
     */
    public void setFoodBeveragesTobacco(Double foodBeveragesTobacco) {
        this.foodBeveragesTobacco = foodBeveragesTobacco;
    }

    /**
     * 获取纺织和服装行业所占比重
     *
     * @return textiles_clothing - 纺织和服装行业所占比重
     */
    public Double getTextilesClothing() {
        return textilesClothing;
    }

    /**
     * 设置纺织和服装行业所占比重
     *
     * @param textilesClothing 纺织和服装行业所占比重
     */
    public void setTextilesClothing(Double textilesClothing) {
        this.textilesClothing = textilesClothing;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}