package okkpp.model.propagate;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "table_catalog")
public class TableCatalog implements Serializable {
    @Id
    private Integer id;

    private String catalog;

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
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * @param catalog
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }
}