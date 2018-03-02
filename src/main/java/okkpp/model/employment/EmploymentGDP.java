package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_gdp")
public class EmploymentGDP implements Serializable {
    @Id
    private Integer id;

    /**
     * ����
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ƽ������
     */
    private Double wages;

    /**
     * ���
     */
    private Integer sort;

    /**
     * ����ʱ��
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
     * ��ȡ����
     *
     * @return country - ����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���
     *
     * @param country ����
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * ��ȡ���
     *
     * @return year - ���
     */
    public String getYear() {
        return year;
    }

    /**
     * �������
     *
     * @param year ���
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * ��ȡƽ������
     *
     * @return wages - ƽ������
     */
    public Double getWages() {
        return wages;
    }

    /**
     * ����ƽ������
     *
     * @param wages ƽ������
     */
    public void setWages(Double wages) {
        this.wages = wages;
    }

    /**
     * ��ȡ���
     *
     * @return sort - ���
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * �������
     *
     * @param sort ���
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return update - ����ʱ��
     */
    public Date getUpdate() {
        return update;
    }

    /**
     * ���ø���ʱ��
     *
     * @param update ����ʱ��
     */
    public void setUpdate(Date update) {
        this.update = update;
    }
}