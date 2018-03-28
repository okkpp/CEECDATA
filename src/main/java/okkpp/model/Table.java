package okkpp.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {

	private String refTable;
	private String tableComment;
	private HashMap<String, String> fieldComment;

	public String getRefTable() {
		return refTable;
	}

	public void setRefTable(String refTable) {
		this.refTable = refTable;
	}

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	public HashMap<String, String> getFieldComment() {
		return fieldComment;
	}

	public void setFieldComment(HashMap<String, String> fieldComment) {
		this.fieldComment = fieldComment;
	}

	@Override
	public String toString() {
		return "Table [refTable=" + refTable + ", tableComment=" + tableComment + ", fieldComment=" + fieldComment
				+ "]";
	}

}
