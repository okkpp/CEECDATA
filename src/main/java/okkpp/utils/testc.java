package okkpp.utils;

import java.util.Scanner;

/**
* @author duck
* @date 创建时间：2018年3月12日 下午2:02:45
*/
public class testc {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "t_testc_abc_bcd";

		Scanner s = new Scanner(System.in);
		System.out.println(str.split("_")[2]);
		System.out.println(str.substring(str.indexOf("_",2)+1));
	}

}
