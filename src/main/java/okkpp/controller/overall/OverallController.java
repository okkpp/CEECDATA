package okkpp.controller.overall;

import java.util.List;

import okkpp.model.overall.CountryArea;
import okkpp.service.overall.CountryAreaService;
import okkpp.service.overall.FreshWaterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String CountryArea(Model model,String country){
		List<CountryArea> list = countryareaservice.selectByExample(country);
		System.out.println(list.size());
		model.addAttribute("data", list);
		return "404";
	}
	@Autowired
	FreshWaterService freshwaterservice;
	@RequestMapping("/FreshWater")
	public String FreshWater(Model model){
		model.addAttribute("data", freshwaterservice.selectAll());
		return "overall/FreshWater";
	}
}
