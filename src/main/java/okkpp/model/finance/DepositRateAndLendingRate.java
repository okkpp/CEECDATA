package okkpp.model.finance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_finance_deposit_rate_and_lending_rate")
public class DepositRateAndLendingRate implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 年平均存款利率
     */
    @Column(name = "deposit_rate")
    private Double depositRate;

    /**
     * 贷款利率
     */
    @Column(name = "lending_rate")
    private Double lendingRate;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新时间
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
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
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
     * 获取年平均存款利率
     *
     * @return deposit_rate - 年平均存款利率
     */
    public Double getDepositRate() {
        return depositRate;
    }

    /**
     * 设置年平均存款利率
     *
     * @param depositRate 年平均存款利率
     */
    public void setDepositRate(Double depositRate) {
        this.depositRate = depositRate;
    }

    /**
     * 获取贷款利率
     *
     * @return lending_rate - 贷款利率
     */
    public Double getLendingRate() {
        return lendingRate;
    }

    /**
     * 设置贷款利率
     *
     * @param lendingRate 贷款利率
     */
    public void setLendingRate(Double lendingRate) {
        this.lendingRate = lendingRate;
    }

    /**
     * 获取序号
     *
     * @return sort - 序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置序号
     *
     * @param sort 序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}