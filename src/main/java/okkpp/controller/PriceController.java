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

import okkpp.base.Msg;
import okkpp.model.price.*;
import okkpp.service.price.*;
import okkpp.utils.ChartInfo;
import okkpp.utils.CountryCode;
import okkpp.utils.TimeUtils;

@Controller
@RequestMapping("/price")
public class PriceController {

	@Autowired
	ConsumerService consumerService;
	@Autowired
	ProducerService producerService;

	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> info(String info) {
		switch (info) {
		case "Consumer":
			return ChartInfo.mapByCountry(consumerService.selectAll());
		case "Producer":
			return ChartInfo.mapByCountry(producerService.selectAll());
		}
		return null;
	}

	// 后台获取所有数据
	@RequestMapping(value = "/getJson", method = RequestMethod.GET)
	@ResponseBody
	public <E> Msg getJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model,
			@RequestParam("info") String info) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "Consumer":
			pageInfo = consumerService.getPageInfo(pn);
			break;
		case "Producer":
			pageInfo = producerService.getPageInfo(pn);
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
	public <E> Msg getJsonByCondition(@PathVariable("info") String info,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam("column") String column,
			@RequestParam("condition") String condition) {
		PageInfo<E> pageInfo = null;
		switch (info) {
		case "Consumer":
			pageInfo = consumerService.getPageInfoByCondition(pn, column, condition);
			break;
		case "Producer":
			pageInfo = producerService.getPageInfoByCondition(pn, column, condition);
			break;
		}
		if (pageInfo.getList().isEmpty()) {
			return Msg.fail();
		}
		return Msg.success().add("pageInfo", pageInfo);
	}

	// 更新方法
	@RequestMapping(value = "update/{info}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg update(@PathVariable("info") String info,
			@RequestParam("json") String json) {
		int result = 0;
		switch (info) {
		case "Consumer":
			Consumer consumer = (Consumer) CountryCode.replaceCountrySingle(new Gson().fromJson(json, Consumer.class));
			consumer.setUpdated(TimeUtils.getCurrentTime());
			result = consumerService.updateConsumer(consumer);
			break;
		case "Producer":
			Producer producer = (Producer) CountryCode.replaceCountrySingle(new Gson().fromJson(json, Producer.class));
			producer.setUpdated(TimeUtils.getCurrentTime());
			result = producerService.updateConsumer(producer);
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
		case "Consumer":
			Consumer consumer = new Gson().fromJson(json, Consumer.class);
			consumer.setUpdated(TimeUtils.getCurrentTime());
			result = consumerService.insertConsumer(consumer);
			break;
		case "Producer":
			Producer producer = new Gson().fromJson(json, Producer.class);
			producer.setUpdated(TimeUtils.getCurrentTime());
			result = producerService.insertProducer(producer);
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
		case "Consumer":
			result = consumerService.deleteConsumer(id);
			break;
		case "Producer":
			result = producerService.deleteProducer(id);
			break;
		}
		if (result == 1) {
			return Msg.success();
		}
		return Msg.fail();
	}

	/*
	 * Gson gson = new Gson(); ArrayList<Consumer> list = new ArrayList<Consumer>();
	 * Type listType = new TypeToken<List<Consumer>>() {}.getType(); list =
	 * gson.fromJson(json, listType); System.out.println(list.get(0));
	 */

}
