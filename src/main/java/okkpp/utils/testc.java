package okkpp.utils;
/**
* @author duck
* @date ����ʱ�䣺2018��3��12�� ����2:02:45
*/
public class testc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "t_testc_abc_bcd";

		System.out.println(str.split("_")[2]);
		System.out.println(str.substring(str.indexOf("_",2)+1));
	}

}
