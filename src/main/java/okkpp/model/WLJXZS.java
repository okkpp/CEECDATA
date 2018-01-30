package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_wljxzs")
public class WLJXZS implements Serializable {
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
     * 项目
     */
    @Column(name = "XM")
    private String xm;

    /**
     * 分数
     */
    @Column(name = "FS")
    private Double fs;

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
     * 获取项目
     *
     * @return XM - 项目
     */
    public String getXM() {
        return xm;
    }

    /**
     * 设置项目
     *
     * @param xm 项目
     */
    public void setXM(String xm) {
        this.xm = xm;
    }

    /**
     * 获取分数
     *
     * @return FS - 分数
     */
    public Double getFS() {
        return fs;
    }

    /**
     * 设置分数
     *
     * @param fs 分数
     */
    public void setFS(Double fs) {
        this.fs = fs;
    }
}