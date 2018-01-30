<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>${GJ}_宁波中东欧国家合作研究院</title>
		
		<link rel="stylesheet" href="css/main.css" />

	</head>
	<body>
	${count}
	<c:forEach items="${content}" var="c">
	<br><a href="${c.LJ}?GJDM=${c.GJDM}">${c.GJ}${c.LB}</a>
	</c:forEach>
<br><br><br>
<p style="color:red">导入模板下载</p>
<a href="导入模板/国土面积-导入模板.xlsx">国土面积-导入模板.xlsx</a>||
<a href="导入模板/宏观经济-导入模板.xlsx">宏观经济-导入模板.xlsx</a>||
<a href="导入模板/进出口-导入模板.xlsx">进出口-导入模板.xlsx</a>||
<a href="导入模板/经济自由度指数-导入模板.xlsx">经济自由度指数-导入模板.xlsx</a>||
<a href="导入模板/贸易情况-导入模板.xlsx">贸易情况-导入模板.xlsx</a>||
<a href="导入模板/社会环境-导入模板.xlsx">社会环境-导入模板.xlsx</a>||
<a href="导入模板/物流绩效指数-导入模板.xlsx">物流绩效指数-导入模板.xlsx</a>||
<a href="导入模板/营商环境-导入模板.xlsx">营商环境-导入模板.xlsx</a><br>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/main.js"></script>
	</body>
</html>