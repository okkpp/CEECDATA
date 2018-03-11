package okkpp.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_output_of_livestock_products")
public class OutputOfLivestockProducts implements Serializable {
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
     * 肉类总产量
     */
    @Column(name = "meat_total")
    private Integer meatTotal;

    /**
     * 牛肉
     */
    private Integer beef;

    /**
     * 羊肉
     */
    private Integer sheep;

    /**
     * 猪肉
     */
    private Integer pig;

    /**
     * 禽肉
     */
    private Integer poultry;

    /**
     * 蛋类总产量
     */
    @Column(name = "eggs_total")
    private Integer eggsTotal;

    /**
     * 鸡蛋
     */
    @Column(name = "hen_eggs")
    private Integer henEggs;

    /**
     * 牛奶总产量
     */
    @Column(name = "milk_total")
    private Integer milkTotal;

    /**
     * 牛奶
     */
    @Column(name = "cow_milk")
    private Integer cowMilk;

    /**
     * 羊毛
     */
    private Integer wool;

    /**
     * 蜂蜜
     */
    private Integer honey;

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
     * 获取肉类总产量
     *
     * @return meat_total - 肉类总产量
     */
    public Integer getMeatTotal() {
        return meatTotal;
    }

    /**
     * 设置肉类总产量
     *
     * @param meatTotal 肉类总产量
     */
    public void setMeatTotal(Integer meatTotal) {
        this.meatTotal = meatTotal;
    }

    /**
     * 获取牛肉
     *
     * @return beef - 牛肉
     */
    public Integer getBeef() {
        return beef;
    }

    /**
     * 设置牛肉
     *
     * @param beef 牛肉
     */
    public void setBeef(Integer beef) {
        this.beef = beef;
    }

    /**
     * 获取羊肉
     *
     * @return sheep - 羊肉
     */
    public Integer getSheep() {
        return sheep;
    }

    /**
     * 设置羊肉
     *
     * @param sheep 羊肉
     */
    public void setSheep(Integer sheep) {
        this.sheep = sheep;
    }

    /**
     * 获取猪肉
     *
     * @return pig - 猪肉
     */
    public Integer getPig() {
        return pig;
    }

    /**
     * 设置猪肉
     *
     * @param pig 猪肉
     */
    public void setPig(Integer pig) {
        this.pig = pig;
    }

    /**
     * 获取禽肉
     *
     * @return poultry - 禽肉
     */
    public Integer getPoultry() {
        return poultry;
    }

    /**
     * 设置禽肉
     *
     * @param poultry 禽肉
     */
    public void setPoultry(Integer poultry) {
        this.poultry = poultry;
    }

    /**
     * 获取蛋类总产量
     *
     * @return eggs_total - 蛋类总产量
     */
    public Integer getEggsTotal() {
        return eggsTotal;
    }

    /**
     * 设置蛋类总产量
     *
     * @param eggsTotal 蛋类总产量
     */
    public void setEggsTotal(Integer eggsTotal) {
        this.eggsTotal = eggsTotal;
    }

    /**
     * 获取鸡蛋
     *
     * @return hen_eggs - 鸡蛋
     */
    public Integer getHenEggs() {
        return henEggs;
    }

    /**
     * 设置鸡蛋
     *
     * @param henEggs 鸡蛋
     */
    public void setHenEggs(Integer henEggs) {
        this.henEggs = henEggs;
    }

    /**
     * 获取牛奶总产量
     *
     * @return milk_total - 牛奶总产量
     */
    public Integer getMilkTotal() {
        return milkTotal;
    }

    /**
     * 设置牛奶总产量
     *
     * @param milkTotal 牛奶总产量
     */
    public void setMilkTotal(Integer milkTotal) {
        this.milkTotal = milkTotal;
    }

    /**
     * 获取牛奶
     *
     * @return cow_milk - 牛奶
     */
    public Integer getCowMilk() {
        return cowMilk;
    }

    /**
     * 设置牛奶
     *
     * @param cowMilk 牛奶
     */
    public void setCowMilk(Integer cowMilk) {
        this.cowMilk = cowMilk;
    }

    /**
     * 获取羊毛
     *
     * @return wool - 羊毛
     */
    public Integer getWool() {
        return wool;
    }

    /**
     * 设置羊毛
     *
     * @param wool 羊毛
     */
    public void setWool(Integer wool) {
        this.wool = wool;
    }

    /**
     * 获取蜂蜜
     *
     * @return honey - 蜂蜜
     */
    public Integer getHoney() {
        return honey;
    }

    /**
     * 设置蜂蜜
     *
     * @param honey 蜂蜜
     */
    public void setHoney(Integer honey) {
        this.honey = honey;
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