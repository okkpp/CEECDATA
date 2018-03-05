package okkpp.model.payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_foreign")
public class Foreign implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 外商直接投资
     */
    private Double inflows;

    /**
     * 对外直接投资
     */
    private Double outflows;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 更新日期
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
     * 获取国家代码
     *
     * @return country - 国家代码
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家代码
     *
     * @param country 国家代码
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取外商直接投资
     *
     * @return inflows - 外商直接投资
     */
    public Double getInflows() {
        return inflows;
    }

    /**
     * 设置外商直接投资
     *
     * @param inflows 外商直接投资
     */
    public void setInflows(Double inflows) {
        this.inflows = inflows;
    }

    /**
     * 获取对外直接投资
     *
     * @return outflows - 对外直接投资
     */
    public Double getOutflows() {
        return outflows;
    }

    /**
     * 设置对外直接投资
     *
     * @param outflows 对外直接投资
     */
    public void setOutflows(Double outflows) {
        this.outflows = outflows;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取更新日期
     *
     * @return updated - 更新日期
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新日期
     *
     * @param updated 更新日期
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}