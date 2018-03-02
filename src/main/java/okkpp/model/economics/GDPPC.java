package okkpp.model.economics;

import java.util.Date;

/**
 * �˾�����������ֵ(�ּ���Ԫ)
GDP per Capita
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class GDPPC {
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
     * �˾�����������ֵ(��Ԫ)
     */
    private Double gdp;

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

    public Double getGdp() {
        return gdp;
    }

    public void setGdp(Double gdp) {
        this.gdp = gdp;
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