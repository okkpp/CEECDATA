package okkpp.utils;

import java.util.HashMap;
import java.util.Map;

/**
* @author duck
* @date 创建时间：2018年4月11日 下午3:03:00
*/
public class Catalog{
	String catalog_cn;
	String catalog_en;
	//href - tableName
	Map<String, String> map = new HashMap<>();
	public int add(String href,String table) {
		//table 表名规范化
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