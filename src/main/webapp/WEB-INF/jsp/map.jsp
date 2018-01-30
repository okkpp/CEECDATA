<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>中东欧16国_宁波中东欧国家合作研究院</title>

<link rel="stylesheet" href="css/contentmain.css" />

<link href="css/jquery-accordion-menu.css" rel="stylesheet"
	type="text/css" />
<link href="css/font-awesome.css" rel="stylesheet" type="text/css" />

<script src="js/echarts.js"></script>
<style type="text/css">
* {
	box-sizing: border-box;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
}

body {
	background: #ffffff;
}

.content {
	width: 260px;
}

.filterinput {
	background-color: rgba(249, 244, 244, 0);
	border-radius: 15px;
	width: 90%;
	height: 30px;
	border: thin solid #FFF;
	text-indent: 0.5em;
	font-weight: bold;
	color: #FFF;
}

#demo-list a {
	overflow: hidden;
	text-overflow: ellipsis;
	-o-text-overflow: ellipsis;
	white-space: nowrap;
	width: 100%;
}
</style>

<script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
<script src="js/jquery-accordion-menu.js" type="text/javascript"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {
		jQuery("#jquery-accordion-menu").jqueryAccordionMenu();

	});

	$(function() {
		//顶部导航切换
		$("#demo-list li").click(function() {
			$("#demo-list li.active").removeClass("active");
			$(this).addClass("active");
		})
	})
</script>
</head>
<body>

	<div
		style="min-width: 60em; width: 100%; position: relative; background-color: #fff">

		<div class="content"
			style="min-width: 60em; width: 100%; position: relative;">
			<div style="width: 100%; float: center">
					<div id="zdo-map">
						<h1
							style="font-size: 42px; margin: 20px auto -40px; display: block; text-align: center; letter-spacing: 8px; color: #cb3335;">中东欧十六国各国地图板块</h1>
						<div class="zdomap">
<a href="content.do?GJDM=asny" class="con-zdo" id="asny"></a>
<a href="content.do?GJDM=ltwy" class="con-zdo" id="ltwy"></a>
<a href="content.do?GJDM=ltw" class="con-zdo" id="ltw"></a>
<a href="content.do?GJDM=bl" class="con-zdo" id="bl"></a>
<a href="content.do?GJDM=jk" class="con-zdo" id="jk"></a>
<a href="content.do?GJDM=slfk" class="con-zdo" id="slfk"></a>
<a href="content.do?GJDM=xyl" class="con-zdo" id="xyl"></a>
<a href="content.do?GJDM=slwny" class="con-zdo" id="slwny"></a>
<a href="content.do?GJDM=kldy" class="con-zdo" id="kldy"></a>
<a href="content.do?GJDM=lmny" class="con-zdo" id="lmny"></a>
<a href="content.do?GJDM=bh" class="con-zdo" id="bh"></a>
<a href="content.do?GJDM=hs" class="con-zdo" id="hs"></a>
<a href="content.do?GJDM=sewy" class="con-zdo" id="sewy"></a>
<a href="content.do?GJDM=bjly" class="con-zdo" id="bjly"></a>
<a href="content.do?GJDM=aebny" class="con-zdo" id="aebny"></a>
<a href="content.do?GJDM=mqd" class="con-zdo" id="mqd"></a>

							<div class="tap-zdo" id="tap-asny">
								<h4>爱沙尼亚</h4>
								<p>面积(km²)：45,227</p>
							</div>
							<div class="tap-zdo" id="tap-ltwy">
								<h4>拉脱维亚</h4>
								<p>面积(km²)：64,589</p>
							</div>
							<div class="tap-zdo" id="tap-ltw">
								<h4>立陶宛</h4>
								<p>面积(km²)：65,300</p>
							</div>
							<div class="tap-zdo" id="tap-bl">
								<h4>波兰</h4>
								<p>面积(km²)：312,685</p>
							</div>
							<div class="tap-zdo" id="tap-jk">
								<h4>捷克</h4>
								<p>面积(km²)：78,866</p>
							</div>
							<div class="tap-zdo" id="tap-slfk">
								<h4>斯洛伐克</h4>
								<p>面积(km²)：49,037</p>
							</div>
							<div class="tap-zdo" id="tap-xyl">
								<h4>匈牙利</h4>
								<p>面积(km²)：93,030</p>
							</div>
							<div class="tap-zdo" id="tap-slwny">
								<h4>斯洛文尼亚</h4>
								<p>面积(km²)：20,273</p>
							</div>
							<div class="tap-zdo" id="tap-kldy">
								<h4>克罗地亚</h4>
								<p>面积(km²)：56,594</p>
							</div>
							<div class="tap-zdo" id="tap-lmny">
								<h4>罗马尼亚</h4>
								<p>面积(km²)：238,391</p>
							</div>
							<div class="tap-zdo" id="tap-bh">
								<h4>波黑</h4>
								<p>面积(km²)：51,210</p>
							</div>
							<div class="tap-zdo" id="tap-hs">
								<h4>黑山</h4>
								<p>面积(km²)：13,812</p>
							</div>
							<div class="tap-zdo" id="tap-serwy">
								<h4>塞尔维亚</h4>
								<p>面积(km²)：88,361</p>
							</div>
							<div class="tap-zdo" id="tap-bjly">
								<h4>保加利亚</h4>
								<p>面积(km²)：110,994</p>
							</div>
							<div class="tap-zdo" id="tap-aerbny">
								<h4>阿尔巴尼亚</h4>
								<p>面积(km²)：28,750</p>
							</div>
							<div class="tap-zdo" id="tap-mqd">
								<h4>马其顿</h4>
								<p>面积(km²)：25,713</p>
							</div>
						</div>
					</div>
			</div>
		</div>


	</div>

	<script src="js/contentmain.js"></script>
	<script src="js/index.js"></script>
</body>
</html>
