<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<!-- 
    @author: 胡校辉
    @title: 港口集装箱吞吐量
 -->
<head lang="zh-CN">
<title>港口集装箱吞吐量</title>

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
					<a href="javascript:;" onclick="showTable()">
						&nbsp;
						<span class="glyphicon glyphicon-th-large"></span>
						&nbsp;
					</a>
				</li>
				<li role="presentation" id="imageTag">
					<a href="javascript:;" onclick="showImage()">
						&nbsp;
						<span class="glyphicon glyphicon-tasks"></span>
						&nbsp;
					</a>
				</li>
			</ul>
		</div>

		<div id="tableView">
			<div class="page-header" style="text-align: center;">
				<h3>港口集装箱吞吐量</h3>
				<br>
				<h4 style="margin-top: -20px;">Goods and Services Tax as Percentage of Revenue</h4>
			</div>

			<div style="text-align: right;">单位:&nbsp;标准集装箱(TEUs)</div>
			<table id="tableData"></table>
		</div>

		<div id="imageView">
			<div class="page-header" style="text-align: center;">
				<h3>港口集装箱吞吐量柱状图</h3>
				<br>
				<h4 style="margin-top: -20px;">Goods and Services Tax as Percentage of Revenue</h4>
			</div>

			<div class="panel" style="margin-top: 40px;">
				<div style="text-align: right;">单位:&nbsp;标准集装箱(TEUs)</div>
				<div id="main" style="width: 100%; height: 400px;"></div>
			</div>
		</div>

		<div style="color: #666666; margin-top: 15px;">
			*此数据仅展现最近五年，若需全部数据请点击
			<a href="#" class="btn btn-info btn-xs">
				<span class="glyphicon glyphicon-save"></span>
				下载
			</a>
		</div>

		<!-- <div style="text-align: right;"><div id="page"></div></div> -->
	</div>
</body>
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
                title: '2009年'
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
                country: '阿尔巴尼亚',
                year1: '68780',
                year2: '86875',
                year3: '91826.88',
                year4: '98713.89',
                year5: '109000',
                year6: '99000',
            },
            {
                country: '爱沙尼亚',
                year1: '130939',
                year2: '151969',
                year3: '197717',
                year4: '174926',
                year5: '188745.15',
                year6: '198371.16',
            },
            {
                country: '波黑',
                year1: '',
                year2: '22.67',
                year3: '44.86',
                year4: '43.86',
                year5: '42.98',
                year6: '',
            },
            {
                country: '保加利亚',
                year1: '136444',
                year2: '142611',
                year3: '150739.82',
                year4: '162045.31',
                year5: '174846.89',
                year6: '183764.09',
            },
            {
                country: '波兰',
                year1: '671552',
                year2: '1045232',
                year3: '1361164.67',
                year4: '1669402.95',
                year5: '1976474.98',
                year6: '2051717.60',
            },
            {
                country: '黑山',
                year1: '',
                year2: '',
                year3: '',
                year4: '',
                year5: '',
                year6: '',
            },
            {
                country: '捷克共和国',
                year1: '',
                year2: '',
                year3: '',
                year4: '',
                year5: '',
                year6: '',
            },
            {
                country: '克罗地亚',
                year1: '130740',
                year2: '137048',
                year3: '144859.74',
                year4: '155724.22',
                year5: '168026.43',
                year6: '176595.78',
            },
            {
                country: '罗马尼亚',
                year1: '594299',
                year2: '556694',
                year3: '662796',
                year4: '684059',
                year5: '738099.66',
                year6: '775742.74',
            },
            {
                country: '立陶宛',
                year1: '247982',
                year2: '294954',
                year3: '382200',
                year4: '381300',
                year5: '402500',
                year6: '423027.5',
            },
            {
                country: '拉脱维亚',
                year1: '184399',
                year2: '256713.18',
                year3: '305338.76',
                year4: '308425',
                year5: '332790.58',
                year6: '349762.89',
            },
            {
                country: '马其顿',
                year1: '',
                year2: '',
                year3: '',
                year4: '',
                year5: '',
                year6: '',
            },
            {
                country: '塞尔维亚',
                year1: '',
                year2: '',
                year3: '',
                year4: '',
                year5: '',
                year6: '',
            },
            {
                country: '斯洛伐克',
                year1: '',
                year2: '',
                year3: '',
                year4: '',
                year5: '',
                year6: '',
            },
            {
                country: '斯洛文尼亚',
                year1: '343165',
                year2: '476731',
                year3: '589314',
                year4: '570744',
                year5: '615832.78',
                year6: '647240.25',
            },
            {
                country: '匈牙利',
                year1: '',
                year2: '',
                year3: '',
                year4: '',
                year5: '',
                year6: '',
            },

        ]
    });

    var options={
        bootstrapMajorVersion:1,    //版本
        currentPage:1,    //当前页数
        numberOfPages:5,    //最多显示Page页
        totalPages:10,    //所有数据可以显示的页数
        onPageClicked:function(e,originalEvent,type,page){


        }
    }
    $("#page").bootstrapPaginator(options);

    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));

    var dataS='["2009年","2010年","2011年","2012年","2013年","2014年"]';
    var dataNames='["nine","ten","eleven","twelve","thirteen","fourteen"]';
    var pageViews='[{"country":"阿尔巴尼亚","nine":"68780","ten":"86875","eleven":"91826.875","id":1,"pojoName":"containerporttraffic","twelve":"98713.89063","thirteen":"　109000","fourteen":"99000"},{"country":"爱沙尼亚","nine":"130939","ten":"151969","eleven":"197717","id":1,"pojoName":"containerporttraffic","twelve":"174926","thirteen":"188745.154","fourteen":"198371.1569"},{"country":"保加利亚","nine":"136444","ten":"142611","eleven":"150739.827","id":1,"pojoName":"containerporttraffic","twelve":"162045.314","thirteen":"174846.8938","fourteen":"183764.0854"},{"country":"波兰","nine":"671552","ten":"1045232","eleven":"1361164.671	","id":1,"pojoName":"containerporttraffic","twelve":"1669402.946","thirteen":"1976474.979","fourteen":"2051717.603"},{"country":"黑山","nine":"/","ten":"/","eleven":"/	","id":1,"pojoName":"containerporttraffic","twelve":"/","thirteen":"/","fourteen":"/"},{"country":"捷克共和国","nine":"/","ten":"/","eleven":"/	","id":1,"pojoName":"containerporttraffic","twelve":"/","thirteen":"/","fourteen":"/"},{"country":"克罗地亚","nine":"130740","ten":"137048","eleven":"144859.736	","id":1,"pojoName":"containerporttraffic","twelve":"155724.2162","thirteen":"168026.4293","fourteen":"176595.7772"},{"country":"拉脱维亚","nine":"184399","ten":"256713.18","eleven":"305338.7563","id":1,"pojoName":"containerporttraffic","twelve":"308425","thirteen":"332790.575","fourteen":"349762.8943"},{"country":"立陶宛","nine":"247982","ten":"294954","eleven":"382200","id":1,"pojoName":"containerporttraffic","twelve":"381300","thirteen":"402500","fourteen":"423027.5"},{"country":"罗马尼亚","nine":"594299","ten":"556694","eleven":"662796","id":1,"pojoName":"containerporttraffic","twelve":"684059","thirteen":"738099.661","fourteen":"775742.7437"},{"country":"马其顿","nine":"/","ten":"/","eleven":"/	","id":1,"pojoName":"containerporttraffic","twelve":"/","thirteen":"/","fourteen":"/"},{"country":"塞尔维亚","nine":"/","ten":"/","eleven":"/	","id":1,"pojoName":"containerporttraffic","twelve":"/","thirteen":"/","fourteen":"/"},	 {"country":"斯洛伐克","nine":"/","ten":"/","eleven":"/	","id":1,"pojoName":"containerporttraffic","twelve":"/","thirteen":"/","fourteen":"/"},{"country":"斯洛文尼亚","nine":"343165","ten":"476731","eleven":"589314	","id":1,"pojoName":"containerporttraffic","twelve":"570744","thirteen":"615832.776","fourteen":"647240.2476"},{"country":"匈牙利","nine":"/","ten":"/","eleven":"/	","id":1,"pojoName":"containerporttraffic","twelve":"/","thirteen":"/","fourteen":"/"},{"country":"波黑","nine":"/","ten":"/","eleven":"/	","id":1,"pojoName":"containerporttraffic","twelve":"/","thirteen":"/","fourteen":"/"}]';
    var datas = eval('(' + dataS + ')');
    var dataName = eval('(' + dataNames + ')');
    var pageView = eval('(' + pageViews + ')');

    var contry=new Array();
    var seriesData=new Array();
    for(var i=0;i<datas.length;i++){
        var obj=new Object();
        obj.name=datas[i];
        obj.type='bar';
        obj.data=new Array();
        seriesData.push(obj);
    }
    for(var i=0;i<pageView.length;i++){

        // 		var d=transform(pageView[i]);
        var contrys=pageView[i];
        var c=contrys['country'];
        contry.push(c);
    }

    var i=0;
    for(var j=0;j<dataName.length;j++){
        for(var k=0;k<pageView.length;k++){
            var b=pageView[k];
            var c=b[dataName[j]];
            seriesData[i].data.push(c);
        }
        i++;
    }
    function transform(obj){
        var arr = [];
        for(var item in obj){
            arr.push(obj[item]);
        }
        return arr;
    }
    // 	app.title = '堆叠柱状图';

    option = {
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        legend: {
            data:datas
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis : [
            {
                type : 'category',
                data : contry,
                axisLabel:{
                    interval:0,
                    inside:false,
                    rotate:30,
                }
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : seriesData
    };


    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
</script>
</html>