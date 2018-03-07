package okkpp.controller;

import java.util.List;

import okkpp.model.overall.*;
import okkpp.service.overall.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@RequestMapping("/CountryArea")
	public String CountryArea(Model model){
		List<CountryArea> list = countryareaservice.selectAll();
		model.addAttribute("data", list);
		return "overall/CountryArea";
	}
	@Autowired
	FreshWaterService freshwaterservice;
	@RequestMapping("/FreshWater")
	public String FreshWater(Model model){
		model.addAttribute("data", freshwaterservice.selectAll());
		model.addAttribute("jsdata", new Gson().toJson(freshwaterservice.selectAll()));
		return "overall/FreshWater";
	}
	@Autowired
	LandUtilizationService landUtilizationService;
	@RequestMapping("/LandUtilization")
	public String LandUtilization(Model model) {	
		List<LandUtilization> list = landUtilizationService.selectAll();
		model.addAttribute("data",list);
		model.addAttribute("jsdata", new Gson().toJson(list));
		return "overall/LandUtilization";
	}

}
