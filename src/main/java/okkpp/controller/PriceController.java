package okkpp.controller;

import java.util.List;
import java.util.Map;
<<<<<<< HEAD
=======

>>>>>>> e2320eefdae1b993da01566b6587eca85971472d
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.model.Msg;
import okkpp.model.price.*;
import okkpp.service.price.*;
import okkpp.utils.CountryMap;

@Controller
@RequestMapping("/price")
public class PriceController {
	
	@Autowired
	ConsumerService consumerService;
	@Autowired
	ProducerService producerService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
			case "Consumer" :
				return CountryMap.mapByCountry(consumerService.selectAll());
			case "Producer" :
				return CountryMap.mapByCountry(producerService.selectAll());
		}
		return null;
	}

	@RequestMapping("/Consumer")
	public String Consumer(Model model) {
		List<Consumer> list = consumerService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}
	
	//后台获取数据
	@RequestMapping(value = "/getJson",method = RequestMethod.POST)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model,@RequestParam("info")String info) {
		PageInfo<E> pageInfo = null;
		switch(info) {
			case "Consumer":
				pageInfo = consumerService.getPageInfo(pn);
				break;
			case "Producer":
				pageInfo = producerService.getPageInfo(pn);			
				break;
			default :
				break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	//更新Consume更新方法
	@RequestMapping(value = "/Consumer",method = RequestMethod.PUT)
	@ResponseBody
	public Msg updateConsumer(Consumer consumer) {
		System.out.println(consumer.toString());
		/*if(consumerService.updateConsumer(consumer) == 1) {
			return Msg.success();
		}else{
			return Msg.fail();
		}*/
		return Msg.success();
	}

	// 按条件查找
	@RequestMapping("/selectConsumerByExample")
	@ResponseBody
	public Msg selectConsumerByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<Consumer> list = consumerService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	// 按条件查找Produce
	@RequestMapping("/selectProducerByExample")
	@ResponseBody
	public Msg selectProducerByExample(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("column") String column, @RequestParam("condition") String condition) {
		PageHelper.startPage(pn, 10);
		List<Producer> list = producerService.selectByExample(column, condition);
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
	}
}
