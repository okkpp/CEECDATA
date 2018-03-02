package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_educational")
public class Educational implements Serializable {
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
     * ���Ƚ���
     */
    private Double primary;

    /**
     * �еȽ���
     */
    private Double secondary;

    /**
     * �ߵȽ���
     */
    private Double tertiary;

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
     * ��ȡ���Ƚ���
     *
     * @return primary - ���Ƚ���
     */
    public Double getPrimary() {
        return primary;
    }

    /**
     * ���ó��Ƚ���
     *
     * @param primary ���Ƚ���
     */
    public void setPrimary(Double primary) {
        this.primary = primary;
    }

    /**
     * ��ȡ�еȽ���
     *
     * @return secondary - �еȽ���
     */
    public Double getSecondary() {
        return secondary;
    }

    /**
     * �����еȽ���
     *
     * @param secondary �еȽ���
     */
    public void setSecondary(Double secondary) {
        this.secondary = secondary;
    }

    /**
     * ��ȡ�ߵȽ���
     *
     * @return tertiary - �ߵȽ���
     */
    public Double getTertiary() {
        return tertiary;
    }

    /**
     * ���øߵȽ���
     *
     * @param tertiary �ߵȽ���
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