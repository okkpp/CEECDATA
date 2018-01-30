package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_jjzydzs")
public class JJZYDZS implements Serializable {
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
     * 经济自由度指数
     */
    @Column(name = "ZS")
    private Double zs;

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
     * 获取经济自由度指数
     *
     * @return ZS - 经济自由度指数
     */
    public Double getZS() {
        return zs;
    }

    /**
     * 设置经济自由度指数
     *
     * @param zs 经济自由度指数
     */
    public void setZS(Double zs) {
        this.zs = zs;
    }
}