package okkpp.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_freight")
public class Freight implements Serializable {
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
     * 国际海运装货量
     */
    private Integer loaded;

    /**
     * 国际海运卸货量
     */
    private Integer unloaded;

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
     * 获取国际海运装货量
     *
     * @return loaded - 国际海运装货量
     */
    public Integer getLoaded() {
        return loaded;
    }

    /**
     * 设置国际海运装货量
     *
     * @param loaded 国际海运装货量
     */
    public void setLoaded(Integer loaded) {
        this.loaded = loaded;
    }

    /**
     * 获取国际海运卸货量
     *
     * @return unloaded - 国际海运卸货量
     */
    public Integer getUnloaded() {
        return unloaded;
    }

    /**
     * 设置国际海运卸货量
     *
     * @param unloaded 国际海运卸货量
     */
    public void setUnloaded(Integer unloaded) {
        this.unloaded = unloaded;
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