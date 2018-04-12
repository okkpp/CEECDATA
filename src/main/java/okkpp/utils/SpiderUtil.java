package okkpp.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
* @author duck
* @date ����ʱ�䣺2018��4��3�� ����4:03:16
*/
public class SpiderUtil {

	private String BASE_PATH = "https://data.worldbank.org.cn";
	private String INDEX = "/indicator";
	public static void main(String[] args) {
		SpiderUtil su = new SpiderUtil();
		try {
			List<Catalog> list = su.getCatalog();
			
			Catalog c = list.get(0);
			su.resolveCatalog(c);
//			for(Catalog c : list) {
//				
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<Catalog> getCatalog() throws IOException {
		Connection conn = Jsoup.connect(BASE_PATH+INDEX);
		Document doc = conn.get();
		Elements section = doc.getElementsByTag("section");
		List<Catalog> list = new ArrayList<>();
		for(Element e : section) {
			Catalog catalog = new Catalog();
			Element title = e.getElementsByTag("h3").first();
			//catalog ����Ŀ¼���ġ�Ӣ����
			catalog.catalog_cn = title.getElementsByTag("a").first().ownText();
			catalog.catalog_en = title.attr("id");
			System.out.println("���ڻ�ȡ��"+catalog.getName());
			Elements ul = e.getElementsByTag("li");
			//����list
			for(Element li : ul) {
				Element a = li.getElementsByTag("a").first();
				if(catalog.add(a.attr("href"), a.ownText())==0) {
					System.out.println("�����ظ�ֵ��"+a.attr("href")+"---"+a.ownText());
				}
			}
			list.add(catalog);
		}
		System.out.println("Ŀ¼��ȡ��ϣ�");
		return list;
	}
	public void resolveCatalog(Catalog c) throws IOException {
		System.out.println("���ڽ�����"+c.getName());
		for(String key : c.map.keySet()) {
			System.out.println("׼�����ӣ�"+BASE_PATH+key);
			Connection conn = Jsoup.connect(BASE_PATH+key);
			Document doc = conn.get();
			Element div = doc.getElementsByClass("btn-item download").first();
			Elements a = div.getElementsByTag("a");
			for(Element e : a) {
				String href = e.attr("href");
				Pattern pattern = Pattern.compile("\\w*downloadformat=excel");
				if(pattern.matcher(href).find()) {
					new Thread(download(href,c.map.get(key))).start();
				}
			}
		}
	}
	private String LOCAL_PATH = "B:\\download_excel\\";
	public Runnable download(String spec,String name) throws IOException {
		String path = LOCAL_PATH+name+".xls";
		URL url = new URL(spec);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		File file = new File(path);
		if(file.exists()) {
			System.out.println("�ļ��Ѵ��ڣ�"+path);
			return null;
		}
		System.out.println("��ʼ�����ļ���"+path);
		FileOutputStream fos = new FileOutputStream(file);
		InputStream in = null;
		in = conn.getInputStream();
		int num = 0;
		byte[] size = new byte[1024];
        while((num=in.read(size)) != -1){
            for(int i=0;i<num;i++)
               fos.write(size[i]);
        }
		return null;
	}
}
class Catalog{
	String catalog_cn;
	String catalog_en;
	//href - tableName
	Map<String, String> map = new HashMap<>();
	public int add(String href,String table) {
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