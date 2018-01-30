<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<head>
		<meta charset="utf-8" />
		<script src="../js/echarts.js"></script>
		<title>${GJ}65岁及以上人口占总人口比</title>
	<body>
		<div id="main" style="width:100%;height:800px;display:inline-block;"></div>
		
	</body>
	<script>
	var GJ = '${GJ}';
	var SHHJ = ${SHHJ};
	var NF = [];
	var NL65ZB = [];
	for(i=0;i<SHHJ.length;i++){
		NF[i]=SHHJ[i].nf;
		NL65ZB[i]=SHHJ[i].nl65zb;
	}
		//开始结尾要设置容器
		var myChart = echarts.init(document.getElementById('main'));
option = {
    title:{
        text:GJ+'65岁及以上人口占总人口占比',
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
            name:'年份',
            type : 'category',
            data : NF,
            axisTick: {
                alignWithLabel: true
            }
        }
    ],
    yAxis : [
        {   name: '(%)',
            type : 'value',
            max:30
        }
    ],
    label: {
                    normal: {
                        show: true,
                        position: 'top'
                    }
                },
    series : [
        {
            name:'人口数',
            type:'bar',
            barWidth: '60%',
            data:NL65ZB
        }
    ]
};

myChart.setOption(option);
	</script>
</html>
