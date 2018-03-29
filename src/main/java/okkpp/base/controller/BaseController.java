package okkpp.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import okkpp.base.service.BaseService;
import okkpp.system.vo.Result;

/**
* @author duck
* @date 创建时间：2018年3月23日 下午5:24:50
*/
public abstract class BaseController<T> {

	@Autowired
	protected BaseService<T> baseService;
	
	@RequestMapping(value = "/save")
	@ResponseBody
	public Result save(@ModelAttribute T t) {
		Result result = new Result();
		try {
			baseService.save(t);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		return result;
	}
	
	@RequestMapping(value = "/update")
	@ResponseBody
	public Result update(@ModelAttribute T t) {
		Result result = new Result();
		try {
			baseService.update(t);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		return result;
	}
	
	@RequestMapping(value = "/delete")
	@ResponseBody
	public Result deleteResource(@RequestParam int id) {
		Result result = new Result();
		try {
			baseService.delete(id);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMsg(e.getMessage());
		}
		return result;
	}
}
