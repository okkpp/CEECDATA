package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_composition_employment")
public class CompositionEmployment implements Serializable {
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
     * 第一产业
     */
    @Column(name = "primary_edu")
    private Double primaryEdu;

    /**
     * 第二产业
     */
    @Column(name = "secondary_edu")
    private Double secondaryEdu;

    /**
     * 第三产业
     */
    @Column(name = "tertiary_edu")
    private Double tertiaryEdu;

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
     * 获取第一产业
     *
     * @return primary_edu - 第一产业
     */
    public Double getPrimaryEdu() {
        return primaryEdu;
    }

    /**
     * 设置第一产业
     *
     * @param primaryEdu 第一产业
     */
    public void setPrimaryEdu(Double primaryEdu) {
        this.primaryEdu = primaryEdu;
    }

    /**
     * 获取第二产业
     *
     * @return secondary_edu - 第二产业
     */
    public Double getSecondaryEdu() {
        return secondaryEdu;
    }

    /**
     * 设置第二产业
     *
     * @param secondaryEdu 第二产业
     */
    public void setSecondaryEdu(Double secondaryEdu) {
        this.secondaryEdu = secondaryEdu;
    }

    /**
     * 获取第三产业
     *
     * @return tertiary_edu - 第三产业
     */
    public Double getTertiaryEdu() {
        return tertiaryEdu;
    }

    /**
     * 设置第三产业
     *
     * @param tertiaryEdu 第三产业
     */
    public void setTertiaryEdu(Double tertiaryEdu) {
        this.tertiaryEdu = tertiaryEdu;
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