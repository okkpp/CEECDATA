<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert data</title>
</head>
<body>

	<form id="form" action="${pageContext.request.contextPath}/catalogData/saveData/${catalog.id}.do" method="post">
		<table>
		<thead><tr><th>添加数据</th></tr></thead>
		<tbody id="tabBody">
		</tbody>
		</table>
		<input type="submit"/>
	</form>
	<script type="text/javascript">
	var fields = ${catalog.fields};
	for(index in fields){
		console.log(fields[index]);
		appendHTML(fields[index]);
	}
	function appendHTML(field){
		var tr=document.createElement("TR");
		var td=document.createElement("TD");td.innerHTML=field+":";
		var input=document.createElement("INPUT");input.setAttribute("name",field);
		td.appendChild(input);
		tr.appendChild(td);
		document.getElementById("tabBody").appendChild(tr);
	}
	</script>
</body>
</html>