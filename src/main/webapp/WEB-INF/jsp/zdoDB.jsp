<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>中东欧数据库首页</title>
    <link rel="stylesheet" href="zdo_static/css/normalize.css">
    <link rel="stylesheet" href="zdo_static/css/zdoDB.css">
    <link rel="stylesheet" media="max-width: 1024px" href="zdo_static/css/moblie.css">
    <script type="text/javascript" src="zdo_static/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="zdo_static/js/zbtree.js"></script>
</head>
<body>
<!--header部分-->
<header>
    <div class="head-top">
        <div class="h-top">
            <span>打造国家前沿战略支撑平台</span>
            <div class="loginDiv">

            </div>
        </div>
    </div>
    <div class="h-con">
        <div class="LOGO">
            <img src="zdo_static/img/LOGO4.png" alt="中国-中东欧国家经贸合作数据库">
        </div>
        <div class="search">
            <form action="" method="" id="searchForm">
                <input type="text" value="" maxlength="50" autocomplete="off" class="searchCon">
                <input type="submit" value="" class="searchbtn">
            </form>
        </div>
    </div>
</header>
<!--container部分-->
<div class="container">
    <div class="navbar">
        <div class="nav-back">
            <a href="">返回首页</a>
        </div>
        <div class="nav-function">
            <div id="download"></div>
            <div id="export"></div>
            <div id="printer"></div>
        </div>
    </div>
    <div class="contant">
        <form action="" method="" id="zbtree">
            <ul id="main-zb">
            	<c:forEach items="${data}" var="map">
            		<li>
            			<a href="" class="main-zb-mes">${map.key}</a>
            			<ul class="sec-zb">
            				<c:forEach items="${map.value}" var="list">
            					<li>
            						<a href="${list.href}" target="normal_a" class="sec-zb-mes">${list.content}</a>
            					</li>
            				</c:forEach>
            			</ul>
            		</li>
            	</c:forEach>
            </ul>
        </form>
        <iframe src="welcome.html" name="normal_a" id="DataPage">
            您的浏览器不支持嵌入式框架，或者当前配置为不显示嵌入式框架。
        </iframe>
    </div>
</div>
<!--footer部分-->
<div class="footer">
    <div class="fo-con">
       <div class="contact">
            <h3>联系我们</h3>
            <p>
                官方电话：0574-88222535 <br>
                传真：0574-88222535 <br>
                邮编：315100 <br>
                地址：浙江省宁波市鄞州区钱湖南路8号
            </p>
        </div>
        <div class="link">
            <h3>友情链接</h3>
            <div class="link-adr">
                <a href="">
                    <img src="zdo_static/img/youlian1.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian2.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian3.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian4.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian5.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian6.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian7.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian8.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian9.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian10.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian11.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian12.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian13.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian14.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian15.jpg" alt="">
                </a>
                <a href="">
                    <img src="zdo_static/img/youlian16.jpg" alt="">
                </a>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="zdo_static/js/zdoDB.js"></script>
</body>
</html>
