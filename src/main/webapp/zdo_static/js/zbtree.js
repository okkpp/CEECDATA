//说明 所有的元素以ul li ul li ul li的循环格式嵌套 如果没有下级分类 就用li a结束嵌套
 $(document).ready(function(){
 //$("#zbtree ul li").children("ul").hide();
//     以下注释代码为 对无下级目录的主目录
 $("#zbtree").find("li").not(":has(ul)").children("a").css({background:"none"})
 .click(function(){
 $(this).get(0).location.href="'"+$(this).attr("href")+"'";
 });
 $("#zbtree").find("li:has(ul)").children("a").click(function(){
  if($(this).next("ul").is(":hidden")){
  $(this).next("ul").slideDown("slow");//slideDown方法，通过使用滑动效果，显示隐藏的被选元素
  if($(this).parent("li").siblings("li").children("ul").is(":visible")){ //siblings()是遍历方法，除被选元素的其他ul元素隐藏
  $(this).parent("li").siblings("li").find("ul").slideUp("1000");//slideUp()方法，隐藏被选元素，若该元素是显示状态时
  $(this).parent("li").siblings("li:has(ul)").children("a").css({background:"url(zdo_static/img/arrow2.png) no-repeat left center",backgroundSize:"auto"})
   .end().find("li:has(ul)").children("a").css({background:"url(zdo_static/img/arrow2.png) no-repeat left center",backgroundSize:"auto"});}
   $(this).css({background:"url(zdo_static/img/arrow2.png) no-repeat left center",backgroundSize:"auto"});
  return false;
 }else{
  $(this).next("ul").slideUp("normal");
  //不用toggle()的原因是为了在收缩菜单的时候同时也将该菜单的下级菜单以后的所有元素都隐藏
  $(this).css({background:"url(zdo_static/img/arrow1.png) no-repeat left center",backgroundSize:"auto"});
  $(this).next("ul").children("li").find("ul").fadeOut("normal");
  $(this).next("ul").find("li:has(ul)").children("a").css({background:"url(zdo_static/img/arrow1.png) no-repeat left center",backgroundSize:"auto"});
  return false;
  }
  });
 });
