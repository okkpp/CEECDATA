package okkpp.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_harvest_areas")
public class HarvestAreas implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家
     */
    private String country;

    /**
     * 谷物
     */
    private Integer cereals;

    /**
     * 稻谷
     */
    private Integer rice;

    /**
     * 小麦
     */
    private Integer wheat;

    /**
     * 玉米
     */
    private Integer maize;

    /**
     * 大豆
     */
    private Integer soybeans;

    /**
     * 花生
     */
    private Integer groundnuts;

    /**
     * 油菜籽
     */
    private Integer rapeseed;

    /**
     * 籽棉
     */
    private Integer seedcotton;

    /**
     * 甜菜
     */
    private Integer sugerbeets;

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
     * 获取谷物
     *
     * @return cereals - 谷物
     */
    public Integer getCereals() {
        return cereals;
    }

    /**
     * 设置谷物
     *
     * @param cereals 谷物
     */
    public void setCereals(Integer cereals) {
        this.cereals = cereals;
    }

    /**
     * 获取稻谷
     *
     * @return rice - 稻谷
     */
    public Integer getRice() {
        return rice;
    }

    /**
     * 设置稻谷
     *
     * @param rice 稻谷
     */
    public void setRice(Integer rice) {
        this.rice = rice;
    }

    /**
     * 获取小麦
     *
     * @return wheat - 小麦
     */
    public Integer getWheat() {
        return wheat;
    }

    /**
     * 设置小麦
     *
     * @param wheat 小麦
     */
    public void setWheat(Integer wheat) {
        this.wheat = wheat;
    }

    /**
     * 获取玉米
     *
     * @return maize - 玉米
     */
    public Integer getMaize() {
        return maize;
    }

    /**
     * 设置玉米
     *
     * @param maize 玉米
     */
    public void setMaize(Integer maize) {
        this.maize = maize;
    }

    /**
     * 获取大豆
     *
     * @return soybeans - 大豆
     */
    public Integer getSoybeans() {
        return soybeans;
    }

    /**
     * 设置大豆
     *
     * @param soybeans 大豆
     */
    public void setSoybeans(Integer soybeans) {
        this.soybeans = soybeans;
    }

    /**
     * 获取花生
     *
     * @return groundnuts - 花生
     */
    public Integer getGroundnuts() {
        return groundnuts;
    }

    /**
     * 设置花生
     *
     * @param groundnuts 花生
     */
    public void setGroundnuts(Integer groundnuts) {
        this.groundnuts = groundnuts;
    }

    /**
     * 获取油菜籽
     *
     * @return rapeseed - 油菜籽
     */
    public Integer getRapeseed() {
        return rapeseed;
    }

    /**
     * 设置油菜籽
     *
     * @param rapeseed 油菜籽
     */
    public void setRapeseed(Integer rapeseed) {
        this.rapeseed = rapeseed;
    }

    /**
     * 获取籽棉
     *
     * @return seedcotton - 籽棉
     */
    public Integer getSeedcotton() {
        return seedcotton;
    }

    /**
     * 设置籽棉
     *
     * @param seedcotton 籽棉
     */
    public void setSeedcotton(Integer seedcotton) {
        this.seedcotton = seedcotton;
    }

    /**
     * 获取甜菜
     *
     * @return sugerbeets - 甜菜
     */
    public Integer getSugerbeets() {
        return sugerbeets;
    }

    /**
     * 设置甜菜
     *
     * @param sugerbeets 甜菜
     */
    public void setSugerbeets(Integer sugerbeets) {
        this.sugerbeets = sugerbeets;
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