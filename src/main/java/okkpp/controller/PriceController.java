package okkpp.controller;

import java.util.List;
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

@Controller
@RequestMapping("/price")
public class PriceController {

	@Autowired
	ConsumerService consumerService;
	@RequestMapping(value = "/Consumer",method = RequestMethod.POST)
	public String Consumer(Model model) {
		List<Consumer> list = consumerService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping("/consumer")
	@ResponseBody
	public Msg Consumer(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Consumer> list = consumerService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	ProducerService producerService;
	@RequestMapping(value = "/Producer",method = RequestMethod.POST)
	public String Producer(Model model) {
		List<Producer> list = producerService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping("/producer")
	@ResponseBody
	public Msg Producer(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Producer> list = producerService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	public Msg searchConsumerByCondition(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model,
			@RequestParam("column")String column,@RequestParam("condition")String condition) {
		PageHelper.startPage(pn,10);
		List<Consumer> list = consumerService.selectByExample(column,condition);
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
}
