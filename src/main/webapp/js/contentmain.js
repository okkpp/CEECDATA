$(function(){
    var Con_zdo = $(".zdomap .con-zdo"),
        Tap_zdo = $(".zdomap .tap-zdo"),
        x = 0;
    
//    地图信息显示
    Tap_zdo.hide();
    Con_zdo.mouseenter(function(){
        x = $(this).index();
        Tap_zdo.hide().eq(x-1).fadeIn(800);
    })
    Con_zdo.mouseleave(function(){
        x = $(this).index();
        Tap_zdo.stop().eq(x-1).fadeOut(500);
    });
    
    //地图与指标间的切换
    var zdoMap_h = $("#zdomap-h"),
        zdoData_h = $("#zdodata-h"),
        changeData = $("#change-data"),
        changeMap = $("#change-map"),
        zdoMap = $(".zdomap"),
        zdoData = $(".zdodata");
    
    changeData.click(function(){
        zdoMap_h.css("display","none");
        zdoMap.css("display","none");
        zdoData_h.css("display","block");
        zdoData.css("display","block");
    })
    changeMap.click(function(){
        zdoData_h.css("display","none");
        zdoData.css("display","none");
        zdoMap_h.css("display","block");
        zdoMap.css("display","block");
    })
    
    //小指标显示
    var zdoDataTd = $("#zdo-data td"),
        zdoDataul = $(".zdodata ul")
        ;
    
    zdoDataul.hide();
    zdoDataTd.mouseenter(function(){
        x = $(this).index();
        
        zdoDataul.hide().eq(x).fadeIn(800);
    }).mouseleave(function(){
        zdoDataul.stop();
    })
    zdoDataul.mouseleave(function(){
        zdoDataul.stop().eq(x).fadeOut(500);
    })

   //各国小指标的显示
   var couDataTd = $("#country-data td"),
        couDataul = $(".coudata ul")
        ;
    
    couDataul.hide();
    couDataTd.mouseenter(function(){
        x = $(this).index();
        
        couDataul.hide().eq(x).fadeIn(800);
    }).mouseleave(function(){
        couDataul.stop();
    })
    couDataul.mouseleave(function(){
        couDataul.stop().eq(x).fadeOut(500);
    })
})