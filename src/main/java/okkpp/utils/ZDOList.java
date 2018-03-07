package okkpp.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
* @author duck
* @param <E>
* @date ����ʱ�䣺2018��3��6�� ����3:58:00
*/
public class ZDOList<E> extends ArrayList<E>{

	private static final long serialVersionUID = 1L;

	/*
	 * Class<?> c ---> .class
	 */
	public void replaceCountry(Class<?> c) {
		//Listת����
		Object[] arr = this.toArray();
		try {
			//��ȡcountry���� ������Ϊ���޸�
			Field field = c.getDeclaredField("country");
			field.setAccessible(true);
			//�������� �滻������Ϣ
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
