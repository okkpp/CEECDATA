package okkpp.model.propagate;

import java.io.Serializable;
import java.util.Map;

import javax.persistence.*;

import com.google.gson.Gson;

@Table(name = "table_info")
public class TableInfo implements Serializable {
	public TableInfo() {}
	public TableInfo(String tableName,Map<String, Object> fields) {
		this.tableName = tableName;
		this.fields = new Gson().toJson(fields);
	}
    @Id
    private Integer id;

    @Column(name = "table_name")
    private String tableName;

    private String fields;

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
     * @return table_name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return fields;
    }

    /**
     * @param fields
     */
    public void setFields(String fields) {
        this.fields = fields;
    }
}