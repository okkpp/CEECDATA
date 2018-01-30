package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_content")
public class Content implements Serializable {
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
     * 标题
     */
    @Column(name = "BT")
    private String bt;

    /**
     * 类别
     */
    @Column(name = "LB")
    private String lb;

    /**
     * 链接
     */
    @Column(name = "LJ")
    private String lj;

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
     * 获取标题
     *
     * @return BT - 标题
     */
    public String getBT() {
        return bt;
    }

    /**
     * 设置标题
     *
     * @param bt 标题
     */
    public void setBT(String bt) {
        this.bt = bt;
    }

    /**
     * 获取类别
     *
     * @return LB - 类别
     */
    public String getLB() {
        return lb;
    }

    /**
     * 设置类别
     *
     * @param lb 类别
     */
    public void setLB(String lb) {
        this.lb = lb;
    }

    /**
     * 获取链接
     *
     * @return LJ - 链接
     */
    public String getLJ() {
        return lj;
    }

    /**
     * 设置链接
     *
     * @param lj 链接
     */
    public void setLJ(String lj) {
        this.lj = lj;
    }
}