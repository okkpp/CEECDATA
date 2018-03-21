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
				Field[] fields = c.getDeclaredFields();
				boolean existCountry = false;
				boolean existYear = false;
				int fieldCount = 0;
				List<String> fieldName = new ArrayList<>();
				for(Field f : fields) {
					switch(f.getName()) {
					case "year": existYear = true;break;
					case "country": existCountry = true;
					case "serialVersionUID":
					case "id":
					case "sort":
					case "updated":break;
						default : fieldName.add(f.getName());fieldCount++;
					}
				}
				//System.out.println(existYear+"/"+existCountry+"/"+fields.length+"/"+dataCount+"/"+dataName.size());
				List<String> yearList = new ArrayList<>();
				if(existCountry) {
					//获取country属性
					Field field = c.getDeclaredField("country");
					field.setAccessible(true);
					//遍历数组
					for(E ele : list) {
						String key = field.get(ele).toString();
						if(map.containsKey(key)) {
							List<E> l = (List<E>) map.get(key);
							l.add(ele);
							map.put(key, l);
						}else {
							List<E> l = new ArrayList<E>();
							l.add(ele);
							map.put(key, l);
						}
						if(existYear) {
							Field yearF = c.getDeclaredField("year");
							yearF.setAccessible(true);
							yearList.add(yearF.get(ele).toString());
						}
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
				res.put("maxLength", maxLength);
				res.put("countryCount", countryCount);
				res.put("existYear", existYear);
				if(existYear) {
					res.put("yearList", yearList);
				}
				res.put("fieldName", fieldName);
				res.put("fieldCount", fieldCount);
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
