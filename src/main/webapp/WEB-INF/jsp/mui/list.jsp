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
<link rel="stylesheet" href="../MUI/css/pintuer.css">
<link rel="stylesheet" href="../MUI/css/admin.css">
<script src="../MUI/js/jquery.js"></script>
<script src="../MUI/js/jquery.js"></script>
</head>
<body>
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
					<select name="isvouch" style="padding: 5px 15px; border: 1px solid #ddd;" onchange="changeisvouch(this)">
						<option value="">推荐</option>
						<option value="1">是</option>
						<option value="0">否</option>
					</select>
					<select name="istop" style="padding: 5px 15px; border: 1px solid #ddd;" onchange="changeistop(this)">
						<option value="">置顶</option>
						<option value="1">是</option>
						<option value="0">否</option>
					</select>
					&nbsp;&nbsp;&nbsp; 移动到：
					<select name="movecid" style="padding: 5px 15px; border: 1px solid #ddd;" onchange="changecate(this)">
						<option value="">请选择分类</option>
						<option value="">产品分类</option>
						<option value="">产品分类</option>
						<option value="">产品分类</option>
						<option value="">产品分类</option>
					</select>
					<select name="copynum" style="padding: 5px 15px; border: 1px solid #ddd;" onchange="changecopy(this)">
						<option value="">请选择复制</option>
						<option value="5">复制5条</option>
						<option value="10">复制10条</option>
						<option value="15">复制15条</option>
						<option value="20">复制20条</option>
					</select>
				</td>
			</tr>-->
			</table>
			<div class="col-xs-12">
				<div class="pagelist" id="page_nav_area">
				</div>
			</div>
		</div>
	</form>
	<script type="text/javascript">	
	var json = new Array();
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
						$.each(result,function(index,item) {
							$("<option></option>").append(item.Field).appendTo("#column_choose");
								if (item.Comment == "") {item.Comment = "id";}
								$("<th></th>").append(item.Comment).appendTo("#search_result thead");
								json[index] = item.Field;
						});
						$("<th></th>").append("操作").appendTo("#search_result thead");
						to_page(1,"normal");
												
						/* <td><div class="button-group">
						<a class="button border-main" href="add.html"><span
							class="icon-edit"></span> 修改</a> <a class="button border-red"
							href="javascript:void(0)" onclick="return del(1,1,1)"><span
							class="icon-trash-o"></span> 删除</a>
					</div></td> */
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
		/* var chapter = $("#chapter_choose").val();
		var sheet = $("#sheet_choose").val();
		var column = $("#column_choose").val();
		var condition = $("#condition").val();
		//var str = "../"+chapter+"/"+sheet+"/selectConsumerByExample.do?&column="+column+"&condition="+condition;
		var str = "../price/selectConsumerByExample.do?&column="+column+"&condition="+condition;
		$.ajax({
			url : str,
			type : "GET",
			success : function(result){
				result = eval('('+ result+ ')');
				to_page(result,"search");
			}
		}); */
	}
	//跳转页数
	function to_page(pn,type){
		var str;
		if(type == "normal"){
			str = "../"+$("#chapter_choose").val()+"/"+$("#sheet_choose").val()+".do";				
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
		$.each(result.extend.pageInfo.list,function(index,item){		
			var tr = $("<tr></tr>");
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
			tr.append($("<td><td>").append("编辑"));
			tr.appendTo("#search_result tbody");
		});
	}	
	//转成驼峰命名法
	function tranformStr(str){	
		var strArr=str.split('_');
		for(var i=1;i<strArr.length;i++){
		    strArr[i]=strArr[i].charAt(0).toUpperCase()+strArr[i].substring(1);
		}
		return strArr.join('');
	}	
	
	//单个删除
	function del(id, mid, iscid) {
		if (confirm("您确定要删除吗?")) {
		}
	}

	//全选
	$("#checkall").click(function() {
		$("input[name='id[]']").each(function() {
			if (this.checked) {
				this.checked = false;
			} else {
				this.checked = true;
			}
		});
	})

	//批量删除
	function DelSelect() {
		var Checkbox = false;
		$("input[name='id[]']").each(function() {
			if (this.checked == true) {
				Checkbox = true;
			}
		});
		if (Checkbox) {
			var t = confirm("您确认要删除选中的内容吗？");
			if (t == false)
				return false;
			$("#listform").submit();
		} else {
			alert("请选择您要删除的内容!");
			return false;
		}
	}

	//批量排序
	function sorts() {
		var Checkbox = false;
		$("input[name='id[]']").each(function() {
			if (this.checked == true) {
				Checkbox = true;
			}
		});
		if (Checkbox) {
			$("#listform").submit();
		} else {
			alert("请选择要操作的内容!");
			return false;
		}
	}

	//批量首页显示
	function changeishome(o) {
		var Checkbox = false;
		$("input[name='id[]']").each(function() {
			if (this.checked == true) {
				Checkbox = true;
			}
		});
		if (Checkbox) {
			$("#listform").submit();
		} else {
			alert("请选择要操作的内容!");
			return false;
		}
	}

	//批量推荐
	function changeisvouch(o) {
		var Checkbox = false;
		$("input[name='id[]']").each(function() {
			if (this.checked == true) {
				Checkbox = true;
			}
		});
		if (Checkbox) {
			$("#listform").submit();
		} else {
			alert("请选择要操作的内容!");
			return false;
		}
	}
	//批量置顶
	function changeistop(o) {
		var Checkbox = false;
		$("input[name='id[]']").each(function() {
			if (this.checked == true) {
				Checkbox = true;
			}
		});
		if (Checkbox) {
			$("#listform").submit();
		} else {
			alert("请选择要操作的内容!");
			return false;
		}
	}

	//批量移动
	function changecate(o) {
		var Checkbox = false;
		$("input[name='id[]']").each(function() {
			if (this.checked == true) {
				Checkbox = true;
			}
		});
		if (Checkbox) {
			$("#listform").submit();
		} else {
			alert("请选择要操作的内容!");
			return false;
		}
	}
	//批量复制
	function changecopy(o) {
		var Checkbox = false;
		$("input[name='id[]']").each(function() {
			if (this.checked == true) {
				Checkbox = true;
			}
		});
		if (Checkbox) {
			var i = 0;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					i++;
				}
			});
			if (i > 1) {
				alert("只能选择一条信息!");
				$(o).find("option:first").prop("selected", "selected");
			} else {
				$("#listform").submit();
			}
		} else {
			alert("请选择要复制的内容!");
			$(o).find("option:first").prop("selected", "selected");
			return false;
		}
	}
</script>
</body>
</html>