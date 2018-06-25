package okkpp.model.propagate;

import java.io.Serializable;
import java.util.Date;
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

    /**
     * 目录中文
     */
    @Column(name = "catalog_cn")
    private String catalogCn;

    /**
     * 目录英文
     */
    @Column(name = "catalog_en")
    private String catalogEn;

    /**
     * 表单
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 数据来源
     */
    private String source;
    
    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 字段列表-json
     */
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
     * 获取目录中文
     *
     * @return catalog_cn - 目录中文
     */
    public String getCatalogCn() {
        return catalogCn;
    }

    /**
     * 设置目录中文
     *
     * @param catalogCn 目录中文
     */
    public void setCatalogCn(String catalogCn) {
        this.catalogCn = catalogCn;
    }

    /**
     * 获取目录英文
     *
     * @return catalog_en - 目录英文
     */
    public String getCatalogEn() {
        return catalogEn;
    }

    /**
     * 设置目录英文
     *
     * @param catalogEn 目录英文
     */
    public void setCatalogEn(String catalogEn) {
        this.catalogEn = catalogEn;
    }

    /**
     * 获取表单
     *
     * @return table_name - 表单
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置表单
     *
     * @param tableName 表单
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取数据来源
     *
     * @return source - 数据来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置数据来源
     *
     * @param source 数据来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取更新时间
     *
     * @return updated - 更新时间
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 设置更新时间
     *
     * @param updated 更新时间
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    
    /**
     * 获取字段列表-json
     *
     * @return fields - 字段列表-json
     */
    public String getFields() {
        return fields;
    }

    /**
     * 设置字段列表-json
     *
     * @param fields 字段列表-json
     */
    public void setFields(String fields) {
        this.fields = fields;
    }
}