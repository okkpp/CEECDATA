package okkpp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import okkpp.service.MerchandiseImportsService;
import okkpp.service.trade.CommercialServiceExportService;
import okkpp.service.trade.CommercialServiceImportService;
import okkpp.service.trade.ExportsByCommodityGroupsService;
import okkpp.service.trade.GoodsAndServicesService;
import okkpp.service.trade.ImportsByCommodityGroupsService;
import okkpp.service.trade.MerchandiseExportsService;
import okkpp.service.trade.MerchandiseImportsAndExportsService;
import okkpp.model.trade.*;

@Controller
@RequestMapping("/trade")
public class TradeController {

	@Autowired
	CommercialServiceExportService commercialServiceExportService;
	@RequestMapping("/CommercialServiceExport")
	public String CommercialServiceExport(Model model) {
		List<CommercialServiceExport> list = commercialServiceExportService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	CommercialServiceImportService commercialServiceImportService;
	@RequestMapping("/CommercialServiceImport")
	public String CommercialServiceImport(Model model) {
		List<CommercialServiceImport> list = commercialServiceImportService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ExportsByCommodityGroupsService exportsByCommodityGroupsService;
	@RequestMapping("/ExportsByCommodityGroups")
	public String ExportsByCommodityGroups(Model model) {
		List<ExportsByCommodityGroups> list = exportsByCommodityGroupsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	GoodsAndServicesService goodsAndServicesService;
	@RequestMapping("/GoodsAndServices")
	public String GoodsAndServices(Model model) {
		List<GoodsAndServices> list = goodsAndServicesService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	ImportsByCommodityGroupsService importsByCommodityGroupsService;
	@RequestMapping("/ImportsByCommodityGroups")
	public String ImportsByCommodityGroups(Model model) {
		List<ImportsByCommodityGroups> list = importsByCommodityGroupsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	MerchandiseExportsService merchandiseExportsService;
	@RequestMapping("/MerchandiseExports")
	public String MerchandiseExports(Model model) {
		List<MerchandiseExports> list = merchandiseExportsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	MerchandiseImportsService merchandiseImportsService;
	@RequestMapping("/MerchandiseImports")
	public String MerchandiseImports(Model model) {
		List<MerchandiseImports> list = merchandiseImportsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	@Autowired
	MerchandiseImportsAndExportsService merchandiseImportsAndExportsService;
	@RequestMapping("/MerchandiseImportsAndExports")
	public String MerchandiseImportsAndExports(Model model) {
		List<MerchandiseImportsAndExports> list = merchandiseImportsAndExportsService.selectAll();
		model.addAttribute("data",list);
		return "404";
	}
	
	
}
