package okkpp.base.controller;

import org.springframework.beans.factory.annotation.Autowired;

import okkpp.base.service.BaseService;

/**
* @author duck
* @date ����ʱ�䣺2018��3��23�� ����5:24:50
*/
public abstract class BaseController<T> {

	@Autowired
	BaseService<T> service;
	
//	@RequestMapping(value = "/save")
//	@ResponseBody
//	public Result save(@ModelAttribute T t) {
//		Result result = new Result();
//		try {
//			baseService.save(t);
//		} catch (Exception e) {
//			result.setSuccess(false);
//			result.setMsg(e.getMessage());
//		}
//		return result;
//	}
//	
//	@RequestMapping(value = "/update")
//	@ResponseBody
//	public Result update(@ModelAttribute T t) {
//		Result result = new Result();
//		try {
//			baseService.update(t);
//		} catch (Exception e) {
//			result.setSuccess(false);
//			result.setMsg(e.getMessage());
//		}
//		return result;
//	}
//	
//	@RequestMapping(value = "/delete")
//	@ResponseBody
//	public Result deleteResource(@RequestParam int id) {
//		Result result = new Result();
//		try {
//			baseService.delete(id);
//		} catch (Exception e) {
//			result.setSuccess(false);
//			result.setMsg(e.getMessage());
//		}
//		return result;
//	}
}
