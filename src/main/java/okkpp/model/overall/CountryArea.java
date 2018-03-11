package okkpp.model.overall;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_overall_country_area")
public class CountryArea implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 国土面积
     */
    private Double surface;

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
     * 获取国家代码
     *
     * @return country - 国家代码
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家代码
     *
     * @param country 国家代码
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取国土面积
     *
     * @return surface - 国土面积
     */
    public Double getSurface() {
        return surface;
    }

    /**
     * 设置国土面积
     *
     * @param surface 国土面积
     */
    public void setSurface(Double surface) {
        this.surface = surface;
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