package okkpp.model.poverty;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_poverty_household_consumption_expenditure")
public class HouseholdConsumptionExpenditure implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家/地区
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 居民最终消费支出
     */
    private Integer expenditure;

    /**
     * 人均居民最终消费支出
     */
    @Column(name = "expenditure_per")
    private Integer expenditurePer;

    /**
     * 序号
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
     * 获取国家/地区
     *
     * @return country - 国家/地区
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家/地区
     *
     * @param country 国家/地区
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
     * 获取居民最终消费支出
     *
     * @return expenditure - 居民最终消费支出
     */
    public Integer getExpenditure() {
        return expenditure;
    }

    /**
     * 设置居民最终消费支出
     *
     * @param expenditure 居民最终消费支出
     */
    public void setExpenditure(Integer expenditure) {
        this.expenditure = expenditure;
    }

    /**
     * 获取人均居民最终消费支出
     *
     * @return expenditure_per - 人均居民最终消费支出
     */
    public Integer getExpenditurePer() {
        return expenditurePer;
    }

    /**
     * 设置人均居民最终消费支出
     *
     * @param expenditurePer 人均居民最终消费支出
     */
    public void setExpenditurePer(Integer expenditurePer) {
        this.expenditurePer = expenditurePer;
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