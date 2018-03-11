//定义显示/隐藏行（国家）方法
$(function(){
    var selectInput = $("#selectBtn input");
    selectInput.bind("click",function(){

        if(this.checked){
            if($(this).attr("name")==="checkCol"){
                $("#"+$(this).attr("title")).slideDown(1000);
//                var trId = $("#"+$(this).attr("title"));
//                var tdNum = trId.children("td");
//                for(var z=0;z<tdNum.length;z++){
//
//                }
                $("#"+$(this).attr("title")).children("td").fadeIn(400);
            }else if($(this).attr("name")==="checkRow"){
                var formTable = $("#zdoForm table");
                var theadTh = formTable.find("th");
                var inputTitle = $(this).attr("title");
                for(var i=0;i<theadTh.length;i++){
                    var thId = $(this).parent().prev().find("th").eq(i).attr("id");
                    var tbodyTr = $(this).parent().prev().find("tr");

                    if(thId==inputTitle){
                        $("#"+$(this).attr("title")).fadeIn(400);
                        for(var j=0;j<tbodyTr.length;j++){
                            tbodyTr.eq(j).children("td").eq(i).fadeIn(400);
                        }
                    }
                }
            }
        }else{
            if($(this).attr("name")==="checkCol"){
                $("#"+$(this).attr("title")).slideUp("normal");
                $("#"+$(this).attr("title")).children("td").fadeOut(200);
            }else if($(this).attr("name")==="checkRow"){
                var formTable = $("#zdoForm table");
                var theadTh = formTable.find("th");
                var inputTitle = $(this).attr("title");
                for(var i=0;i<theadTh.length;i++){
                    var thId = $(this).parent().prev().find("th").eq(i).attr("id");
                    var tbodyTr = $(this).parent().prev().find("tr");

                    if(thId==inputTitle){
                        $("#"+$(this).attr("title")).fadeOut(400);
                        for(var j=0;j<tbodyTr.length;j++){
                            tbodyTr.eq(j).children("td").eq(i).fadeOut(400);
                        }
                    }
                }

            }
        }

    })
})
