<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>${GJ}12-16年的进出口量</title>
    <script src="../js/echarts.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width:100%;height:800px;display:inline-block;"></div>
<script type="text/javascript">
var GJ = '${GJ}';
var IMANDEX = ${IMANDEX};
var NF = [];
var JKL = [];
var CKL = [];
for(i=0;i<IMANDEX.length;i++){
	NF[i]=IMANDEX[i].nf;
	JKL[i]=IMANDEX[i].jkl;
	CKL[i]=IMANDEX[i].ckl;
}
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    // 指定图表的配置项和数据
option = {
	    title : {
	        text: GJ+'12-16年的进出口量',
	        x:'7%'
	    },
	    tooltip : {
	        trigger: 'axis'
	    },
	    legend: {
	        data:['出口','进口']
	    },
	    toolbox: {
	        show : true,
	        feature : {
	            dataView : {show: true, readOnly: false},
	            magicType : {show: true, type: ['line', 'bar']},
	            restore : {show: true},
	            saveAsImage : {show: true}
	        }
	    },
	    calculable : true,
	    xAxis : [
	        {
	            type : 'category',
	            data : NF
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
	            name:'出口',
	            type:'bar',
	            data:CKL,
	            markPoint : {
	                data : [
	                    {type : 'max', name: '最大值'},
	                    {type : 'min', name: '最小值'}
	                ]
	            },
	            markLine : {
	                data : [
	                    {type : 'average', name: '平均值'}
	                ]
	            }
	        },
	        {
	            name:'进口',
	            type:'bar',
	            data:JKL,
	            markPoint : {
	                data : [
	                    {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183},
	                    {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
	                ]
	            },
	            markLine : {
	                data : [
	                    {type : 'average', name : '平均值'}
	                ]
	            }
	        }
	    ]
	};


    myChart.setOption(option);
</script>
</body>
</html>