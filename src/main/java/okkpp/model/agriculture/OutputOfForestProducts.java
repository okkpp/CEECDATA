package okkpp.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_output_of_forest_products")
public class OutputOfForestProducts implements Serializable {
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
     * 栗子
     */
    private Integer chestnuts;

    /**
     * 榛子
     */
    private Integer hazelnuts;

    /**
     * 核桃
     */
    private Integer walnuts;

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
     * 获取栗子
     *
     * @return chestnuts - 栗子
     */
    public Integer getChestnuts() {
        return chestnuts;
    }

    /**
     * 设置栗子
     *
     * @param chestnuts 栗子
     */
    public void setChestnuts(Integer chestnuts) {
        this.chestnuts = chestnuts;
    }

    /**
     * 获取榛子
     *
     * @return hazelnuts - 榛子
     */
    public Integer getHazelnuts() {
        return hazelnuts;
    }

    /**
     * 设置榛子
     *
     * @param hazelnuts 榛子
     */
    public void setHazelnuts(Integer hazelnuts) {
        this.hazelnuts = hazelnuts;
    }

    /**
     * 获取核桃
     *
     * @return walnuts - 核桃
     */
    public Integer getWalnuts() {
        return walnuts;
    }

    /**
     * 设置核桃
     *
     * @param walnuts 核桃
     */
    public void setWalnuts(Integer walnuts) {
        this.walnuts = walnuts;
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