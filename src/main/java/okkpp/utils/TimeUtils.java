package okkpp.utils;

import java.sql.Timestamp;

public class TimeUtils {
	public static Timestamp getCurrentTime() {
		java.util.Date date = new java.util.Date(); // ��ȡһ��Date����
		Timestamp timeStamp = new Timestamp(date.getTime());
		return timeStamp;
	}
}
