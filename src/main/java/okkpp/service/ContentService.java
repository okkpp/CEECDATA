package okkpp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okkpp.dao.ContentMapper;
import okkpp.dao.TabHrefMapper;
import okkpp.model.Content;
import okkpp.model.TabHref;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年1月18日 上午10:01:54 
 * @version 1.0 
 */
@Service
@Transactional
public class ContentService {

	@Autowired
	private ContentMapper Cmapper;
	@Autowired
	private TabHrefMapper Tmapper;
	
	public List<Content> getAllContent(){
		return Cmapper.getAllContent();
	}
	public Map<String,List<Content>> getContent(String GJDM){
		List<Content> list = Cmapper.getContent(GJDM);
		List<Content> HGJJ = new ArrayList<Content>(),
				SHHJ = new ArrayList<Content>(),
				TZYS = new ArrayList<Content>(),
				MYHZ = new ArrayList<Content>();
		for(Content c : list){
			String lj = c.getLJ();
			if(lj.contains("HGJJ")){
				HGJJ.add(c);continue;
			}else if(lj.contains("SHHJ")){
				SHHJ.add(c);continue;
			}else if(lj.contains("TZYS")){
				TZYS.add(c);continue;
			}else if(lj.contains("MYHZ")){
				MYHZ.add(c);continue;
			}
		}
		Map<String,List<Content>> map = new HashMap<String, List<Content>>();
		map.put("MYHZ", MYHZ);map.put("TZYS", TZYS);
		map.put("SHHJ", SHHJ);map.put("HGJJ", HGJJ);
		return map;
	}
	public int update(){
		int count = 0;
		List<String> list = this.getCEECCODE();
		for(String code : list){
			count += this.check(code);
		}
		return count;
	}
	private int check(String GJDM){
		int count = 0;
		List<TabHref> lth = Tmapper.getTabHref();
		for(TabHref th : lth){
			//System.out.println("check:"+GJDM+"-"+th.getHref());
			if(this.search(GJDM, th.getTabName())>0){
				Content c = new Content();
				c.setGJDM(GJDM);
				c.setBT(th.getBT());
				c.setLB(this.getLB(th.getHref()));c.setLJ(th.getHref());
				Cmapper.deleteExist(c);
				Cmapper.update(c);
				count++;
			}
		}
		
		return count;
	}
	private List<String> getCEECCODE(){
		return Tmapper.getCEECCODE();
	}
	private int search(String GJDM,String tabName){
		TabHref th = new TabHref();
		th.setTabName(tabName);
		th.setHref(GJDM);
		return Tmapper.search(th);
	}
	private String getLB(String href){
		if(href.contains("HGJJ"))return "宏观经济";
		else if(href.contains("SHHJ"))return "社会环境";
		else if(href.contains("TZYS"))return "投资营商";
		else if(href.contains("MYHZ"))return "贸易合作";

		return "";
	}
	
	public String GJDM2GJ(String GDJM){
		return Cmapper.GJDM2GJ(GDJM);
	}
	public void getTest(){
		List<String> tabs = Cmapper.showTables();
		for(String tabName : tabs){
			System.out.println(tabName);
			Content c = new Content();c.setGJDM(tabName);
			List<Map<String,String>> columns = Cmapper.showColumns(tabName);
			for(Map<String,String> map : columns){
				System.out.println(map.get("Field"));
			}
		}
	}
}
