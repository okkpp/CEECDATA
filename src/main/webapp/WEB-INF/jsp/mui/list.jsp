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
<%@ include file="/WEB-INF/jsp/mui/userModal.jsp"%>

</head>
<body>
	<form method="post" action="" id="listform">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 内容列表</strong>
				<a href="" style="float: right; display: none;">添加字段</a>
			</div>
			<div class="padding border-bottom">
				<ul style="padding-left: 10px;">
					<li>
						<a class="button border-main icon-plus-square-o" href="mui.do?str=add"> 添加内容</a>
					</li>
					<li>搜索&nbsp;&nbsp;
					
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
						&nbsp;&nbsp;
						<input type="text" placeholder="请输入搜索关键字" id="condition" class="input" style="width: 250px; line-height: 17px; display: inline-block" />
						<input type="button" class="button border-main icon-search" onclick="search()" value="搜索">
						&nbsp;&nbsp;
						<input type="button" class="button border-red" id="delete_all" value="删除选中">
					</li>
				</ul>
			</div>
			<table id="search_result" class="table table-hover text-center">
				<thead>
				</thead>
				<tbody>
				</tbody>
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
		var data = "pn="+pn;
		if(type == "normal"){
			str = "../"+$("#chapter_choose").val()+"/getJson.do";			
			data +="&info="+tranformStr("_"+$("#sheet_choose").val());
		}else if(type == "search"){
			var chapter = $("#chapter_choose").val();
			var sheet = $("#sheet_choose").val();
			var column = $("#column_choose").val();
			var condition = $("#condition").val()
			str = "../" + chapter + "/"+tranformStr("select_" + sheet)+"ByExample.do?column="+column+"&condition="+condition;
		}
		$.ajax({
			url : str,
			data : data,
			type : "POST",
			success : function(result) {				
				result = eval('('+ result+ ')');
				console.log(result);
				//json排序
				result = sortByJson(result,json);
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
	//按json数组格式排序
	function sortByJson(result,json){
		var newList = "[";
		$.each(result.extend.pageInfo.list,function(index,item){
			newList += "{";
			for(var i = 0;i<json.length;i++){
				json[i] = tranformStr(json[i]);
				for(var y in item){
					if(y == json[i]){
						newList += "\""+y+"\":"+"\""+item[y]+"\",";		
					}
				}
				
			};
			newList = newList.substring(0,newList.length - 1);
			newList += "},";
		});
		newList = newList.substring(0,newList.length - 1) +"]";
		newList = eval('('+ newList+ ')');
		result.extend.pageInfo.list = newList;
		return result;	
	}
	
	//为所有修改按钮绑定事件
	$(document).on("click", ".update_btn", function() {
		var id = $(this).attr("edit-id");
		//alert(id);
		//$("#update_form").empty();
		
		$.each(items,function(index,item){		
			if(item.id == id){
				for(var i in item){
					var pOrInput;
					if(i == "id" || i == "updated"){
						pOrInput = $("<p></p>").addClass("form-control-static").append(item[i]).attr("name",i);
					}else{
						pOrInput = $("<input></input>").addClass("form-control").attr("value",item[i]).attr("name",i);
					}
					$("<div></div>").addClass("form-group").append(
						$("<label></label>").addClass("col-sm-2 control-label").append(i))
						.append($("<div></div>").addClass("col-sm-10").append(pOrInput))
						.appendTo("#update_form");
				}
			}
		});
		
		//把数据id传递给模态框的更新按钮
		$("#update_btn").attr("edit-id",$(this).attr("edit-id"));
		$("#updateModal").modal({
			backdrop : "static"
		});
	});
	
	$("#update_btn").click(function(){
		//var str = "../"+$("#chapter_choose").val()+"/"+tranformStr("_"+$("#sheet_choose").val())+".do";//+$(this).attr("edit-id");
		var str = "../price/test.do/"+$(this).attr("edit-id");
		$.ajax({
			url : str,
			type : "POST",
			data : $("#update_form").serialize()+"&_method=put",
			success : function(result){
				console.log(result);
				//alert(result.msg);
			}
		})
	});
	
	//为所有删除按钮绑定事件(单个删除)
	$(document).on("click",".delete_btn",function(){
		if(confirm("您确定要删除吗?")){
			alert($(this).parents("tr").find("td:eq(1)").text());
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
			/* $.ajax({
				
			}); */
		}
	});
</script>
</body>
</html>