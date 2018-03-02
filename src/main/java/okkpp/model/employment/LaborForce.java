package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_labor_force")
public class LaborForce implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家代码
     */
    private String country;

    /**
     * 年份
     */
    private String year;

    /**
     * 劳动力人口
     */
    @Column(name = "labor_force")
    private Integer laborForce;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 更新时间
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
     * 获取劳动力人口
     *
     * @return labor_force - 劳动力人口
     */
    public Integer getLaborForce() {
        return laborForce;
    }

    /**
     * 设置劳动力人口
     *
     * @param laborForce 劳动力人口
     */
    public void setLaborForce(Integer laborForce) {
        this.laborForce = laborForce;
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
     * @return update - 更新时间
     */
    public Date getUpdate() {
        return update;
    }

    /**
     * 设置更新时间
     *
     * @param update 更新时间
     */
    public void setUpdate(Date update) {
        this.update = update;
    }
}