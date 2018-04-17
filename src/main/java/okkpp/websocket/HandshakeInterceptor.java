package okkpp.websocket;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
* @author duck
* @date ����ʱ�䣺2018��4��16�� ����3:52:11
*/
public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {

	@Override  
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler,  
           Map<String,Object> map)throws Exception {  
       System.out.println("����ǰ");  
       return super.beforeHandshake(request, response, handler, map);  
    }  
     
    @Override  
    public void afterHandshake(ServerHttpRequest request,ServerHttpResponse response,WebSocketHandler wsHandler,Exception ex) {  
       super.afterHandshake(request, response, wsHandler, ex);  
    }
}
