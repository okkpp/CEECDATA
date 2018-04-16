<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>websocket</title>
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
</head>
<body>
       welcome<br />  
       <input id="text" type="text" onchange="sendMsg()"/>  
       <button onclick="sendMsg()">sendMsg</button>  
       <hr/>  
       <button onclick="closeWebSocket()">close WebSocketconnection</button>  
       <hr/>  
       <div id="message"></div>  
    </body>  
     
    <script type="text/javascript">  
       var websocket = null;  
       //判断浏览器是否支持websocket  
       if('WebSocket' in window) {
           websocket = new WebSocket("ws://<%
        	       String path = request.getContextPath();
        	       String basePath = request.getServerName()+":"+request.getServerPort()+path+"/";
        	       out.write(basePath);
        	       %>/hello.do");
       }else{  
           $("#message").html("该浏览器不支持实时通信功能");  
       }
       
       websocket.onopen= function() {  
           console.log("websocket连接成功");  
       }  
        
       websocket.onclose= function() {  
           console.log("websocket连接关闭");  
       }  
        
       websocket.onmessage= function(event) {  
           console.log("接收消息");  
           console.log(event);  
           printMsg(event.data);  
       }  
        
       //打印消息  
       function printMsg(msg) {  
           $("#message").append(msg+ "<br/>");  
       }  
        
       function sendMsg() {  
           var msg = $("#text").val();
           $("#text").val("");
           websocket.send(msg);  
       }  
        
       function closeWebSocket(){  
           websocket.close();  
       }  
    </script> 
</body>
</html>