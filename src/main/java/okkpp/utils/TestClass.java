package okkpp.utils;

import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.sql.ast.statement.SQLShowTablesStatement;

import okkpp.dao.ContentMapper;
import okkpp.model.Content;
import okkpp.model.TableField;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestClass {

	// ����HttpSolrServer
	@Autowired
	@Qualifier(value = "httpSolrServer")
	private HttpSolrServer server;
	// ����SolrQuery����
	SolrQuery query = new SolrQuery();

	// �򵥲�ѯ
	@Test
	public void search01() throws SolrServerException {
		// �����ѯ����
		query.setQuery("*:*");
		// ִ�в�ѯ�����ؽ��
		QueryResponse response = server.query(query);

		// ��ȡƥ��
		SolrDocumentList list = response.getResults();
		// ƥ��������
		long count = list.getNumFound();

		System.out.println("ƥ��������:" + count);

		for (SolrDocument solrDocument : list) {
			System.out.println("id : " + solrDocument.get("id"));
			System.out.println("name : " + solrDocument.get("info_id"));
			System.out.println("catalog : " + solrDocument.get("data_keywords"));
			System.out.println("=====================================");
		}
	}

	// ���Ӳ�ѯ
	@Test
	public void search02() throws Exception {
		query.setQuery("product_name:С����");
		// ���ù�������
		// ������ö�����������Ļ�,��Ҫʹ��add : query.addFilterQuery("");
		query.setFilterQueries("product_price:[1 TO 10]");

		// ��������
		query.setSort("product_name", ORDER.asc);

		// ���÷�ҳ��Ϣ (ʹ��Ĭ�ϵ�)
		query.setStart(0);
		query.setRows(10);

		// ������ʾ��Field���򼯺�
		query.setFields("id,product_name,product_price");

		// ����Ĭ����
		query.set("df", "product_keywords");

		// ���ø�����Ϣ
		query.setHighlight(true);
		query.addHighlightField("product_name");
		query.setHighlightSimplePre("<em>");
		query.setHighlightSimplePost("</em>");

		// ִ�в�ѯ�����ؽ��
		QueryResponse response = server.query(query);

		// ��ȡƥ��
		SolrDocumentList list = response.getResults();
		// ƥ��������
		long count = list.getNumFound();

		System.out.println("ƥ��������:" + count);
		// ��ȡ������ʾ��Ϣ
		Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();

		for (SolrDocument solrDocument : list) {
			System.out.println("id : " + solrDocument.get("id"));

			List<String> list2 = highlighting.get(solrDocument.get("id")).get("product_name");
			if (list2 != null) {
				System.out.println("������ʾ����Ʒ���� : " + list2.get(0));
			} else {
				System.out.println(solrDocument.get("product_name"));
			}

			System.out.println("catalog : " + solrDocument.get("product_catalog"));
			System.out.println("price : " + solrDocument.get("product_price"));
			System.out.println("picture : " + solrDocument.get("product_picture"));
			System.out.println("=====================================");
		}
	}

}
