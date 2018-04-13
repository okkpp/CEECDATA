package okkpp.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import okkpp.model.DataModel;
import okkpp.model.MusinInfo;

@Service
@Transactional
public class SolrService {

	HttpSolrServer dataSolrServer = new HttpSolrServer("http://kcudk.top/solr/collection2");
	HttpSolrServer infoSolrServer = new HttpSolrServer("http://kcudk.top/solr/collection3");
	HttpSolrServer musicSolrServer = new HttpSolrServer("http://kcudk.top/solr/collection4");
	// ����SolrQuery����
	SolrQuery query;

	public List<MusinInfo> getMusics(String catalog){
		query = new SolrQuery();
		query.setQuery("music_catalog_name:"+catalog);
		
		List<MusinInfo> musinInfos = new ArrayList<>();
		MusinInfo musinInfo;
		
		try {
			QueryResponse response = musicSolrServer.query(query);
			response = musicSolrServer.query(query);
			// ��ȡƥ��
			SolrDocumentList list = response.getResults();

			System.out.println("ƥ��������:" + list.getNumFound());
			for (SolrDocument solrDocument : list) {
				musinInfo = new MusinInfo();
				musinInfo.setCatalog(solrDocument.get("music_catalog_name").toString());
				musinInfo.setPricture(solrDocument.get("music_picture").toString());
				musinInfo.setDescription(solrDocument.get("music_description").toString());
				
				musinInfos.add(musinInfo);
			}
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return musinInfos;
	}
	
	public List<DataModel> getContentByCondition(String info){
		// TODO Auto-generated method stub
		String[] str = info.split(" ");
		String target = str[0];
		String country = str[1];
		String year = str[2];
		System.out.println("target : " + target + "country : " + country  );
		return getContent(target, country, year);
		// return null;
	}

	// getContentByCondition
	public List<DataModel> getContent(String target, String country, String year) {
		List<DataModel> dataModels = new ArrayList<>();
		DataModel dataModel;
		query = new SolrQuery();
		query.setQuery("name_keywords:" + target);

		// ���÷�ҳ��Ϣ (ʹ��Ĭ�ϵ�)
		query.setStart(0);
		query.setRows(10);

		// ������ʾ��Field���򼯺�
		// query.setFields("id,name_keywords,fields_keywords");

		// ����Ĭ����
		query.set("df", "name_keywords");

		// ִ�в�ѯ�����ؽ��
		QueryResponse response;

		try {
			response = infoSolrServer.query(query);

			// ��ȡƥ��
			SolrDocumentList list = response.getResults();

			System.out.println("ƥ��������:" + list.getNumFound());
			String str;
			for (SolrDocument solrDocument : list) {
				str = solrDocument.get("fields_keywords").toString();
				str = str.substring(1, str.length() - 1);
				LinkedHashMap<String, String> jsonMap = toFastJson(str);
				for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
					if (entry.getValue().toString().equals(year)) {

						query = new SolrQuery();
						query.setQuery("info_id:" + solrDocument.get("id"));
						query.set("fq", "data_keywords:" + country);

						QueryResponse dataResponse = dataSolrServer.query(query);
						// ��ȡƥ��
						SolrDocumentList documentList = dataResponse.getResults();
						for (SolrDocument document : documentList) {
							str = document.get("data_keywords").toString();
							str = str.substring(1, str.length() - 1);
							LinkedHashMap<String, String> jsonMap2 = toFastJson(str);

							dataModel = new DataModel();
							dataModel.setCountry(jsonMap2.get("field0"));
							//dataModel.setTargetValue(jsonMap2.get(entry.getKey()));
							dataModel.setYear(year);
							//dataModel.setTarget(solrDocument.get("name_keywords").toString().substring(1,
									//solrDocument.get("name_keywords").toString().length() - 1));
							dataModels.add(dataModel);
						}
					} else {
						// System.out.println(entry.getValue().toString());
					}
				}
			}
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return dataModels;
	}

	public LinkedHashMap<String, String> toFastJson(String str) {
		LinkedHashMap<String, String> jsonMap = JSON.parseObject(str,
				new TypeReference<LinkedHashMap<String, String>>() {
				});
		return jsonMap;
	}
	
	public void getMusic() {
		
	}
	/*
	 * @Test public void search02() throws Exception {
	 * query.setQuery("product_name:С����"); // ���ù������� // ������ö�����������Ļ�,��Ҫʹ��add :
	 * query.addFilterQuery(""); query.setFilterQueries("product_price:[1 TO 10]");
	 * 
	 * // �������� query.setSort("product_name", ORDER.asc);
	 * 
	 * // ���÷�ҳ��Ϣ (ʹ��Ĭ�ϵ�) query.setStart(0); query.setRows(10);
	 * 
	 * // ������ʾ��Field���򼯺� query.setFields("id,product_name,product_price");
	 * 
	 * // ����Ĭ���� query.set("df", "product_keywords");
	 * 
	 * // ���ø�����Ϣ query.setHighlight(true); query.addHighlightField("product_name");
	 * query.setHighlightSimplePre("<em>"); query.setHighlightSimplePost("</em>");
	 * 
	 * // ִ�в�ѯ�����ؽ�� QueryResponse response = server.query(query);
	 * 
	 * // ��ȡƥ�� SolrDocumentList list = response.getResults(); // ƥ�������� long count =
	 * list.getNumFound();
	 * 
	 * System.out.println("ƥ��������:" + count); // ��ȡ������ʾ��Ϣ Map<String, Map<String,
	 * List<String>>> highlighting = response.getHighlighting();
	 * 
	 * for (SolrDocument solrDocument : list) { System.out.println("id : " +
	 * solrDocument.get("id"));
	 * 
	 * List<String> list2 =
	 * highlighting.get(solrDocument.get("id")).get("product_name"); if (list2 !=
	 * null) { System.out.println("������ʾ����Ʒ���� : " + list2.get(0)); } else {
	 * System.out.println(solrDocument.get("product_name")); }
	 * 
	 * System.out.println("catalog : " + solrDocument.get("product_catalog"));
	 * System.out.println("price : " + solrDocument.get("product_price"));
	 * System.out.println("picture : " + solrDocument.get("product_picture"));
	 * System.out.println("====================================="); } }
	 */

}
