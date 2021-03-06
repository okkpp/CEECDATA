<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>企业经营环境排名——中东欧统计数据库</title>
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
                <h3>土地利用</h3>
                <br>
                <h4 style="margin-top: -20px;">Land Utilization</h4>
            </div>

            <div style="text-align: right;">单位:&nbsp;万公顷</div>

            <table id="tableData"></table>
        </div>

        <div id="imageView">
            <div class="page-header" style="text-align: center;">
                <h3>土地利用</h3>
                <br>
                <h4 style="margin-top: -20px;">Land Utilization</h4>
            </div>

            <div class="panel" style="margin-top: 40px;">
                <div id="main" style="width: 100%;height:400px;">
                  <script type="text/javascript">
                      var dom = document.getElementById("main");
                      var myChart = echarts.init(dom);
                      var app = {};
                      option = null;
                      option = {
                          title : {

                              subtext: '',

                          },
                          tooltip : {
                              trigger: 'item'
                          },
                          legend: {
                              show:'true',
                              data:['陆地面积','耕地面积','森林面积'],

                          },

                          calculable : true,
                          xAxis : [
                              {
                                  type : 'category',
                                  data : ['阿尔巴尼亚','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
                              }
                          ],
                          yAxis : [
                              {
                                  type : 'value',
                                  name: '万公顷'
                              }
                          ],
                          series : [
                              {
                                  name:'陆地面积',
                                  type:'bar',
                                  data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],


                              },
                              {
                                  name:'耕地面积',
                                  type:'bar',
                                  data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],


                              },
                              {
                                  name:'森林面积',
                                  type:'bar',
                                  data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],


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
                    field: 'landArea',
                    title: '陆地面积'
                },
                {
                    field: 'arableArea',
                    title: '耕地面积'
                },
                {
                    field: 'forestArea',
                    title: '森林面积'
                },


            ],
            data: [
                {
                    country: '阿尔巴尼亚',
                    landArea: '274',
                    arableArea: '62',
                    forestArea: '77'
                },
                {
                    country: '波黑',
                    landArea: '274',
                    arableArea: '62',
                    forestArea: '77'
                },
                {
                    country: '保加利亚',
                    landArea: '274',
                    arableArea: '62',
                    forestArea: '77'
                }
            ]
        });


    </script>
</body>
</html>
