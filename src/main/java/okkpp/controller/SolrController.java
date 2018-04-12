package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.model.DataModel;
import okkpp.service.SolrService;

@Controller
@RequestMapping("/solr")
public class SolrController {
	
	@Autowired
	private SolrService solrService;
	
	@RequestMapping("/getContentByCondition")
	@ResponseBody
	public List<DataModel> getContentByCondition(@RequestParam("info")String info,@RequestParam("country")String countrys){
		System.out.println("info : " + info);
		return solrService.getContentByCondition(info);
	}
	
	@RequestMapping("/searchIndex")
	public String searchIndex() {
		return "search";
	}
	
}
