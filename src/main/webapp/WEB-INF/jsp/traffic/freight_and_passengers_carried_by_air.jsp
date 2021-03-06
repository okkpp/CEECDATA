<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<!--
    	作者：陈周云
    	时间：2018-03-15
    	描述：
    -->

	<head lang="zh-CN">
		<title>空运货物周转量和客运量</title>

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
				    <li role="presentation" id="tableTag"><a href="javascript:;" onclick="showTable()">&nbsp;<span class="glyphicon glyphicon-th-large"></span>&nbsp;</a></li>
				    <li role="presentation" id="imageTag"><a href="javascript:;" onclick="showImage()">&nbsp;<span class="glyphicon glyphicon-tasks"></span>&nbsp;</a></li>
				</ul>
			</div>

			<div id="tableView">
				<div class="page-header" style="text-align: center;">
					<h3>空运货物周转量和客运量</h3>
					<br>
					<h4 style="margin-top: -20px;">Freight and Passengers Carried by Air</h4>
				</div>

				<table class="table table-hover table-striped">
					<tr>
						<td>国家或地区</td>
						<td>时间</td>
						<td>空运货物周转量（万吨公里）</td>
						<td>航空客运量（万人）</td>
					</tr>
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">阿尔巴尼亚</div>
						</td>
						<td>2005</td>
						<td>0.1</td>
						<td>195702</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>0</td>
						<td>768533</td>
					</tr>
					<tr>
						<td>2015</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">爱沙尼亚</div></td>
						<td>2005</td>
						<td>1.302</td>
						<td>577808</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>4.148</td>
						<td>582320.202753145</td>
					</tr>
					<tr>
						<td>2015</td>
						<td>0.870362136</td>
						<td>512388.96</td>
					</tr>
					
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">保加利亚</div></td>
						<td>2005</td>
						<td>3.105</td>
						<td>653703</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>2.13518</td>
						<td>801840</td>
					</tr>
					<tr>
						<td>2015</td>
						<td>1.58334</td>
						<td>1118689.8</td>
					</tr>
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;"><div style="text-align: center; padding-top: 15%;">波兰</div></td>
						<td>2005</td>
						<td>71.284</td>
						<td>3553680</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>76.606040095</td>
						<td>4099082</td>
					</tr>
					<tr>
						<td>2015</td>
						<td>120.016465876</td>
						<td>4841128.645</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">黑山</div></td>
						<td>2005</td>
						<td>0.123</td>
						<td>383140</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>0</td>
						<td>659355.414807816</td>
					</tr>
					<tr>
						<td>2015</td>
						<td>0</td>
						<td>526980</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">捷克共和国</div></td>
						<td>2005</td>
						<td>38.757</td>
						<td>4706226</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>17.987</td>
						<td>5145187</td>
					</tr>
					<tr>
						<td>2015</td>
						<td>26.61965</td>
						<td>4971616.027</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">克罗地亚</div></td>
						<td>2005</td>
						<td>3.999</td>
						<td>2099000</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>1.516001</td>
						<td>1577226</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>0.77532</td>
						<td>1782666</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">拉脱维亚</div></td>
						<td>2005</td>
						<td>1.947</td>
						<td>1032128</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>5.483</td>
						<td>3158051</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>2.277996</td>
						<td>2527368</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">立陶宛</div></td>
						<td>2005</td>
						<td>1.295</td>
						<td>505409</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>2.6402227027027</td>
						<td>81450</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>0.56564267</td>
						<td>1363950.289</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">罗马尼亚</div></td>
						<td>2005</td>
						<td>5.161</td>
						<td>1707714</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>5.163786</td>
						<td>3733253</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>4.69128</td>
						<td>3636642.834</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">马其顿</div></td>
						<td>2005</td>
						<td>0.111</td>
						<td>191977</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>0</td>
						<td>0</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>0</td>
						<td>0</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">塞尔维亚</div></td>
						<td>2005</td>
						<td>4.578</td>
						<td>918540</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>2.133</td>
						<td>985072</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>2.748</td>
						<td>2424886.552</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">斯洛伐克</div></td>
						<td>2005</td>
						<td>0.317</td>
						<td>711939</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>0</td>
						<td>74856</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>0</td>
						<td>11100</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">斯洛文尼亚</div></td>
						<td>2005</td>
						<td>2.639</td>
						<td>757651</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>1.533</td>
						<td>979803</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>1.349442</td>
						<td>1130637.573</td>
					</tr>
					 
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">匈牙利</div></td>
						<td>2005</td>
						<td>21.429</td>
						<td>2735214</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>5.60895570713066</td>
						<td>12477063.18</td>
					</tr>
					 
					<tr>
						<td>2015</td>
						<td>0</td>
						<td>20042184.96</td>
					</tr>
					<tr>
						<td rowspan="3" style="font-size:20px;text-align: center;">
							<div style="text-align: center; padding-top: 15%;">波黑</div></td>
						<td>2005</td>
						<td>0</td>
						<td>0</td>
					</tr>
					<tr>
						<td>2010</td>
						<td>0.00133914808477711</td>
						<td>56485.16182</td>
					</tr>

					<tr>
						<td>2015</td>
						<td>0.00008772</td>
						<td>7070.748</td>
					</tr>
				</table>
			</div>

			<div id="imageView">
				<div class="page-header" style="text-align: center;">
					<h3>空运货物周转量和客运量柱状图</h3>
					<br>
					<h4 style="margin-top: -20px;"">Freight and Passengers Carried by Air</h4>
				</div>

				<div class="panel" style="margin-top: 40px;">
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

		$('#tableData').bootstrapTable({
			striped: true,
			columns: [
			    {
					field: 'country',
					title: '国家或地区',
				},
				{
					field: 'year1',
					title: '2005年'
				},
				{
					field: 'year2',
					title: '2010年'
				},
				{
					field: 'year3',
					title: '2015年'
				},
			],
			data: [
                {
                    country:"阿尔巴尼亚",
                    year1:"0.1",
                    year2:"0",
                    year3:"0",
                },
                {
                    country:"爱沙尼亚",
                    year1:"1.302",
                    year2:"4.148",
                    year3:"0.870362136",
                },
                {
                    country:"保加利亚",
                    year1:"3.105",
                    year2:"2.13518",
                    year3:"1.58334",
                },
                {
                    country:"波兰",
                    year1:"71.284",
                    year2:"76.6060401",
                    year3:"120.0164659",
                },
                {
                    country:"黑山",
                    year1:"0.123",
                    year2:"0",
                    year3:"0",
                },
                {
                    country:"捷克",
                    year1:"38.757",
                    year2:"17.987",
                    year3:"26.61965",
                },
                {
                    country:"克罗地亚",
                    year1:"3.999",
                    year2:"1.516001",
                    year3:"0.77532",
                },
                {
                    country:"拉脱维亚",
                    year1:"1.947",
                    year2:"5.483",
                    year3:"2.277996",
                },
                {
                    country:"立陶宛",
                    year1:"1.295",
                    year2:"2.640222703",
                    year3:"0.56564267",
                },
                {
                    country:"罗马尼亚",
                    year1:"5.161",
                    year2:"5.163786",
                    year3:"4.69128",
                },
                {
                    country:"马其顿",
                    year1:"0.111",
                    year2:"0",
                    year3:"0",
                },
                {
                    country:"塞尔维亚",
                    year1:"4.578",
                    year2:"2.133",
                    year3:"2.748",
                },
                {
                    country:"斯洛伐克",
                    year1:"0.317",
                    year2:"0",
                    year3:"0",
                },
                {
                    country:"斯洛文尼亚",
                    year1:"2.639",
                    year2:"1.533",
                    year3:"1.349442",
                },
                {
                    country:"匈牙利",
                    year1:"21.429",
                    year2:"5.608955707",
                    year3:"0",
                },
                {
                    country:"波黑",
                    year1:"0",
                    year2:"0.001339148",
                    year3:"0.00008772",
                },
            ]
		});
		//tabledata2
		$('#tableData2').bootstrapTable({
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
					title: '2010年'
				},
				{
					field: 'year3',
					title: '2015年'
				},
			],
			data: [
                {
                    country:"阿尔巴尼亚",
                    year1:"195702",
                    year2:"768533",
                    year3:"0",
                },
                {
                    country:"爱沙尼亚",
                    year1:"577808",
                    year2:"582320.2028",
                    year3:"512388.96",
                },
                {
                    country:"保加利亚",
                    year1:"653703",
                    year2:"801840",
                    year3:"1118689.8",
                },
                {
                    country:"波兰",
                    year1:"3553680",
                    year2:"4099082",
                    year3:"4841128.645",
                },
                {
                    country:"黑山",
                    year1:"383140",
                    year2:"659355.4148",
                    year3:"526980",
                },
                {
                    country:"捷克",
                    year1:"4706226",
                    year2:"5145187",
                    year3:"4971616.027",
                },
                {
                    country:"克罗地亚",
                    year1:"2099000",
                    year2:"1577226",
                    year3:"1782666",
                },
                {
                    country:"拉脱维亚",
                    year1:"1032128",
                    year2:"3158051",
                    year3:"2527368",
                },
                {
                    country:"立陶宛",
                    year1:"505409",
                    year2:"81450",
                    year3:"1363950.289",
                },
                {
                    country:"罗马尼亚",
                    year1:"1707714",
                    year2:"3733253",
                    year3:"3636642.834",
                },
                {
                    country:"马其顿",
                    year1:"191977",
                    year2:"0",
                    year3:"0",
                },
                {
                    country:"塞尔维亚",
                    year1:"918540",
                    year2:"985072",
                    year3:"2424886.552",
                },
                {
                    country:"斯洛伐克",
                    year1:"711939",
                    year2:"74856",
                    year3:"11100",
                },
                {
                    country:"斯洛文尼亚",
                    year1:"757651",
                    year2:"979803",
                    year3:"1130637.573",
                },
                {
                    country:"匈牙利",
                    year1:"2735214",
                    year2:"12477063.18",
                    year3:"20042184.96",
                },
                {
                    country:"波黑",
                    year1:"0",
                    year2:"56485.16182",
                    year3:"7070.748",
                }


            ]
		});

		var all = {
			"data": [
                ['0.1', '1.302', '3.105', '71.284', '0.123', '38.757', '3.999', '1.947', '1.295', '5.161', '0.111', '4.578', '0.317', '2.639', '21.429', '0'],
                ['0', '4.148', '2.13518', '76.6060401', '0', '17.987', '1.516001', '5.483', '2.640222703', '5.163786', '0', '2.133', '0', '1.533', '5.608955707', '0.001339148'],
                ['0', '0.870362136', '1.58334', '120.0164659', '0', '26.61965', '0.77532', '2.277996', '0.56564267', '4.69128', '0', '2.748', '0', '1.349442', '0', '0.00008772'],
                ['195702', '577808', '653703', '3553680', '383140', '4706226', '2099000', '1032128', '505409', '1707714', '191977', '918540', '711939', '757651', '2735214', '0'],
                ['768533', '582320.2028', '801840', '4099082', '659355.4148', '5145187', '1577226', '3158051', '81450', '3733253', '0', '985072', '74856', '979803', '12477063.18', '56485.16182'],
                ['0', '512388.96', '1118689.8', '4841128.645', '526980', '4971616.027', '1782666', '2527368', '1363950.289', '3636642.834', '0', '2424886.552', '11100', '1130637.573', '20042184.96', '7070.748']
            ],
			"countrys": ["阿尔巴尼亚","爱沙尼亚","保加利亚","波兰","黑山","捷克","克罗地亚","拉脱维亚","立陶宛","罗马尼亚","马其顿","塞尔维亚","斯洛伐克","斯洛文尼亚","匈牙利","波黑"],
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
						data: ['空运货物周转量（万吨公里）', '航空客运量（万人）']
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
						name: '空运货物周转量（万吨公里）',
						type: 'bar',
						data: all.data[0]
					}, {
						name: '航空客运量（万人）',
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