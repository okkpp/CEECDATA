//  获取表格列数据
function getTableColumns(remoteData) {
    var columns = [];
    var yearFunc = function() {};

    var countryObj = { field:'country', title:'国家' };
    columns.push(countryObj);
    for (var i = 1; i <= remoteData.yearList.length; i++) {
        var yearObj = new yearFunc();
        yearObj.field = 'year'+i;
        var num = i-1;
        // console.log(remoteData.yearList[num]);
        yearObj.title = remoteData.yearList[num];
        columns.push(yearObj);
    }
    // console.log(columns);
    return columns;
}

//  获取表格数据
function getTableDatas(remoteData,param) {
    var datas = [];
    var obj = function() {};
    for (var key in remoteData.countries) {
        var Obj = new obj();
        Obj.country = key;
        // console.log(remoteData.countries[key]);
        for(var i = 0; i < remoteData.countries[key].length; i++) {
            var num = i+1;
            var value = 'year'+num;
            Obj[value] = remoteData.countries[key][i][param];
        }
        datas.push(Obj);
    }
    // console.log(datas);
    return datas;
}

//组装表格
function setTableData(data,obj) {
    for(var country in data.countries){
        var tmp="";
        $.each(data.countries[country],function (index,value) {
            if(index=="0"){
                tmp+='<tr><td rowspan="'+data.countries[country].length+'" style="font-size:1.5em;text-align: center;display: table-cell;vertical-align: inherit;">'+value.country+'</td>';
                //$('#tableData').html($('#tableData').html()+'<tr><td rowspan="6" style="font-size:1.5em;text-align: center;display: table-cell;vertical-align: inherit;">阿尔巴尼亚</td>')
                tmp+='<td>'+value.year+'</td>';
                //$('#tableData').html($('#tableData').html()+'<td>'+value.year+'</td>');
                $.each(data.fieldName,function (index2,value2) {
                    if(value[value2]==undefined){
                        tmp+='<td>-</td>';
                    }else {
                        tmp+='<td>'+value[value2]+'</td>';
                    }
                    //$('#tableData').html($('#tableData').html()+'<td>'+value[value2]+'</td>');
                });
                tmp+='</tr>';
                //$('#tableData').html($('#tableData').html()+'</tr>');
            }else {
                tmp+='<tr><td>'+value.year+'</td>';
                //$('#tableData').html($('#tableData').html()+'<tr><td>'+value.year+'</td>');
                $.each(data.fieldName,function (index2,value2) {
                    if(value[value2]==undefined){
                        tmp+='<td>-</td>';
                    }else {
                        tmp+='<td>'+value[value2]+'</td>';
                    }
                    //$('#tableData').html($('#tableData').html()+'<td>'+value[value2]+'</td>');
                });
                tmp+='</tr>';
                //$('#tableData').html($('#tableData').html()+'</tr>');
            }
        });
        obj.append(tmp);
    }
}

//  初始化表格
function generalTable(remoteData,param,tabObj) {
    var tableColumns = getTableColumns(remoteData);
    var tableDatas = getTableDatas(remoteData,param);
    tabObj.bootstrapTable({
        striped: true,
        columns: tableColumns,
        data: tableDatas,
    });
}

//设置series标题
function setSeriesTitle(data) {
    var res="[";
    $.each(data.fieldName,function (index,value) {
        res+="{name: '"+data.fieldName[index]+"',type: 'bar'},";
    });
    res+="]";
    // console.log(res);
    return eval("("+res+")");
}

//组装legend
function setLegend(data) {
    // console.log(data.fieldName);
    return data.fieldName;
}

//组装年份
function setYears(data) {
    console.log(eval("(["+data.yearList+"])"));
    return eval("(["+data.yearList+"])");
}

//组装国家
function setCountries(data) {
    res=[];
    for(var country in data.countries){
        res.push(country);
    }
    // console.log(res);
    return res;
}

//组装options2
function setOptions2(data) {
    var res="[";
    //for(var tmp_year in data){
    $.each(data,function (index,value) {
        res+="{series: [";
        $.each(value,function (index2,value2) {
            res+="{type: 'bar','data':["+value2+"]},";
        });
        res+="]},";
    });
    res+="]";
    // console.log(res);
    return eval("("+res+")");
}

//组装options
function setOptions(data) {
    var tmp = {};
    var year = data.yearList;
    $.each(year,function (index,value) {
        tmp[value]=[];
        for(var i=0;i<data.fieldName.length;i++) {
            tmp[value].push([]);
        }
    });
    for(var country in data.countries){
        $.each(data.countries[country],function (index,value) {
            $.each(data.fieldName,function (index1,value1) {
                if(typeof(value[value1])==undefined){
                    tmp[value["year"]][index1].push(0);
                }else {
                    tmp[value["year"]][index1].push(value[value1]);
                }
                //console.log(value[value1]);
            });
        });
    }
    // console.log(JSON.stringify(tmp));
    return setOptions2(tmp);
}


// Ajax获取数据
function getRemoteData(url) {

    var baseUrl = '/CEECDATA';

    var dataUrl = baseUrl + url;

    var data;

    $.ajax({
        type: 'get',
        async: false,
        dataType: 'json',
        url : dataUrl,
        success: function(result) {
            // console.log(data);
            data = result;
        }
    })

    return data;
}