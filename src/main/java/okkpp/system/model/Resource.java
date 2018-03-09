package okkpp.system.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "s_resource")
public class Resource implements Serializable {
    @Id
    private Integer id;

    private String reid;

    private String name;

    private String type;

    private Integer pid;

    private String remark;

    private String value;

    private String enabled;

    private String leaf;

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
     * @return reid
     */
    public String getReid() {
        return reid;
    }

    /**
     * @param reid
     */
    public void setReid(String reid) {
        this.reid = reid;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * @return leaf
     */
    public String getLeaf() {
        return leaf;
    }

    /**
     * @param leaf
     */
    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }
}