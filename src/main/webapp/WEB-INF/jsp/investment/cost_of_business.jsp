<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>企业开业成本——中东欧统计数据库</title>
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
                <h3>企业开业成本</h3>
                <br>
                <h4 style="margin-top: -20px;">Cost of Business Start-up</h4>
            </div>

            <!-- <div style="text-align: right;">单位:&nbsp;%</div> -->

            <table class="table table-striped table-hover">
              <thead>
                  <th>国家</th>
                  <th>时间</th>
                  <th>开办企业所需手续数（个）</th>
                  <th>开办企业所需时间（天）</th>
                  <th>开办企业成本占人均收入比重（%）</th>
              </thead>
              <tbody>
                  <tr id="aebny">
                      <td rowspan="5" style="text-align:center;font-size:1.5em;display: table-cell;vertical-align: inherit;">阿尔巴尼亚</td>
                      <td>2017年</td>
                      <td>5</td>
                      <td>5</td>
                      <td>10.1</td>
                  </tr>
                  <tr>
                    <td>2016年</td>
                    <td>5</td>
                    <td>5</td>
                    <td>10.1</td>
                  </tr>
                  <tr>
                    <td>2010年</td>
                    <td>5</td>
                    <td>5</td>
                    <td>10.1</td>
                  </tr>
                  <tr>
                    <td>2005年</td>
                    <td>5</td>
                    <td>5</td>
                    <td>10.1</td>
                  </tr>


              </tbody>
            </table>
        </div>

        <div id="imageView">
            <div class="page-header" style="text-align: center;">
                <h3>企业开业成本</h3>
                <br>
                <h4 style="margin-top: -20px;">Cost of Business Start-up</h4>
            </div>

            <div class="panel" style="margin-top: 40px;">
                <div id="main" style="width: 100%;height:400px;">
                  <script type="text/javascript">
                    var dom = document.getElementById("main");
                    var myChart = echarts.init(dom);
                    var app = {};
                    option = null;

                    var colors = ['#5793f3', '#d14a61','#6747e6'];
                    var dataMap = {};
                    function dataFormatter(obj) {
                        var pList = ['北京','天津','河北','山西','内蒙古','辽宁','吉林','黑龙江','上海','江苏','浙江','安徽','福建','江西','山东','河南','湖北','湖南','广东','广西','海南','重庆','四川','贵州','云南','西藏','陕西','甘肃','青海','宁夏','新疆'];
                        var temp;
                        for (var year = 2011; year <= 2016; year++) {
                            var max = 0;
                            var sum = 0;
                            temp = obj[year];
                            for (var i = 0, l = temp.length; i < l; i++) {
                                obj[year][i] = {
                                    name : pList[i],
                                    value : temp[i]
                                }
                            }
                        }
                        return obj;
                    }
                    dataMap.dataCZ = dataFormatter({
                        2011:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],
                        2012:[3.0, 3.9, 3.0, 33.2, 35.6, 73.7, 133.6, 132.2, 33.6, 30.0, 3.4, 3.3],
                        2013:[4.0, 4.4, 7.4, 43.2, 45.6, 46.7, 145.6, 142.2, 42.6, 24.0, 4.4, 4.3],
                        2014:[5.0, 5.9, 7.5, 53.2, 55.6, 56.7, 155.6, 152.2, 52.6, 25.0, 56.4, 53.3],
                        2015:[6.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],
                        2016:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3]
                    })
                    dataMap.dataMD = dataFormatter({
                        2011:[22.0,22.2, 23.3, 24.5,26.3, 210.2, 220.3, 223.4, 223.0, 216.5, 212.0, 26.2],
                        2012:[32.0, 32.2, 33.3, 34.5, 36.3, 310.2, 20.3, 23.4, 23.0, 16.5, 12.0, 36.2],
                        2013:[42.0, 24.2, 43.3, 44.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 46.2],
                        2014:[52.0, 52.2, 3.3, 4.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2],
                        2015:[2.0, 2.2, 3.3, 64.5, 66.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2],
                        2016:[2.0, 2.2, 3.3, 4.5, 6.3, 10.2, 270.3, 23.4, 23.0, 167.5, 127.0, 76.2]
                    })
                    dataMap.dataBZ = dataFormatter({
                        2011:[22.0,22.2, 23.3, 24.5,26.3, 210.2, 220.3, 223.4, 223.0, 216.5, 212.0, 26.2],
                        2012:[32.0, 32.2, 33.3, 34.5, 36.3, 310.2, 20.3, 23.4, 23.0, 16.5, 12.0, 36.2],
                        2013:[42.0, 24.2, 43.3, 44.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 46.2],
                        2014:[52.0, 52.2, 3.3, 4.5, 6.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2],
                        2015:[2.0, 2.2, 3.3, 64.5, 66.3, 10.2, 20.3, 23.4, 23.0, 16.5, 12.0, 6.2],
                        2016:[2.0, 2.2, 3.3, 4.5, 6.3, 10.2, 270.3, 23.4, 23.0, 167.5, 127.0, 76.2]
                    })
                    option = {
                        baseOption:{
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
                                    '2011-01-01','2012-01-01','2013-01-01','2014-01-01','2015-01-01','2016-01-01'
                                ],
                                label: {
                                    formatter : function(s) {
                                        return (new Date(s)).getFullYear();
                                    }
                                },

                            },
                            title: {
                                subtext: '数据来自国家统计局'
                            },
                            color: colors,
                            tooltip: {
                                trigger: 'axis',
                                axisPointer: {
                                    type: 'cross'
                                }
                            },
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
                            legend: {
                                data:['开办企业所需手续数(个)','开办企业所需时间（天)','开办企业成本占人均收入比重（%）']
                            },
                            xAxis: [
                                {
                                    'type':'category',
                                    'axisLabel':{'interval':0},
                                    'data':[
                                        '北京','\n天津','河北','\n山西','内蒙古','\n辽宁','吉林','\n黑龙江',
                                        '上海','\n江苏','浙江','\n安徽','福建','\n江西','山东','\n河南',
                                        '湖北','\n湖南','广东','\n广西','海南','\n重庆','四川','\n贵州',
                                        '云南','\n西藏','陕西','\n甘肃','青海','\n宁夏','新疆'
                                    ],
                                    splitLine: {show: false}
                                }
                            ],
                            yAxis: [
                                {
                                    type: 'value',
                                    name: '手续数(个)',
                                    min: 0,
                                    max: 250,
                                    position: 'left',
                                    axisLine: {
                                        lineStyle: {
                                            color: colors[0]
                                        }
                                    },
                                    axisLabel: {
                                        formatter: '{value} 个'
                                    }
                                },
                                {
                                    type: 'value',
                                    name: '时间（天)',
                                    min: 0,
                                    max: 25,
                                    position: 'right',
                                    axisLine: {
                                        lineStyle: {
                                            color: colors[1]
                                        }
                                    },
                                    axisLabel: {
                                        formatter: '{value} 天'
                                    }
                                },
                                {
                                    type: 'value',
                                    name: '比重（%）',
                                    min: 0,
                                    max: 100,
                                    offset: 80,
                                    position: 'right',
                                    axisLine: {
                                        lineStyle: {
                                            color: colors[1]
                                        }
                                    },
                                    axisLabel: {
                                        formatter: '{value} %'
                                    }
                                }
                            ],
                            series: [
                                {name: '开办企业所需手续数(个)', type: 'bar'},
                                {name: '开办企业所需时间（天)', type: 'bar'},
                                {name: '开办企业成本占人均收入比重（%）', type: 'bar'}
                            ]

                        },

                        options:[
                            {
                                title: {text: '2011企业开业成本'},
                                series: [
                                    {data: dataMap.dataCZ['2011']},
                                    {data: dataMap.dataMD['2011']},
                                    {data: dataMap.dataBZ['2011']},
                                ]
                            },
                            {
                                title: {text: '2012企业开业成本'},
                                series: [
                                    {data: dataMap.dataCZ['2012']},
                                    {data: dataMap.dataMD['2012']},
                                    {data: dataMap.dataBZ['2011']},
                                ]
                            },
                            {
                                title: {text: '2013企业开业成本'},
                                series: [
                                    {data: dataMap.dataCZ['2013']},
                                    {data: dataMap.dataMD['2013']},
                                    {data: dataMap.dataBZ['2011']},
                                ]
                            },
                            {
                                title: {text: '2014企业开业成本'},
                                series: [
                                    {data: dataMap.dataCZ['2014']},
                                    {data: dataMap.dataMD['2014']},
                                    {data: dataMap.dataBZ['2011']},
                                ]
                            },
                            {
                                title: {text: '2015企业开业成本'},
                                series: [
                                    {data: dataMap.dataCZ['2015']},
                                    {data: dataMap.dataMD['2015']},
                                    {data: dataMap.dataBZ['2011']},
                                ]
                            },
                            {
                                title: {text: '2016企业开业成本'},
                                series: [
                                    {data: dataMap.dataCZ['2016']},
                                    {data: dataMap.dataMD['2016']},
                                    {data: dataMap.dataBZ['2011']},
                                ]
                            }
                        ]
                    };
                    ;
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




    </script>
</body>
</html>
