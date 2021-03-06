<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<!--
    	作者：林子捷
    	时间：2018-03-16
    	描述：
    -->

	<head lang="zh-CN">
		<title>电话主线普及率和移动电话普及率普及率
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
						<a href="javascript:;" onclick="showTable()">&nbsp;<span class="glyphicon glyphicon-th-large"></span>&nbsp;</a>
					</li>
					<li role="presentation" id="imageTag">
						<a href="javascript:;" onclick="showImage()">&nbsp;<span class="glyphicon glyphicon-tasks"></span>&nbsp;</a>
					</li>
				</ul>
			</div>

			<div id="tableView">
				<div class="page-header" style="text-align: center;">
					<h3>电话主线普及率和移动电话普及率普及率</h3>
					<br>
					<h4 style="margin-top: -20px;">telephone Mainlines And Mobile Phones.html</h4>
				</div>
				<div class="panel" style="margin-top: 40px;">
					<div style="text-align: right;">单位:&nbsp;条(部)/百人</div>
				</div>
				<table class="table table-hover table-striped">
					<tr>
						<td>国家</td>
						<td>时间</td>
						<td>电话主线普及率</td>
						<td>移动电话普及率</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">阿尔巴尼亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">爱沙尼亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">保加利亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">波兰</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">黑山</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">捷克</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">克罗地亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">拉脱维亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">立陶宛</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">罗马尼亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">马其顿</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">塞尔维亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">斯洛伐克</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">斯洛文尼亚</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一个国家的合并
                    -->
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">匈牙利</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 5%;">波黑</div>
						</td>
						<td>2000</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2014</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<!--
                    	作者：1622472966@qq.com
                    	时间：2018-03-15
                    	描述：一国结束
                    -->
				</table>
			</div>

			<!--
            	作者：1622472966@qq.com
            	时间：2018-03-14
            	描述：后部图表  移动电话普及率
            -->
			<div id="imageView">
				<div class="page-header" style="text-align: center;">
					<h3>电话主线普及率和移动电话普及率普及率</h3>
					<br>
					<h4 style="margin-top: -20px;">telephone Mainlines And Mobile Phones.html</h4>
				</div>

				<div class="panel" style="margin-top: 40px;">
					<div id="main" style="width: 100%;height:400px;"></div>
				</div>
			</div>

			<!-- <div style="text-align: right;"><div id="page"></div></div> -->
			<div style="color: #666666; margin-top: 15px;">*此数据仅展现最近3年，若需全部数据请点击
				<a href="#" class="btn btn-info btn-xs">
					<span class="glyphicon glyphicon-save"></span> 下载
				</a>
			</div>
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

		$('#tableData').bootstrapTable({
			striped: true,
			columns: [{
					field: 'country',
					title: '国家或地区',

				},
				{
					field: 'year2',
					title: '2000年'
				},
				{
					field: 'year3',
					title: '2005年'
				},
				{
					field: 'year4',
					title: '2014年'
				},
			],
			data: [{
					country: '阿尔巴尼亚',
					year2: '0',
					year3: '0',
					year4: '0',

				},
				{
					country: '爱沙尼亚',
					year2: '0',
					year3: '0',
					year4: '0',

				},
				{
					country: '保加利亚',
					year2: '2.62',
					year3: '0.75',
					year4: '0',

				},
				{
					country: '波兰',
					year2: '8.62',
					year3: '14.48',
					year4: '0',
					year5: '0',
					year6: '11.08',
				},
				{
					country: '黑山',
					year2: '0',
					year3: '1.07',
					year4: '0',

				}, {
					country: '捷克',
					year2: '25.25',
					year3: '10.66',
					year4: '0',

				}, {
					country: '克罗地亚',
					year2: '1.66',
					year3: '1.75',
					year4: '0',

				}, {
					country: '拉脱维亚',
					year2: '0',
					year3: '0',
					year4: '0',

				}, {
					country: '立陶宛',
					year2: '0',
					year3: '0',
					year4: '0',

				}, {
					country: '罗马尼亚',
					year2: '1.42',
					year3: '0.99',
					year4: '0',

				}, {
					country: '马其顿',
					year2: '1.55',
					year3: '0.38',
					year4: '0',

				}, {
					country: '塞尔维亚',
					year2: '2.58',
					year3: '0.79',
					year4: '0',

				}, {
					country: '斯洛伐克',
					year2: '2.58',
					year3: '0.79',
					year4: '0',

				}, {
					country: '斯洛文尼亚',
					year2: '1.30',
					year3: '1.00',
					year4: '0',
					year5: '0',
					year6: '0.85',
				}, {
					country: '匈牙利',
					year2: '19.69',
					year3: '20.34',
					year4: '0',
					year5: '0',
					year6: '6.16',
				},

			]
		});
		//tabledata2
		$('#tableData2').bootstrapTable({
			striped: true,
			columns: [{
					field: 'country',
					title: '国家或地区'
				},

				{
					field: 'year2',
					title: '2005年'
				},
				{
					field: 'year3',
					title: '2010年'
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
			data: [{
					country: '阿尔巴尼亚',
					year2: '0',
					year3: '0',
					year4: '0',

				},
				{
					country: '爱沙尼亚',
					year2: '0',
					year3: '0',
					year4: '0',

				},
				{
					country: '保加利亚',
					year2: '15.36',
					year3: '5.11',
					year4: '0',

				},
				{
					country: '波兰',
					year2: '8.62',
					year3: '14.48',
					year4: '0',
					year5: '0',
					year6: '11.08',
				},
				{
					country: '黑山',
					year2: '27.90',
					year3: '36.41',
					year4: '38.19',

				}, {
					country: '捷克',
					year2: '98.43',
					year3: '0',
					year4: '0',

				}, {
					country: '克罗地亚',
					year2: '5.85',
					year3: '4.10',
					year4: '0',

				}, {
					country: '拉脱维亚',
					year2: '0',
					year3: '0',
					year4: '0',

				}, {
					country: '立陶宛',
					year2: '0',
					year3: '0',
					year4: '0',

				}, {
					country: '罗马尼亚',
					year2: '8.96',
					year3: '11.81',
					year4: '0',

				}, {
					country: '马其顿',
					year2: '18.33',
					year3: '4.56',
					year4: '0',

				}, {
					country: '塞尔维亚',
					year2: '9.69',
					year3: '7.55',
					year4: '0',

				}, {
					country: '斯洛伐克',
					year2: '0.07',
					year3: '7.41',
					year4: '0',

				}, {
					country: '斯洛文尼亚',
					year2: '6.02',
					year3: '5.13',
					year4: '6.04',

				}, {
					country: '匈牙利',
					year2: '68.03',
					year3: '95.51',
					year4: '42.06',

				},

			]
		});

		var all = {
			"data": [
				//00
				[0, 0, 2.6, 1.7, 25.3, 0, 19.7, 0, 0, 1.6, 0, 8.6, 1.4, 2.6, 0.1, 1.3],
				//00
				[0, 0, 15.4, 5.9, 98.4, 0, 68, 0, 0, 18.3, 0, 27.9, 9, 9.7, 0.1, 6, ],
				//05 
				[0, 0, 5.1, 4.1, 0, 0, 95.5, 0, 0, 4.6, 1.4, 36.4, 11.8, 7.6, 7.4, 5.1],
				//05
				[0, 0, 0, 0, 0, 0, 6.2, 0, 0, 0, 0, 11.1, 0, 0, 0, 0.9],
				//14
				[0, 0, 0.8, 1.8, 10.7, 0, 20.3, 0, 0, 0.4, 1.1, 14.5, 1, 0.8, 0.3, 1],
				//14

			],
			"countrys": ["阿尔巴尼亚", "爱沙尼亚", "保加利亚", "波兰", "黑山", "捷克", "克罗地亚", "拉脱维亚", "立陶宛", "罗马尼亚", "马其顿", "塞尔维亚", "斯洛伐克", "斯洛文尼亚", "匈牙利", "波黑"],
			"years": ["2000年", "2005年", "2014年"]
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
						data: [' 电话主线普及率', ' 移动电话普及率']
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
						name: ' 电话主线普及率',
						type: 'bar',
						data: all.data[0]
					}, {
						name: ' 移动电话普及率',
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