package okkpp.controller.propagate;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import okkpp.model.propagate.TableInfo;
import okkpp.service.propagate.TableInfoService;

/**
* @author duck
* @date 创建时间：2018年3月30日 下午2:58:48
*/
@RequestMapping("/tableCatalog")
@Controller
public class TableInfoController {

	@Autowired
	TableInfoService service;
	
	@RequestMapping("/render")
	public String render() {
		return "/propagate/list";
	}
	@RequestMapping("/render/{catalogId}")
	public String page(@PathVariable(value="catalogId")int catalogId,Model model) {
		model.addAttribute("catalog", service.selectByKey(catalogId));
		return "/propagate/data";
	}
	@RequestMapping("/add/{catalogId}")
	public String add(@PathVariable(value="catalogId")int catalogId,Model model) {
		model.addAttribute("catalog", service.selectByKey(catalogId));
		return "/propagate/addData";
	}
	@RequestMapping("/createCatalog")
	public String newForm() {
		return "/propagate/createCatalog";
	}
	@RequestMapping("/create/{tableName}")
	public String save(@PathVariable(value="tableName") String tableName,@RequestParam Map<String, Object> data) {
		int catalogId = service.saveInfo(tableName, data);
		
		return "redirect:/tableCatalog/render/"+catalogId+".do";
	}
	@RequestMapping("/list")
	@ResponseBody
	public List<TableInfo> list() {
		return service.list();
	}
	@RequestMapping("/listPage")
	@ResponseBody
	public PageInfo<TableInfo> listPage(int page,int pageSize) {
		return service.listPage(page, pageSize);
	}
	@RequestMapping("/getInfo")
	@ResponseBody
	public TableInfo getInfo(Integer id) {
		return service.selectByKey(id);
	}
}
