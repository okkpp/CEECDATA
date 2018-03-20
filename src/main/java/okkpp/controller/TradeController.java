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
import okkpp.service.trade.*;
import okkpp.utils.CountryMap;
import okkpp.model.Msg;
import okkpp.model.price.Consumer;
import okkpp.model.trade.*;

@Controller
@RequestMapping("/trade")
public class TradeController {

	@Autowired
	CommercialServiceExportService commercialServiceExportService;
	@Autowired
	CommercialServiceImportService commercialServiceImportService;
	@Autowired
	ExportsByCommodityGroupsService exportsByCommodityGroupsService;
	@Autowired
	GoodsAndServicesService goodsAndServicesService;
	@Autowired
	ImportsByCommodityGroupsService importsByCommodityGroupsService;
	@Autowired
	MerchandiseExportsService merchandiseExportsService;
	@Autowired
	MerchandiseImportsService merchandiseImportsService;
	@Autowired
	MerchandiseImportsAndExportsService merchandiseImportsAndExportsService;
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch(info) {
		 	case "CommercialServiceExport" :
		 		return CountryMap.mapByCountry(commercialServiceExportService.selectAll());
		 	case "CommercialServiceImport" :
		 		return CountryMap.mapByCountry(commercialServiceImportService.selectAll());
		 	case "ExportsByCommodityGroups" :
		 		return CountryMap.mapByCountry(exportsByCommodityGroupsService.selectAll());
		 	case "GoodsAndServices" :
		 		return CountryMap.mapByCountry(goodsAndServicesService.selectAll());
		 	case "ImportsByCommodityGroups" :
		 		return CountryMap.mapByCountry(importsByCommodityGroupsService.selectAll());
		 	case "MerchandiseExports" :
		 		return CountryMap.mapByCountry(merchandiseExportsService.selectAll());
		 	case "MerchandiseImports" :
		 		return CountryMap.mapByCountry(merchandiseImportsService.selectAll());
		 	case "MerchandiseImportsAndExports" :
		 		return CountryMap.mapByCountry(merchandiseImportsAndExportsService.selectAll());			
		}
		return null;
	}
	
	@RequestMapping("/CommercialServiceExport")
	public String CommercialServiceExport(Model model) {
		List<CommercialServiceExport> list = commercialServiceExportService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/CommercialServiceExport",method = RequestMethod.POST)
	@ResponseBody
	public Msg commercial_service_export(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<CommercialServiceExport> list = commercialServiceExportService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/CommercialServiceImport")
	public String CommercialServiceImport(Model model) {
		List<CommercialServiceImport> list = commercialServiceImportService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/CommercialServiceImport",method = RequestMethod.POST)
	@ResponseBody
	public Msg commercial_service_import(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<CommercialServiceImport> list = commercialServiceImportService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/ExportsByCommodityGroups")
	public String ExportsByCommodityGroups(Model model) {
		List<ExportsByCommodityGroups> list = exportsByCommodityGroupsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/ExportsByCommodityGroups",method = RequestMethod.POST)
	@ResponseBody
	public Msg exports_by_commodity_groups(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<ExportsByCommodityGroups> list = exportsByCommodityGroupsService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/GoodsAndServices")
	public String GoodsAndServices(Model model) {
		List<GoodsAndServices> list = goodsAndServicesService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/GoodsAndServices",method = RequestMethod.POST)
	@ResponseBody
	public Msg goods_and_services(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<GoodsAndServices> list = goodsAndServicesService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/ImportsByCommodityGroups")
	public String ImportsByCommodityGroups(Model model) {
		List<ImportsByCommodityGroups> list = importsByCommodityGroupsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/imports_by_commodity_groups",method = RequestMethod.POST)
	@ResponseBody
	public Msg imports_by_commodity_groups(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<ImportsByCommodityGroups> list = importsByCommodityGroupsService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/MerchandiseExports")
	public String MerchandiseExports(Model model) {
		List<MerchandiseExports> list = merchandiseExportsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/merchandise_exports",method = RequestMethod.POST)
	@ResponseBody
	public Msg merchandise_exports(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<MerchandiseExports> list = merchandiseExportsService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/MerchandiseImports")
	public String MerchandiseImports(Model model) {
		List<MerchandiseImports> list = merchandiseImportsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/MerchandiseImports",method = RequestMethod.POST)
	@ResponseBody
	public Msg merchandise_imports(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<MerchandiseImports> list = merchandiseImportsService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}
	
	
	@RequestMapping("/MerchandiseImportsAndExports")
	public String MerchandiseImportsAndExports(Model model) {
		List<MerchandiseImportsAndExports> list = merchandiseImportsAndExportsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	@RequestMapping(value = "/MerchandiseImportsAndExports",method = RequestMethod.POST)
	@ResponseBody
	public Msg merchandise_imports_and_exports(@RequestParam(value="pn",defaultValue = "1")Integer pn,Model model) {
		PageHelper.startPage(pn,10);
		List<MerchandiseImportsAndExports> list = merchandiseImportsAndExportsService.selectAll();
		PageInfo pageInfo = new PageInfo(list,10);
		model.addAttribute("pageInfo",pageInfo);
		return Msg.success().add("pageInfo",pageInfo);
	}	
}
