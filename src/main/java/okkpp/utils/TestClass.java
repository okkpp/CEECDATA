package okkpp.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import okkpp.dao.ContentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestClass {

	@Autowired
	ContentMapper mapper;

	@Test
	public void showTablesWithComment() {
		List<HashMap<String, String>> columns = null;
		HashMap<String, String> comments = null;
		String k = null;
		columns = mapper.showColumnsWithComment("t_price_consumer");
		System.out.println(columns);
		comments = new HashMap<>();
		for (Map<String, String> column : columns) {
			k = column.get("Field");
			if (!(k.equals("country") || k.equals("year") || k.equals("updated") || k.equals("sort")))
			comments.put(k,column.get("Comment"));
			
		}
	}
}
