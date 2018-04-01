package okkpp.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;

import okkpp.service.trade.*;
import okkpp.utils.ChartInfo;
import okkpp.utils.CountryCode;
import okkpp.utils.TimeUtils;
import okkpp.base.Msg;
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
	@RequestMapping(value = "/getJson", method = RequestMethod.GET)
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
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 后台按条件查找
	@RequestMapping(value = "/getJsonByCondition/{info}", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "CommercialServiceExport":
			pageInfo = commercialServiceExportService.getPageInfoByCondition(pn, column, condition);
			break;
		case "CommercialServiceImport":
			pageInfo = commercialServiceImportService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ExportsByCommodityGroups":
			pageInfo = exportsByCommodityGroupsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "GoodsAndServices":
			pageInfo = goodsAndServicesService.getPageInfoByCondition(pn, column, condition);
			break;
		case "ImportsByCommodityGroups":
			pageInfo = importsByCommodityGroupsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "MerchandiseExports":
			pageInfo = merchandiseExportsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "MerchandiseImports":
			pageInfo = merchandiseImportsService.getPageInfoByCondition(pn, column, condition);
			break;
		case "MerchandiseImportsAndExports":
			pageInfo = merchandiseImportsAndExportsService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 更新方法
	@RequestMapping(value = "update/{info}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg update(@PathVariable("info") String info, @RequestParam("json") String json) {
		int result = 0;
		switch (info) {
		case "CommercialServiceExport":
			CommercialServiceExport commercialServiceExport = (CommercialServiceExport) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, CommercialServiceExport.class));
			commercialServiceExport.setUpdated(TimeUtils.getCurrentTime());
			result = commercialServiceExportService.updateCommercialServiceExport(commercialServiceExport);
			break;
		case "CommercialServiceImport":
			CommercialServiceImport commercialServiceImport = (CommercialServiceImport) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, CommercialServiceImport.class));
			commercialServiceImport.setUpdated(TimeUtils.getCurrentTime());
			result = commercialServiceImportService.updateCommercialServiceImport(commercialServiceImport);
			break;
		case "ExportsByCommodityGroups":
			ExportsByCommodityGroups exportsByCommodityGroups = (ExportsByCommodityGroups) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, ExportsByCommodityGroups.class));
			exportsByCommodityGroups.setUpdated(TimeUtils.getCurrentTime());
			result = exportsByCommodityGroupsService.updateExportsByCommodityGroups(exportsByCommodityGroups);
			break;
		case "GoodsAndServices":
			GoodsAndServices goodsAndServices = (GoodsAndServices) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, GoodsAndServices.class));
			goodsAndServices.setUpdated(TimeUtils.getCurrentTime());
			result = goodsAndServicesService.updateGoodsAndServices(goodsAndServices);
			break;
		case "ImportsByCommodityGroups":
			ImportsByCommodityGroups importsByCommodityGroups = (ImportsByCommodityGroups) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, ImportsByCommodityGroups.class));
			importsByCommodityGroups.setUpdated(TimeUtils.getCurrentTime());
			result = importsByCommodityGroupsService.updateImportsByCommodityGroups(importsByCommodityGroups);
			break;
		case "MerchandiseExports":
			MerchandiseExports merchandiseExports = (MerchandiseExports) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, MerchandiseExports.class));
			merchandiseExports.setUpdated(TimeUtils.getCurrentTime());
			result = merchandiseExportsService.updateMerchandiseExports(merchandiseExports);
			break;
		case "MerchandiseImports":
			MerchandiseImports merchandiseImports = (MerchandiseImports) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, MerchandiseImports.class));
			merchandiseImports.setUpdated(TimeUtils.getCurrentTime());
			result = merchandiseImportsService.updateMerchandiseImports(merchandiseImports);
			break;
		case "MerchandiseImportsAndExports":
			MerchandiseImportsAndExports merchandiseImportsAndExports = (MerchandiseImportsAndExports) CountryCode
					.replaceCountrySingle(new Gson().fromJson(json, MerchandiseImportsAndExports.class));
			merchandiseImportsAndExports.setUpdated(TimeUtils.getCurrentTime());
			result = merchandiseImportsAndExportsService
					.updateMerchandiseImportsAndExports(merchandiseImportsAndExports);
			break;
		}
		if (result == 1) {
			return Msg.success();
		}
		return Msg.fail();
	}

	// 添加方法
	@RequestMapping(value = "add/{info}", method = RequestMethod.POST)
	@ResponseBody
	public Msg add(@PathVariable("info") String info, @PathVariable("id") Integer id,
			@RequestParam("json") String json) {
		int result = 0;
		switch (info) {
		case "CommercialServiceExport":
			CommercialServiceExport commercialServiceExport = new Gson().fromJson(json, CommercialServiceExport.class);
			commercialServiceExport.setUpdated(TimeUtils.getCurrentTime());
			result = commercialServiceExportService.insertCommercialServiceExport(commercialServiceExport);
			break;
		case "CommercialServiceImport":
			CommercialServiceImport commercialServiceImport = new Gson().fromJson(json, CommercialServiceImport.class);
			commercialServiceImport.setUpdated(TimeUtils.getCurrentTime());
			result = commercialServiceImportService.insertCommercialServiceImport(commercialServiceImport);
			break;
		case "ExportsByCommodityGroups":
			ExportsByCommodityGroups exportsByCommodityGroups = new Gson().fromJson(json,
					ExportsByCommodityGroups.class);
			exportsByCommodityGroups.setUpdated(TimeUtils.getCurrentTime());
			result = exportsByCommodityGroupsService.insertExportsByCommodityGroups(exportsByCommodityGroups);
			break;
		case "GoodsAndServices":
			GoodsAndServices goodsAndServices = new Gson().fromJson(json, GoodsAndServices.class);
			goodsAndServices.setUpdated(TimeUtils.getCurrentTime());
			result = goodsAndServicesService.insertGoodsAndServices(goodsAndServices);
			break;
		case "ImportsByCommodityGroups":
			ImportsByCommodityGroups importsByCommodityGroups = new Gson().fromJson(json,
					ImportsByCommodityGroups.class);
			importsByCommodityGroups.setUpdated(TimeUtils.getCurrentTime());
			result = importsByCommodityGroupsService.insertImportsByCommodityGroups(importsByCommodityGroups);
			break;
		case "MerchandiseExports":
			MerchandiseExports merchandiseExports = new Gson().fromJson(json, MerchandiseExports.class);
			merchandiseExports.setUpdated(TimeUtils.getCurrentTime());
			result = merchandiseExportsService.insertImportsByCommodityGroups(merchandiseExports);
			break;
		case "MerchandiseImports":
			MerchandiseImports merchandiseImports = new Gson().fromJson(json, MerchandiseImports.class);
			merchandiseImports.setUpdated(TimeUtils.getCurrentTime());
			result = merchandiseImportsService.insertMerchandiseImports(merchandiseImports);
			break;
		case "MerchandiseImportsAndExports":
			MerchandiseImportsAndExports merchandiseImportsAndExports = new Gson().fromJson(json,
					MerchandiseImportsAndExports.class);
			merchandiseImportsAndExports.setUpdated(TimeUtils.getCurrentTime());
			result = merchandiseImportsAndExportsService
					.insertMerchandiseImportsAndExports(merchandiseImportsAndExports);
			break;
		}
		if (result == 1) {
			return Msg.success();
		}
		return Msg.fail();
	}

	// 删除方法
	@RequestMapping(value = "delete/{info}/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg delete(@PathVariable("info") String info, @PathVariable("id") Integer id) {
		int result = 0;
		switch (info) {
		case "CommercialServiceExport":
			result = commercialServiceExportService.deleteCommercialServiceExport(id);
			break;
		case "CommercialServiceImport":
			result = commercialServiceImportService.deleteCommercialServiceImport(id);
			break;
		case "ExportsByCommodityGroups":
			result = exportsByCommodityGroupsService.deleteExportsByCommodityGroups(id);
			break;
		case "GoodsAndServices":
			result = goodsAndServicesService.deleteGoodsAndServices(id);
			break;
		case "ImportsByCommodityGroups":
			result = importsByCommodityGroupsService.deleteImportsByCommodityGroups(id);
			break;
		case "MerchandiseExports":
			result = merchandiseExportsService.deleteMerchandiseExports(id);
			break;
		case "MerchandiseImports":
			result = merchandiseImportsService.deleteMerchandiseImports(id);
			break;
		case "MerchandiseImportsAndExports":
			result = merchandiseImportsAndExportsService.deleteMerchandiseImportsAndExports(id);
			break;
		}
		if (result == 1) {
			return Msg.success();
		}
		return Msg.fail();
	}
}
