<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head lang="zh-CN">
    <title>年平均存款利率和贷款利率</title>

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <meta charset="utf-8">

    <!-- 引入Jquery -->
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>

    <!-- 引入Bootstrap -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>

    <!-- 引入BootStrap-table -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/libs/bootstrap-table-master/dist/bootstrap-table.min.css">
    <script src="${pageContext.request.contextPath}/assets/libs/bootstrap-table-master/dist/bootstrap-table.min.js"></script>

    <!-- 引入Bootstrap-paginator -->
    <script src="${pageContext.request.contextPath}/assets/libs/bootstrap-paginator-master/build/bootstrap-paginator.min.js"></script>

    <!-- 引入Echarts -->
    <script src="${pageContext.request.contextPath}/assets/libs/echarts/echarts.min.js"></script>

    <!-- 引入wzyTable -->
    <script src="${pageContext.request.contextPath}/assets/libs/wzy-bootstrap-table/wzy-bootstrap-table.js"></script>
</head>
<body>
<div class="container">
    <div>
        <ul class="nav nav-tabs">
            <li role="presentation" id="tableTag"><a href="javascript:;" onclick="showTable()">&nbsp;<span class="glyphicon glyphicon-th-large"></span>&nbsp;</a></li>
            <li role="presentation" id="imageTag"><a href="javascript:;" onclick="showImage()">&nbsp;<span class="glyphicon glyphicon-tasks"></span>&nbsp;</a></li>
        </ul>
    </div>

    <div id="tableView">
        <div class="page-header" style="text-align: center;">
            <h3>年平均存款利率和贷款利率</h3>
            <br>
            <h4 style="margin-top: -20px;">Annual Average Deposit Rate and Lending Rate</h4>
        </div>

        <div style="text-align: right;">单位:&nbsp;%</div>

        <table id="tableData"></table>
    </div>

    <div id="imageView">
        <div class="page-header" style="text-align: center;">
            <h3>年平均存款利率和贷款利率柱状图</h3>
            <br>
            <h4 style="margin-top: -20px;">Annual Average Deposit Rate and Lending Rate</h4>
        </div>

        <div class="panel" style="margin-top: 40px;">
            <div style="text-align: right;">单位:&nbsp;%</div>
            <div id="main" style="width: 100%;height:400px;"></div>
        </div>
    </div>

    <div style="color: #666666; margin-top: 15px;">*此数据仅展现最近五年，若需全部数据请点击<a href="#" class="btn btn-info btn-xs">
          <span class="glyphicon glyphicon-save"></span> 下载
        </a></div>

    <!-- <div style="text-align: right;"><div id="page"></div></div> -->
</div>
</body>
<script>
var jsondata = eval('('+ '${data}'+ ')');
console.log(jsondata);
    var column = [
        {
            title: '国家',
            field: 'contry',
            rowspan: 5,
        },
        {
            title: '年份',
            field: 'year',
        },
        {
            title: '存款利率',
            field: 'save_rate'
        },
        {
            title: '贷款利率',
            field: 'borrow_rate'
        }
    ];

    var data = [

    ];

    $('#tableData').wzyTable({
        column: column,
        data: data,
    });

    $(function () {
        $('#imageView').hide();
        $('#tableTag').attr('class', 'active');
    })

    function showTable() {
        $('#tableView').show();
        $('#imageView').hide();
        $('#tableTag').attr('class', 'active');
        $('#imageTag').removeClass('active');
    }

    function showImage() {
        $('#imageView').show();
        $('#tableView').hide();
        $('#imageTag').attr('class', 'active');
        $('#tableTag').removeClass('active');
    }

    var all = {
        "data": [
            [0,0,0,36.27421662,0,12.64537665,0,11.86241304,0,0,0,0,1.596143642,0,61.06416139,0],
            [0,0,0,46.83704817,0,21.07369247,0,0,0,0,0,0,36.43978533,0,65.29249732,0],
            [0,0.519205856,14.27699525,50.98148174,0,33.556452,0,50.43995596,40.63814613,34.59767353,0,0,44.59620698,0,81.65024779,0],
            [0,0.625414512,17.20211519,55.15502839,0,40.82348997,0,41.59453671,46.99984111,41.57752702,0,0,53.30985846,0,94.28021046,47.78280607],
            [0,0.629979215,0,55.59157203,0,0,0,0,43.76049951,41.50278607,0,0,63.20000379,0,94.53781897,46.0035936],
            [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
        ],
        "countrys": ["阿尔巴尼亚","波黑","保加利亚","克罗地亚","捷克","爱沙尼亚","匈牙利","拉脱维亚","立陶宛","马其顿","黑山","波兰","罗马尼亚","塞尔维亚","斯洛伐克","斯洛文尼亚"],
        "years": ["2000年", "2005年", "2010年", "2013年", "2014年", "2015年"]
    };

    var option = {
        timeline: {
            axisType: 'category',
            autoPlay: true,
            playInterval: 5000,
            data: all.years
        },
        options: [{
            tooltip: {
                trigger: 'axis'
            },
            toolbox: {
                show: true,
                orient: 'vertical',
                x: 'right',
                y: 'center',
                feature: {
                    mark: {
                        show: true
                    },
                    dataView: {
                        show: true,
                        readOnly: false
                    },
                    magicType: {
                        show: true,
                        type: ['line', 'bar']
                    },
                    restore: {
                        show: true
                    },
                    saveAsImage: {
                        show: true
                    }
                }
            },
            calculable: true,
            grid: {
                y: 100,
                y2: 100
            },
            xAxis: [{
                type: 'category',
                axisLabel: {
                    interval: 0
                },
                data: all.countrys
            }],
            yAxis: [{
                type: 'value',
                name: ''
            }],
            series: [{
                name: '银行资本充足率',
                type: 'bar',
                data: all.data[0]
            }]
        },
            {
                series: [{
                    data: all.data[1]
                }]
            },
            {
                series: [{
                    data: all.data[2]
                }]
            },
            {
                series: [{
                    data: all.data[3]
                }]
            },
            {
                series: [{
                    data: all.data[4]
                }]
            },
            {
                series: [{
                    data: all.data[5]
                }]
            },
            {
                series: [{
                    data: all.data[6]
                }]
            },
            {
                series: [{
                    data: all.data[7]
                }]
            },
            {
                series: [{
                    data: all.data[8]
                }]
            }
        ]
    };
    var myChart = echarts.init(document.getElementById('main'));
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</html>