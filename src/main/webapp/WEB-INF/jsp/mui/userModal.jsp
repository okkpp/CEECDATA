<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link href="${pageContext.request.contextPath}/MUI/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/MUI/js/bootstrap.min.js"></script>
<script type="text/javascript">
function showModal(ele){
	console.log(ele);
	$("#updateModal").modal({
		backdrop : "static"
	});
}
</script>
</head>
<body>
	<!-- 修改模态框 -->
	<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title">修改</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal" id="update_form">
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="update_btn">更新</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>