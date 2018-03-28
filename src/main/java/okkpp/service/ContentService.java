package okkpp.service;

import okkpp.model.Content;
import okkpp.model.Table;
import okkpp.base.service.BaseService;
import okkpp.dao.ContentMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class ContentService extends BaseService<Content>{

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
	
	public List<String> showTotalTables(){
		return mapper.showTables();
	}
	
	public List<Table> showTablesWithComment(){
		return mapper.showTablesWithComment();
	}

}
