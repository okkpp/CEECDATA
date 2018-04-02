package okkpp.controller.propagate;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import okkpp.service.propagate.TableDataService;

/**
* @author duck
* @date 创建时间：2018年3月30日 下午2:55:44
*/
@RequestMapping("/catalogData")
@Controller
public class TableDataController {

	@Autowired
	TableDataService service;
	
	@RequestMapping("/saveData/{catalogId}")
	public String saveData(@PathVariable(value="catalogId") int catalogId,@RequestParam Map<String, Object> data) {
		service.saveData(catalogId, data);
		return "redirect:/tableCatalog/render/"+catalogId+".do";
	}
}
