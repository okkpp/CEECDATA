<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>${GJ}GDP</title>
    <script src="../js/echarts.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width:100%;height:800px;display:inline-block;"></div>
<script type="text/javascript">
var GJ = '${GJ}';
var HGJJ = ${HGJJ};
var NF = [];
var GDP = [];
for(i=0;i<HGJJ.length;i++){
	NF[i]=HGJJ[i].nf;
	GDP[i]=HGJJ[i].gdp;
}
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据

option = {
	    title: {
	    	text: GJ+'GDP',
	    	x:'center',
	    	textStyle:{
	            fontWeight:'bold',
	            fontSize:30
	        }
	    },
    color: ['#3398DB'],
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis : [
        {
            
            type : 'category',
            data : NF,
            axisTick: {
                alignWithLabel: true
            }
        }
    ],
    yAxis : [
        {
            name:'单位：十亿美元',
            type : 'value'
        }
    ],
    series : [
        {
            name:'GDP',
            type:'bar',
            barWidth: '90%',
            data: GDP
        }
    ]
};


    myChart.setOption(option);
</script>
</body>
</html>