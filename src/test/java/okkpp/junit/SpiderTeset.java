package okkpp.junit;

import java.io.IOException;
import java.util.Date;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import okkpp.system.dao.UserMapper;
import okkpp.system.model.User;
import okkpp.system.service.UserService;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
public class SpiderTeset {

	// @Autowired
	// UserService userService;

	@Test
	public void test() throws IOException {
		String condition = "ÖÐ¶«Å·";
		for (int i = 1; i <= 75; i++) {
			String link = "http://s.zjol.com.cn/cse/search?q=" + condition + "&p=" + i + "&s=6048247431686495421&srt=lds&nsid=0";
			//System.out.println("link : " + link);
			Connection connection = Jsoup.connect(link);
			Document document = connection.get();
			Elements results = document.getElementsByClass("result f s0");
			for (Element element : results) {
				String date = element.getElementsByClass("c-showurl").text().toString().split(" ")[1];
				String url = element.childNode(1).childNode(1).attr("href").toString();
				System.out.println("date : " + date);
				System.out.println("url : " + url);
			}
		}
	}
}
