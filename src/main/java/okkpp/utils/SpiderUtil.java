package okkpp.utils;

import java.io.IOException;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
* @author duck
* @date 创建时间：2018年4月3日 下午4:03:16
*/
public class SpiderUtil {

	public static void main(String[] args) {
		String url = "http://kcudk.top/CEECDATA/hsy/price/producer_price_indices_replace.html";
		String tabId = "tableData";
		SpiderUtil su = new SpiderUtil();
		try {
			su.getResource(url, tabId);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void getResource(String url,String tabId) throws IOException {
		Connection conn = Jsoup.connect(url);
		Document doc = conn.get();
		Element table = doc.getElementById(tabId);
		Element thead = table.getElementsByTag("thead").first();
		Element tbody = table.getElementsByTag("tbody").first();
		System.out.println(doc.toString());
		Elements c = table.children();
		System.out.println(c.size());
		Map<String, String> map = table.dataset();
		for(String key : map.keySet()) {
			System.out.println(key+"+"+map.get(key));
		}
		System.out.println();
	}
}
