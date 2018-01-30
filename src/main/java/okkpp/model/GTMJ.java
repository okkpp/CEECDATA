package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_ceec_gtmj")
public class GTMJ implements Serializable {
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
     * 土地类别
     */
    @Column(name = "LB")
    private String lb;

    /**
     * 占地面积
     */
    @Column(name = "MJ")
    private Double mj;

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
     * 获取土地类别
     *
     * @return LB - 土地类别
     */
    public String getLB() {
        return lb;
    }

    /**
     * 设置土地类别
     *
     * @param lb 土地类别
     */
    public void setLB(String lb) {
        this.lb = lb;
    }

    /**
     * 获取占地面积
     *
     * @return MJ - 占地面积
     */
    public Double getMJ() {
        return mj;
    }

    /**
     * 设置占地面积
     *
     * @param mj 占地面积
     */
    public void setMJ(Double mj) {
        this.mj = mj;
    }
}