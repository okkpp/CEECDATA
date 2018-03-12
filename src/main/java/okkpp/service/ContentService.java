package okkpp.service;

import okkpp.model.Content;
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
public class ContentService {

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
				map.replace(p, l);
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
	
	public List<String> showTables(){
		return mapper.showTables();
	}
}
