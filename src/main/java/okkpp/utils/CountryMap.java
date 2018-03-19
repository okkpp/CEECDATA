package okkpp.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

/**
* @author duck
* @date 创建时间：2018年3月19日 下午4:01:09
*/
public class CountryMap {
	
	public static <E> Map<String, List<E>> mapByCountry(List<E> list) {
		Map<String, List<E>> map = new HashMap<String, List<E>>();
		try {
			if(!list.isEmpty()) {
				Class<?> c = list.get(0).getClass();
				//获取country属性
				Field field = c.getDeclaredField("country");
				field.setAccessible(true);
				//遍历数组
				for(E ele : list) {
					String key = field.get(ele).toString();
					if(map.containsKey(key)) {
						List<E> l = map.get(key);
						l.add(ele);
						map.replace(key, l);
					}else {
						List<E> l = new ArrayList<E>();
						l.add(ele);
						map.put(key, l);
					}
				}
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return map;
	}

	public static <E> String mapByCountryToJson(List<E> list) {
		return new Gson().toJson(mapByCountry(list));
	}
}
