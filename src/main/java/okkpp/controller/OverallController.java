package okkpp.controller;

import java.util.List;
import java.util.Map;

import okkpp.model.Msg;
import okkpp.model.overall.*;
import okkpp.service.overall.*;
import okkpp.utils.ChartInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;

/**
 * @author DUCK E-mail: okkpp@qq.com
 * @date 创建时间：2018年3月2日 上午10:43:58
 * @version 1.0
 */
@Controller
@RequestMapping("/overall")
public class OverallController {

	@Autowired
	CountryAreaService countryareaService;
	@Autowired
	FreshWaterService freshwaterService;
	@Autowired
	LandUtilizationService landUtilizationService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
		case "Countryarea":
			return ChartInfo.mapByCountry(countryareaService.selectAll());
		case "Freshwater":
			return ChartInfo.mapByCountry(freshwaterService.selectAll());
		case "LandUtilization":
			return ChartInfo.mapByCountry(landUtilizationService.selectAll());
		}
		return null;
	}

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("info") String info) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "Countryarea":
			pageInfo = countryareaService.getPageInfo(pn);
			break;
		case "Freshwater":
			pageInfo = freshwaterService.getPageInfo(pn);
			break;
		case "LandUtilization":
			pageInfo = landUtilizationService.getPageInfo(pn);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 后台按条件查找
	@RequestMapping(value = "/getJsonByCondition/{info}", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "Countryarea":
			pageInfo = countryareaService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Freshwater":
			pageInfo = freshwaterService.getPageInfoByCondition(pn, column, condition);
			break;
		case "LandUtilization":
			pageInfo = landUtilizationService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/CountryArea")
	public String CountryArea(Model model) {
		List<CountryArea> list = countryareaService.selectAll();
		model.addAttribute("data", list);
		return "overall/CountryArea";
	}

	@RequestMapping("/FreshWater")
	public String FreshWater(Model model) {
		model.addAttribute("data", freshwaterService.selectAll());
		return "overall/FreshWater";
	}

	@RequestMapping("/LandUtilization")
	public String LandUtilization(Model model) {
		List<LandUtilization> list = landUtilizationService.selectAll();
		model.addAttribute("data", list);
		model.addAttribute("jsdata", new Gson().toJson(list));
		return "overall/LandUtilization";
	}

}
