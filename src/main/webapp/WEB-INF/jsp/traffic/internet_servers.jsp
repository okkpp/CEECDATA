<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!--
      @author 言伟
      @Description: 互联网服务商
    -->
    <meta charset="UTF-8">
    <title>互联网服务商</title>
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
            <h3>互联网服务商</h3>
            <br>
            <h4 style="margin-top: -20px;">Internet Servers</h4>
        </div>

        <div style="text-align: right;">单位:&nbsp;个/千万人</div>

        <table id="tableData"></table>
    </div>

    <div id="imageView">
        <div class="page-header" style="text-align: center;">
            <h3>互联网服务商</h3>
            <br>
            <h4 style="margin-top: -20px;">Internet Servers</h4>
        </div>

        <div class="panel" style="margin-top: 40px;">
            <div style="text-align: right;">单位:&nbsp;个/千万人</div>
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
                title: '2005年'
            },
            {
                field: 'year2',
                title: '2011年'
            },
            {
                field: 'year3',
                title: '2012年'
            },
            {
                field: 'year4',
                title: '2013年'
            },
            {
                field: 'year5',
                title: '2014年'
            },
            {
                field: 'year6',
                title: '2015年'
            },
        ],
        data: [
            {
                country: '阿尔巴尼亚',
                year1: '1',
                year2: '44',
                year3: '60',
                year4: '51',
                year5: '69',
                year6: '109',
            },
            {
                country: '波黑',
                year1: '13',
                year2: '76',
                year3: '99',
                year4: '92',
                year5: '137',
                year6: '163',
            },
            {
                country: '保加利亚',
                year1: '67',
                year2: '1040',
                year3: '1199',
                year4: '1060',
                year5: '1277',
                year6: '1303',
            },
            {
                country: '克罗地亚',
                year1: '176',
                year2: '990',
                year3: '1046',
                year4: '822',
                year5: '930',
                year6: '1117',
            },
            {
                country: '捷克',
                year1: '425',
                year2: '4083',
                year3: '5453',
                year4: '5929',
                year5: '7269',
                year6: '9146',
            },
            {
                country: '爱沙尼亚',
                year1: '137',
                year2: '714',
                year3: '884',
                year4: '992',
                year5: '1218',
                year6: '1503',
            },
            {
                country: '匈牙利',
                year1: '303',
                year2: '2193',
                year3: '2458',
                year4: '2469',
                year5: '2966',
                year6: '3606',
            },
            {
                country: '拉脱维亚',
                year1: '87',
                year2: '457',
                year3: '556',
                year4: '548',
                year5: '718',
                year6: '903',
            },
            {
                country: '立陶宛',
                year1: '74',
                year2: '775',
                year3: '815',
                year4: '759',
                year5: '606',
                year6: '709',
            },
            {
                country: '马其顿',
                year1: '1',
                year2: '59',
                year3: '83',
                year4: '109',
                year5: '159',
                year6: '190',
            },
            {
                country: '黑山',
                year1: '-',
                year2: '16',
                year3: '19',
                year4: '23',
                year5: '35',
                year6: '45',
            },
            {
                country: '波兰',
                year1: '835',
                year2: '10306',
                year3: '11548',
                year4: '11906',
                year5: '16327',
                year6: '20791',
            },
            {
                country: '罗马尼亚',
                year1: '116',
                year2: '1148',
                year3: '1420',
                year4: '1378',
                year5: '2491',
                year6: '4547',
            },
            {
                country: '塞尔维亚',
                year1: '-',
                year2: '210',
                year3: '272',
                year4: '249',
                year5: '312',
                year6: '451',
            },
            {
                country: '斯洛伐克',
                year1: '99',
                year2: '891',
                year3: '1224',
                year4: '1423',
                year5: '1741',
                year6: '2129',
            },
            {
                country: '斯洛文尼亚',
                year1: '158',
                year2: '889',
                year3: '1146',
                year4: '1128',
                year5: '1337',
                year6: '1665',
            }
        ]
    });

    var all = {
        "data": [
            [1,13,67,176,425,137,303,87,74,1,0,838,116,0,99,158],
            [44,76,1040,990,4083,714,2193,457,775,59,16,10306,1148,210,891,889],
            [60,99,1199,1046,5453,884,2458,556,815,83,19,11548,1420,272,1224,1146],
            [51,92,1060,822,5929,992,2469,548,759,109,23,11906,1378,249,1423,1128],
            [69,137,1277,930,7269,1218,2966,718,606,159,35,16327,2491,312,1741,1337],
            [109,163,1303,1117,9146,1503,3606,903,709,190,45,20791,4547,451,2129,1665]
        ],
        "countrys": ["阿尔巴尼亚","波黑","保加利亚","克罗地亚",
            "捷克","爱沙尼亚","匈牙利","拉脱维亚","立陶宛","马其顿","黑山","波兰",
            "罗马尼亚","塞尔维亚","斯洛伐克","斯洛文尼亚"],
        "years": ["2005年", "2010年", "2012年", "2013年", "2014年", "2015年"]
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
                name: '互联网服务商',
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
</body>
</html>