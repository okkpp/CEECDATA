package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tab_href")
public class TabHref implements Serializable {
    @Id
    private Integer id;

    /**
     * 表名
     */
    @Column(name = "tabName")
    private String tabname;

    /**
     * 资源链接
     */
    private String href;

    /**
     * 标题
     */
    @Column(name = "BT")
    private String bt;

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
     * 获取表名
     *
     * @return tabName - 表名
     */
    public String getTabName() {
        return tabname;
    }

    /**
     * 设置表名
     *
     * @param tabname 表名
     */
    public void setTabName(String tabname) {
        this.tabname = tabname;
    }

    /**
     * 获取资源链接
     *
     * @return href - 资源链接
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置资源链接
     *
     * @param href 资源链接
     */
    public void setHref(String href) {
        this.href = href;
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
}