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
  <script type="text/javascript" src="../zdo_static/js/echarts.js"></script>
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
        <th>人均可再生淡水资源</th>
    </thead>
    <tbody>
    	<c:forEach items="${data}" var="v">
			<tr>
            	<td>${v.country}</td>
            	<td class="numCenter">${v.renewable}</td>
        	</tr>
		</c:forEach> 
        <tr>
            <td>阿尔巴尼亚</td>
            <td class="numCenter">999999</td>
        </tr>
        <tr>
            <td>爱沙尼亚</td>
            <td class="numCenter">888888</td>
        </tr>
        <tr>
            <td>罗马尼亚</td>
            <td class="numCenter">777777</td>
        </tr>
        <tr>
            <td>哥伦比亚</td>
            <td class="numCenter">666666</td>
        </tr>
        <tr>
            <td>泰坦尼亚</td>
            <td class="numCenter">555555</td>
        </tr>
    </tbody>
</table>
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
                                  data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
                              },
                              yAxis: {
                                  type: 'value'
                              },
                              series: [{
                                  data: [120, 200, 150, 80, 70, 110, 130],
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
