package okkpp.utils;

import java.lang.reflect.Field;
import java.util.List;

/**
* @author duck
* @date 创建时间：2018年3月6日 下午2:48:52
*/
public enum CountryCode {
	aebny("阿尔巴尼亚","The Republic of Albania"),
	asny("爱沙尼亚","Republic of Estonia"),
	bh("波黑","Bosnia and Herzegovina"),
	bjly("保加利亚","The Republic of Bulgaria"),
	bl("波兰","The Republic of Poland"),
	hs("黑山","Montenegro"),
	jk("捷克","The Czech Republic"),
	kldy("克罗地亚","The Republic of Croatia"),
	lmny("罗马尼亚","Romania"),
	ltw("立陶宛","The Republic of Lithuania"),
	ltwy("拉脱维亚","Republic of Latvia"),
	mqd("马其顿","The Republic of Macedonia"),
	sewy("塞尔维亚","The Republic of Serbia"),
	slfk("斯洛伐克","The Slovak Republic"),
	slwny("斯洛文尼亚","The Republic of Slovenia"),
	xyl("匈牙利","Hungary");
	
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
				//获取country属性 并设置为可修改
				Field field = c.getDeclaredField("country");
				field.setAccessible(true);
				//遍历数组 替换国别信息
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
