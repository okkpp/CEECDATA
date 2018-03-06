<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>淡水资源——中东欧统计数据库</title>
  <link rel="stylesheet" href="../zdo_static/css/normalize.css">
  <link rel="stylesheet" href="../zdo_static/css/bootstrap.min.css">
  <link rel="stylesheet" href="../zdo_static/css/zdoData.css">
  <script type="text/javascript" src="../zdo_static/js/jquery-3.2.1.min.js"></script>
  <script type="text/javascript" src="../zdo_static/js/echarts.js"></script>
  <script src="../zdo_static/js/showORhidden.js"></script>
</head>
<body>
  <div id="zdodata">
  <!--           表格与数据图切换栏-->
      <div class="zdoTab">
          <input type="radio" name="radio-set" checked="checked" id="radio-form">
          <a href="#zdoForm"></a>
          <input type="radio" name="radio-set" id="radio-anal">
          <a href="#zdoAnalysis"></a>

  <!--            基础数据图表-->
      <section id="zdoForm">
          <form action="" method="">
            <table id="zdoTable" class="table table-striped table-bordered table-hover table-condensed">
                <thead>
                    <th>国家</th>
                    <th id="rjkzs">人均可再生淡水资源</th>

                </thead>
                <tbody>
					<c:forEach items="${data}" var="v">
						<tr>
            				<td>${v.country}</td>
            				<td class="numCenter">${v.renewable}</td>
        				</tr>
					</c:forEach>
                </tbody>
            </table>
            <div id="selectBtn">
                <!-- 行的显示|隐藏 -->
                <input type="checkbox" checked="checked" name="checkCol" title="aebny">阿尔巴尼亚
                <br>
                <!-- 列的显示|隐藏 -->
                <input type="checkbox" checked="checked" name="checkRow" title="rjkzs">人均可再生资源
            </div>
          </form>
      </section>
  <!--            数据图-->
      <section id="zdoAnalysis">
          <form action="" method="">
              <div id="analysis">
                  <script type="text/javascript">
                      var myChart = echarts.init(document.getElementById('analysis'));

                      var option = {
                              xAxis: {
                                  type: 'category',
                                  data: [<c:forEach items="${data}" var="v">'${v.country}',</c:forEach>]
                              },
                              yAxis: {
                                  type: 'value'
                              },
                              series: [{
                                  data: [<c:forEach items="${data}" var="v">${v.renewable},</c:forEach>],
                                  type: 'bar'
                              }]
                          };
                      myChart.setOption(option);
                  </script>
              </div>
          </form>
      </section>
      </div>
  </div>

</body>
</html>
