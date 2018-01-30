<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>upload excel</title>
</head>
<body>
<a>${msg}</a>
<form action="<%=request.getContextPath() %>/upload/import.do" method="post" enctype="multipart/form-data">
         文件：<input type="file" name="uploadFile"/>
         <br></br>
         <input type="submit" value="导入"/>
         <input type="button" value="导出" onclick="exportFile()"/>
     </form> 
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
</body>
</html>