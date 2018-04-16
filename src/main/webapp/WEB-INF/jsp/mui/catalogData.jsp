<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/MUI/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/MUI/css/admin.css">
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/pintuer.js"></script>
</head>
<body>
	<form method="post" action="">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder">表单管理</strong>
				<a href="javascript:;" onClick="javascript:history.back(-1);">返回上一页</a>
			</div>
			<div class="padding border-bottom">
				<ul class="search">
					<li>
						<button type="button" class="button border-green" id="checkall">
							<span class="icon-check"></span> 全选
						</button>
						<button type="submit" class="button border-red">
							<span class="icon-trash-o"></span> 批量删除
						</button>
						<strong id="title"></strong>
					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<thead id="thead">
				</thead>
				<tbody id="tbody">
				</tbody>
				<!-- <tfoot>
					<tr>
						<td colspan="8">
						<div id="pageFoot" class="pagelist">
								<a onclick="loadData(1)">上一页</a> 
								<span class="current">1</span>
								<a onclick="loadData(2)">2</a>
								<a onclick="loadData(3)">3</a>
								<a onclick="loadData(2)">下一页</a>
								<a onclick="loadData(pages)">尾页</a>
						</div>
						</td>
					</tr>
				</tfoot> -->
			</table>
		</div>
	</form>
	<script type="text/javascript">
	var pageNum = 1;
	var isFirstPage,isLastPage;
	var pageSize = 10;
	var pages;
loadInfo();
function loadInfo(){
	$.ajax({
		type:'POST',
		data:{id:${param.id}},
		url:'${pageContext.request.contextPath}/tableCatalog/getInfo.do',
		success:function(data){
			data = eval('('+data+')');
			$("#title").html(data.tableName);
			fields = eval('('+data.fields+')');
			appendThead(fields);
			loadData();
		}
	});
}
function appendThead(fields){
	var thead = "";
	thead += "<tr>";
	var length = Object.keys(fields).length;
	for(i=0;i<length;i++){
		thead += "<th>"+fields["field"+i]+"</th>";
	}
	thead += "</tr>";
	$("#thead").html("");
	$("#thead").append(thead);
}
function loadData(){
	$.ajax({
		type:'POST',
		data:{infoId:${param.id}},
		url:'${pageContext.request.contextPath}/catalogData/list.do',
		success:function(data){
			data = eval('('+data+')');
			appendData(data)
			/* pageNum = data.pageNum;
			isFirstPage = data.isFirstPage;
			isLastPage = data.isLastPage;
			pages = data.pages;
			appendData(data.list);
			refreshFoot(); */
		}
	});
}
function appendData(data){
	$("#tbody").html("");
	for(index in data){
		obj = eval('('+data[index].data+')');
		$("#tbody").append(resolve(obj));
	}
}
function resolve(data){
	var res = "";
	res += "<tr>";
	var length = Object.keys(data).length;
	for(i=0;i<length;i++){
		var value = data["field"+i];
		if(value.indexOf('.')!=-1){
			value = parseFloat(value).toFixed(2);
		}
		res += "<th>"+value+"</th>";
	}
	res += "</tr>";
	return res;
}

function del(id){
	if(confirm("您确定要删除吗?")){
		
	}
}

$("#checkall").click(function(){ 
  $("input[name='id[]']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
  });
})

function DelSelect(){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) return false; 		
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	}
}

</script>
</body>
</html>