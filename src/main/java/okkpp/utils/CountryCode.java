package okkpp.utils;

import java.lang.reflect.Field;
import java.util.List;

/**
* @author duck
* @date ����ʱ�䣺2018��3��6�� ����2:48:52
*/
public enum CountryCode {
	aebny("����������","The Republic of Albania"),
	asny("��ɳ����","Republic of Estonia"),
	bh("����","Bosnia and Herzegovina"),
	bjly("��������","The Republic of Bulgaria"),
	bl("����","The Republic of Poland"),
	hs("��ɽ","Montenegro"),
	jk("�ݿ�","The Czech Republic"),
	kldy("���޵���","The Republic of Croatia"),
	lmny("��������","Romania"),
	ltw("������","The Republic of Lithuania"),
	ltwy("����ά��","Republic of Latvia"),
	mqd("�����","The Republic of Macedonia"),
	sewy("����ά��","The Republic of Serbia"),
	slfk("˹�工��","The Slovak Republic"),
	slwny("˹��������","The Republic of Slovenia"),
	xyl("������","Hungary");
	
	String cn;
	String en;
	private CountryCode(String cn,String en) {
		this.cn=cn;
		this.en=en;
	}
	public static <E> List<E> replaceCountry(List<E> list) {
		try {
			if(!list.isEmpty()) {
				Class<?> c = list.get(0).getClass();
				//��ȡcountry���� ������Ϊ���޸�
				Field field = c.getDeclaredField("country");
				field.setAccessible(true);
				//�������� �滻������Ϣ
				for(E ele : list) {
					field.set(ele, CountryCode.valueOf(field.get(ele).toString()).cn);
				}
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
		return list;
	}
}
