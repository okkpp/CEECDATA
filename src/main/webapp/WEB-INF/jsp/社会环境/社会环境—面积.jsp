<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<head>
		<meta charset="utf-8" />
		<script src="../js/echarts.js"></script>
		<title>${GJ}国土面积</title>
	<body>
		<div id="main" style="width:100%;height:800px;display:inline-block;"></div>
		
	</body>
	<script>
	var GJ = '${GJ}';
	var GTMJ = ${GTMJ};
	var LB = [];
	var MJ = [];
	var ZMJ = 0;
	for(i=0;i<GTMJ.length;i++){
		LB[i] = GTMJ[i].lb;
		MJ.push({value:GTMJ[i].mj,name:GTMJ[i].lb});
		ZMJ += GTMJ[i].mj;
	}
		//开始结尾要设置容器
		var myChart = echarts.init(document.getElementById('main'));
	option = {
    title : {
        text: GJ+'国土面积',
        subtext: ZMJ+'平方公里',
    	x:'center',
    	textStyle:{
            fontWeight:'bold',
            fontSize:30
        }
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: LB
    },
    series : [
        {
            name: '占比',
            type: 'pie',
            radius : '55%',
            center: ['50%', '50%'],
            data:MJ,
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};
myChart.setOption(option);
	</script>
</html>
