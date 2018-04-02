package okkpp.controller.propagate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.model.propagate.TableCatalog;
import okkpp.service.propagate.TableCatalogService;

/**
* @author duck
* @date 创建时间：2018年3月30日 下午2:58:48
*/
@RequestMapping("/tableCatalog")
@Controller
public class TableCatalogController {

	@Autowired
	TableCatalogService service;
	
	@RequestMapping("/render/{catalogId}")
	public String page(@PathVariable(value="catalogId")int catalogId,Model model) {
		model.addAttribute("catalog", service.selectByKey(catalogId));
		return "/propagate/catalog";
	}
	@RequestMapping("/list")
	@ResponseBody
	public List<TableCatalog> list() {
		return service.list();
	}
}
