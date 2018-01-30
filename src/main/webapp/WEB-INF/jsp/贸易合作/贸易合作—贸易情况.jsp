<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>${GJ}贸易情况</title>
    <script src="../js/echarts.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width:100%;height:800px;display:inline-block;"></div>
<script type="text/javascript">
var GJ = '${GJ}';
var MYQK = ${MYQK};
var NFYF = [];
var JKE = [];
var CKE = [];
var ZE = [];
for(i=0;i<MYQK.length;i++){
	NFYF[i]=MYQK[i].nf+'年'+MYQK[i].yf+'月';
	JKE[i]=MYQK[i].jke;
	CKE[i]=MYQK[i].cke;
	ZE[i]=MYQK[i].jke+MYQK[i].cke;
}
    var myChart = echarts.init(document.getElementById('main'));
    option = {
        title: {
            text: '各月'+GJ+'贸易情况/单位：亿美元'
        },
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        legend: {
            data:['双边货物贸易额','出口额','进口额']
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
                data : NFYF
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'进出口总额',
                type:'bar',
                data:ZE
            },
            {
                name:'出口额',
                type:'bar',
                stack: '广告',
                data:CKE
            },
            {
                name:'进口额',
                type:'bar',
                data:JKE

            }
        ]
    };
    myChart.setOption(option);
</script>

</body>
</html>