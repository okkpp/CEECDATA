package okkpp.model.finance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_finance_stocks_traded_value")
public class StocksTradedValue implements Serializable {
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
     * ռ����������ֵ����
     */
    private Double percentage;

    /**
     * ��Ʊ������ת��
     */
    private Double ratio;

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
     * ��ȡռ����������ֵ����
     *
     * @return percentage - ռ����������ֵ����
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * ����ռ����������ֵ����
     *
     * @param percentage ռ����������ֵ����
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    /**
     * ��ȡ��Ʊ������ת��
     *
     * @return ratio - ��Ʊ������ת��
     */
    public Double getRatio() {
        return ratio;
    }

    /**
     * ���ù�Ʊ������ת��
     *
     * @param ratio ��Ʊ������ת��
     */
    public void setRatio(Double ratio) {
        this.ratio = ratio;
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