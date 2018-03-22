package okkpp.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import okkpp.model.culture.AdultLiteracyRate;
import okkpp.system.model.User;

/**
* @author duck
* @date 创建时间：2018年3月12日 下午2:02:45
*/
public class testc {
//	id
//	country
//	year
//	total
//	male
//	female
//	sort
//	updated
//	serialVersionUID
	
	public static void main(String[] args) {

//		Field[] fields = User.class.getDeclaredFields();
//		boolean existCountry = false;
//		boolean existYear = false;
//		int dataCount = 0;
//		List<String> dataName = new ArrayList<>();
//		for(Field f : fields) {
//			switch(f.getName()) {
//			case "year": existYear = true;break;
//			case "country": existYear = true;
//			case "serialVersionUID":
//			case "id":
//			case "sort":
//			case "updated":break;
//				default : dataName.add(f.getName());dataCount++;
//			}
//			System.out.println(f.getName());
//		}
//		System.out.println(existYear+"/"+existCountry+"/"+fields.length+"/"+dataCount+"/"+dataName.size());
		List<AdultLiteracyRate> list = new ArrayList<>();
		for(int i=0;i<5;i++) {
			AdultLiteracyRate a = new AdultLiteracyRate();
			a.setCountry("country"+i);
			a.setYear("201");
			list.add(a);
		}
		System.out.println(new Gson().toJson(ChartInfo.mapByCountryToJson(list)));
	}

}
