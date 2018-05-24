package okkpp.service.agriculture;

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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import okkpp.base.Msg;
import okkpp.model.DataModel;
import okkpp.model.DataModel2;
import okkpp.utils.Countrys;

@Service
@Transactional
public class SolrService {

	HttpSolrServer dataSolrServer = new HttpSolrServer("http://120.77.159.125/solr/collection2");
	HttpSolrServer infoSolrServer = new HttpSolrServer("http://120.77.159.125/solr/collection3");

	// ����SolrQuery����
	SolrQuery query;

	public Msg getContentByCondition(String info) {
		// ���� info �������
		String countrys = "";
		String targets = "";
		String years = "";
		boolean flag = false;
		String[] infos = info.split(" ");
		// �������
		for (int i = 0; i < infos.length; i++) {
			// �Ƿ����
			if (Pattern.matches("^[1-2]{1}[0-9]{3}$", infos[i])) {
				years += infos[i] + " ";
			} else {
				// �Ƿ����
				for (int y = 0; y < Countrys.countryNames.length; y++) {
					if (Countrys.countryNames[y].contains(infos[i]) && infos[i].length() >= 2)
						flag = true;
				}
				if (flag) {
					countrys += infos[i] + " ";
				} else {
					targets += infos[i] + " ";
				}
				flag = false;
			}
		}
		// ȥ�����һ���ո�
		if (!years.isEmpty()) {
			years = years.substring(0, years.length() - 1);
		}
		if (!countrys.isEmpty()) {
			countrys = countrys.substring(0, countrys.length() - 1);
		}
		if (!targets.isEmpty()) {
			targets = targets.substring(0, targets.length() - 1);
		}

		try {
			return getContent(years, countrys, targets);
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			return Msg.fail().add("error", e.getMessage().toString());
		}
	}

	private Msg getContent(String years, String countrys, String targets) throws SolrServerException {
		if (!years.isEmpty() && !countrys.isEmpty() && !targets.isEmpty()) {
			// ����Ϊ��
			return Msg.success().add("dataType", "type1").add("data", getContentByCondition(countrys, targets, years));
		} else if (years.isEmpty() && !targets.isEmpty() && !countrys.isEmpty()) {
			// ���Ϊ��������Ϊ��
			return Msg.success().add("dataType", "type2").add("data", getContentByCondition(countrys, targets, 0, 16));
		} else if (years.isEmpty() && !targets.isEmpty() && countrys.isEmpty()) {
			// ָ�겻Ϊ������Ϊ��
			return Msg.success().add("dataType", "type2").add("data", getContentByCondition("*", targets, 0, 100));
		} else {
			// �������
			return Msg.success().add("dataType", "type3").add("data", getFields());
		}
	}

	// ����������
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
					// ƴ�Ӳ�ѯ����
					querySql += " name_keywords:" + targets[i];
				}
				query.setQuery(querySql);
				QueryResponse response = infoSolrServer.query(query);
				SolrDocumentList list = response.getResults();

				for (SolrDocument solrDocument : list) {
					LinkedHashMap<String, String> jsonMap = toFastJson(solrDocument.get("fields_keywords").toString());
					for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
						if (entry.getValue().toString().equals(years[x])) {
							query = new SolrQuery();
							query.setQuery("info_id:" + solrDocument.get("id").toString());
							query.set("fq", "data_keywords:" + country);
							response = dataSolrServer.query(query);
							SolrDocumentList dataList = response.getResults();
							for (SolrDocument dataSolrDocument : dataList) {

								LinkedHashMap<String, String> jsonMap2 = toFastJson(
										dataSolrDocument.get("data_keywords").toString());
								for (Map.Entry<String, String> entry2 : jsonMap2.entrySet()) {
									if (entry2.getKey().equals(entry.getKey())) {
										// ��� fields
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

	// ����������
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

				query.setQuery("name_keywords:" + targets[i]);
				QueryResponse response = infoSolrServer.query(query);
				SolrDocumentList list = response.getResults();
				for (SolrDocument solrDocument : list) {

					// List<String> keys = new ArrayList<>();
					// System.out.println(solrDocument.get("fields_keywords"));
					// ��ͷ��Ϣ Json
					LinkedHashMap<String, String> jsonMap = toFastJson(solrDocument.get("fields_keywords").toString());

					query = new SolrQuery();
					query.setQuery("info_id:" + solrDocument.get("id").toString());
					query.setStart(pn * rows);
					query.setRows(rows);
					query.set("fq", "data_keywords:" + country);
					QueryResponse queryResponse = dataSolrServer.query(query);
					SolrDocumentList solrDocumentList = queryResponse.getResults();
					for (SolrDocument document : solrDocumentList) {

						dataModel = new DataModel2();
						// ������Ϣ Json
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
					}
				}
			}

		}
		return dataModels;
	}

	// ���ҿɲ�ѯ��
	public List<String> getFields() throws SolrServerException {
		List<String> list = new ArrayList<>();
		query = new SolrQuery();
		query.setQuery("*:*");
		query.setStart(0);
		query.setRows(9999);
		QueryResponse response = infoSolrServer.query(query);
		SolrDocumentList solrDocumentList = response.getResults();

		for (SolrDocument solrDocument : solrDocumentList) {
			list.add(sub(solrDocument.get("name_keywords").toString()));
		}
		return list;
	}

	// ȥ����β + JSON ת HashMap
	public LinkedHashMap<String, String> toFastJson(String str) {
		LinkedHashMap<String, String> jsonMap = JSON.parseObject(sub(str),
				new TypeReference<LinkedHashMap<String, String>>() {
				});
		return jsonMap;
	}

	// ȥ����β
	public String sub(String str) {
		return str.substring(1, str.length() - 1);
	}

}
