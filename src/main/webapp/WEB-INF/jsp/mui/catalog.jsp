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
					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<thead>
					<tr>
						<th width="120">ID</th>
						<th>目录中文</th>
						<th>目录英文</th>
						<th>表单名称</th>
						<th>数据源</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody id="tabBody">
				<!-- 
					<tr>
						<td><input type="checkbox" name="id[]" value="1" /> 1</td>
						<td>健康</td>
						<td>Health</td>
						<td>Completeness of death registration with cause-of-death information (%)</td>
						<td>https://data.worldbank.org.cn/</td>
						<td><div class="button-group">
								<a class="button border-red" href="javascript:void(0)"
									onclick="return del(1)"><span class="icon-trash-o"></span>
									删除</a>
							</div></td>
					</tr>
				 -->
				</tbody>
				<tfoot>
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
						<div hidden="true">
							<input value="查找" onchange="loadData(this.innerHTML)"/>
						</div>
						</td>
					</tr>
				</tfoot>
			</table>
		</div>
	</form>
	<script type="text/javascript">
	var pageNum = 1;
	var isFirstPage,isLastPage;
	var pageSize = 10;
	var pages;
function loadData(page){
	if(pageNum<1)page=1;
	if(pageNum>pages)page=pages;
	$.ajax({
		type:'POST',
		data:{page:page,pageSize:pageSize},
		url:'http://localhost/CEECDATA/tableCatalog/listPage.do',
		success:function(data){
			data = eval('('+data+')');
			//console.log(data);
			pageNum = data.pageNum;
			isFirstPage = data.isFirstPage;
			isLastPage = data.isLastPage;
			pages = data.pages;
			appendData(data.list);
			refreshFoot();
		}
	})
}
loadData(1);
function appendData(data){
	$("#tabBody").html("");
	for(obj in data){
		$("#tabBody").append(resolve(data[obj]));
	}
}
function resolve(obj){
	var res = "<tr><td><input type=\"checkbox\" name=\"id[]\" value=\""+obj.id+"\" />"+obj.id+"</td>";
	res += "<td>"+obj.catalogCn+"</td>";
	res += "<td>"+obj.catalogEn+"</td>";
	res += "<td>"+obj.tableName+"</td>";
	res += "<td>"+obj.source+"</td>";
	res += "<td><div class=\"button-group\"><a class=\"button border-red\" href=\"javascript:void(0)\"";
	res += "onclick=\"return del("+obj.id+")\"><span class=\"icon-trash-o\"></span>删除</a></div></td></tr>";
	return res;
}
function refreshFoot(){
	var foot = "";
	foot += "<a onclick=\"loadData(1)\">首页</a>";
	foot += "<a onclick=\"loadData(pageNum-1)\">上一页</a>";
	if(isFirstPage){
		foot += "<span class=\"current\">"+pageNum+"</span>";
		foot += "<a onclick=\"loadData("+(pageNum+1)+")\">"+(pageNum+1)+"</a>";
		foot += "<a onclick=\"loadData("+(pageNum+2)+")\">"+(pageNum+2)+"</a>";
	}else if(isLastPage){
		foot += "<a onclick=\"loadData("+(pageNum-2)+")\">"+(pageNum-2)+"</a>";
		foot += "<a onclick=\"loadData("+(pageNum-1)+")\">"+(pageNum-1)+"</a>";
		foot += "<span class=\"current\">"+pageNum+"</span>";
	}else{
		foot += "<a onclick=\"loadData("+(pageNum-1)+")\">"+(pageNum-1)+"</a>";
		foot += "<span class=\"current\">"+pageNum+"</span>";
		foot += "<a onclick=\"loadData("+(pageNum+1)+")\">"+(pageNum+1)+"</a>";
	}
	foot += "<a onclick=\"loadData(pageNum+1)\">下一页</a>";
	foot += "<a onclick=\"loadData(pages)\">尾页</a>";
	$("#pageFoot").html("");
	$("#pageFoot").append(foot);
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