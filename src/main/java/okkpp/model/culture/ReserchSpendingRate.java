package okkpp.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_reserch_spending_rate")
public class ReserchSpendingRate implements Serializable {
    @Id
    private Integer id;

    /**
     * ����/����
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * �о��뿪������֧��ռ����������ֵ����
     */
    @Column(name = "research_rate")
    private Double researchRate;

    /**
     * ������������֧��ռ����������ֵ����
     */
    @Column(name = "public_rate")
    private Double publicRate;

    /**
     * ���
     */
    private Integer sort;

    /**
     * ��������
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
     * ��ȡ����/����
     *
     * @return country - ����/����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���/����
     *
     * @param country ����/����
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
     * ��ȡ�о��뿪������֧��ռ����������ֵ����
     *
     * @return research_rate - �о��뿪������֧��ռ����������ֵ����
     */
    public Double getResearchRate() {
        return researchRate;
    }

    /**
     * �����о��뿪������֧��ռ����������ֵ����
     *
     * @param researchRate �о��뿪������֧��ռ����������ֵ����
     */
    public void setResearchRate(Double researchRate) {
        this.researchRate = researchRate;
    }

    /**
     * ��ȡ������������֧��ռ����������ֵ����
     *
     * @return public_rate - ������������֧��ռ����������ֵ����
     */
    public Double getPublicRate() {
        return publicRate;
    }

    /**
     * ���ù�����������֧��ռ����������ֵ����
     *
     * @param publicRate ������������֧��ռ����������ֵ����
     */
    public void setPublicRate(Double publicRate) {
        this.publicRate = publicRate;
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
     * ��ȡ��������
     *
     * @return updated - ��������
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø�������
     *
     * @param updated ��������
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}