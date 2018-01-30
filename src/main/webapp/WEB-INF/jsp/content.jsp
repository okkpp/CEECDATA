<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>${GJ}_宁波中东欧国家合作研究院</title>
		
		<link rel="stylesheet" href="css/contentmain.css" />

	</head>
	<body>
		<div style="min-width: 60em;width: 100%;position:relative;">
	<div class="ub div-center" style="width: 100%;">
		<div style="width:100%">
			<img style="width:100%;display:block;" src="img/Logo3.png"/>
		</div>
   </div>
		
			<div id="country_map">
           <h1 id="coudata-h">${GJ}</h1>
            <div class="coudata">
                <a id="recur-map" href="http://118.31.188.83/zdomap/index.jhtml">回到地图</a>
                <table id="country-data">
                    <tr>
                        <td>
                            <div id="cou_mview">
                                
                            </div>
                            <span>宏观经济</span>
                        </td>
                        <td>
                            <div id="cou_trade">
                                
                            </div>
                            <span>贸易合作</span>
                        </td>
                   
                        <td>
                            <div id="cou_adm">
                                
                            </div>
                            <span>投资营商</span>
                        </td>
                        <td>
                            <div id="cou_society">
                                
                            </div>
                            <span>社会环境</span>
                        </td>
                    </tr>
                </table>

                <!-- 宏观经济-->
                <ul class="mview_index">
                    <li>
                    	<c:forEach items="${HGJJ}" var="c">
                    		<div class="list_index">
				    			<a href="${c.LJ}?GJDM=${c.GJDM}" title='${c.BT}' target="_blank">${c.BT}</a>
			      			</div>
						</c:forEach>                          
                    </li>
                    <li><a href="http://118.31.188.83/asnyhgjj/index.jhtml" style="padding:10px 12px; text-align:right;">查看更多</a></li>
                </ul>
                <!-- 贸易合作-->
                <ul class="trade_index">
                     <li>
                     	<c:forEach items="${MYHZ}" var="c">
                    		<div class="list_index">
				    			<a href="${c.LJ}?GJDM=${c.GJDM}" title='${c.BT}' target="_blank">${c.BT}</a>
			      			</div>
						</c:forEach>   
                    </li>
                    <li><a href="http://118.31.188.83/asnymyhz/index.jhtml" style="padding:10px 12px; text-align:right;">查看更多</a></li>
                 </ul>
                 <!-- 投资营商-->
                 <ul class="adm_index">
                    <li>
                    	<c:forEach items="${TZYS}" var="c">
                    		<div class="list_index">
				    			<a href="${c.LJ}?GJDM=${c.GJDM}" title='${c.BT}' target="_blank">${c.BT}</a>
			      			</div>
						</c:forEach>                                
                    </li>
                    <li><a href="http://118.31.188.83/asnytzys/index.jhtml" style="padding:10px 12px; text-align:right;">查看更多</a></li>
                </ul>
                <!-- 社会环境-->
                <ul class="society_index">
                    <li>
                    	<c:forEach items="${SHHJ}" var="c">
                    		<div class="list_index">
				    			<a href="${c.LJ}?GJDM=${c.GJDM}" title='${c.BT}' target="_blank">${c.BT}</a>
			      			</div>
						</c:forEach>                                
                    </li>
                    <li><a href="http://118.31.188.83/asnyshhj/index.jhtml" style="padding:10px 12px; text-align:right;">查看更多</a></li>
                </ul>
            </div>
    </div>
<div class="clear-10" style="height:4em;"></div>
<div class="footBg" style="width:100%;background-color: #384a5e; ">
    <div class="ub div-center" style="color: #FFFFFF;width:65%;padding:2em 0;">
		<div style="width:34%;">
		    <div style="width:100%;">
				<div style=""><h2 style="font-size:18px;font-weight:normal;">联系我们</h2></div>
				<div style="padding-top: 12px;">
					<div class="uinn07">官方电话：0574-88222535</div>
					<div class="uinn07">传真：0574-88222535</div>
					<div class="uinn07">邮编：315100</div>
					<div class="uinn07">地址：浙江省宁波市鄞州区钱湖南路8号</div>
				</div>
			</div>
		</div> 
		<div style="margin-left:5%;width:66%;">
			<div><h2 style="font-size:18px;font-weight:normal;">友情链接</h2></div>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://www.fmprc.gov.cn/web/" target="_blank" title="中华人民共和国外交部">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian1.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://www.moe.gov.cn/" target="_blank"  title="中华人民共和国教育部">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian2.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://www.mofcom.gov.cn/" target="_blank" title="中华人民共和国商务部">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian3.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://www.mcprc.gov.cn/" target="_blank" title="中华人民共和国文化部">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian4.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://www.cnta.gov.cn/" target="_blank" title="中华人民共和国国家旅游局">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian5.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://www.sdpc.gov.cn/" target="_blank" title="中华人民共和国国家发改委">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian6.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://niis.cass.cn/" target="_blank"  title="中国社会科学院亚太与全球战略研究院">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian7.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:18px;" href="http://www.siis.org.cn/" target="_blank"  title="上海国际问题研究院">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian8.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.people.com.cn/" target="_blank"  title="人民网">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian9.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.iiss.org/" target="_blank"  title="国际战略研究所">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian10.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.nus.edu.sg/" target="_blank"  title="新加坡国立大学">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian11.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.ftchinese.com/" target="_blank"  title="FT中文网">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian12.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.chinanews.com/" target="_blank"  title="中国新闻网">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian13.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.zjol.com.cn/" target="_blank"  title="浙江在线">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian14.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.edailu.cn/" target="_blank"  title="一带一路门户网">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian15.jpg" style="width: 100%;" /></div>
			</a>
			<a style="display:block;width:12%;float:left;margin-top:1.0em;" href="http://www.chinanews.com/" target="_blank"  title="中国新闻网">
				<div style="margin-left: 1em;"><img src="img/youlian/youlian16.jpg" style="width: 100%;" /></div>
			</a>
		</div>
	</div>
<!--	<div style="background-color: #474e62;height:1.5em;padding:0.5em 0em;">
		<div class="t-center" style="color: #707484;">浙ICP备16017915号-2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;版权所有：宁波中东欧国家合作研究院</div>
	</div>  -->
</div>

		</div>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/contentmain.js"></script>
	</body>
</html>