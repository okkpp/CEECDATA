package okkpp.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
* @author duck
* @param <E>
* @date 创建时间：2018年3月6日 下午3:58:00
*/
public class ZDOList<E> extends ArrayList<E>{

	private static final long serialVersionUID = 1L;

	/*
	 * Class<?> c ---> .class
	 */
	public void replaceCountry(Class<?> c) {
		//List转数组
		Object[] arr = this.toArray();
		try {
			//获取country属性 并设置为可修改
			Field field = c.getDeclaredField("country");
			field.setAccessible(true);
			//遍历数组 替换国别信息
			for(Object o : arr) {
				field.set(o, CountryCode.valueOf(field.get(o).toString()).cn);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
