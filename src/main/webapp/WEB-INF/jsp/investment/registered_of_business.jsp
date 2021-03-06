<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>新注册企业数——中东欧统计数据库</title>
  <link rel="stylesheet" href="../zdo_static/css/normalize.css">
  <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <link rel="stylesheet" href="../zdo_static/js/libs/bootstrap-table-master/dist/bootstrap-table.min.css">

  <script type="text/javascript" src="../zdo_static/js/jquery-3.2.1.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  <script src="../zdo_static/js/libs/bootstrap-table-master/dist/bootstrap-table.min.js"></script>
  <script src="../zdo_static/js/libs/bootstrap-paginator-master/build/bootstrap-paginator.min.js"></script>
  <script type="text/javascript" src="../zdo_static/js/echarts.js"></script>
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
                <h3>新注册企业数</h3>
                <br>
                <h4 style="margin-top: -20px;">New Businesses Registered</h4>
            </div>

            <div style="text-align: right;">单位:&nbsp;个</div>

            <table id="tableData"></table>
        </div>

        <div id="imageView">
            <div class="page-header" style="text-align: center;">
                <h3>新注册企业数</h3>
                <br>
                <h4 style="margin-top: -20px;">New Businesses Registered</h4>
            </div>

            <div class="panel" style="margin-top: 40px;">
                <div id="main" style="width: 100%;height:400px;">
                  <script type="text/javascript">
                    var dom = document.getElementById("main");
                    var myChart = echarts.init(dom);
                    var app = {};
                    option = null;
                    var dataMap = {};
                    function dataFormatter(obj) {
                        var pList = ['阿尔巴尼亚','天津','河北','山西','内蒙古','辽宁','吉林','黑龙江','上海','江苏','浙江','安徽','福建','江西','山东','河南'];
                        var temp;
                        for (var year = 2014; year <= 2018; year++) {
                            var max = 0;
                            var sum = 0;
                            temp = obj[year];
                            for (var i = 0, l = temp.length; i < l; i++) {
                                max = Math.max(max, temp[i]);
                                sum += temp[i];
                                obj[year][i] = {
                                    name : pList[i],
                                    value : temp[i]
                                }
                            }
                            obj[year + 'max'] = Math.floor(max / 100) * 100;
                            obj[year + 'sum'] = sum;
                        }
                        return obj;
                    }

                    dataMap.dataFinalC = dataFormatter({
                        //max : 60000,
                        2018:[88,78,68,58,48,38,28,18,98,108,88,78,68,58,48,38],
                        2017:[108,88,78,68,58,48,38,78,68,58,48,38,28,18,98,108],
                        2016:[88,78,68,58,48,38,38,78,68,58,48,38,28,18,98,108],
                        2015:[108,88,78,68,58,48,38,78,68,58,48,38,28,18,98,108],
                        2014:[88,78,68,58,48,38,28,18,98,108,88,78,68,58,48,38]
                    });
                    option = {
                        baseOption: {
                            timeline: {
                                // y: 0,
                                axisType: 'category',
                                // realtime: false,
                                // loop: false,
                                autoPlay: true,
                                // currentIndex: 2,
                                playInterval: 1000,
                                // controlStyle: {
                                //     position: 'left'
                                // },
                                data: [
                                    '2014-01-01','2015-01-01','2016-01-01','2017-01-01','2018-01-01'
                                ],
                                label: {
                                    formatter : function(s) {
                                        return (new Date(s)).getFullYear();
                                    }
                                }
                            },
                            title: {
                                subtext: 'final_consumption'
                            },
                            tooltip: {
                            },
                            // legend: {
                            //     x: 'right',
                            //     data: ['第一产业', '第二产业', '第三产业', 'GDP', '金融', '房地产'],
                            //     selected: {
                            //         'GDP': false, '金融': false, '房地产': false
                            //     }
                            // },
                            // toolbox: {
                            //     show : true,
                            //     feature : {
                            //         magicType : {show: true, type: ['line', 'bar']},
                            //         restore : {show: true},
                            //     },
                            //     top:'2%'
                            // },
                            calculable : true,
                            grid: {
                                top: 80,
                                bottom: 100,
                                tooltip: {
                                    trigger: 'axis',
                                    axisPointer: {
                                        type: 'shadow',
                                        label: {
                                            show: true,
                                            formatter: function (params) {
                                                return params.value.replace('\n', '');
                                            }
                                        }
                                    }
                                }
                            },
                            xAxis: [
                                {
                                    'type':'category',
                                    'axisLabel':{'interval':0},
                                    'data':[
                                        '北京','天津','河北','山西','内蒙古','辽宁','吉林','黑龙江',
                                        '上海','江苏','浙江','安徽','福建','江西','山东','河南'
                                    ],
                                    splitLine: {show: false}
                                }
                            ],
                            yAxis: [
                                {
                                    type: 'value',
                                    name: '个'
                                }
                            ],
                            series: [{
                                name: '最终消费支出', type: 'bar',
                                itemStyle:{
                                  normal: {      //一般样式
                                    color: 'rgb(81, 181, 145)'
                                },
                                  emphasis: {     //类似于鼠标的hover样式
                                      color:'rgb(115, 217, 168)'
                                  }
                                },

                            }],
                        },
                        options: [
                            {
                                title: {text: '2014年各国最终消费支出'},
                                series: [
                                    {data: dataMap.dataFinalC['2014']},
                                ]
                            },
                            {
                                title: {text: '2015年各国最终消费支出'},
                                series: [
                                    {data: dataMap.dataFinalC['2015']},
                                ]
                            },
                            {
                                title: {text: '2016年各国最终消费支出'},
                                series: [
                                    {data: dataMap.dataFinalC['2016']},
                                ]
                            },
                            {
                                title: {text: '2017年各国最终消费支出'},
                                series: [
                                    {data: dataMap.dataFinalC['2017']},
                                ]
                            },
                            {
                                title: {text: '2018年各国最终消费支出'},
                                series: [
                                    {data: dataMap.dataFinalC['2018']},
                                ]
                            }
                        ]
                    };;
                    if (option && typeof option === "object") {
                        myChart.setOption(option, true);
                    }
                  </script>
                </div>
            </div>
        </div>

        <div style="color: #959595; margin-top: 15px;">*此数据仅展现最近五年，若需全部数据请点击&nbsp;<a href="#" class="btn btn-info btn-xs">
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
                    title: '国家'
                },
                {
                    field: 'year1',
                    title: '2015年'
                },
                {
                    field: 'year2',
                    title: '2014年'
                },
                {
                    field: 'year3',
                    title: '2013年'
                },
                {
                    field: 'year4',
                    title: '2012年'
                },
                {
                    field: 'year5',
                    title: '2011年'
                },

            ],
            data: [
                {
                    country: '阿尔巴尼亚',
                    year1: '89.9',
                    year2: '94.4',
                    year3: '89.7',
                    year4: '90.3',
                    year5: '91.3',

                },
                {
                    country: '波黑',
                    year1: '89.9',
                    year2: '94.4',
                    year3: '89.7',
                    year4: '90.3',
                    year5: '91.3',
                },
                {
                    country: '保加利亚',
                    year1: '89.9',
                    year2: '94.4',
                    year3: '89.7',
                    year4: '90.3',
                    year5: '91.3',
                },

            ]
        });


    </script>
</body>
</html>
