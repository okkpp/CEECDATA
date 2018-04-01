package okkpp.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okkpp.model.price.Consumer;

public class FormatUtil {

	public static void main(String[] args) {
		Consumer consumer = new Consumer();
		System.out.println(haveNull(consumer));
	}

	public static boolean haveNull(Object object) {
		List<String> list = null;
		try {
			list = getModelAttriButeType(object);
			for (int i = 0; i < list.size(); i++) {					
				if (!list.get(i).equals("serialVersionUID"))
					if (getFieldValueByName(list.get(i), object) == null) {
						return true;
					}
			}
			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
	}

	public static List<String> getModelAttriButeType(Object model) throws Exception {
		Field[] field = model.getClass().getDeclaredFields(); // ��ȡʵ������������ԣ�����Field����
		List<String> list = new ArrayList<>();
		for (int j = 0; j < field.length; j++) { // ������������
			String name = field[j].getName(); // ��ȡ���Ե�����
			list.add(name);
		}
		return list;
	}

	/**
	 * ������������ȡ����ֵ
	 */
	public static Object getFieldValueByName(String fieldName, Object o) {
		try {
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getter = "get" + firstLetter + fieldName.substring(1);
			Method method = o.getClass().getMethod(getter, new Class[] {});
			Object value = method.invoke(o, new Object[] {});
			return value;
		} catch (Exception e) {
			System.out.println("getFieldValueByName fail :" + e.getMessage());
			return null;
		}
	}

}
