package okkpp.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "s_content")
public class Content implements Serializable {
    @Id
    private Integer id;

    /**
     * 上级目录
     */
    private String parent;

    /**
     * 目录名
     */
    private String content;

    /**
     * 链接
     */
    private String href;

    /**
     * 对应表名
     */
    @Column(name = "ref_table")
    private String refTable;

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
     * 获取上级目录
     *
     * @return parent - 上级目录
     */
    public String getParent() {
        return parent;
    }

    /**
     * 设置上级目录
     *
     * @param parent 上级目录
     */
    public void setParent(String parent) {
        this.parent = parent;
    }

    /**
     * 获取目录名
     *
     * @return content - 目录名
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置目录名
     *
     * @param content 目录名
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取链接
     *
     * @return href - 链接
     */
    public String getHref() {
        return href;
    }

    /**
     * 设置链接
     *
     * @param href 链接
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * 获取对应表名
     *
     * @return ref_table - 对应表名
     */
    public String getRefTable() {
        return refTable;
    }

    /**
     * 设置对应表名
     *
     * @param refTable 对应表名
     */
    public void setRefTable(String refTable) {
        this.refTable = refTable;
    }

	@Override
	public String toString() {
		return "Content [id=" + id + ", parent=" + parent + ", content=" + content + ", href=" + href + ", refTable="
				+ refTable + "]";
	}
    
    
}