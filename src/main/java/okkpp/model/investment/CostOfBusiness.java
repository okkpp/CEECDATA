package okkpp.model.investment;

import java.util.Date;

/**
 * ��ҵ��ҵ�ɱ� 
Cost of Business Start-up
 * 
 * @author wcyong
 * 
 * @date 2018-03-02
 */
public class CostOfBusiness {
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
     * ������ҵ����������(��)
     */
    private Integer number;

    /**
     * ������ҵ����ʱ�䣨��)
     */
    private Double days;

    /**
     * ������ҵ�ɱ�ռ�˾�������أ�%��
     */
    private Double percentage;

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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getDays() {
        return days;
    }

    public void setDays(Double days) {
        this.days = days;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
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