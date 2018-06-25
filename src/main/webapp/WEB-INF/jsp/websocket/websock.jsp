<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>websocket</title>
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
</head>
<body>
	<br />
	<select id="sendTo"><option value="-1">所有人</option></select>
	<input id="text" type="text" onchange="sendMsg()" />
	<hr />
	<button onclick="openWebSocket()">重连</button><button onclick="closeWebSocket()">退出</button>
	<hr />
	<div id="message"></div>
</body>

<script type="text/javascript">
	var websocket = null;
	function openWebSocket(){
		//判断浏览器是否支持websocket
		if ('WebSocket' in window) {
			websocket = new WebSocket("ws://${BASE_PATH}/hello.do");
		} else {
			$("#message").html("该浏览器不支持实时通信功能");
		}

		websocket.onopen = function() {
			$("#message").append("连接成功" + "<br/>");
			console.log("websocket连接成功");
		}

		websocket.onclose = function() {
			$("#message").append("连接关闭" + "<br/>");
			console.log("websocket连接关闭");
		}

		websocket.onmessage = function(event) {
			console.log("接收消息");
			console.log(event);
			resolveMsg(event.data);
		}
	}
	openWebSocket();
	var userlist;
	//打印消息  
	function resolveMsg(msg) {
		msg = eval('(' + msg + ')');
		if (msg.sendFrom == -1) {
			userlist = eval('(' + msg.content + ')');
			refreshList(userlist);
		} else {
			printMsg(msg.content);
		}
	}
	function refreshList(userlist){
		var option = "<option value=\"-1\">所有人</option>";
		for(i in userlist){
			if(${USER.id}==userlist[i].id)continue;
			option += "<option value=\""+userlist[i].id+"\">"+userlist[i].username+"</option>";
		}
		$("#sendTo").html("");
		$("#sendTo").append(option);
	}
	function printMsg(msg){
		$("#message").append(msg + "<br/>");
	}
	function sendMsg() {
		var msg = $("#text").val();
		$("#text").val("");
		if(websocket == null){
			msg+="(发送失败！)";
		}
		printMsg(msg);
		websocket.send('{"sendTo":' + $("#sendTo").val()
				+ ',"sendFrom":${USER.id},"content":"' + msg + '"}');
	}

	function closeWebSocket() {
		websocket.close();
		websocket = null;
	}
</script>
</body>
</html>