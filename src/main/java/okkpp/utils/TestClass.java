package okkpp.utils;

public class TestClass {
	public static void main(String[] args) {
		String str = "GDP";
		String str2 = "gDP";
		System.out.println("GDP : " + str.substring(0,1));
		System.out.println("gDP : " + str2.substring(0,1));
		System.out.println(str.substring(0,1).equals(str2.substring(0,1)));
		System.out.println(str.substring(0,1).equals(str2.substring(0,1).toUpperCase()));
	}
}
