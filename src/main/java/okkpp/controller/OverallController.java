package okkpp.controller;

import java.util.List;
import java.util.Map;

import okkpp.model.overall.*;
import okkpp.service.overall.*;
import okkpp.utils.CountryMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

/**
 * @author DUCK  E-mail: okkpp@qq.com
 * @date 创建时间：2018年3月2日 上午10:43:58 
 * @version 1.0 
 */
@Controller
@RequestMapping("/overall")
public class OverallController {

	@Autowired
	CountryAreaService countryareaservice;
	@Autowired
	FreshWaterService freshwaterservice;
	@Autowired
	LandUtilizationService landUtilizationService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		 	case "Countryarea" :
		 		return CountryMap.mapByCountry(countryareaservice.selectAll());
		 	case "Freshwater" :
		 		return CountryMap.mapByCountry(freshwaterservice.selectAll());
		 	case "LandUtilization" :
		 		return CountryMap.mapByCountry(landUtilizationService.selectAll());
		}
		return null;
	}
	@RequestMapping("/CountryArea")
	public String CountryArea(Model model){
		List<CountryArea> list = countryareaservice.selectAll();
		model.addAttribute("data", list);
		return "overall/CountryArea";
	}
	
	@RequestMapping("/FreshWater")
	public String FreshWater(Model model){
		model.addAttribute("data", freshwaterservice.selectAll());
		return "overall/FreshWater";
	}
	
	@RequestMapping("/LandUtilization")
	public String LandUtilization(Model model) {	
		List<LandUtilization> list = landUtilizationService.selectAll();
		model.addAttribute("data",list);
		model.addAttribute("jsdata", new Gson().toJson(list));
		return "overall/LandUtilization";
	}

}
