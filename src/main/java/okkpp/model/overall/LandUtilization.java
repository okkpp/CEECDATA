package okkpp.model.overall;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_overall_land_utilization")
public class LandUtilization implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 土地类型
     */
    @Column(name = "area_type")
    private String areaType;

    /**
     * 面积
     */
    private Double measure;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新日期
     */
    private Date update;

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
     * 获取土地类型
     *
     * @return area_type - 土地类型
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * 设置土地类型
     *
     * @param areaType 土地类型
     */
    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    /**
     * 获取面积
     *
     * @return measure - 面积
     */
    public Double getMeasure() {
        return measure;
    }

    /**
     * 设置面积
     *
     * @param measure 面积
     */
    public void setMeasure(Double measure) {
        this.measure = measure;
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
     * @return update - 更新日期
     */
    public Date getUpdate() {
        return update;
    }

    /**
     * 设置更新日期
     *
     * @param update 更新日期
     */
    public void setUpdate(Date update) {
        this.update = update;
    }
}