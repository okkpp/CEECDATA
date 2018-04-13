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

		// ����ѯ����ŵ� Request ����
		model.addAttribute("result", rm);
		System.out.println(rm);
		// �����͵����ݻ���
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

		// ����ѯ����ŵ� Request ����
		model.addAttribute("result", rm);

		return "product_list";
	}

}
