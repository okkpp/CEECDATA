package okkpp.utils;

import com.google.gson.Gson;

/**
* @author duck
* @date ����ʱ�䣺2018��3��19�� ����2:36:59
*/
public class ElFunctions {

	public static String toJsonString(Object obj) {
		return new Gson().toJson(obj);
	}
}
