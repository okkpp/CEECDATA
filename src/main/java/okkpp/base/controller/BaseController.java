package okkpp.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.base.Msg;
import okkpp.base.service.BaseService;

/**
* @author duck
* @date 创建时间：2018年3月23日 下午5:24:50
*/
public abstract class BaseController<T> {

	@Autowired
	BaseService<T> baseService;
	
	@RequestMapping(value = "/save")
	@ResponseBody
	public Msg save(@ModelAttribute T t) {
		try {
			baseService.save(t);
		} catch (Exception e) {
			return Msg.fail().add("msg", e.getMessage());
		}
		return Msg.success();
	}
	
	@RequestMapping(value = "/update")
	@ResponseBody
	public Msg update(@ModelAttribute T t) {
		try {
			baseService.update(t);
		} catch (Exception e) {
			return Msg.fail().add("msg", e.getMessage());
		}
		return Msg.success();
	}
	
	@RequestMapping(value = "/delete")
	@ResponseBody
	public Msg deleteResource(@RequestParam int id) {
		try {
			baseService.delete(id);
		} catch (Exception e) {
			return Msg.fail().add("msg", e.getMessage());
		}
		return Msg.success();
	}
}
