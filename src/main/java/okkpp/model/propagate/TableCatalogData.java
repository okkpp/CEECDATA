package okkpp.model.propagate;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "table_catalog_data")
public class TableCatalogData implements Serializable {
    @Id
    private Integer id;

    @Column(name = "data_id")
    private Integer dataId;

    @Column(name = "catalog_id")
    private Integer catalogId;

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
     * @return data_id
     */
    public Integer getDataId() {
        return dataId;
    }

    /**
     * @param dataId
     */
    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    /**
     * @return catalog_id
     */
    public Integer getCatalogId() {
        return catalogId;
    }

    /**
     * @param catalogId
     */
    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }
}