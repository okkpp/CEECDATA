package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ProducerService producerService;
	@RequestMapping("/Producer")
	public String Produce(Model model) {
		List<Producer> list = producerService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}

}
