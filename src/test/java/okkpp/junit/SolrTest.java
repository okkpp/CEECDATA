package okkpp.junit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import okkpp.model.DataModel;
import okkpp.model.DataModel2;
import okkpp.model.MusinInfo;
import okkpp.service.SolrService;
import okkpp.utils.CountryCode;
import okkpp.utils.Countrys;

public class SolrTest {

	HttpSolrServer dataSolrServer = new HttpSolrServer("http://120.77.159.125/solr/collection2");
	HttpSolrServer infoSolrServer = new HttpSolrServer("http://120.77.159.125/solr/collection3");

	SolrQuery query;

	String[] countryNames = {};

	@Test
	public void getFields() throws SolrServerException {
		getContentByCondition("*","城镇人口 孕妇",0,16);

	}
	
	public List<DataModel2> getContentByCondition(String countrys, String target, Integer pn, Integer rows)
			throws SolrServerException {
		DataModel2 dataModel = null;
		List<DataModel2> dataModels = new ArrayList<>();
		HashMap<String, String> map;
		String[] cs = countrys.split(" ");
		String[] targets = target.split(" ");

		for (int y = 0; y < cs.length; y++) {
			String country = cs[y];
			map = new HashMap<>();

			for (int i = 0; i < targets.length; i++) {
				query = new SolrQuery();
				query.setStart(pn);
				query.setRows(rows);

				query.setQuery("name_keywords:" + targets[i]);
				QueryResponse response = infoSolrServer.query(query);
				SolrDocumentList list = response.getResults();
				for (SolrDocument solrDocument : list) {
					
					List<String> keys = new ArrayList<>();
					// System.out.println(solrDocument.get("fields_keywords"));
					// 表头信息 Json
					LinkedHashMap<String, String> jsonMap = toFastJson(solrDocument.get("fields_keywords").toString());

					query = new SolrQuery();
					query.setQuery("info_id:" + solrDocument.get("id").toString());
					query.set("fq", "data_keywords:" + country);
					QueryResponse queryResponse = dataSolrServer.query(query);
					SolrDocumentList solrDocumentList = queryResponse.getResults();
					for (SolrDocument document : solrDocumentList) {

						dataModel = new DataModel2();
						// 数据信息 Json
						LinkedHashMap<String, String> jsonMap2 = toFastJson(document.get("data_keywords").toString());
						map = new HashMap<>();
						for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
							if (!entry.getKey().toString().equals("field0")) {
								for (Map.Entry<String, String> entry2 : jsonMap2.entrySet()) {
									if (entry.getKey().equals(entry2.getKey())) {
										map.put(entry.getValue(), entry2.getValue());
									}
								}
							} else {
								dataModel.setCountry(jsonMap2.get("field0"));
							}
						}

						dataModel.setTarget(sub(solrDocument.get("name_keywords").toString()));
						dataModel.setFields(map);
						dataModels.add(dataModel);
						System.out.println(dataModel);
					}
				}
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
