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

	// 创建HttpSolrServer
	@Autowired
	@Qualifier(value = "httpSolrServer")
	private HttpSolrServer server;
	// 创建SolrQuery对象
	SolrQuery query = new SolrQuery();

	// 简单查询
	@Test
	public void search01() throws SolrServerException {
		// 输入查询条件
		query.setQuery("*:*");
		// 执行查询并返回结果
		QueryResponse response = server.query(query);

		// 获取匹配
		SolrDocumentList list = response.getResults();
		// 匹配结果总数
		long count = list.getNumFound();

		System.out.println("匹配结果总数:" + count);

		for (SolrDocument solrDocument : list) {
			System.out.println("id : " + solrDocument.get("id"));
			System.out.println("name : " + solrDocument.get("info_id"));
			System.out.println("catalog : " + solrDocument.get("data_keywords"));
			System.out.println("=====================================");
		}
	}

	// 复杂查询
	@Test
	public void search02() throws Exception {
		query.setQuery("product_name:小黄人");
		// 设置过滤条件
		// 如果设置多个过滤条件的话,需要使用add : query.addFilterQuery("");
		query.setFilterQueries("product_price:[1 TO 10]");

		// 设置排序
		query.setSort("product_name", ORDER.asc);

		// 设置分页信息 (使用默认的)
		query.setStart(0);
		query.setRows(10);

		// 设置显示的Field的域集合
		query.setFields("id,product_name,product_price");

		// 设置默认域
		query.set("df", "product_keywords");

		// 设置高亮信息
		query.setHighlight(true);
		query.addHighlightField("product_name");
		query.setHighlightSimplePre("<em>");
		query.setHighlightSimplePost("</em>");

		// 执行查询并返回结果
		QueryResponse response = server.query(query);

		// 获取匹配
		SolrDocumentList list = response.getResults();
		// 匹配结果总数
		long count = list.getNumFound();

		System.out.println("匹配结果总数:" + count);
		// 获取高亮显示信息
		Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();

		for (SolrDocument solrDocument : list) {
			System.out.println("id : " + solrDocument.get("id"));

			List<String> list2 = highlighting.get(solrDocument.get("id")).get("product_name");
			if (list2 != null) {
				System.out.println("高亮显示的商品名称 : " + list2.get(0));
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
