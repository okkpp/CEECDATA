package okkpp.model.trade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_trade_exports_by_commodity_groups")
public class ExportsByCommodityGroups implements Serializable {
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
     * 农业原材料
     */
    private Double agricultural;

    /**
     * 食品
     */
    private Double food;

    /**
     * 燃料
     */
    private Double fuel;

    /**
     * 矿物和金属
     */
    @Column(name = "ores_and_metals")
    private Double oresAndMetals;

    /**
     * 制成品
     */
    private Double manufactures;

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
     * 获取农业原材料
     *
     * @return agricultural - 农业原材料
     */
    public Double getAgricultural() {
        return agricultural;
    }

    /**
     * 设置农业原材料
     *
     * @param agricultural 农业原材料
     */
    public void setAgricultural(Double agricultural) {
        this.agricultural = agricultural;
    }

    /**
     * 获取食品
     *
     * @return food - 食品
     */
    public Double getFood() {
        return food;
    }

    /**
     * 设置食品
     *
     * @param food 食品
     */
    public void setFood(Double food) {
        this.food = food;
    }

    /**
     * 获取燃料
     *
     * @return fuel - 燃料
     */
    public Double getFuel() {
        return fuel;
    }

    /**
     * 设置燃料
     *
     * @param fuel 燃料
     */
    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    /**
     * 获取矿物和金属
     *
     * @return ores_and_metals - 矿物和金属
     */
    public Double getOresAndMetals() {
        return oresAndMetals;
    }

    /**
     * 设置矿物和金属
     *
     * @param oresAndMetals 矿物和金属
     */
    public void setOresAndMetals(Double oresAndMetals) {
        this.oresAndMetals = oresAndMetals;
    }

    /**
     * 获取制成品
     *
     * @return manufactures - 制成品
     */
    public Double getManufactures() {
        return manufactures;
    }

    /**
     * 设置制成品
     *
     * @param manufactures 制成品
     */
    public void setManufactures(Double manufactures) {
        this.manufactures = manufactures;
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