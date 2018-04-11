package okkpp.utils;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.sql.ast.statement.SQLShowTablesStatement;

import okkpp.dao.ContentMapper;
import okkpp.model.Content;
import okkpp.model.TableField;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestClass {

	// 创建HttpSolrServer
	private HttpSolrServer server = new HttpSolrServer("http://localhost:8081/solr");
	// 创建SolrQuery对象
	SolrQuery query = new SolrQuery();
	

	// 简单查询
	@Test
	public void search01() throws SolrServerException {
		// 输入查询条件
		query.setQuery("product_name:小黄人");
		// 执行查询并返回结果
		QueryResponse response = server.query(query);

		// 获取匹配
		SolrDocumentList list = response.getResults();
		// 匹配结果总数
		long count = list.getNumFound();

		System.out.println("匹配结果总数:" + count);

		for (SolrDocument solrDocument : list) {
			System.out.println("id : " + solrDocument.get("id"));
			System.out.println("name : " + solrDocument.get("product_name"));
			System.out.println("catalog : " + solrDocument.get("product_catalog"));
			System.out.println("price : " + solrDocument.get("product_price"));
			System.out.println("picture : " + solrDocument.get("product_picture"));
			System.out.println("=====================================");
		}
	}

}
