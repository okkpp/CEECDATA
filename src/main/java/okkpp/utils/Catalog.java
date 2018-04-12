package okkpp.utils;

import java.util.HashMap;
import java.util.Map;

/**
* @author duck
* @date ����ʱ�䣺2018��4��11�� ����3:03:00
*/
public class Catalog{
	String catalog_cn;
	String catalog_en;
	//href - tableName
	Map<String, String> map = new HashMap<>();
	public int add(String href,String table) {
		//table �����淶��
		table = table.replace("\\", "")
		.replace("/", "")
		.replace(":", "")
		.replace("*", "")
		.replace("?", "")
		.replace("\"", "")
		.replace("<", "")
		.replace(">", "")
		.replace("|", "");
		if(map.containsKey(href)) {
			return 0;
		}
		map.put(href, table);
		return 1;
	}
	public String getName() {
		return catalog_cn+"---"+catalog_en;
	}
}