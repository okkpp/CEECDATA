<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>搜索页面</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MUI/css/default.css" />

<!--必要样式-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/MUI/css/search-form.css" />

</head>
<body>

<form onSubmit="submitFn(this, event);">
	<div class="search-wrapper">
		<div class="input-holder">
			<input type="text" class="search-input" placeholder="请输入关键词" />
			<button class="search-icon" onClick="searchToggle(this, event);"><span></span></button>
		</div>
		<span class="close" onClick="searchToggle(this, event);"></span>
		<div class="result-container">

		</div>
	</div>
</form>

<script src="${pageContext.request.contextPath}/MUI/js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script type="text/javascript">
function searchToggle(obj, evt){
	var container = $(obj).closest('.search-wrapper');

	if(!container.hasClass('active')){
		  container.addClass('active');
		  evt.preventDefault();
	}
	else if(container.hasClass('active') && $(obj).closest('.input-holder').length == 0){
		  container.removeClass('active');
		  // clear input
		  container.find('.search-input').val('');
		  // clear and hide result container when we press close
		  container.find('.result-container').fadeOut(100, function(){$(this).empty();});
	}
}

function submitFn(obj, evt){
	value = $(obj).find('.search-input').val().trim();

	_html = "您搜索的关键词： ";
	if(!value.length){
		_html = "关键词不能为空。";
	}
	else{
		_html += "<b>" + value + "</b>";
	}

	$(obj).find('.result-container').html('<span>' + _html + '</span>');
	$(obj).find('.result-container').fadeIn(100);

	evt.preventDefault();
	if(_html!="关键词不能为空。"){
		window.location.href="searchResult.do?info="+value;
	}
}
</script>

</body>
</html>