package okkpp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import okkpp.model.price.*;
import okkpp.service.price.*;

@Controller
@RequestMapping("/price")
public class PriceController {

	@Autowired
	ConsumerService consumerService;
	@RequestMapping("/Consumer")
	@ResponseBody
	public List<Consumer> Consumer() {
		return consumerService.selectAll();
	}
	
	@Autowired
	ProducerService producerService;
	@RequestMapping("/Producer")
	@ResponseBody
	public List<Producer> Produce() {
		return producerService.selectAll();
	}

}
