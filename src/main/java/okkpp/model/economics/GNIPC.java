package okkpp.model.economics;

import java.util.Date;

/**
 * �˾����������루��Ԫ��
GNI per Capita��USD��
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class GNIPC {
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
     * �˾�����������(��Ԫ)
     */
    private Integer gni;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ��������
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

    public Integer getGni() {
        return gni;
    }

    public void setGni(Integer gni) {
        this.gni = gni;
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