package okkpp.model.energy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_energy_electricity_generation")
public class ElectricityGeneration implements Serializable {
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
     * 发电量总计
     */
    private Integer total;

    /**
     * 热电
     */
    private Integer thermal;

    /**
     * 水电
     */
    private Integer hydro;

    /**
     * 核电
     */
    private Integer nuclear;

    /**
     * 风电
     */
    private Integer wind;

    /**
     * 太阳能电
     */
    private Integer solar;

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
     * 获取发电量总计
     *
     * @return total - 发电量总计
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 设置发电量总计
     *
     * @param total 发电量总计
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 获取热电
     *
     * @return thermal - 热电
     */
    public Integer getThermal() {
        return thermal;
    }

    /**
     * 设置热电
     *
     * @param thermal 热电
     */
    public void setThermal(Integer thermal) {
        this.thermal = thermal;
    }

    /**
     * 获取水电
     *
     * @return hydro - 水电
     */
    public Integer getHydro() {
        return hydro;
    }

    /**
     * 设置水电
     *
     * @param hydro 水电
     */
    public void setHydro(Integer hydro) {
        this.hydro = hydro;
    }

    /**
     * 获取核电
     *
     * @return nuclear - 核电
     */
    public Integer getNuclear() {
        return nuclear;
    }

    /**
     * 设置核电
     *
     * @param nuclear 核电
     */
    public void setNuclear(Integer nuclear) {
        this.nuclear = nuclear;
    }

    /**
     * 获取风电
     *
     * @return wind - 风电
     */
    public Integer getWind() {
        return wind;
    }

    /**
     * 设置风电
     *
     * @param wind 风电
     */
    public void setWind(Integer wind) {
        this.wind = wind;
    }

    /**
     * 获取太阳能电
     *
     * @return solar - 太阳能电
     */
    public Integer getSolar() {
        return solar;
    }

    /**
     * 设置太阳能电
     *
     * @param solar 太阳能电
     */
    public void setSolar(Integer solar) {
        this.solar = solar;
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