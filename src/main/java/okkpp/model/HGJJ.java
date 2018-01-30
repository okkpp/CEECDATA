package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_hgjj")
public class HGJJ implements Serializable {
    @Id
    private Integer id;

    /**
     * 国家
     */
    @Column(name = "GJ")
    private String gj;

    /**
     * 国家代码
     */
    @Column(name = "GJDM")
    private String gjdm;

    /**
     * 年份
     */
    @Column(name = "NF")
    private String nf;

    /**
     * 产值/单位：十亿美元
     */
    @Column(name = "GDP")
    private Double gdp;

    /**
     * 服务等附加值
     */
    @Column(name = "FJZ")
    private Double fjz;

    /**
     * 人均GDP
     */
    @Column(name = "RJGDP")
    private Double rjgdp;

    /**
     * 通胀率
     */
    @Column(name = "TZL")
    private Double tzl;

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
     * @return GJ - 国家
     */
    public String getGJ() {
        return gj;
    }

    /**
     * 设置国家
     *
     * @param gj 国家
     */
    public void setGJ(String gj) {
        this.gj = gj;
    }

    /**
     * 获取国家代码
     *
     * @return GJDM - 国家代码
     */
    public String getGJDM() {
        return gjdm;
    }

    /**
     * 设置国家代码
     *
     * @param gjdm 国家代码
     */
    public void setGJDM(String gjdm) {
        this.gjdm = gjdm;
    }

    /**
     * 获取年份
     *
     * @return NF - 年份
     */
    public String getNF() {
        return nf;
    }

    /**
     * 设置年份
     *
     * @param nf 年份
     */
    public void setNF(String nf) {
        this.nf = nf;
    }

    /**
     * 获取产值/单位：十亿美元
     *
     * @return GDP - 产值/单位：十亿美元
     */
    public Double getGDP() {
        return gdp;
    }

    /**
     * 设置产值/单位：十亿美元
     *
     * @param gdp 产值/单位：十亿美元
     */
    public void setGDP(Double gdp) {
        this.gdp = gdp;
    }

    /**
     * 获取服务等附加值
     *
     * @return FJZ - 服务等附加值
     */
    public Double getFJZ() {
        return fjz;
    }

    /**
     * 设置服务等附加值
     *
     * @param fjz 服务等附加值
     */
    public void setFJZ(Double fjz) {
        this.fjz = fjz;
    }

    /**
     * 获取人均GDP
     *
     * @return RJGDP - 人均GDP
     */
    public Double getRJGDP() {
        return rjgdp;
    }

    /**
     * 设置人均GDP
     *
     * @param rjgdp 人均GDP
     */
    public void setRJGDP(Double rjgdp) {
        this.rjgdp = rjgdp;
    }

    /**
     * 获取通胀率
     *
     * @return TZL - 通胀率
     */
    public Double getTZL() {
        return tzl;
    }

    /**
     * 设置通胀率
     *
     * @param tzl 通胀率
     */
    public void setTZL(Double tzl) {
        this.tzl = tzl;
    }
}