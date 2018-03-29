package okkpp.model.propagate;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "table_data")
public class TableData implements Serializable {
    @Id
    private Integer id;

    private String json;

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
     * @return json
     */
    public String getJson() {
        return json;
    }

    /**
     * @param json
     */
    public void setJson(String json) {
        this.json = json;
    }
}