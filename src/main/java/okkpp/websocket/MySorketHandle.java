package okkpp.websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.google.gson.Gson;

import okkpp.system.model.User;

/**
 * @author duck
 * @date 创建时间：2018年4月16日 下午3:51:36
 */
public class MySorketHandle extends TextWebSocketHandler {

	// 线上人数
	private static int count;
	//线程安全CopyOnWriteArraySet
	private static CopyOnWriteArraySet<WebSocketSession> set = new CopyOnWriteArraySet<>();

	@Override
	public void afterConnectionEstablished(WebSocketSession session) {
		for(WebSocketSession ssion : set) {
			User join = getUserBySession(session);
			if(join.equals(getUserBySession(ssion))) {
				try {
					ssion.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				continue;
			}
		}
		try {
			set.add(session);
			systemPush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		MySorketHandle.addOnlineCount();
	}
	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) {
		set.remove(session);
		systemPush();
		subOnlineCount();
	}
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) {
		Message msg = new Message(message.getPayload().toString());
		System.out.println("收到消息:"+message.getPayload().toString());
		if(msg.getSendTo()==-1) {
			sendToAll(msg.getSendFrom(),message);
		}else {
			sendTo(msg.getSendTo(), message);
		}
		
	}
	private void systemPush() {
		Message msg = new Message();
		msg.setSendFrom(-1);
		msg.setSendTo(-1);
		List<Map<String, Object>> users = new ArrayList<>();
		for (WebSocketSession ssion : set) {
			Map<String, Object> c = new HashMap<>();
			User user = getUserBySession(ssion);
			c.put("id", user.getId());
			c.put("username", user.getUsername());
			users.add(c);
		}
		msg.setContent(new Gson().toJson(users));
		sendToAll(msg.getSendFrom(),new TextMessage(msg.toJson()));
	}
	private void sendToAll(Integer id,WebSocketMessage<?> message) {
		for (WebSocketSession ssion : set) {
			if(id.equals(getUserId(ssion)))continue;
			try {
				ssion.sendMessage(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private void sendTo(Integer id,WebSocketMessage<?> message) {
		for (WebSocketSession ssion : set) {
			if(id.equals(getUserId(ssion))) {
				try {
					ssion.sendMessage(message);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	private Integer getUserId(WebSocketSession session) {
		if(session.getAttributes().containsKey("USER")) {
			User user = (User)(session.getAttributes().get("USER"));
			return user.getId();
		}
		return -1;
	}
	private User getUserBySession(WebSocketSession session) {
		if(session.getAttributes().containsKey("USER")) {
			User user = (User)(session.getAttributes().get("USER"));
			return user;
		}
		return null;
	}
	public static int getOnlineCount() {
		return count;
	}

	public static void addOnlineCount() {
		count++;
	}

	public static void subOnlineCount() {
		count--;
	}
}
