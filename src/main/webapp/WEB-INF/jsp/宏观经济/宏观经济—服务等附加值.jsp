<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <title>服务等附加值</title>
    <script src="../static-1/js/echarts.js" type="text/javascript"></script>
    <script src="../static-1/js/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script>

    var GJ = '${GJ}';
    var HGJJ = ${HGJJ};
    var NF = [];
    var FJZ = [];
    for(i=0;i<HGJJ.length;i++){
    	NF[i]=HGJJ[i].nf;
    	FJZ[i]=HGJJ[i].fjz;
    }

option = {
    title: {
            text: '服务等附加值',
            x: 'center',
            textStyle: {
                fontWeight: 'bold',
                fontSize: 30
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
        {
            name:'服务等附加值',
            min:'8',
            type : 'value'
        }
    ],
    series : [
        {
            type:'bar',
            barWidth: '60%',
            data:FJZ
        }
    ]
};


        $(function () {
            var myChart = echarts.init(document.getElementById('myChart'));
            myChart.setOption(option);
        });

    </script>
</head>
<body>
    <div style="width:100%;height:800px;display:inline-block;" id="myChart" ></div>
</body>
</html>