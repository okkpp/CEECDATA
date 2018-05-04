package okkpp.junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import okkpp.model.DataModel2;
<<<<<<< HEAD
=======
import okkpp.model.MusinInfo;
import okkpp.service.agriculture.SolrService;
import okkpp.utils.CountryCode;
import okkpp.utils.Countrys;
>>>>>>> 98c8e39d33f035a42f0b077354a3b425fae1c6f5

public class SolrTest {

	HttpSolrServer dataSolrServer = new HttpSolrServer("http://120.77.159.125/solr/collection2");
	HttpSolrServer infoSolrServer = new HttpSolrServer("http://120.77.159.125/solr/collection3");

	SolrQuery query;

	String[] countryNames = {};

	@Test
	public void getFields() throws SolrServerException {
		System.out.println(getContentByCondition("爱沙尼亚", "孕妇", "2000"));
		
	}

	// 按条件查找
	public List<DataModel> getContentByCondition(String countrys, String target, String year)
			throws SolrServerException {
		DataModel dataModel;
		List<DataModel> dataModels = new ArrayList<>();
		String[] cs = countrys.split(" ");
		for (int y = 0; y < cs.length; y++) {
			String country = cs[y];
			HashMap<String, String> map;
			String[] targets = target.split(" ");
			String[] years = year.split(" ");
			String querySql = "";
			for (int x = 0; x < years.length; x++) {

				dataModel = new DataModel();
				dataModel.setCountry(country);
				dataModel.setYear(years[x]);
				map = new HashMap<>();
				query = new SolrQuery();
				for (int i = 0; i < targets.length; i++) {
					// 拼接查询条件
					querySql += " name_keywords:" + targets[i];
				}
				query.setQuery(querySql);
				QueryResponse response = infoSolrServer.query(query);
				SolrDocumentList list = response.getResults();

				for (SolrDocument solrDocument : list) {
<<<<<<< HEAD
					
					//List<String> keys = new ArrayList<>();
					// System.out.println(solrDocument.get("fields_keywords"));
					// 表头信息 Json
=======
>>>>>>> 98c8e39d33f035a42f0b077354a3b425fae1c6f5
					LinkedHashMap<String, String> jsonMap = toFastJson(solrDocument.get("fields_keywords").toString());
					System.out.println("solrDocument : " + solrDocument.toString());
					for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
						if (entry.getValue().toString().equals(years[x])) {
							query = new SolrQuery();
							query.setQuery("info_id:" + solrDocument.get("id").toString());
							query.set("fq", "data_keywords:" + country);
							response = dataSolrServer.query(query);
							SolrDocumentList dataList = response.getResults();
							for (SolrDocument dataSolrDocument : dataList) {
								System.out.println(dataSolrDocument.toString());
								LinkedHashMap<String, String> jsonMap2 = toFastJson(
										dataSolrDocument.get("data_keywords").toString());
								for (Map.Entry<String, String> entry2 : jsonMap2.entrySet()) {
									if (entry2.getKey().equals(entry.getKey())) {
										// 填充 fields
										map.put(sub(solrDocument.get("name_keywords").toString()),
												entry2.getValue().toString());
									}
								}
							}
						}
					}
				}
				dataModel.setFields(map);
				dataModels.add(dataModel);
			}
		}
		return dataModels;
	}

	public LinkedHashMap<String, String> toFastJson(String str) {
		LinkedHashMap<String, String> jsonMap = JSON.parseObject(sub(str),
				new TypeReference<LinkedHashMap<String, String>>() {
				});
		return jsonMap;
	}

	// 去除首尾
	public String sub(String str) {
		return str.substring(1, str.length() - 1);
	}
}
