package okkpp.model;

import java.util.HashMap;

public class TableField {

	private String refTable;
	private String content;
	private String href;
	private String parent;
	private HashMap<String, String> fieldComment;
	public String getRefTable() {
		return refTable;
	}
	public void setRefTable(String refTable) {
		this.refTable = refTable;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public HashMap<String, String> getFieldComment() {
		return fieldComment;
	}
	public void setFieldComment(HashMap<String, String> fieldComment) {
		this.fieldComment = fieldComment;
	}
	@Override
	public String toString() {
		return "TableField [refTable=" + refTable + ", content=" + content + ", href=" + href + ", parent=" + parent
				+ ", fieldComment=" + fieldComment + "]";
	}

	
}
