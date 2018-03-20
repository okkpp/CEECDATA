<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<!--
    @author 赵国杰
    @title 铁路运输
-->

<head lang="zh-CN">
    <title>铁路运输
    </title>

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <meta charset="utf-8">

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
            <li role="presentation" id="tableTag">
                <a href="javascript:;" onclick="showTable()">表格</a>
            </li>
            <li role="presentation" id="imageTag">
                <a href="javascript:;" onclick="showImage()">图表</a>
            </li>
        </ul>
    </div>

    <div id="tableView">
        <div class="page-header" style="text-align: center;">
            <h3>铁路运输</h3>
            <br>
            <h4 style="margin-top: -20px;">The Railway Transport</h4>
        </div>

        <table class="table table-hover table-striped">
            <tr>
                <td>国家</td>
                <td>时间</td>
                <td>铁路总长度</td>
                <td>铁路货运周转量</td>
                <td>铁路客运周转量</td>
            </tr>
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">阿尔巴尼亚</div></td>
                <td>2010</td>
                <td>423</td>
                <td>46</td>
                <td>32</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>423</td>
                <td>46</td>
                <td>32</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">爱沙尼亚</div></td>
                <td>2010</td>
                <td>787</td>
                <td>6261</td>
                <td>248</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>792</td>
                <td>4807</td>
                <td>237</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">保加利亚</div></td>
                <td>2010</td>
                <td>4098</td>
                <td>3061</td>
                <td>2100</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>4032</td>
                <td>2714</td>
                <td>1826</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">波兰</div></td>
                <td>2010</td>
                <td>19702</td>
                <td>34266</td>
                <td>15715</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>18959</td>
                <td>33256</td>
                <td>12941</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">黑山</div></td>
                <td>2010</td>
                <td>/</td>
                <td>/</td>
                <td>/</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>/</td>
                <td>/</td>
                <td>/</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">捷克</div></td>
                <td>2010</td>
                <td>9569</td>
                <td>13592</td>
                <td>6553</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>9569</td>
                <td>10587</td>
                <td>6924</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">克罗地亚</div></td>
                <td>2010</td>
                <td>2722</td>
                <td>2618</td>
                <td>1742</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>2723</td>
                <td>2086</td>
                <td>858</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">拉脱维亚</div></td>
                <td>2010</td>
                <td>1897</td>
                <td>17164</td>
                <td>79</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>1859</td>
                <td>14991</td>
                <td>89</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">立陶宛</div></td>
                <td>2010</td>
                <td>1767</td>
                <td>13431</td>
                <td>373</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>1767</td>
                <td>13344</td>
                <td>391</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">罗马尼亚</div></td>
                <td>2010</td>
                <td>/</td>
                <td>9134</td>
                <td>5248</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>10768</td>
                <td>10387</td>
                <td>3988</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">马其顿</div></td>
                <td>2010</td>
                <td>699</td>
                <td>497</td>
                <td>155</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>699</td>
                <td>423</td>
                <td>99</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">塞尔维亚</div></td>
                <td>2010</td>
                <td>4058</td>
                <td>3868</td>
                <td>658</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>3809</td>
                <td>2646</td>
                <td>777</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">斯洛伐克</div></td>
                <td>2010</td>
                <td>3587</td>
                <td>7669</td>
                <td>2291</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>3593</td>
                <td>6810</td>
                <td>/</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">斯洛文尼亚</div></td>
                <td>2010</td>
                <td>1228</td>
                <td>3283</td>
                <td>813</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>1209</td>
                <td>3534</td>
                <td>760</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">匈牙利</div></td>
                <td>2010</td>
                <td>7893</td>
                <td>1000</td>
                <td>5398</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>1898</td>
                <td>1343</td>
                <td>5799</td>
            </tr>
            <!--
                描述：一国结束
            -->
            <!--
                描述：一个国家的合并
            -->
            <tr>
                <td rowspan="2" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">波黑</div></td>
                <td>2010</td>
                <td>1026</td>
                <td>1227</td>
                <td>59</td>
            </tr>
            <tr>
                <td>2013</td>
                <td>1027</td>
                <td>47</td>
                <td>47</td>
            </tr>
            <!--
                描述：一国结束
            -->
        </table>
    </div>

    <!--
        描述：后部图表
    -->
    <div id="imageView">
        <div class="page-header" style="text-align: center;">
            <h3>铁路运输柱状图</h3>
            <br>
            <h3>The Railway Transport</h3>
        </div>

        <div class="panel" style="margin-top: 40px;">
            <div id="main" style="width: 100%;height:400px;"></div>
        </div>
    </div>
    <div style="color: #666666; margin-top: 15px;">*此数据仅展现最近五年， 若需全部数据请点击<a href="#" class="btn btn-info btn-xs">
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
            //10铁路总长度
            [423,787,4098,19702,0,9569,2722,1897,1767,0,699,4058,3587,1228,7893,1026],
            //13铁路总长度
            [423,792,4032,18959,0,9469,2723,1859,1767,0,699,3809,3593,1209,7898,1027],
            //10铁路货运周转量
            [46,6261,3061,34266,0,13592,2618,17164,13431,9134,497,3868,7669,3283,1000,1227],
            //13铁路货运周转量
            [46,4807,2714,33256,0,10587,2086,14991,13344,10387,423,2646,6810,3534,1343,47],
            //10铁路客运周转量
            [32,248,2100,15715,0,6553,1742,79,373,5248,155,658,2291,813,5398,59],
            //13铁路客运周转量
            [32,237,1826,12941,0,6924,858,89,391,3988,99,777,0,760,5799,47]
        ],
        "countrys": ["阿尔巴尼亚", "爱沙尼亚", "保加利亚", "波兰", "黑山", "捷克", "克罗地亚", "拉脱维亚", "立陶宛", "罗马尼亚", "马其顿", "塞尔维亚", "斯洛伐克", "斯洛文尼亚", "匈牙利", "波黑"],
        "years": [ "2010年", "2013年"]
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
                data: ['铁路总长度', '铁路货运周转量','铁路客运周转量']
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
            //10
            series: [{
                name: '铁路总长度',
                type: 'bar',
                data: all.data[0]
            }, {
                name: '铁路货运周转量',
                type: 'bar',
                data: all.data[1]
            }, {
                name: '铁路客运周转量',
                type: 'bar',
                data: all.data[2]
            }]
        },
            //13
            {
                series: [{
                    data: all.data[3]
                }, {
                    data: all.data[4]
                }, {
                    data: all.data[5]
                }]
            }
        ]
    };
    var myChart = echarts.init(document.getElementById('main'));
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>

</html>