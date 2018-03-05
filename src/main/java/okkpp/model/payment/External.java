package okkpp.model.payment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_payment_external")
public class External implements Serializable {
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
     * 外债总额
     */
    @Column(name = "total_debt")
    private Double totalDebt;

    /**
     * 长期外债
     */
    @Column(name = "long_debt")
    private Double longDebt;

    /**
     * 私人非担保外债
     */
    @Column(name = "private_debt")
    private Double privateDebt;

    /**
     * 政府及政府担保外债
     */
    @Column(name = "public_debt")
    private Double publicDebt;

    /**
     * 国际货币基金组织贷款
     */
    @Column(name = "imf_credit")
    private Double imfCredit;

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
     * 获取外债总额
     *
     * @return total_debt - 外债总额
     */
    public Double getTotalDebt() {
        return totalDebt;
    }

    /**
     * 设置外债总额
     *
     * @param totalDebt 外债总额
     */
    public void setTotalDebt(Double totalDebt) {
        this.totalDebt = totalDebt;
    }

    /**
     * 获取长期外债
     *
     * @return long_debt - 长期外债
     */
    public Double getLongDebt() {
        return longDebt;
    }

    /**
     * 设置长期外债
     *
     * @param longDebt 长期外债
     */
    public void setLongDebt(Double longDebt) {
        this.longDebt = longDebt;
    }

    /**
     * 获取私人非担保外债
     *
     * @return private_debt - 私人非担保外债
     */
    public Double getPrivateDebt() {
        return privateDebt;
    }

    /**
     * 设置私人非担保外债
     *
     * @param privateDebt 私人非担保外债
     */
    public void setPrivateDebt(Double privateDebt) {
        this.privateDebt = privateDebt;
    }

    /**
     * 获取政府及政府担保外债
     *
     * @return public_debt - 政府及政府担保外债
     */
    public Double getPublicDebt() {
        return publicDebt;
    }

    /**
     * 设置政府及政府担保外债
     *
     * @param publicDebt 政府及政府担保外债
     */
    public void setPublicDebt(Double publicDebt) {
        this.publicDebt = publicDebt;
    }

    /**
     * 获取国际货币基金组织贷款
     *
     * @return imf_credit - 国际货币基金组织贷款
     */
    public Double getImfCredit() {
        return imfCredit;
    }

    /**
     * 设置国际货币基金组织贷款
     *
     * @param imfCredit 国际货币基金组织贷款
     */
    public void setImfCredit(Double imfCredit) {
        this.imfCredit = imfCredit;
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