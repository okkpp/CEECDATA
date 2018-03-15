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
import okkpp.service.payment.*;
import okkpp.model.Msg;
import okkpp.model.payment.*;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	ExchangeService exchangeService;
	@RequestMapping(value = "/Exchange",method = RequestMethod.POST)
	public String Exchange(Model model) {
		List<Exchange> list = exchangeService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping("/exchange")
	@ResponseBody
	public Msg exchange(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Exchange> list = exchangeService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	ExternalService externalService;
	@RequestMapping("/External")
	public String External(Model model) {
		List<External> list = externalService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/external",method = RequestMethod.POST)
	@ResponseBody
	public Msg external(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<External> list = externalService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	ForeignService foreignService;
	@RequestMapping("/Foreign")
	public String Foreign(Model model) {
		List<Foreign> list = foreignService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/foreign",method = RequestMethod.POST)
	@ResponseBody
	public Msg foreign(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Foreign> list = foreignService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	PaymentService paymentService;
	@RequestMapping("/Payment")
	public String Payment(Model model) {
		List<Payment> list = paymentService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/payment",method = RequestMethod.POST)
	@ResponseBody
	public Msg payment(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Payment> list = paymentService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	@Autowired
	ReservesService reservesService;
	@RequestMapping("/Reserves")
	public String Reserves(Model model) {
		List<Reserves> list = reservesService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/reserves",method = RequestMethod.POST)
	@ResponseBody
	public Msg reserves(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<Reserves> list = reservesService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
}
