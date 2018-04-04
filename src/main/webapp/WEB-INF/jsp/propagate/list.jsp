<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list of table catalog</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/MUI/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/MUI/css/admin.css">
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/pintuer.js"></script>
</head>
<body>
<button onclick="window.location.href='${pageContext.request.contextPath}/tableCatalog/createCatalog.do'">添加表单</button>
		<table>
		<thead><tr><th>表名称</th><th>字段列表</th></tr></thead>
		<tbody id="tabBody">
		</tbody>
		</table>

	<script type="text/javascript">
	$.ajax({
		type:"POST",
		url:"${pageContext.request.contextPath}/tableCatalog/list.do",
		success:function(data){
			data = eval('(' + data + ')');
			for(index in data){
				appendHTML(data[index]);
			}
		}
	})
	var n=1;
	function appendHTML(obj){
		var tr=document.createElement("TR");tr.setAttribute("id",obj.id);
		tr.setAttribute("onclick","openTab("+obj.id+")");
		var td1=document.createElement("TD");td1.innerHTML=obj.tableName;
		var td2=document.createElement("TD");
		td2.appendChild(createUL(eval('(' + obj.fields + ')')));
		
		tr.appendChild(td1);
		tr.appendChild(td2);
		document.getElementById("tabBody").appendChild(tr);
	}
	function createUL(obj){
		var ul=document.createElement("UL");
		for(key in obj){
			var li=document.createElement("LI");
			li.innerHTML=obj[key]+":"+key;
			ul.appendChild(li);
		}
		return ul;
	}
	function openTab(id){
		window.location.href="${pageContext.request.contextPath}/tableCatalog/render/"+id+".do"
	}
	</script>
</body>
</html>