package okkpp.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;

/**
* @author duck
* @date 创建时间：2018年3月19日 下午4:01:09
*/
public class CountryMap {
	
	@SuppressWarnings("unchecked")
	public static <E> Map<String, Object> mapByCountry(List<E> list) {
		Map<String, Object> res = new HashMap<String, Object>();
		Map<String, Object> map = new HashMap<String, Object>();
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
						List<E> l = (List<E>) map.get(key);
						l.add(ele);
						map.replace(key, l);
					}else {
						List<E> l = new ArrayList<E>();
						l.add(ele);
						map.put(key, l);
					}
				}
				int maxLength = 0;
				int countryCount = 0;
				for(String key : map.keySet()) {
					countryCount++;
					int i = ((List<E>) map.get(key)).size();
					maxLength = maxLength >= i ? maxLength : i;
				}
				res.put("countries", map);
				res.put("_maxLength", maxLength);
				res.put("_countryCount", countryCount);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return res;
	}

	public static <E> String mapByCountryToJson(List<E> list) {
		return new Gson().toJson(mapByCountry(list));
	}
	
	public static <E> PageInfo<E> mapByCountryWithPageInfo(int page,int pageSize,List<E> list) {
		PageHelper.startPage(page, pageSize);
		PageInfo<E> pi = new PageInfo<E>(list);
		
		Map<String, Object> map = mapByCountry(pi.getList());
		map.put("_endRow", pi.getEndRow());
		return pi;
	}
}
