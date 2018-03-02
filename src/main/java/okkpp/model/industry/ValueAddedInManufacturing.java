package okkpp.model.industry;

import java.util.Date;

/**
 * 11-4 ����ҵ����ֵ
 Value Added in Manufacturing
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class ValueAddedInManufacturing {
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ����ҵ����ֵ
     */
    private Double addedValue;

    /**
     * ʳƷ�����Ϻ��̲���ҵ��ռ����
     */
    private Double foodBeveragesTobacco;

    /**
     * ��֯�ͷ�װ��ҵ��ռ����
     */
    private Double textilesClothing;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ����ʱ��
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