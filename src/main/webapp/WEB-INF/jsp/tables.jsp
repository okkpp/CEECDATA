<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<meta name="viewport" content="initial-scale=1.0, maximum-scale=2.0">
<title>统计表</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/search/css/bootstrap4alpha.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/search/css/dataTables.bootstrap4.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/search/css/buttons.bootstrap4.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/search/css/shCore.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/search/css/demo.css">
<style type="text/css" class="init">
.right {
	font-size: 25px;
}

#light {
	width: 527px;
	float: left;
}

#Blight {
	background-color: #c8e5bc;
	float: right;
}

#example>thead>tr>th {
	text-align: center;
}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/dataTables.bootstrap4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/dataTables.buttons.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/buttons.bootstrap4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/jszip.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/pdfmake.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/vfs_fonts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/buttons.html5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/buttons.print.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/buttons.colVis.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/shCore.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/search/js/demo.js"></script>
</head>
<body class="dt-example dt-example-bootstrap4">
	<div class="container">
		<section>
			<div class="panel panel-default">
				<div class="panel-body">
					<table id="example" class="table table-bordered table-striped table-hover">
						<thead>
							<tr id="table_tr"></tr>
						</thead>
						<tbody>
						</tbody>
					</table>
				</div>
			</div>
		</section>
	</div>
	<script type="text/javascript" class="init">
		var dataTable;
		$(function() {
			var info = GetRequest()
			getData(info);
		});

		function GetRequest() {
			var url = location.search; //获取url中"?"符后的字串   
			var info = url.split("?")[1];
			return info;
		}

		function getData(info) {
			var str = "getContentByCondition.do?" + info;
			$.ajax({
				url : str,
				type : "GET",
				success : function(result) {
					$("#search_result").empty();
					result = eval('(' + result + ')');
					//console.log(result);
					if (result.extend.dataType == "type1") {
						console.log(result);
						var title = "[{'data':'国家'},";
						setData(title,result);
					} else if (result.extend.dataType == "type2") {
						var title = "[{'data':'国家'},{'data':'指标'},";
						setData(title,result)
					}else if(result.extend.dataType == "type3"){
						console.log(result);
						 var str = "[{'data':'指标'}]";
						 str = eval('(' + str + ')');
						$.each(result.extend.data, function(index, item) {
							var tr = $("<tr></tr>");
							console.log("item = " + item.split("（")[0]);
							var a = "<a onclick=\"doSomething('"+item+"')\">"+item+"</a>";
							console.log(a);
							tr.append($("<td></td>").append(a));
							tr.appendTo("#example tbody");
						});
						showData(str);
					}
				}
			})
		}
		
		function setData(title,result){
			var str = title;
			 for ( var i in result.extend.data[1].fields) {
				str += "{'data':'" + i + "'},";
			}	
			$.each(result.extend.data, function(index, item) {
				var tr = $("<tr></tr>");
				tr.append($("<td></td>").append(item.country));
				tr.append($("<td></td>").append(item.target));
				for ( var i in item.fields) {
					if (item.fields[i] == "") {
						tr.append($("<td></td>").append("/"));
					} else {
						var value = parseFloat(item.fields[i])
								.toFixed(2);
						tr.append($("<td></td>").append(value));
					}
				}
				tr.appendTo("#example tbody");
			});
			//去除末尾逗号
			str = str.substring(0, str.length - 1);
			str += "]";
			str = eval('(' + str + ')');
			showData(str);
		}

		function showData(columName) {
			for (var i = 0; i < columName.length; i++) {
				$("#example thead tr").append(
						"<th>" + columName[i].data + "</th>");
			}
			var table = $('#example').DataTable({
				ordering : false,//是否启用排序
				searching : true,//搜索
				language : {
					lengthMenu : '显示 <select style="height: 35px;width: 100px">'
					+ '<option value="5">5</option>'
					+ '<option value="10">10</option>'
					+ '<option value="20">20</option>'
					+ '<option value="30">30</option>'
					+ '<option value="40">40</option>'
					+ '<option value="50">50</option>'
					+ '<option value="-1">不限</option>'
					+ '</select>',
					paginate : {//分页的样式内容。
						previous : "上一页",
						next : "下一页",
						first : "首页",
						last : "末页"
					},
				zeroRecords : "没有内容",//table tbody内容为空时，tbody的内容。
				//下面三者构成了总体的左下角的内容。
				info : "总共_PAGES_ 页，显示第_START_ 到第 _END_ ，筛选之后得到 _TOTAL_ 条，初始_MAX_ 条 ",//左下角的信息显示，大写的词为关键字。
				infoEmpty : "0条记录",//筛选为空时左下角的显示。
				infoFiltered : ""//筛选之后的左下角筛选提示，
				},
				paging : true,
				pagingType : "full_numbers",//分页样式的类型
				data : dataTable,
				lengthChange : true,
				columns : columName,
				'dom' : '<"left"f>r<"right"<"#light"l><"Blight"B>>tip',
				buttons : [ 'excel' ],
				createdRow : function(row, data, index) {
				$('td', row).css('font-weight', "bold").css("text-align", "center");
				},
			});
		}
		
		function doSomething(item){
			alert(item);
			window.location.href="http://localhost:8080/CEECDATA/solr/searchResult.do?info=" + item;
		}
	</script>
</body>
</html>