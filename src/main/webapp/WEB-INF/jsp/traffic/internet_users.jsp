<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!--
      @author DoubleH
      @email 1120023921@qq.com
      @Description: 国际互联网用户
    -->
    <meta charset="UTF-8">
    <title>国际互联网用户</title>
    <!-- 引入Jquery -->
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>

    <!-- 引入Bootstrap -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <!-- 引入BootStrap-table -->
    <link rel="stylesheet" href="../assets/libs/bootstrap-table-master/dist/bootstrap-table.min.css">
    <script src="../assets/libs/bootstrap-table-master/dist/bootstrap-table.min.js"></script>

    <!-- 引入Bootstrap-paginator -->
    <script src="../assets/libs/bootstrap-paginator-master/build/bootstrap-paginator.min.js"></script>

    <!-- 引入Echarts -->
    <script src="../assets/libs/echarts/echarts.min.js"></script>
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
                <h3>国际互联网用户</h3>
                <br>
                <h4 style="margin-top: -20px;">Internet Users</h4>
            </div>

            <div style="text-align: right;">单位:&nbsp;个/百人</div>

            <table id="tableData"></table>
        </div>

        <div id="imageView">
            <div class="page-header" style="text-align: center;">
                <h3>国际互联网用户</h3>
                <br>
                <h4 style="margin-top: -20px;">Internet Users</h4>
            </div>

            <div class="panel" style="margin-top: 40px;">
                <div style="text-align: right;">单位:&nbsp;个/百人</div>
                <div id="main" style="width: 100%;height:400px;"></div>
            </div>
        </div>

        <div style="color: #666666; margin-top: 15px;">*此数据仅展现最近五年，若需全部数据请点击<a href="#" class="btn btn-info btn-xs">
          <span class="glyphicon glyphicon-save"></span> 下载
      </a></div>

        <!-- <div style="text-align: right;"><div id="page"></div></div> -->
    </div>
    <script>
        $(function(){
            $('#imageView').hide();
            $('#tableTag').attr('class','active');
        })

        function showTable() {
            $('#tableView').show();
            $('#imageView').hide();
            $('#tableTag').attr('class','active');
            $('#imageTag').removeClass('active');
        }

        function showImage() {
            $('#imageView').show();
            $('#tableView').hide();
            $('#imageTag').attr('class','active');
            $('#tableTag').removeClass('active');
        }

        $('#tableData').bootstrapTable({
            striped: true,
            columns: [
                {
                    field: 'country',
                    title: '国家或地区'
                },
                {
                    field: 'year1',
                    title: '2000年'
                },
                {
                    field: 'year2',
                    title: '2010年'
                },
                {
                    field: 'year3',
                    title: '2011年'
                },
                {
                    field: 'year4',
                    title: '2012年'
                },
                {
                    field: 'year5',
                    title: '2013年'
                },
                {
                    field: 'year6',
                    title: '2014年'
                },
            ],
            data: [
                {
                    country: "阿尔巴尼亚",
                    year1:"0.114097347",
                    year2:"45",
                    year3:"49",
                    year4:"54.65595904",
                    year5:"57.2",
                    year6:"60.1",
                },
                {
                    country: "爱沙尼亚",
                    year1:"28.57695381",
                    year2:"74.1",
                    year3:"76.5",
                    year4:"78.38992593",
                    year5:"79.4",
                    year6:"84.24",
                },
                {
                    country: "保加利亚",
                    year1:"5.370923469",
                    year2:"46.23",
                    year3:"47.97999305",
                    year4:"51.89998767",
                    year5:"53.0615",
                    year6:"55.49",
                },
                {
                    country: "波兰",
                    year1:"7.285428708",
                    year2:"62.32",
                    year3:"61.94999897",
                    year4:"62.30999727",
                    year5:"62.8492",
                    year6:"66.6",
                },
                {
                    country: "黑山",
                    year1:"",
                    year2:"37.5",
                    year3:"35.61154125",
                    year4:"56.83878255",
                    year5:"60.31",
                    year6:"61",
                },
                {
                    country: "捷克共和国",
                    year1:"9.780527888",
                    year2:"68.82",
                    year3:"70.49",
                    year4:"73.43000782",
                    year5:"74.1104",
                    year6:"79.71",
                },
                {
                    country: "克罗地亚",
                    year1:"6.644882544",
                    year2:"56.55",
                    year3:"57.78997899",
                    year4:"61.93997315",
                    year5:"66.7476",
                    year6:"68.57",
                },
                {
                    country: "拉脱维亚",
                    year1:"6.319062083",
                    year2:"68.42",
                    year3:"69.74995456",
                    year4:"73.11994377",
                    year5:"75.2344",
                    year6:"75.83",
                },
                {
                    country: "立陶宛",
                    year1:"6.427067495",
                    year2:"62.12",
                    year3:"63.6399774",
                    year4:"67.22998933",
                    year5:"68.4529",
                    year6:"72.13",
                },
                {
                    country: "罗马尼亚",
                    year1:"3.613717291",
                    year2:"39.93",
                    year3:"40.00999678",
                    year4:"45.87999425",
                    year5:"49.7645",
                    year6:"54.08",
                },
                {
                    country: "马其顿",
                    year1:"2.485566316",
                    year2:"51.9",
                    year3:"56.7",
                    year4:"57.44994731",
                    year5:"65.24",
                    year6:"68.06",
                },
                {
                    country: "塞尔维亚",
                    year1:"",
                    year2:"40.9",
                    year3:"42.2",
                    year4:"48.1",
                    year5:"51.5",
                    year6:"53.5",
                },
                {
                    country: "斯洛伐克",
                    year1:"9.426803201",
                    year2:"75.71",
                    year3:"74.43999717",
                    year4:"76.70999012",
                    year5:"77.8826",
                    year6:"79.98",
                },
                {
                    country: "斯洛文尼亚",
                    year1:"15.11025956",
                    year2:"70",
                    year3:"67.33999481",
                    year4:"68.34997453",
                    year5:"72.6756",
                    year6:"71.59",
                },
                {
                    country: "匈牙利",
                    year1:"6.999676351",
                    year2:"65",
                    year3:"68.01998789",
                    year4:"70.57999815",
                    year5:"72.6439",
                    year6:"76.13",
                },
                {
                    country: "波黑",
                    year1:"1.08296075",
                    year2:"42.75",
                    year3:"47.77",
                    year4:"52.78",
                    year5:"57.79",
                    year6:"60.8",
                }
            ]
        });

        var all = {
            "data": [
                [0.114097347,28.57695381,5.370923469,7.285428708,0,9.780527888,6.644882544,6.319062083,6.427067495,3.613717291,2.485566316,0,9.426803201,15.11025956,6.999676351,1.08296075],
                [45,74.1,46.23,62.32,37.5,68.82,56.55,68.42,62.12,39.93,51.9,40.9,75.71,70,65,42.75],
                [49,76.5,47.97999305,61.94999897,35.61154125,70.49,57.78997899,69.74995456,63.6399774,40.00999678,56.7,42.2,74.43999717,67.33999481,68.01998789,47.77],
                [54.65595904,78.38992593,51.89998767,62.30999727,56.83878255,73.43000782,61.93997315,73.11994377,67.22998933,45.87999425,57.44994731,48.1,76.70999012,68.34997453,70.57999815,52.78],
                [57.2,79.4,53.0615,62.8492,60.31,74.1104,66.7476,75.2344,68.4529,49.7645,65.24,51.5,77.8826,72.6756,72.6439,57.79],
                [60.1,84.24,55.49,66.6,61,79.71,68.57,75.83,72.13,54.08,68.06,53.5,79.98,71.59,76.13,60.8]
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
                    name: '国际互联网用户',
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
                }
            ]
        };
        var myChart = echarts.init(document.getElementById('main'));
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>