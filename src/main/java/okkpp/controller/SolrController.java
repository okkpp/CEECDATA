package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.base.Msg;
import okkpp.model.MusinInfo;
import okkpp.service.SolrService;

@Controller
@RequestMapping("/solr")
public class SolrController {
	
	@Autowired
	private SolrService solrService;
	
	@RequestMapping("/getContentByCondition")
	@ResponseBody
	public Msg getContentByCondition(@RequestParam("info")String info){	
		return solrService.getContentByCondition(info);
	}
	
	@RequestMapping("/searchIndex")
	public String searchIndex() {
		return "search";
	}
	
	@RequestMapping("/getMusic")
	@ResponseBody
	public List<MusinInfo> getMusic(@RequestParam("catalog")String catalog) {
		return solrService.getMusics(catalog);
	}
	
}
