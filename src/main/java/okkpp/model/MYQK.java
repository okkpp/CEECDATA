package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_myqk")
public class MYQK implements Serializable {
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
     * 月份
     */
    @Column(name = "YF")
    private String yf;

    /**
     * 出口额
     */
    @Column(name = "CKE")
    private Double cke;

    /**
     * 进口额
     */
    @Column(name = "JKE")
    private Double jke;

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
     * 获取月份
     *
     * @return YF - 月份
     */
    public String getYF() {
        return yf;
    }

    /**
     * 设置月份
     *
     * @param yf 月份
     */
    public void setYF(String yf) {
        this.yf = yf;
    }

    /**
     * 获取出口额
     *
     * @return CKE - 出口额
     */
    public Double getCKE() {
        return cke;
    }

    /**
     * 设置出口额
     *
     * @param cke 出口额
     */
    public void setCKE(Double cke) {
        this.cke = cke;
    }

    /**
     * 获取进口额
     *
     * @return JKE - 进口额
     */
    public Double getJKE() {
        return jke;
    }

    /**
     * 设置进口额
     *
     * @param jke 进口额
     */
    public void setJKE(Double jke) {
        this.jke = jke;
    }
}