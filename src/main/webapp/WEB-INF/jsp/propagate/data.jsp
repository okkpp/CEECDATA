<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert data</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/MUI/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/MUI/css/admin.css">
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/pintuer.js"></script>
</head>
<body>
<button onclick="window.location.href='${pageContext.request.contextPath}/tableCatalog/add/${catalog.id}.do'">添加数据</button>
		<table>
		<thead id="tabHead"></thead>
		<tbody id="tabBody">
		</tbody>
		</table>

	<script type="text/javascript">
	var fields = ${catalog.fields};
	function appendHead(){
		var tr=document.createElement("TR");
		
		for(index in fields){
			var th=document.createElement("TH");th.innerHTML=fields[index];
			tr.appendChild(th);
		}
		document.getElementById("tabHead").appendChild(tr);
	}
	appendHead();
	$.ajax({
		type:"POST",
		data:{catalogId:${catalog.id}},
		url:"${pageContext.request.contextPath}/catalogData/list.do",
		success:function(data){
			data = eval('(' + data + ')');
			for(index in data){
				appendData(data[index].data);
			}
		}
	});
	function appendData(data){
		data = eval('(' + data + ')');
		var tr=document.createElement("TR");
		for(index in fields){
			var td=document.createElement("TD");td.innerHTML=data[fields[index]];
			tr.appendChild(td);
		}
		document.getElementById("tabBody").appendChild(tr);
	}
	</script>
</body>
</html>