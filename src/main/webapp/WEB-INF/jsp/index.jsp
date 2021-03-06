﻿<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>中东欧国家综合数据</title>

<!--<link href="./hsy/js/font-awesome.min.css" rel="stylesheet">-->
<link rel="stylesheet" type="text/css"
	href="http://www.jq22.com/jquery/font-awesome.4.6.0.css">

<!-- 引入Jquery -->
<script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>

<!-- 引入Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<script src="./hsy/assets/libs/js/jquery.slimscroll.min.js"></script>
<style>
li {
	list-style: none
}

a {
	text-decoration: none;
}
/*navMenu */
background: #1c2229 ;
        .navMenubox {
	width: 100%;
	height: 100%;
	margin: 0px;
}

.navMenu-top {
	padding: 10px;
	color: #000;
}

.navMenu>li {
	display: block;
	margin: 0;
	padding: 0;
	border: 0px;
}

.navMenu>li>a {
	display: block;
	overflow: hidden;
	padding-left: 0px;
	line-height: 25px;
	color: #0099CC;
	transition: all .3s;
	position: relative;
	text-decoration: none;
	font-size: 17px;
}
/*.navMenu > li:nth-of-type(1)> a { border-top: 1px solid transparent; }*/
/*.navMenu > li:last-child > a { border-bottom: 1px solid transparent; }*/
.navMenu>li>a>i {
	font-size: 20px;
	float: left;
	font-style: normal;
	margin: 0 5px;
}

.navMenu li a .arrow:before {
	display: block;
	float: right;
	margin-top: 1px;
	margin-right: 15px;
	display: inline;
	font-size: 16px;
	font-family: FontAwesome;
	height: auto;
	content: "\f105";
	font-weight: 300;
	text-shadow: none;
}

.navMenu li a .arrow.open:before {
	float: right;
	margin-top: 1px;
	margin-right: 15px;
	display: inline;
	font-family: FontAwesome;
	height: auto;
	font-size: 16px;
	content: "\f107";
	font-weight: 300;
	text-shadow: none;
}
/*.navMenu>li>a.active, .navMenu>li>a:hover { color: #FFF; background: #12181b; }*/
.navMenu>li>ul.sub-menu, .navMenu>li>ul.sub-menu>li>ul.sub-menu {
	display: none;
	list-style: none;
	clear: both;
	margin: 8px 0px 0px 10px;
	padding-bottom: 5px;
}

.navMenu>li.active>ul.sub-menu, .navMenu>li>ul.sub-menu>li.active>ul.sub-menu
	{
	
}

.navMenu>li>ul.sub-menu li {
	background: none;
	margin: 0px;
	padding: 0px;
}
/*color: #ABB1B7;*/
.navMenu>li>ul.sub-menu li>a {
	display: block;
	font-size: 16px;
	line-height: 25px;
	padding-left: 20px;
	clear: both;
}

html, body {
	padding: 0px;
	margin: 0px;
	width: 100%;
	height: 100%;
	overflow: hidden;
}

.container-fluid {
	margin: 0px;
	padding: 0px;
	min-width: 1244px;
	min-height: 768px;
	width: 100%;
	height: 100%;
}

.header {
	background-image: url("./hsy/assets/img/dataLOGO.jpg");
}

.left {
	background-image: url("./hsy/assets/img/QQ图片20180328084125.jpg");
	background-size: cover;
}

.container-head {
	background-image: url("./hsy/assets/img/QQ图片20180328084115.png");
	background-size: cover;
}

.left ul li a:hover {
	background-color: #94B4DB;
	color: white;
}

.nav .open>a, .nav .open>a:focus, .nav .open>a:hover {
	background-color: #94B4DB;
	color: white;
}

ul li span {
	margin-left: 20px;
}

.nav-pills>li.active>a, .nav-pills>li.active>a:focus, .nav-pills>li.active>a:hover
	{
	background-color: #000;
	color: #fff;
}

.active {
	background-color: #000;
}
/*.fa-line-chart{*/
/*margin-left: 100px;*/
/*}*/
</style>

</head>
<body>
	<div class="container-fluid">
		<div
			style="margin: 0px; padding: 0px; width: 100%; height: 180px;background:url(hsy/assets/img/dataLOGO.jpg) no-repeat top center;background-size:100% auto;">
		</div>
		<div style="width: 100%; height: 80px;">
			<div style="float: left; width: 20%; height: 100%;">
				<p
					style="font-size: 20px; font-weight: bold; font-family: 微软雅黑; color: #0099CC; position: relative; top: 20px; left: 10%;">中&nbsp;&nbsp;东&nbsp;&nbsp;欧&nbsp;&nbsp;国&nbsp;&nbsp;家&nbsp;&nbsp;综&nbsp;&nbsp;合&nbsp;&nbsp;数&nbsp;&nbsp;据</p>
				<p
					style="font-size: 16px; color: #0099CC; position: relative; top: 10px; left: 10%;">CEEC Synthetic Data</p>
			</div>
			<div class="container-head"
				style="float: left; width: 80%; height: 100%;text-align: right">
				<div style="position: relative;top: 20px;left: 60%">
					<form class="navbar-form navbar-left" >
						<div class="form-group">
							<input type="text" id="search_input" class="form-control" style="width: 300px;height: 40px;" placeholder="Search">
						</div>
						<button type="button" id="search_btn" class="btn btn-default btn-primary" style="height: 40px;">Submit</button>
					</form>
				</div>
			</div>
		</div>
		<div style="width: 100%; height: 80%;">
			<div class="left"
				style="float: left; margin: 0px; padding: 0px; min-height: 640px; height: 100%; width: 20%; overflow: auto;">
				<div class="navMenubox">
					<div id="slimtest1">
						<!--<div class="navMenu-top">-->
						<!--<div id="mini" style="">111<i class="fa fa-bars fa-2x"></i></div>-->
						<!--</div>-->

					</div>
				</div>
			</div>
			<div style="float: right; width: 80%; height: 100%;">
				<iframe name="right" id="ifID" src="right.html" width="100%"
					frameborder="0" height="100%" style="padding-bottom: 60px;"></iframe>
			</div>
		</div>
	</div>
	<script type="text/javascript">
var hrefAndName = null;
$(function () {
	sendAjax("getContent.do");
});

function sendAjax(str){
	$.ajax({
		type:"POST",
		url:str,
		success:function(data){
			var remoteData = eval('(' + data + ')');
			hrefAndName = setTree(remoteData);
	        
	            var html = '<ul class="navMenu nav nav-pills nav-stacked">';
	            for(var i=0;i<hrefAndName.length;i++){
	                if(hrefAndName[i].son==[]||hrefAndName[i].son.length==0){
	                    html +='<li><a href="'+hrefAndName[i].href+'" target="right"><span class="glyphicon glyphicon-file"></span><span>'+hrefAndName[i].name+'</span></a></li>';
	                } else {
	                    html +='<li> <a href="'+hrefAndName[i].href+'" target="right" class="afinve">  <span class="">'+hrefAndName[i].name+'</span> <span class="arrow"></span></a>';
	                    var data = getData(hrefAndName[i].son);
	                    if(data!=-1){
	                        html+=data;
	                    }
	                }
	            }
	            html += '</ul>';
	            $('#slimtest1').empty();
	            $('#slimtest1').append(html);
	            $('.navMenu li a').on('click',function(){
	                var parent = $(this).parent().parent();//获取当前页签的父级的父级
	                var labeul =$(this).parent("li").find(">ul")
	                if ($(this).parent().hasClass('open') == false) {
	                    //展开未展开
	                    parent.find('ul').slideUp(300);
	                    parent.find("li").removeClass("open")
	                    parent.find('li a').removeClass("active").find(".arrow").removeClass("open")
	                    $(this).parent("li").addClass("open").find(labeul).slideDown(300);
	                    $(this).addClass("active").find(".arrow").addClass("open")
	                }else{
	                    $(this).parent("li").removeClass("open").find(labeul).slideUp(300);
	                    if($(this).parent().find("ul").length>0){
	                        $(this).removeClass("active").find(".arrow").removeClass("open")
	                    }else{
	                        $(this).addClass("active")
	                    }
	                }

	            });
	        
		}
	});
}

         function setTree(remoteData) {

            var data = [];

            for (key in remoteData) {

                var obj = function(){};

                var Obj = new obj();

                Obj.href = 'javascript:;';

                Obj.name = key;

                // console.log(Obj);
                // console.log(remoteData[key]);
                if (remoteData[key].length == 0) {
                    Obj.son = [];
                } else {
                    var array = [];

                    for (var i = remoteData[key].length - 1; i >= 0; i--) {
                        var objson = function(){};

                        var objSon = new objson();

                        objSon.name = remoteData[key][i].content;
                        objSon.href = remoteData[key][i].href;
                        objSon.son = [];
                        
                        // console.log(objSon);

                        array.push(objSon);

                    }
                    Obj.son = array;
                }

                data.push(Obj);
            }

            // console.log(data);
            return data;
         }


        function clickLink(obj) {
            var liList = $('.left ul li');
            for(var i=0;i<liList.length;i++){
//                if(liList.eq(i).hasClass('active')){
//                    alert(i+1)
//                }
                liList.eq(i).removeClass('active');
            }
            $(obj).parent().addClass('active');
        }

        function getData(hrefAndName){
            var str = '<ul class="sub-menu nav nav-pills nav-stacked" >';
            if(hrefAndName.length==0)
                return -1;
            for(var i=0;i<hrefAndName.length;i++){
                if(hrefAndName[i].son==[]||hrefAndName[i].son.length==0){
                    str +='<li><a href="'+hrefAndName[i].href+'" target="right"><span class="glyphicon glyphicon-file"></span><span>'+hrefAndName[i].name+'</span></a></li>';
                } else {
                    str +='<li> <a href="'+hrefAndName[i].href+'" target="right" class="afinve">  <span class="">'+hrefAndName[i].name+'</span> <span class="arrow"></span></a>';
                    var data = getData(hrefAndName[i].son);
                    if(data!=-1){
                        str+=data;
                    }
                }
            }
            return str + '</ul>';
        }
		$("#search_btn").click(function(){
			var str = "getContentByCondition.do?info=" + $("#search_input").val();
			sendAjax(str);
			console.log("finish");
			
		})

    </script>
</body>
</html>
