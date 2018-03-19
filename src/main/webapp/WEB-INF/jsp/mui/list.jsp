<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/MUI/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/MUI/css/admin.css">
<link href="${pageContext.request.contextPath}/MUI/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/pintuer.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/bootstrap.min.js"></script>


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
					<form class="form-horizontal" id="updateForm">
						<div class="form-group">
							<label for="empName_add_input" class="col-sm-2 control-label">empName</label>
							<div class="col-sm-10">
								<p class="form-control-static" id="empName_update_static"></p>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">empEmail</label>
							<div class="col-sm-10">
								<input type="text" name="empEmail" class="form-control"
									id="email_add_input" placeholder="email@163.com"> <span
									class="help-block"></span> <span class="help-block"></span>
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="update_btn">更新</button>
				</div>
			</div>
		</div>
	</div>

	<form method="post" action="" id="listform">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 内容列表</strong>
				<a href="" style="float: right; display: none;">添加字段</a>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left: 10px;">
					<li>
						<a class="button border-main icon-plus-square-o" href="mui.do?str=add"> 添加内容</a>
					</li>
					<li>搜索</li>
					<li>
						章节:
						<select id="chapter_choose" class="input" style="width: 120px; line-height: 17px; display: inline-block">
							<option></option>
						</select>
						&nbsp;&nbsp; 数据表
						<select id="sheet_choose" class="input" style="width: 120px; line-height: 17px; display: inline-block">
						</select>
						&nbsp;&nbsp; 搜索类别:
						<select id="column_choose" class="input" style="width: 120px; line-height: 17px; display: inline-block">
						</select>
					</li>
					<li>
						<input type="text" placeholder="请输入搜索关键字" id="condition" class="input" style="width: 250px; line-height: 17px; display: inline-block" />
						<input type="button" class="button border-main icon-search" onclick="search()" value="搜索">
					</li>
					<li>
						<input type="button" class="button border-red" id="delete_all" value="删除选中">
					</li>
				</ul>
			</div>
			<table id="search_result" class="table table-hover text-center">
				<thead>

				</thead>
				<tbody>
				</tbody>
				<!-- <tr>
				<td style="text-align: left; padding: 19px 0; padding-left: 20px;">
					<input type="checkbox" id="checkall" />
					全选
				</td>
				<td colspan="7" style="text-align: left; padding-left: 20px;">
					<a href="javascript:void(0)" class="button border-red icon-trash-o" style="padding: 5px 15px;" onclick="DelSelect()"> 删除</a>
					<a href="javascript:void(0)" style="padding: 5px 15px; margin: 0 10px;" class="button border-blue icon-edit" onclick="sorts()"> 排序</a>
					操作：
					<select name="ishome" style="padding: 5px 15px; border: 1px solid #ddd;" onchange="changeishome(this)">
						<option value="">首页</option>
						<option value="1">是</option>
						<option value="0">否</option>
					</select>
				</td>
			</tr>-->
			</table>
			<div class="col-xs-12">
				<div class="pagelist" id="page_nav_area"></div>
			</div>
		</div>
	</form>
	<script type="text/javascript">	
	var json = new Array();
	var items;
	//显示数据库数据章节
	$.ajax({
		url : "../showTables.do",
		type : "GET",
		success : function(result) {
			//alert(result);
			//现实数据库的表
			result = eval('(' + result + ')');
			for ( var item in result) {
				$("<option></option>").append(item).appendTo("#chapter_choose");
			}
			//选择章节填充数据
			$("#chapter_choose").change(function() {
				var opt = result[$("#chapter_choose").val()];
				$("#sheet_choose").empty();
				$("#auto_create").empty();
				//为章节添加空白选项
				$("<option></option>").appendTo("#sheet_choose");
				for ( var i in opt) {
					$("<option></option>").append(opt[i]).appendTo("#sheet_choose");
					}
			});
			//选择数据表填充数据
			$("#sheet_choose").change(function() {
				var tab = "t_"+ $("#chapter_choose").val() + "_"+ $("#sheet_choose").val();
				$.ajax({
					url : "../showColumns.do",
					data : "tab=" + tab,
					type : "GET",
					success : function(result) {
						result = eval('('+ result+ ')');	
						json = result;
						$("#column_choose").empty();
						$("#search_result thead").empty();
						//为搜索类别添加空白选项
						$("<option></option>").appendTo("#column_choose");
						$("#search_result thead").append("<th><input type=\"checkbox\" id=\"check_all\"></th>")
						$.each(result,function(index,item) {
							$("<option></option>").append(item.Field).appendTo("#column_choose");
								if (item.Comment == "") {item.Comment = "id";}
								$("<th></th>").append(item.Comment).appendTo("#search_result thead");
								json[index] = item.Field;
						});
						$("<th></th>").append("操作").appendTo("#search_result thead");
						to_page(1,"normal");
					}
				})
			});
		}
	});
	
	//构建导航条元素
	function builde_page_nav(result,type){			
		$("#page_nav_area").empty();
		var firstPageSpan = $("<span></span>").append("首页").attr("href","#");
		var prePageSpan = $("<span></span>").append("上一页").attr("href","#");
		if (result.extend.pageInfo.hasPreviousPage == false) {
			firstPageSpan.addClass("disabled");
			prePageSpan.addClass("disabled");
		} else {
			//为元素添加点击翻页的事件
			firstPageSpan.click(function() {
				to_page(1,type);
			});
			prePageSpan.click(function() {
				to_page(result.extend.pageInfo.pageNum - 1,type);
			});
		}
		//添加到导航条
		firstPageSpan.appendTo("#page_nav_area");
		prePageSpan.appendTo("#page_nav_area");
		
		$.each(result.extend.pageInfo.navigatepageNums, function(index,
				item) {
			var numSpan = $("<span></span>").append(item);
			if (result.extend.pageInfo.pageNum == item) {
				numSpan.addClass("current");
			}
			numSpan.click(function() {
				to_page(item,type);
			});
			numSpan.appendTo("#page_nav_area");
		});
		
		var nextPageSpan = $("<span></span>").append("下一页").attr("href","#");
		var lastPageSpan= $("<span></span>").append("末页").attr("href","#");
		if (result.extend.pageInfo.hasNextPage == false) {
			nextPageSpan.addClass("disabled");
			lastPageSpan.addClass("disabled");
		} else {
			nextPageSpan.click(function() {
				to_page(result.extend.pageInfo.pageNum + 1,type);
			});
			lastPageSpan.click(function() {
				to_page(result.extend.pageInfo.pages,type);
			});
		}
		//添加到导航条
		nextPageSpan.appendTo("#page_nav_area");
		lastPageSpan.appendTo("#page_nav_area"); 
		
	}
	
	//按条件搜索
	function search() {
		to_page(1,"search");
	}
	
	//跳转页数
	function to_page(pn,type){
		var str;
		if(type == "normal"){
			str = "../"+$("#chapter_choose").val()+"/"+tranformStr("_"+$("#sheet_choose").val())+".do";
		}else if(type == "search"){
			var chapter = $("#chapter_choose").val();
			var sheet = $("#sheet_choose").val();
			var column = $("#column_choose").val();
			var condition = $("#condition").val()
			str = "../" + chapter + "/"+tranformStr("select_" + sheet)+"ByExample.do?column="+column+"&condition="+condition;
		}
		$.ajax({
			url : str,
			data : "pn=" + pn,
			type : "POST",
			success : function(result) {
				result = eval('('+ result+ ')');
				//解析显示数据结果
				create_result(result);
				//解析显示分页条数据
				builde_page_nav(result,type);
			}
		});
	}
	
	//解析显示数据结果
	function create_result(result){
		$("#search_result tbody").empty();
		items = result.extend.pageInfo.list;	
		$.each(result.extend.pageInfo.list,function(index,item){		
			//按照<th>顺序显示结果
			var tr = $("<tr></tr>");
			tr.append("<td><input type=\"checkbox\" class=\"check_item\"></td>");
			for(var i = 0;i<json.length;i++){	
				json[i] = tranformStr(json[i]);
				if(item[json[i]] == null){
					tr.append($("<td></td>").append("/"));
				}else{
					for(var y in item){
						if(y == json[i]){
							if(item[y] == null || item[y] == ""){
								tr.append($("<td></td>").append("/"));
							}else{
								tr.append($("<td></td>").append(item[y]));
							}
						}
					}
				}
			};
			//tr.append($("<td><td>").append("编辑"));
			//修改--删除按钮
			tr.append($("<td></td>").append($("<div></div>").addClass("button-group")
					.append($("<a></a>").addClass("button border-main update_btn").append($("<span></span>").addClass("icon-edit").append("修改")).attr("edit-id",item.id))
					.append($("<a></a>").addClass("button border-red delete_btn").append($("<span></span>").addClass("icon-trash-o").append("删除")).attr("del-id",item.id))));
			tr.appendTo("#search_result tbody");
		});
	}	
	//按驼峰命名法转成驼峰
	function tranformStr(str){	
		var strArr=str.split('_');
		for(var i=1;i<strArr.length;i++){
		    strArr[i]=strArr[i].charAt(0).toUpperCase()+strArr[i].substring(1);
		}
		return strArr.join('');
	}	
	
	//为所有修改按钮绑定事件
	$(document).on("click", ".update_btn", function() {
		var id = $(this).attr("edit-id");
		//alert(id);
		$("#updateForm").empty();
		$.each(items,function(index,item){		
			if(item.id == id){
				for(var i in item){
					$("<div></div>").append(i).appendTo("#updateForm");
				}
			}
		});
		$("#updateModal").modal({
			backdrop : "static"
		});
	});
	
	$("update_btn").click(function(){
		//alert($(this).attr("del-id"));
	});
	
	//为所有删除按钮绑定事件(单个删除)
	$(document).on("click",".delete_btn",function(){
		if(confirm("您确定要删除吗?")){
			alert($(this).attr("del-id"));	
		}		
	});

	//全选/全不选(check_all)
	$(document).on("click","#check_all",function(){
		//attr获取checked时总是undifiend
		//我们这些dom原生的属性:attr获取自定义属性的值
		//prop修改和读取dom原生属性
		$(".check_item").prop("checked",$(this).prop("checked"));
	});
	
	//全选/全不选(check_item)
	$(document).on("click",".check_item",function(){
		//判断当前选择中的元素是否10个
		if($(".check_item:checked").length == $(".check_item").length){
			$("#check_all").prop("checked",true);
		}else{
			$("#check_all").prop("checked",false);
		};
	});
	
	//批量删除
	$("#delete_all").click(function(){
		var ids = "";
		$.each($(".check_item:checked"),function(){
			ids += $(this).parents("tr").find("td:eq(1)").text() + ",";
		});
		ids = ids.substring(0,ids.length-1);
		if(confirm("确认删除【"+ids+"】吗?")){
			//发送ajax请求删除
			$.ajax({
				
			});
		}
	});
</script>
</body>
</html>