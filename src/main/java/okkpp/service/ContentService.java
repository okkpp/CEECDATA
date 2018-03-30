package okkpp.service;

import okkpp.model.TableField;
import okkpp.model.Content;
import okkpp.base.service.BaseService;
import okkpp.dao.ContentMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.crypto.hash.Hash;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月18日 上午10:01:54
 * @version 1.0
 */
@Service
@Transactional
public class ContentService extends BaseService<Content> {

	@Autowired
	private ContentMapper mapper;

	public Map<String, List<Content>> Content() {
		List<Content> list = mapper.selectAll();
		Map<String, List<Content>> map = new HashMap<String, List<Content>>();
		for (Content c : list) {
			String p = c.getParent();
			if (map.containsKey(p)) {
				List<Content> l = map.get(p);
				l.add(c);
				map.put(p, l);
			} else {
				List<Content> l = new ArrayList<Content>();
				l.add(c);
				map.put(p, l);
			}
		}
		return map;
	}

	public List<HashMap<String, String>> showColumns(String tab) {
		return mapper.showColumns(tab);
	}

	/*
	 * public List<String> showTables(){ return mapper.showTables(); }
	 */

	public Map<String, List<String>> showTables() {
		List<String> list = mapper.showTables();
		Map<String, List<String>> result = new HashMap<>();
		for (String str : list) {
			if (str.contains("t_")) {
				String c = str.split("_")[1];
				if (result.containsKey(c)) {
					result.get(c).add(str.substring(str.indexOf("_", 2) + 1));
				} else {
					List<String> sheet = new ArrayList<String>();
					sheet.add(str.substring(str.indexOf("_", 2) + 1));
					result.put(c, sheet);
				}
			}
		}
		return result;
	}

	public List<String> showTotalTables() {
		return mapper.showTables();
	}

	public List<TableField> showTablesWithComment() {
		List<TableField> tablesWithComment = mapper.showTablesWithComment();
		List<TableField> tables = new ArrayList<>();
		List<HashMap<String, String>> columns = null;
		HashMap<String, String> comments = null;
		String k = null;
		for (TableField table : tablesWithComment) {
			if (!table.getRefTable().isEmpty()) {
				// 获取指定表所有列
				columns = mapper.showColumnsWithComment(table.getRefTable());
				comments = new HashMap<>();
				for (Map<String, String> column : columns) {
					k = column.get("Field");
					if (!(k.equals("id") || k.equals("country") || k.equals("year") || k.equals("updated") || k.equals("sort")))
						comments.put(k, column.get("Comment"));
				}
				table.setFieldComment(comments);
				tables.add(table);
			}
		}
		System.out.println(tables);
		return tables;
	}

	public List<HashMap<String, String>> showColumnsWithComment(String tab) {
		return mapper.showColumnsWithComment(tab);
	}

}
