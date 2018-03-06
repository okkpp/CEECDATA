package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.service.payment.ExchangeService;
import okkpp.service.payment.ExternalService;
import okkpp.service.payment.ForeignService;
import okkpp.service.payment.PaymentService;
import okkpp.service.payment.ReservesService;
import okkpp.model.payment.Exchange;
import okkpp.model.payment.External;
import okkpp.model.payment.Foreign;
import okkpp.model.payment.Payment;
import okkpp.model.payment.Reserves;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	ExchangeService exchangeService;
	@RequestMapping("/Exchange")
	public String Exchange(Model model) {
		List<Exchange> list = exchangeService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ExternalService externalService;
	@RequestMapping("/External")
	public String External(Model model) {
		List<External> list = externalService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ForeignService foreignService;
	@RequestMapping("/Foreign")
	public String Foreign(Model model) {
		List<Foreign> list = foreignService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	PaymentService paymentService;
	@RequestMapping("/Payment")
	public String Payment(Model model) {
		List<Payment> list = paymentService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ReservesService reservesService;
	@RequestMapping("/Reserves")
	public String Reserves(Model model) {
		List<Reserves> list = reservesService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
}
