package okkpp.junit;

import java.io.Console;
import java.sql.Date;
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
import org.aspectj.apache.bcel.generic.ReturnaddressType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import okkpp.model.DataModel;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")*/
public class TestCla {

	private HttpSolrServer dataSolrServer = new HttpSolrServer("http://kcudk.top/solr/collection2");
	private HttpSolrServer infoSolrServer = new HttpSolrServer("http://kcudk.top/solr/collection3");
	// 创建SolrQuery对象
	SolrQuery query;

	@Test
	public void estaqwe() throws Exception {
		search02("","");
	}

	public List<DataModel> search02(String info,String country) throws Exception {
		List<DataModel> dataModels = new ArrayList<>();
		DataModel dataModel;
		query = new SolrQuery();
		query.setQuery("name_keywords:" + target);

		// 设置分页信息 (使用默认的)
		query.setStart(0);
		query.setRows(10);

		// 设置显示的Field的域集合
		// query.setFields("id,name_keywords,fields_keywords");

		// 设置默认域
		query.set("df", "name_keywords");

		// 执行查询并返回结果
		QueryResponse response;

		response = infoSolrServer.query(query);
		// 获取匹配
		SolrDocumentList list = response.getResults();

		System.out.println("匹配结果总数:" + list.getNumFound());
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
					// 获取匹配
					SolrDocumentList documentList = dataResponse.getResults();
					for (SolrDocument document : documentList) {
						//System.out.println(document.get("data_keywords").toString());
						str = document.get("data_keywords").toString();
						str = str.substring(1, str.length() - 1);
						LinkedHashMap<String, String> jsonMap2 = toFastJson(str);
						
						dataModel = new DataModel();
						dataModel.setCountry(jsonMap2.get("field0"));
						dataModel.setTargetValue(jsonMap2.get(entry.getKey()));
						dataModel.setYear(year);
						dataModel.setTarget(solrDocument.get("name_keywords").toString().substring(1,solrDocument.get("name_keywords").toString().length() - 1 ));
						System.out.println(dataModel);
						dataModels.add(dataModel);
					}
				}else {
					//System.out.println(entry.getValue().toString());
				}
			}
		}
		return dataModels;
	}

	public LinkedHashMap<String, String> toFastJson(String str) {
		LinkedHashMap<String, String> jsonMap = JSON.parseObject(str,
				new TypeReference<LinkedHashMap<String, String>>() {
				});
		return jsonMap;
	}
}
