package okkpp.model.propagate;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.*;

import com.google.gson.Gson;

@Table(name = "table_data")
public class TableData implements Serializable {
	public TableData() {}
	public TableData(Integer infoId,Map<String, Object> data) {
		this.infoId = infoId;
		this.data = new Gson().toJson(data);
	}
    @Id
    private Integer id;

    @Column(name = "info_id")
    private Integer infoId;

    /**
     * ����ʱ��
     */
    private Date updated;
    
    private String data;

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
     * @return info_id
     */
    public Integer getInfoId() {
        return infoId;
    }

    /**
     * @param infoId
     */
    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return updated - ����ʱ��
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    
    /**
     * @return data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data
     */
    public void setData(String data) {
        this.data = data;
    }
}