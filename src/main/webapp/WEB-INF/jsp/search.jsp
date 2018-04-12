<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/MUI/css/pintuer.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/MUI/css/admin.css" />
<link href="${pageContext.request.contextPath}/MUI/css/bootstrap.min.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/jquery-ui.min.js"></script>
<link href="${pageContext.request.contextPath}/MUI/css/jquery-ui.min.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath}/MUI/js/pintuer.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/javautils.js"></script>
</head>
<body>
	<input type="text" id="search_input" />
	<input type="button" value="搜索" id="search_btn" />
	<div id="search_result" style="height:200px;width:600px;background:#a1a1a1"/>


</body>

<script>
	$("#search_btn").click(function() {
		var str = "getContentByCondition.do?info="+$("#search_input").val();
		//document.getElementById("search_result").innerHTML = "asd";
		 $.ajax({
			url : str,
			type : "GET",
			success : function(result){
				$("<p></p>").append(result).appendTo("#search_result");
				//console.log(result);
			}
		})
	})
</script>
</html>