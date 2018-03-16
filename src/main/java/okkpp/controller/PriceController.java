package okkpp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.model.Msg;
import okkpp.model.price.*;
import okkpp.service.price.*;

@Controller
@RequestMapping("/price")
public class PriceController {

	@Autowired
	ConsumerService consumerService;

	@RequestMapping("/Consumer")
	public String Consumer(Model model) {
		List<Consumer> list = consumerService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	// 查找所有
	@RequestMapping(value = "/Consumer",method = RequestMethod.POST)
	@ResponseBody
	public Msg Consumer(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Consumer> list = consumerService.selectAll();
		PageInfo pageInfo = new PageInfo(list, 10);
		model.addAttribute("pageInfo", pageInfo);
		return Msg.success().add("pageInfo", pageInfo);
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

	@Autowired
	ProducerService producerService;

	@RequestMapping("/Producer")
	public String Producer(Model model) {
		List<Producer> list = producerService.selectAll();
		model.addAttribute("data", list);
		return "404";
	}

	// 查找所有Produce
	@RequestMapping(value = "/Producer",method = RequestMethod.POST)
	@ResponseBody
	public Msg Producer(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
		PageHelper.startPage(pn, 10);
		List<Producer> list = producerService.selectAll();
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
