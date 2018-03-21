package okkpp.utils;

import com.google.gson.Gson;

/**
* @author duck
* @date 创建时间：2018年3月19日 下午2:36:59
*/
public class ElFunctions {

	public static String toJsonString(Object obj) {
		return new Gson().toJson(obj);
	}
}
