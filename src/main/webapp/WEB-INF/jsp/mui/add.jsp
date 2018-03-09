<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="MUI/css/pintuer.css">
<link rel="stylesheet" href="MUI/css/admin.css">
<script src="MUI/js/jquery.js"></script>
<script src="MUI/js/jquery.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="">          
      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>选择数据表：</label>
          </div>
          <div class="field">
            <select id="table_choose" name="cid" class="input w50">
            	<option onclick="alert('123')">123</option>
            </select>
            <div class="tips"></div>
          </div>
        </div>
        <div class="form-group">
          <div class="label">
            <label>其他属性：</label>
          </div>
          <div class="field" style="padding-top:8px;"> 
            首页 <input id="ishome"  type="checkbox" />
            推荐 <input id="isvouch"  type="checkbox" />
            置顶 <input id="istop"  type="checkbox" /> 
          </div>
        </div>
      </if>
      <div class="form-group">
        <div class="label">
          <label>描述：</label>
        </div>
        <div class="field">
          <textarea class="input" name="note" style=" height:90px;"></textarea>
          <div class="tips"></div>
        </div>
      </div>
            
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
<script>
$(function(){
	for(var i = 1;i<11;i++){
		var tableOption = $("<option></option>").append("测试数据"+i).attr("onclick","alert('123')");
		tableOption.appendTo("#table_choose");
	}
	
	/* $.ajax({ 
		url : "/showTables",
		type : "GET",
		success : function(result) {
			//现实数据库的表
			showTables(result);
		}
	}); */
})

function showTables(result){
	var options = result.data;
	$.each(options,function(index,item){
		var tableOption = $("<option></option>").append(item.value);
		tableOption.appendTo("#table_choose");
	});	
}

</script>
</body>
</html>