package okkpp.junit;

import com.google.gson.Gson;

import okkpp.websocket.Message;

/**
* @author duck
* @date 创建时间：2018年4月4日 上午10:13:48
*/
public class JTest {

	public static void main(String[] args) {
		Message msg = new Message();
		msg.setContent("qweqwe");
		msg.setSendTo(-1);
		System.out.println(new Gson().toJson(msg));
	}


}
