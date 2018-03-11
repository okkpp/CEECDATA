package okkpp.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_livestock")
public class Livestock implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家
     */
    private String country;

    /**
     * 牛
     */
    private Integer cattle;

    /**
     * 马
     */
    private Integer horse;

    /**
     * 羊
     */
    private Integer goats;

    /**
     * 绵羊
     */
    private Integer sheep;

    /**
     * 猪
     */
    private Integer pigs;

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
     * 获取牛
     *
     * @return cattle - 牛
     */
    public Integer getCattle() {
        return cattle;
    }

    /**
     * 设置牛
     *
     * @param cattle 牛
     */
    public void setCattle(Integer cattle) {
        this.cattle = cattle;
    }

    /**
     * 获取马
     *
     * @return horse - 马
     */
    public Integer getHorse() {
        return horse;
    }

    /**
     * 设置马
     *
     * @param horse 马
     */
    public void setHorse(Integer horse) {
        this.horse = horse;
    }

    /**
     * 获取羊
     *
     * @return goats - 羊
     */
    public Integer getGoats() {
        return goats;
    }

    /**
     * 设置羊
     *
     * @param goats 羊
     */
    public void setGoats(Integer goats) {
        this.goats = goats;
    }

    /**
     * 获取绵羊
     *
     * @return sheep - 绵羊
     */
    public Integer getSheep() {
        return sheep;
    }

    /**
     * 设置绵羊
     *
     * @param sheep 绵羊
     */
    public void setSheep(Integer sheep) {
        this.sheep = sheep;
    }

    /**
     * 获取猪
     *
     * @return pigs - 猪
     */
    public Integer getPigs() {
        return pigs;
    }

    /**
     * 设置猪
     *
     * @param pigs 猪
     */
    public void setPigs(Integer pigs) {
        this.pigs = pigs;
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