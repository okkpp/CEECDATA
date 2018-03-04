package okkpp.model.employment;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_employment_labor_force_participation_rate")
public class LaborForceParticipationRate implements Serializable {
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
     * 劳动力人口
     */
    @Column(name = "total_labor_force")
    private Integer totalLaborForce;

    /**
     * 劳动参与率
     */
    @Column(name = "participation_rate")
    private Double participationRate;

    /**
     * 女性劳动参与率
     */
    @Column(name = "female_participation_rate")
    private Double femaleParticipationRate;

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
     * 获取劳动力人口
     *
     * @return total_labor_force - 劳动力人口
     */
    public Integer getTotalLaborForce() {
        return totalLaborForce;
    }

    /**
     * 设置劳动力人口
     *
     * @param totalLaborForce 劳动力人口
     */
    public void setTotalLaborForce(Integer totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    /**
     * 获取劳动参与率
     *
     * @return participation_rate - 劳动参与率
     */
    public Double getParticipationRate() {
        return participationRate;
    }

    /**
     * 设置劳动参与率
     *
     * @param participationRate 劳动参与率
     */
    public void setParticipationRate(Double participationRate) {
        this.participationRate = participationRate;
    }

    /**
     * 获取女性劳动参与率
     *
     * @return female_participation_rate - 女性劳动参与率
     */
    public Double getFemaleParticipationRate() {
        return femaleParticipationRate;
    }

    /**
     * 设置女性劳动参与率
     *
     * @param femaleParticipationRate 女性劳动参与率
     */
    public void setFemaleParticipationRate(Double femaleParticipationRate) {
        this.femaleParticipationRate = femaleParticipationRate;
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