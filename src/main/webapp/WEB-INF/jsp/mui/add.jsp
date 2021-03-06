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
<script src="${pageContext.request.contextPath}/MUI/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/MUI/js/pintuer.js"></script>
</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong>
				<span class="icon-pencil-square-o"></span>
				增加内容
			</strong>
		</div>
		<div class="body-content">
			<form class="form-x">
				<div class="form-group">
					<div class="label">
						<label>选择章节：</label>
					</div>
					<div class="field">
						<select id="chapter_choose" name="cid" class="input w50">
							<option></option>
						</select>
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>选择数据表：</label>
					</div>
					<div class="field">
						<select id="sheet_choose" name="cid" class="input w50">
						</select>
						<div class="tips"></div>
					</div>
				</div>
			</form>
			<form id="add_form" class="form-x">
				<div id="auto_create">
					<!-- <div class="form-group">
					<div class="label">
						<label>其他属性：</label>
					</div>
					<div class="field" style="padding-top: 8px;">
						首页 <input id="ishome" type="checkbox" /> 推荐 <input id="isvouch"
							type="checkbox" /> 置顶 <input id="istop" type="checkbox" />
					</div>
				</div>
				</if>
				<div class="form-group">
					<div class="label">
						<label>描述：</label>
					</div>
					<div class="field">
						<textarea class="input" name="note" style="height: 90px;"></textarea>
						<div class="tips"></div>
					</div>
				</div> -->
				</div>
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="button" id="add_btn">提交</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<script>
		$(function() {
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
					$("#chapter_choose").change(function() {
						var opt = result[$("#chapter_choose").val()];
						$("#sheet_choose").empty();
						$("#auto_create").empty();
						$("<option></option>").appendTo("#sheet_choose");
						for ( var i in opt) {
							$("<option></option>").append(opt[i]).appendTo("#sheet_choose");
						}
					});
					$("#sheet_choose").change(function() {
						var tab = "t_"+ $("#chapter_choose").val()+ "_"+ $("#sheet_choose").val();
						$.ajax({
							url : "../showColumns.do",
							data : "tab=" + tab,
							type : "GET",
							success : function(result) {
								result = eval('('+ result+ ')');
								$("#auto_create").empty();
								$.each(result,function(index,item) {
									if (!(item.Field == "id" || item.Field == "updated")) {
										var label = $("<div></div>").addClass("label").append($("<label></label>").append(item.Comment));
										var form_group = $("<div></div>").addClass("form-group");
										var input = $("<input></input>").addClass("input").attr("name",item.Field);
										var field = $("<div></div>").addClass("field").append(input);
										form_group.append(label).append(field).appendTo("#auto_create");
									}
								
								});
							}
						})
					});
				}
			});
		});
		$("#add_btn").click(function(){
			var str = "../"+$("#chapter_choose").val()+"/add/"+tranformStr("_"+$("#sheet_choose").val())+".do";	
			$.ajax({
				url : str,
				type : "POST",
				data : getForm(),
				success : function(result){
					result = eval('('+ result+ ')');
					alert(result.msg);
					//清空所有输入的值
					$("input").val("");
				}				
			});
		});
		
		//获取更新表单数据
		function getForm(){
			var formObject = {};
			var formArray =$("#add_form").serializeArray();
			$.each(formArray,function(i,item){
			formObject[item.name] = item.value;
			});
			var formJson = JSON.stringify(formObject);
			console.log(formJson);
			return formJson;	
		}
		
		//按驼峰命名法转成驼峰
		function tranformStr(str){	
			var strArr=str.split('_');
			for(var i=1;i<strArr.length;i++){
			    strArr[i]=strArr[i].charAt(0).toUpperCase()+strArr[i].substring(1);
			}
			return strArr.join('');
		}
	</script>
</body>
</html>