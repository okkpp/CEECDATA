package okkpp.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import okkpp.service.trade.*;
import okkpp.utils.ChartInfo;
import okkpp.model.Msg;

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
		switch (info) {
		case "CommercialServiceExport":
			return ChartInfo.mapByCountry(commercialServiceExportService.selectAll());
		case "CommercialServiceImport":
			return ChartInfo.mapByCountry(commercialServiceImportService.selectAll());
		case "ExportsByCommodityGroups":
			return ChartInfo.mapByCountry(exportsByCommodityGroupsService.selectAll());
		case "GoodsAndServices":
			return ChartInfo.mapByCountry(goodsAndServicesService.selectAll());
		case "ImportsByCommodityGroups":
			return ChartInfo.mapByCountry(importsByCommodityGroupsService.selectAll());
		case "MerchandiseExports":
			return ChartInfo.mapByCountry(merchandiseExportsService.selectAll());
		case "MerchandiseImports":
			return ChartInfo.mapByCountry(merchandiseImportsService.selectAll());
		case "MerchandiseImportsAndExports":
			return ChartInfo.mapByCountry(merchandiseImportsAndExportsService.selectAll());
		}
		return null;
	}

	// 后台获取数据
	@RequestMapping(value = "/getJson", method = RequestMethod.POST)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("info") String info) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "CommercialServiceExport":
			pageInfo = commercialServiceExportService.getPageInfo(pn);
			break;
		case "CommercialServiceImport":
			pageInfo = commercialServiceImportService.getPageInfo(pn);
			break;
		case "ExportsByCommodityGroups":
			pageInfo = exportsByCommodityGroupsService.getPageInfo(pn);
			break;
		case "GoodsAndServices":
			pageInfo = goodsAndServicesService.getPageInfo(pn);
			break;
		case "ImportsByCommodityGroups":
			pageInfo = importsByCommodityGroupsService.getPageInfo(pn);
			break;
		case "MerchandiseExports":
			pageInfo = merchandiseExportsService.getPageInfo(pn);
			break;
		case "MerchandiseImports":
			pageInfo = merchandiseImportsService.getPageInfo(pn);
			break;
		case "MerchandiseImportsAndExports":
			pageInfo = merchandiseImportsAndExportsService.getPageInfo(pn);
			break;
		default:
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}
}
