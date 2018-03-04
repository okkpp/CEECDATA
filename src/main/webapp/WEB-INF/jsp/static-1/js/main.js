$(function(){
    var Con_zdo = $(".zdomap .con-zdo"),
        Tap_zdo = $(".zdomap .tap-zdo"),
        x = 0;
       // console.log("suceess")
    
    Tap_zdo.hide();
    Con_zdo.mouseenter(function(){
        x = $(this).index();
         Tap_zdo.hide().eq(x).fadeIn(800); //先把这里注释掉
          // console.log("entered")   //控制台输出entered字符串

    })
    Con_zdo.mouseleave(function(){
        x = $(this).index();
        Tap_zdo.stop().eq(x).fadeOut(500);
            // console.log("leave");   
//这样就说明这两个enter和leave事件有问题，所以把这两个东西都注释掉，再控制台输出
   });
});
