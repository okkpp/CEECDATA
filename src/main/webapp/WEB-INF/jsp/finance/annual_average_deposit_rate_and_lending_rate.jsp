<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<!--
  @author 汪振宇
  @email 1120023921@qq.com
  @Description: 年平均存款利率和贷款利率
-->
<head lang="zh-CN">
    <title>年平均存款利率和贷款利率</title>

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <meta charset="utf-8">

    <!-- 引入Jquery -->
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>

    <!-- 引入Bootstrap -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <!-- 引入BootStrap-table -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/libs/bootstrap-table-master/dist/bootstrap-table.min.css">
    <script src="${pageContext.request.contextPath}/assets/libs/bootstrap-table-master/dist/bootstrap-table.min.js"></script>

    <!-- 引入Bootstrap-paginator -->
    <script src="${pageContext.request.contextPath}/assets/libs/bootstrap-paginator-master/build/bootstrap-paginator.min.js"></script>

    <!-- 引入Echarts -->
    <script src="${pageContext.request.contextPath}/assets/libs/echarts/echarts.min.js"></script>
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
		<table class="table table-hover table-striped">
				<tr>
					<td>国家</td>
					<td>年份</td>
					<td>年平均存款利率</td>
					<td>贷款利率</td>
				</tr>
				<c:forEach items="${data}" var="map">
					<tr>
						<td rowspan="3" style="font-size: 20px; text-align: center;"><div
								style="text-align: center; padding-top: 15%;">${map.key}</div></td>
						<c:forEach items="${map.value}" var="list">
							<td>${list.year}</td>
							<td>${list.depositRate}</td>
							<td>${list.lendingRate}</td>
							<tr>
						</c:forEach>
				</c:forEach>
			</table>
		</div>

    <div id="imageView">
        <div class="page-header" style="text-align: center;">
            <h3>年平均存款利率和贷款利率</h3>
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
    $(function() {
        $('#all').hide()
        $('#imageView').hide();
        $('#imageView2').hide();
        $('#tableTag').attr('class', 'active');
    })

    function showTable() {
        $('#all').hide()
        $('#tableView').show();
        $('#tableView2').show();
        $('#imageView').hide();
        $('#imageView2').hide()
        $('#tableTag').attr('class', 'active');
        $('#imageTag').removeClass('active');
        $('#first').show()
        $('#second').show()
    }

    function showImage() {
        $('#all').show()
        $('#imageView').show();
        $('#tableView').hide();
        $('#tableView2').hide();
        $('#imageView2').show();
        $('#imageTag').attr('class', 'active');
        $('#tableTag').removeClass('active');
        $('#first').hide()
        $('#second').hide()
    }


    var all = {
        "data": [
            //05 交易额
            [5.087550872,2.132839881,3.08435,2.789600127,4.84375,1.174166667,1.714166667,2.780833333,2.4,6.415,5.225,12.13333333,2.44,3.175,5.167934585,3.564166667],
            //5 周转
            [13.075,4.928485792,8.660983333,6.831298668,0,5.776666667,11.19111667,6.106666667,5.271666667,19.60083333,12.13333333,16.83173462,6.675,7.8,8.540945327,9.6125],
            //10 交易额
            [6.417543373,1.10602655,4.076075,0,3.699525,1.081583333,1.7575,1.865,1.71,7.313333333,7.066666667,11.33,0,0,4.917692681,3.159166667],
            //10 周转
            [12.82232989,7.760177765,11.14436667,0,9.53,5.887833333,10.37666667,9.558333333,5.989166667,14.0725,9.483333333,17.3,0,0,7.586925113,7.888333333],
            //13
            [1.39187012,0.503435583,0.613891667,0,1.458083333,0.529332846,0,0,0,1.888333333,2.886194164,0,0,0,0.867014243,2.059663519],
            //13
            [8.70284668,4.481133401,7.484858333,0,8.933333333,4.282533329,0,0,0,6.7675,7.079158056,0,0,0,2.90249069,5.78888799]
        ],
        "countrys": ["阿尔巴尼亚", "爱沙尼亚", "保加利亚", "波兰", "黑山", "捷克", "克罗地亚", "拉脱维亚", "立陶宛", "罗马尼亚", "马其顿", "塞尔维亚", "斯洛伐克", "斯洛文尼亚", "匈牙利", "波黑"],
        "years": ["2005年", "2010年", "2015年"]
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
                    }
                }
            },
            calculable: true,
            grid: {
                y: 100,
                y2: 100
            },
            legend: {
                data: ['年平均存款利率', '贷款利率']
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
            //05
            series: [{
                name: '年平均存款利率',
                type: 'bar',
                data: all.data[0]
            }, {
                name: '贷款利率',
                type: 'bar',
                data: all.data[1]
            }]
        },
            //10
            {
                series: [{
                    data: all.data[2]
                }, {
                    data: all.data[3]
                }]
            },
            //13
            {
                series: [{
                    data: all.data[4]
                }, {
                    data: all.data[5]
                }]
            },
            //14
            {
                series: [{
                    data: all.data[6]
                }, {
                    data: all.data[7]
                }]
            },
            //15
            {
                series: [{
                    data: all.data[8]
                }, {
                    data: all.data[9]
                }]
            }
        ]
    };
    var myChart = echarts.init(document.getElementById('main'));
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>

</html>