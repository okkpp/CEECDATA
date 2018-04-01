package okkpp.controller.propagate;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.service.propagate.TableDataService;

/**
* @author duck
* @date 创建时间：2018年3月30日 下午1:55:44
*/
@RequestMapping("/propagate")
@Controller
public class PropagateController {

	@Autowired
	TableDataService tableDataService;
	
	@RequestMapping("")
	public String saveCatalog(@RequestParam Map<String, Object> data) {
		
		return "";
	}
	@RequestMapping("/saveData/{catalogId}")
	@ResponseBody
	public int saveData(@PathVariable(value="catalogId") int catalogId,@RequestParam Map<String, Object> data) {
		System.out.println(catalogId);
		for(String key : data.keySet()) {
			System.out.println(data.get(key));
		}
		return catalogId;
	}
	
}
