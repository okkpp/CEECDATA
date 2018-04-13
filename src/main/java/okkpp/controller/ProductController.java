package okkpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.model.ResultModel;
import okkpp.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/list")
	public String test(String queryString, String catalog_name, String price, String sort, Integer page, Model model)
			throws Exception {
		ResultModel rm = productService.getProducts(queryString, catalog_name, price, sort, page);

		// 将查询结果放到 Request 域中
		model.addAttribute("result", rm);
		System.out.println(rm);
		// 简单类型的数据回显
		model.addAttribute("queryString", queryString);
		model.addAttribute("catalog_name", catalog_name);
		model.addAttribute("price", price);
		model.addAttribute("sort", sort);
		model.addAttribute("page", page);

		return "product_list";
	}

	@RequestMapping("/jd")
	public String test(Model model) throws Exception {
		ResultModel rm = productService.getProducts("", "", "", "", null);

		// 将查询结果放到 Request 域中
		model.addAttribute("result", rm);

		return "product_list";
	}

}
