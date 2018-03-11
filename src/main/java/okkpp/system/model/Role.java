package okkpp.system.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "s_role")
public class Role implements Serializable {
    @Id
    private Integer id;

    private String roid;

    private String name;

    private String enabled;

    private String remark;

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
     * @return roid
     */
    public String getRoid() {
        return roid;
    }

    /**
     * @param roid
     */
    public void setRoid(String roid) {
        this.roid = roid;
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
}