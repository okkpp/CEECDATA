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
		// ���� solrQuery ����
		SolrQuery query = new SolrQuery();

		// ����ؼ���
		if (!queryString.isEmpty() || queryString == null) {
			query.setQuery(queryString);
		} else {
			query.setQuery("*:*");
		}
	
		// ������Ʒ�����������
		if (!catalogName.isEmpty() || catalogName == null) {
			query.addFilterQuery("product_catalog_name : " + catalogName);
		}

		// ����۸������������
		// price ��ֵ : 0-9 10-19
		if (!price.isEmpty() || price == null) {
			query.addFilterQuery("product_price:[" + price.split("-")[0] + " TO " + price.split("-")[1] + "]");
		}

		// ��������
		if ("1".equals(sort)) {
			query.setSort("product_name", ORDER.asc);
		} else {
			query.setSort("product_name", ORDER.desc);
		}

		// ���÷�ҳ��Ϣ
		if (page == null) {
			page = 1;
		}

		query.setStart((page - 1) * 20);
		query.setRows(20);
		
		// ����Ĭ����
		query.set("df", "product_keywords");
		
		// ���ø�����Ϣ
		query.setHighlight(true);
		query.addHighlightField("product_name");
		query.setHighlightSimplePre("<font style='color:red'>");
		query.setHighlightSimplePost("</font>");
		
		QueryResponse response = httpSolrServer.query(query);
		
		SolrDocumentList results = response.getResults();
		
		// ��ѯ���Ľ������
		long count = results.getNumFound();
		
		List<Products> products = new ArrayList<>();
		Products prod;
		
		// ��ȡ������Ϣ
		Map<String, Map<String,List<String>>> highlighting = response.getHighlighting();
		
		for(SolrDocument doc : results) {
			prod = new Products();
			
			// ��ƷID
			prod.setPid(doc.get("id").toString());
			
			List<String> list = highlighting.get(doc.get("id")).get("product_name");
			
			if (list != null) {
				prod.setName(list.get(0));
			} else {
				// ��Ʒ����
				prod.setName(doc.get("product_name").toString());
			}
			
			// ��Ʒ�۸�
			prod.setPrice(Float.parseFloat(doc.get("product_price").toString()));
			// ��ƷͼƬ��ַ
			prod.setPicture(doc.get("product_picture").toString());
			
			products.add(prod);
		}
		
		resultModel.setProductList(products);
		resultModel.setRecordCount(count);
		resultModel.setCurPage(page);
		
		// ������ҳ��
		int pageCount = (int) (count/20);
		if(count % 20 > 0) {
			pageCount ++;
		}
		resultModel.setPageCount(pageCount);
		return resultModel;
	}

}
