package okkpp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.service.payment.*;
import okkpp.utils.CountryMap;
import okkpp.model.Msg;
import okkpp.model.payment.*;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	ExchangeService exchangeService;
	@Autowired
	ExternalService externalService;
	@Autowired
	ForeignService foreignService;
	@Autowired
	PaymentService paymentService;
	@Autowired
	ReservesService reservesService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		 	case "Exchange" :
		 		return CountryMap.mapByCountry(exchangeService.selectAll());
		 	case "External" :
		 		return CountryMap.mapByCountry(externalService.selectAll());
		 	case "Foreign" :
		 		return CountryMap.mapByCountry(foreignService.selectAll());
		 	case "Payment" :
		 		return CountryMap.mapByCountry(paymentService.selectAll());
		 	case "Reserves" :
		 		return CountryMap.mapByCountry(reservesService.selectAll());
		}
		return null;
	}
	
	@RequestMapping(value = "/Exchange",method = RequestMethod.POST)
	public String Exchange(Model model) {
		List<Exchange> list = exchangeService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping("/Exchange")
	@ResponseBody
	public Msg exchange(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Exchange> list = exchangeService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/External")
	public String External(Model model) {
		List<External> list = externalService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/External",method = RequestMethod.POST)
	@ResponseBody
	public Msg external(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<External> list = externalService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/Foreign")
	public String Foreign(Model model) {
		List<Foreign> list = foreignService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/Foreign",method = RequestMethod.POST)
	@ResponseBody
	public Msg foreign(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Foreign> list = foreignService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/Payment")
	public String Payment(Model model) {
		List<Payment> list = paymentService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/Payment",method = RequestMethod.POST)
	@ResponseBody
	public Msg payment(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Payment> list = paymentService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/Reserves")
	public String Reserves(Model model) {
		List<Reserves> list = reservesService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/Reserves",method = RequestMethod.POST)
	@ResponseBody
	public Msg reserves(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Reserves> list = reservesService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
}
