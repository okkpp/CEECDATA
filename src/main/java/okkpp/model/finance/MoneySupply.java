package okkpp.model.finance;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_finance_money_supply")
public class MoneySupply implements Serializable {
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
     * 狭义货币
     */
    private Double narrow;

    /**
     * 广义货币
     */
    private Double quasi;

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
     * 获取狭义货币
     *
     * @return narrow - 狭义货币
     */
    public Double getNarrow() {
        return narrow;
    }

    /**
     * 设置狭义货币
     *
     * @param narrow 狭义货币
     */
    public void setNarrow(Double narrow) {
        this.narrow = narrow;
    }

    /**
     * 获取广义货币
     *
     * @return quasi - 广义货币
     */
    public Double getQuasi() {
        return quasi;
    }

    /**
     * 设置广义货币
     *
     * @param quasi 广义货币
     */
    public void setQuasi(Double quasi) {
        this.quasi = quasi;
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