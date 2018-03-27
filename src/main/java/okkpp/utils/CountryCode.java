package okkpp.utils;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author duck
 * @date 创建时间：2018年3月6日 下午2:48:52
 */
public enum CountryCode {
	aebny("阿尔巴尼亚", "The Republic of Albania"), 
	asny("爱沙尼亚", "Republic of Estonia"), 
	bh("波黑","Bosnia and Herzegovina"), 
	bjly("保加利亚", "The Republic of Bulgaria"), 
	bl("波兰", "The Republic of Poland"), 
	hs("黑山", "Montenegro"), 
	jk("捷克", "The Czech Republic"), 
	kldy("克罗地亚", "The Republic of Croatia"), 
	lmny("罗马尼亚", "Romania"), 
	ltw("立陶宛", "The Republic of Lithuania"), 
	ltwy("拉脱维亚","Republic of Latvia"), 
	mqd("马其顿", "The Republic of Macedonia"), 
	sewy("塞尔维亚","The Republic of Serbia"), 
	slfk("斯洛伐克", "The Slovak Republic"), 
	slwny("斯洛文尼亚", "The Republic of Slovenia"), 
	xyl("匈牙利", "Hungary"),
	阿尔巴尼亚("aebny", "The Republic of Albania"), 
	爱沙尼亚("asny", "Republic of Estonia"), 
	波黑("bh","Bosnia and Herzegovina"), 
	保加利亚("bjly", "The Republic of Bulgaria"), 
	波兰("bl", "The Republic of Poland"), 
	黑山("hs", "Montenegro"), 
	捷克("jk", "The Czech Republic"), 
	克罗地亚("kldy", "The Republic of Croatia"), 
	罗马尼亚("lmny", "Romania"), 
	立陶宛("ltw", "The Republic of Lithuania"), 
	拉脱维亚("ltwy","Republic of Latvia"), 
	马其顿("mqd", "The Republic of Macedonia"), 
	塞尔维亚("sewy","The Republic of Serbia"), 
	斯洛伐克("slfk", "The Slovak Republic"), 
	斯洛文尼亚("slwny", "The Republic of Slovenia"), 
	匈牙利("xyl", "Hungary");
	
	String cn;
	String en;

	private CountryCode(String cn, String en) {
		this.cn = cn;
		this.en = en;
	}

	public static boolean contains(String _name) {
		CountryCode[] countryCode = values();
		for (CountryCode c : countryCode) {
			if (c.name().equals(_name)) {
				return true;
			}
		}
		return false;
	}

	public static <E> List<E> replaceCountry(List<E> list) {
		try {
			if (!list.isEmpty()) {
				Class<?> c = list.get(0).getClass();
				// 获取country属性 并设置为可修改
				Field field = c.getDeclaredField("country");
				field.setAccessible(true);
				// 遍历数组 替换国别信息
				for (E ele : list) {
					String cc = field.get(ele).toString();
					if (contains(cc)) {
						field.set(ele, CountryCode.valueOf(cc).cn);
					}

				}
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Object replaceCountrySingle(Object object) {
		try {
			Class<?> c = object.getClass();
			// 获取country属性 并设置为可修改
			Field field = c.getDeclaredField("country");
			field.setAccessible(true);
			// 替换国别信息
			String cc = field.get(object).toString();
			if (contains(cc)) {
				field.set(object, CountryCode.valueOf(cc).cn);
			}
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return object;
	}
}
