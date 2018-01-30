package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_shhj")
public class SHHJ implements Serializable {
    @Id
    private Integer id;

    @Column(name = "GJ")
    private String gj;

    @Column(name = "GJDM")
    private String gjdm;

    @Column(name = "NF")
    private String nf;

    /**
     * 65岁及以上人口占比
     */
    @Column(name = "NL65ZB")
    private Double nl65zb;

    /**
     * 劳动力人口
     */
    @Column(name = "LDLRK")
    private Integer ldlrk;

    /**
     * 劳动力人口占比
     */
    @Column(name = "LDLRKZB")
    private Double ldlrkzb;

    /**
     * 人口密度
     */
    @Column(name = "RKMD")
    private Double rkmd;

    /**
     * 总人口
     */
    @Column(name = "ZRK")
    private Integer zrk;

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
     * @return GJ
     */
    public String getGJ() {
        return gj;
    }

    /**
     * @param gj
     */
    public void setGJ(String gj) {
        this.gj = gj;
    }

    /**
     * @return GJDM
     */
    public String getGJDM() {
        return gjdm;
    }

    /**
     * @param gjdm
     */
    public void setGJDM(String gjdm) {
        this.gjdm = gjdm;
    }

    /**
     * @return NF
     */
    public String getNF() {
        return nf;
    }

    /**
     * @param nf
     */
    public void setNF(String nf) {
        this.nf = nf;
    }

    /**
     * 获取65岁及以上人口占比
     *
     * @return NL65ZB - 65岁及以上人口占比
     */
    public Double getNL65ZB() {
        return nl65zb;
    }

    /**
     * 设置65岁及以上人口占比
     *
     * @param nl65zb 65岁及以上人口占比
     */
    public void setNL65ZB(Double nl65zb) {
        this.nl65zb = nl65zb;
    }

    /**
     * 获取劳动力人口
     *
     * @return LDLRK - 劳动力人口
     */
    public Integer getLDLRK() {
        return ldlrk;
    }

    /**
     * 设置劳动力人口
     *
     * @param ldlrk 劳动力人口
     */
    public void setLDLRK(Integer ldlrk) {
        this.ldlrk = ldlrk;
    }

    /**
     * 获取劳动力人口占比
     *
     * @return LDLRKZB - 劳动力人口占比
     */
    public Double getLDLRKZB() {
        return ldlrkzb;
    }

    /**
     * 设置劳动力人口占比
     *
     * @param ldlrkzb 劳动力人口占比
     */
    public void setLDLRKZB(Double ldlrkzb) {
        this.ldlrkzb = ldlrkzb;
    }

    /**
     * 获取人口密度
     *
     * @return RKMD - 人口密度
     */
    public Double getRKMD() {
        return rkmd;
    }

    /**
     * 设置人口密度
     *
     * @param rkmd 人口密度
     */
    public void setRKMD(Double rkmd) {
        this.rkmd = rkmd;
    }

    /**
     * 获取总人口
     *
     * @return ZRK - 总人口
     */
    public Integer getZRK() {
        return zrk;
    }

    /**
     * 设置总人口
     *
     * @param zrk 总人口
     */
    public void setZRK(Integer zrk) {
        this.zrk = zrk;
    }
}