<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create a new table</title>
</head>
<body>

	<form id="form" action="${pageContext.request.contextPath}/tableCatalog/create/newTable.do" method="post">
		<input type="button" onclick="appendHTML()" value="添加"><input type="submit"/>
		<table>
		<thead><tr><th>字段名称</th></tr></thead>
		<tbody id="tabBody">
		<tr><td>国家代码:<input name="countryCode" value="国家代码"/></td></tr>
		<tr><td>年份:<input name="year" value="年份"/></td></tr>
		<tr><td>排序编号:<input name="sort" value="排序编号"/></td></tr>
		<tr><td>更新时间:<input name="updated" value="更新时间"/></td></tr>
		</tbody>
		</table>
	</form>
	<script type="text/javascript">
	var n=1;
	function appendHTML(){
		var tr=document.createElement("TR");
		var td=document.createElement("TD");td.innerHTML="field"+n+":";
		var input=document.createElement("INPUT");input.setAttribute("name","field"+n);
		td.appendChild(input);
		tr.appendChild(td);
		n++;
		document.getElementById("tabBody").appendChild(tr);
	}
	</script>
</body>
</html>