package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tab_href")
public class TabHref implements Serializable {
    @Id
    private Integer id;

    /**
     * ����
     */
    @Column(name = "tabName")
    private String tabname;

    /**
     * ��Դ����
     */
    private String href;

    /**
     * ����
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
     * ��ȡ����
     *
     * @return tabName - ����
     */
    public String getTabName() {
        return tabname;
    }

    /**
     * ���ñ���
     *
     * @param tabname ����
     */
    public void setTabName(String tabname) {
        this.tabname = tabname;
    }

    /**
     * ��ȡ��Դ����
     *
     * @return href - ��Դ����
     */
    public String getHref() {
        return href;
    }

    /**
     * ������Դ����
     *
     * @param href ��Դ����
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * ��ȡ����
     *
     * @return BT - ����
     */
    public String getBT() {
        return bt;
    }

    /**
     * ���ñ���
     *
     * @param bt ����
     */
    public void setBT(String bt) {
        this.bt = bt;
    }
}