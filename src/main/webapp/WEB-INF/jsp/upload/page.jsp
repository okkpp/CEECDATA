<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload excel</title>
</head>
<body>
<a>${msg}</a>
<form action="${pageContext.request.contextPath}/upload/import.do" method="post" enctype="multipart/form-data">
         文件：<input type="file" name="uploadFile"/>
         <br></br>
         <input type="submit" value="导入"/>
         <input type="button" value="导出" onclick="exportFile()"/>
     </form> 
<br><br><br>
</body>
</html>