package okkpp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import okkpp.model.ResultModel;
import okkpp.model.Products;

@Service
public class ProductService {
	
	@Autowired
	HttpSolrServer httpSolrServer;
	
	private ResultModel resultModel = new ResultModel();

	public ResultModel getProducts(String queryString, String catalogName, String price, String sort, Integer page)
			throws Exception {
		// 创建 solrQuery 对象
		SolrQuery query = new SolrQuery();

		// 输入关键字
		if (!queryString.isEmpty() || queryString == null) {
			query.setQuery(queryString);
		} else {
			query.setQuery("*:*");
		}
	
		// 输入商品分类过滤条件
		if (!catalogName.isEmpty() || catalogName == null) {
			query.addFilterQuery("product_catalog_name : " + catalogName);
		}

		// 输入价格区间过滤条件
		// price 的值 : 0-9 10-19
		if (!price.isEmpty() || price == null) {
			query.addFilterQuery("product_price:[" + price.split("-")[0] + " TO " + price.split("-")[1] + "]");
		}

		// 设置排序
		if ("1".equals(sort)) {
			query.setSort("product_name", ORDER.asc);
		} else {
			query.setSort("product_name", ORDER.desc);
		}

		// 设置分页信息
		if (page == null) {
			page = 1;
		}

		query.setStart((page - 1) * 20);
		query.setRows(20);
		
		// 设置默认域
		query.set("df", "product_keywords");
		
		// 设置高亮信息
		query.setHighlight(true);
		query.addHighlightField("product_name");
		query.setHighlightSimplePre("<font style='color:red'>");
		query.setHighlightSimplePost("</font>");
		
		QueryResponse response = httpSolrServer.query(query);
		
		SolrDocumentList results = response.getResults();
		
		// 查询出的结果总数
		long count = results.getNumFound();
		
		List<Products> products = new ArrayList<>();
		Products prod;
		
		// 获取高亮信息
		Map<String, Map<String,List<String>>> highlighting = response.getHighlighting();
		
		for(SolrDocument doc : results) {
			prod = new Products();
			
			// 商品ID
			prod.setPid(doc.get("id").toString());
			
			List<String> list = highlighting.get(doc.get("id")).get("product_name");
			
			if (list != null) {
				prod.setName(list.get(0));
			} else {
				// 商品名称
				prod.setName(doc.get("product_name").toString());
			}
			
			// 商品价格
			prod.setPrice(Float.parseFloat(doc.get("product_price").toString()));
			// 商品图片地址
			prod.setPicture(doc.get("product_picture").toString());
			
			products.add(prod);
		}
		
		resultModel.setProductList(products);
		resultModel.setRecordCount(count);
		resultModel.setCurPage(page);
		
		// 设置总页数
		int pageCount = (int) (count/20);
		if(count % 20 > 0) {
			pageCount ++;
		}
		resultModel.setPageCount(pageCount);
		return resultModel;
	}

}
