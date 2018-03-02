package okkpp.model.economics;

import java.util.Date;

/**
 * �ʱ��γ��ܶ�
Share of the Contributions of Gross Capital Formation
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class ShareOfFormation {
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
     * �ʱ��γ��ܶ�(%)
     */
    private Double share;

    /**
     * ��λ
     */
    private String unit;

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

    public Double getShare() {
        return share;
    }

    public void setShare(Double share) {
        this.share = share;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
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