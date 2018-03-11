package okkpp.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_rail_lines")
public class RailLines implements Serializable {
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
     * 铁路总长度
     */
    @Column(name = "rail_lines_total")
    private Integer railLinesTotal;

    /**
     * 铁路货运周转量
     */
    @Column(name = "goods_transported")
    private Double goodsTransported;

    /**
     * 铁路客运周转量
     */
    @Column(name = "passengers_carried")
    private Double passengersCarried;

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
     * 获取铁路总长度
     *
     * @return rail_lines_total - 铁路总长度
     */
    public Integer getRailLinesTotal() {
        return railLinesTotal;
    }

    /**
     * 设置铁路总长度
     *
     * @param railLinesTotal 铁路总长度
     */
    public void setRailLinesTotal(Integer railLinesTotal) {
        this.railLinesTotal = railLinesTotal;
    }

    /**
     * 获取铁路货运周转量
     *
     * @return goods_transported - 铁路货运周转量
     */
    public Double getGoodsTransported() {
        return goodsTransported;
    }

    /**
     * 设置铁路货运周转量
     *
     * @param goodsTransported 铁路货运周转量
     */
    public void setGoodsTransported(Double goodsTransported) {
        this.goodsTransported = goodsTransported;
    }

    /**
     * 获取铁路客运周转量
     *
     * @return passengers_carried - 铁路客运周转量
     */
    public Double getPassengersCarried() {
        return passengersCarried;
    }

    /**
     * 设置铁路客运周转量
     *
     * @param passengersCarried 铁路客运周转量
     */
    public void setPassengersCarried(Double passengersCarried) {
        this.passengersCarried = passengersCarried;
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