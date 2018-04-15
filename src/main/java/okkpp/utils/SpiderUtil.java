package okkpp.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import okkpp.service.propagate.TableInfoService;

/**
* @author duck
* @date 创建时间：2018年4月3日 下午4:03:16
*/
@Component
public class SpiderUtil {

	private String BASE_PATH = "https://data.worldbank.org.cn";
	private String INDEX = "/indicator";
	public static void main(String[] args) {
		String table = "Net lending (+) \\ net bo:rrow<>ing (-) (%* of G?DP).xls";
		table = table.replace("\\", "")
				.replace("/", "")
				.replace(":", "")
				.replace("*", "")
				.replace("?", "")
				.replace("\"", "")
				.replace("<", "")
				.replace(">", "")
				.replace("|", "");
		System.out.println(table);
//		SpiderUtil su = new SpiderUtil();
//		try {
//			List<Catalog> list = su.getCatalog();
//			
//			for(Catalog c : list) {
//				su.resolveCatalog(c);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	public List<Catalog> getCatalog() throws IOException {
		Connection conn = Jsoup.connect(BASE_PATH+INDEX);
		Document doc = conn.get();
		Elements section = doc.getElementsByTag("section");
		List<Catalog> list = new ArrayList<>();
		for(Element e : section) {
			Catalog catalog = new Catalog();
			Element title = e.getElementsByTag("h3").first();
			//catalog 设置目录中文、英文名
			catalog.catalog_cn = title.getElementsByTag("a").first().ownText();
			catalog.catalog_en = title.attr("id");
			System.out.println("正在获取："+catalog.getName());
			Elements ul = e.getElementsByTag("li");
			//解析list
			for(Element li : ul) {
				Element a = li.getElementsByTag("a").first();
				if(catalog.add(a.attr("href"), a.ownText())==0) {
					System.out.println("发现重复值："+a.attr("href")+"---"+a.ownText());
				}
			}
			list.add(catalog);
		}
		System.out.println("目录获取完毕！");
		return list;
	}
	public int resolveCatalog(Catalog c) throws IOException {
		System.out.println("正在解析："+c.getName());
		int i = 0;
		for(String key : c.map.keySet()) {
			System.out.println("准备连接："+BASE_PATH+key);
			Connection conn = Jsoup.connect(BASE_PATH+key);
			Document doc = conn.get();
			Element div = doc.getElementsByClass("btn-item download").first();
			Elements a = div.getElementsByTag("a");
			for(Element e : a) {
				String href = e.attr("href");
				Pattern pattern = Pattern.compile("\\w*downloadformat=excel");
				if(pattern.matcher(href).find()) {
					//下载文件并解析到数据库
					//new Thread(download(href,c.map.get(key))).start();
				}
			}
		}
		return i;
	}
	private String LOCAL_PATH = "B:\\download_excel\\";
	@SuppressWarnings("resource")
	public Runnable download(String spec,String name) throws IOException {
		String path = LOCAL_PATH+name+".xls";
		URL url = new URL(spec);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		File file = new File(path);
		if(file.exists()) {
			
			System.out.println("文件已存在："+path);
			return null;
		}
		System.out.println("开始下载文件："+path);
		FileOutputStream fos = new FileOutputStream(file);
		InputStream in = null;
		in = conn.getInputStream();
		int num = 0;
		byte[] size = new byte[1024];
        while((num=in.read(size)) != -1){
            for(int i=0;i<num;i++)
               fos.write(size[i]);
        }
        resolveExcel(file,name);
		return null;
	}
	@Autowired
	TableInfoService service;
	private void resolveExcel(File file,String tableName) {
		System.out.println("下载完毕，解析Excel...");
		ExcelUtil eu = new ExcelUtil();
		try {
			eu.xls(file);
//			service.createTabWithData(tableName, eu.info, eu.data);
			System.out.println("建表结束！");
			//System.out.println(new Gson().toJson(eu.data));
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}