package okkpp.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_phone")
public class Phone implements Serializable {
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
     * 电话主线
     */
    @Column(name = "telephone_mainlines")
    private Double telephoneMainlines;

    /**
     * 移动电话
     */
    @Column(name = "mobile_phones")
    private Double mobilePhones;

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
     * 获取电话主线
     *
     * @return telephone_mainlines - 电话主线
     */
    public Double getTelephoneMainlines() {
        return telephoneMainlines;
    }

    /**
     * 设置电话主线
     *
     * @param telephoneMainlines 电话主线
     */
    public void setTelephoneMainlines(Double telephoneMainlines) {
        this.telephoneMainlines = telephoneMainlines;
    }

    /**
     * 获取移动电话
     *
     * @return mobile_phones - 移动电话
     */
    public Double getMobilePhones() {
        return mobilePhones;
    }

    /**
     * 设置移动电话
     *
     * @param mobilePhones 移动电话
     */
    public void setMobilePhones(Double mobilePhones) {
        this.mobilePhones = mobilePhones;
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