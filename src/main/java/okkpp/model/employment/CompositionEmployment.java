package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_composition_employment")
public class CompositionEmployment implements Serializable {
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
     * ��һ��ҵ
     */
    private Double primary;

    /**
     * �ڶ���ҵ
     */
    private Double secondary;

    /**
     * ������ҵ
     */
    private Double tertiary;

    /**
     * ���
     */
    private Integer sort;

    /**
     * ����ʱ��
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
     * ��ȡ��һ��ҵ
     *
     * @return primary - ��һ��ҵ
     */
    public Double getPrimary() {
        return primary;
    }

    /**
     * ���õ�һ��ҵ
     *
     * @param primary ��һ��ҵ
     */
    public void setPrimary(Double primary) {
        this.primary = primary;
    }

    /**
     * ��ȡ�ڶ���ҵ
     *
     * @return secondary - �ڶ���ҵ
     */
    public Double getSecondary() {
        return secondary;
    }

    /**
     * ���õڶ���ҵ
     *
     * @param secondary �ڶ���ҵ
     */
    public void setSecondary(Double secondary) {
        this.secondary = secondary;
    }

    /**
     * ��ȡ������ҵ
     *
     * @return tertiary - ������ҵ
     */
    public Double getTertiary() {
        return tertiary;
    }

    /**
     * ���õ�����ҵ
     *
     * @param tertiary ������ҵ
     */
    public void setTertiary(Double tertiary) {
        this.tertiary = tertiary;
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
     * @return updated - ����ʱ��
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}