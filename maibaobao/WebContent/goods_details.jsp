<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>[卓妮尔]灵动春夏系列珠片褶皱手提包 </title>
<link href="styles/global.css" type="text/css" rel="stylesheet" />
<link href="styles/shangpin.css" type="text/css" rel="stylesheet" />
<script src="js/shangpin.js" type="text/javascript"></script>
<script src="js/SpryTabbedPanels.js" type="text/javascript"></script>
<link href="styles/SpryTabbedPanels.css" rel="stylesheet" type="text/css" />
<link href="styles/footer.css" rel="stylesheet" type="text/css"/>
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<link href="styles/toubu.css" rel="stylesheet" type="text/css" />
<script language="javascript">
function changePic(obj){	
	document.getElementById("showpic").src=obj.src;
	document.getElementById("bigpic").src=obj.src;
}
</script>

<script language="javascript">
function gouwuche(id){
	document.getElementById("id");
	window.location.href="wodegouwuche.html"
	}
</script>
<script language="javascript">
function shuliangjia(){
	var a=document.getElementById("shuliangjia");
	var b=document.getElementById("shuliang");
	var d=document.getElementById("yixuanzeshuliang");
	var c=b.outerText;
	c++;
	b.innerHTML=c;
	d.innerHTML=c;
	}
</script>
<script language="javascript">
function shuliangjian(){
	var a=document.getElementById("shuliangjian");
	var b=document.getElementById("shuliang");
	var d=document.getElementById("yixuanzeshuliang");
	var c=b.outerText;
	c--;	
	b.innerHTML=c;
	d.innerHTML=c;
	}
</script>


</head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<body>
<!--开始-->
 <!--头部开始-->
  <%@ include file="head.jsp" %> 
  <!--头部结束-->
<!--商品介绍开始-->
<div id="jieshao">
<div id="jieshao_d1">
您所在的位置：麦包包 > [卓妮尔]灵动春夏系列珠片褶皱手提包 橙色
</div>
<div id="jieshao_d2">
<!--左开始-->
<div id="jieshao_d2_left">
         
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>
            <div id="div1">
          <div class="small_pic"> <span class="mark"></span> <span class="float_layer"></span> <img id="showpic" src="${goods.gimage }"width="480" height="480"/> </div>
          <div class="big_pic">
          <img src="${goods.gimage }" id="bigpic" width="960" height="960" />
          </div>
        </div>
            </td>
          </tr>
          </table>
</div>
<!--左结束-->
<!--右开始-->
<div id="jieshao_d2_right">
<span id="jieshao_d2_right_s1"><b>${goods.gname }</b></span>
<table width="450" border="0" cellspacing="0" cellpadding="0" id="jieshao_d2_right_t1">
  <tr>
    <td width="210" height="29">市场价：￥<s>${goods.gprice }</s></td>
    <td width="240">编号：1304027902</td>
  </tr>
  <tr>
    <td height="40"><font color="#333333">麦包价:</font><span style="color:red; font-weight:bold; font-size:20px;"><b>${goods.gprice }</span></td>
    <td>可获麦豆：<font color="#F88F05"><b>98</b></font>个</td>
  </tr>
</table>
<table width="450" border="0" cellspacing="0" cellpadding="0" id="jieshao_d2_right_t2">
  <tr>
    <td valign="top"><b>颜色：</b></td>
    <td><a href="#"><img src="images/yanse1.gif" width="42" height="42" /></a><a href="#"><img src="images/yanse2.gif" width="42" height="42" /></a><a href="#"><img src="images/yanse3.gif" width="42" height="42" /></a></td>
  </tr>
  <tr>
    <td><b>数量：</b> <input name="shuliangjia" type="button"  value="+" id="shulangjia" onclick="shuliangjia()"/><span id="shuliang">1</span><input name="shuliangjian"  value="-" type="button"  id="shuliangjian" onclick="shuliangjian()"/></td>
    <td>&nbsp;</td>
  </tr>
</table>
<span class="jieshao_d2_right_s2">配送至：有货，将从&nbsp;${goods.gaddress }&nbsp;仓发货</span><br>
<span class="jieshao_d2_right_s2">消费保障：<img src="images/bz_ico_1.jpg" width="30" height="19" /><img src="images/bz_ico_2.png" width="30" height="19" /><img src="images/bz_ico_4.png" width="30" height="19" /><img src="images/bz_ico_5.png" width="30" height="19" /></span>
<div id="jieshao_d2_right_d1">
已选择：&nbsp;&nbsp;<span id="yixuanzeshuliang"></span>&nbsp;&nbsp; 橙色  <a href="CarServlet?gid=${goods.gid }"><input name="cars" type="submit" value="加入购物车" /></a>  <a href="IsAlreadyCollectServlet?gid=${goods.gid }"><img src="images/jiarushoucang.gif" width="80" height="25" /></a>
</div>
<div id="jieshao_d2_right_d2">
上架时间：2012-6-11<br>
评分：<img src="images/icon_star_5.gif" width="63" height="10" /><font color="#0099FF">(已有0人评论)</font>浏览：<font color="#F88F05"><b>280</b></font> 收藏：<font color="#F88F05"><b>4</b></font>次</div>
<div id="jieshao_d2_right_d3" align="center">
<font color="#f2585e"><b>0</b></font>人喜欢     0人不喜欢      先登陆再投票哦~<br>
<table width="450" border="0" cellspacing="0" cellpadding="0" id="jieshao_d2_right_d3_t1">
  <tr>
    <td width="100"> <font color="#f2585e"> <b>麦友印象：</b></font></td>
    <td align="left">时尚-欧美风-简约</td>
  </tr>
  <tr>
    <td rowspan="2">&nbsp;</td>
  </tr>
</table>

</div>


</div>
<!--右结束-->

</div>
<!--商品介绍结束-->
<!--其他信息开始-->
<div id="qita">
<!--左开始-->
<div id="qita_left">
<table width="195" border="0" cellspacing="0" cellpadding="0" id="qita_left_t1">
  <tr>
    <td class="qita_left_t1_td1"><b>所属品牌</b></td>
  </tr>
  <tr>
    <td class="qita_left_t1_td2" align="center"><img src="images/pinpai.gif" width="70" height="42" /><br />
    <br />
        <a href="#">进入卓尼尔品牌>></a>
        </td>
  </tr>
  <tr>
    <td class="qita_left_t1_td1"><b>相关分类</b></td>
  </tr>
  <tr>
    <td class="qita_left_t1_td3" ><a href="#">女包</a>&nbsp;&nbsp;&nbsp;<a href="#">牛皮手</a>&nbsp;&nbsp;&nbsp;<a href="#">提包</a><br>
        <a href="#">亮片</a>&nbsp;&nbsp;&nbsp;<a href="#">桔色</a></td>
  </tr>
</table>
<table width="195" border="0" cellspacing="0" cellpadding="0" id="qita_left_t2">
  <tr>
    <td colspan="2" class="qita_left_t2_td1"><b>相关商品</b></td>
    </tr>
  <tr>
    <td class="qita_left_t2_td2" align="center"><a href="#"><img src="images/xiangguanshangpin1.gif" width="69" height="92" /></a></td>
    <td class="qita_left_t2_td2" align="center"><a href="#"><img src="images/xiangguanshangpin2.gif" width="69" height="92" /></a></td>
  </tr>
  <tr>
    <td class="qita_left_t2_td2" align="center"><a href="#"><img src="images/xiangguanshangpin3.gif" width="69" height="92" /></a></td>
    <td class="qita_left_t2_td2" align="center"><a href="#"><img src="images/xiangguanshangpin4.gif" width="69" height="92" /></a></td>
  </tr>
</table>
<table>
  <tr>
    <td colspan="2">&nbsp;</td>
  </tr>
 
</table>
</div>
<!--左结束-->
<!--右开始-->
<div id="qita_right">
<table width="750" border="0" cellspacing="0" cellpadding="0">
  <tr>
   <td>
    <div id="TabbedPanels1" class="TabbedPanels">
      <ul class="TabbedPanelsTabGroup">
        <li class="TabbedPanelsTab" tabindex="0">商品展示</li>
        <li class="TabbedPanelsTab" tabindex="0">麦友晒包</li>
        <li class="TabbedPanelsTab" tabindex="0">评论详情</li>
        <li class="TabbedPanelsTab" tabindex="0">售前咨询</li>
        <li class="TabbedPanelsTab" tabindex="0">如何购买</li>
        <li class="TabbedPanelsTab" tabindex="0">售后服务</li>
      </ul>
  
<div class="TabbedPanelsContentGroup">
        <div class="TabbedPanelsContent">
        <div id="qita_right_down1">
<table width="750" border="0" cellspacing="0" cellpadding="5" id="qita_right_down1_t1">
  <tr>
    <td>性别：女</td>
    <td>材质：牛皮</td>
    <td>颜色系：桔色</td>
  </tr>
  <tr>
    <td>使用方法：手提</td>
    <td>款式：不定型</td>
    <td>场合：宴会-聚会</td>
  </tr>
  <tr>
    <td>风格：时尚-欧美风-简约</td>
    <td>图案：纯色</td>
    <td>流行元素：亮片</td>
  </tr>
  <tr>
    <td>大小：中型包</td>
    <td>尺寸：13寸</td>
    <td>适合季节：四季</td>
  </tr>
  <tr>
    <td>打开方式：铁铰</td>
    <td>内部结构：内测拉链袋-手机袋</td>
    <td>成品产地：中国</td>
  </tr>
  <tr>
    <td>包体大小：31.0*23.0*9.0cm</td>
    <td>重量：0.88kg</td>
    <td>&nbsp;</td>
  </tr>
</table>
<table width="600" border="0" cellspacing="0" cellpadding="0" id="qita_right_down1_t2">
  <tr>
    <td><b>请注意：</b>包的颜色请选择确认后下单，系统按订单颜色发货，不接收留言选色！</td>
  </tr>
</table>
<table width="750" border="0" cellspacing="0" cellpadding="0" id="qita_right_down1_t3">

 
  <s:forEach var="fd" items="goodsimg">
   <tr>
    <td align="center"><img src="${goods.gimage}" width="740" height="308" /></td>
  </tr>
  </s:forEach>
</table>
</div>
        
        
        
        
        </div>
        <div class="TabbedPanelsContent"><div id="qita_right_down2">
<table width="750" border="0" cellspacing="0" cellpadding="0" id="qita_right_down2_t1">
  <tr>
    <td align="left" class="qita_right_down2_t1_td1">现在晒包即可获赠5元现金卷，更有机会获大奖！</td>
    <td align="right" class="qita_right_down2_t1_td1">我购买过这个商品，<a href="#">我要晒包>></a></td>
  </tr>
  <tr>
    <td colspan="2" align="center" class="qita_right_down2_t1_td2">还没有人来晒包，赶快来秀秀你的包包吧！</td>
    </tr>
</table>
</div>
</div>
        <div class="TabbedPanelsContent"><div id="qita_right_down3">
        <table width="450" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td align="center">暂时还没有评论，写评论拿麦豆，买过它的麦友赶紧了，<a href="#">点击去写评论</a></td>
  </tr>
</table>

        
        
</div></div>
        <div class="TabbedPanelsContent"><div id="qita_right_down4">
<table width="750" border="0" cellspacing="0" cellpadding="0" id="qita_right_down4_t1">
  <tr>
    <td  align="left" class="qita_right_down4_t1_td1">咨询类型：<select name=""><option value="1" selected="selected">全部咨询</option></select></td>
    <td  align="right" class="qita_right_down4_t1_td1">如果购买过程中没有任何疑问，欢迎向我们咨询，<a href="#">我要咨询>></a></td>
  </tr>
  <tr>
    <td colspan="2">
            <table width="750" border="0" cellspacing="0" cellpadding="0" id="qita_right_down4_t2">
                  <tr>
                    <td align="center">目前还没有麦友咨询</td>
                  </tr>
                  <tr>
                    <td align="center">
                        <table width="728" border="1" cellspacing="0" cellpadding="0" id="qita_right_down4_t3">
                              <tr>
                                <td align="left" class="qita_right_down4_t3_td1"><b>我要咨询</b>（    如果购买过程中有任何疑问，欢迎向我们咨询）</td>
                              </tr>
                              <tr>
                                <td align="left" class="qita_right_down4_t3_td2">咨询类型：<form action="InsertQuestionServlet?gid=${goods.gid }" method="post">
                                              <input name="qtype" type="radio" value="产品咨询" />产品咨询
                                              <input name="qtype" type="radio" value="活动咨询" />活动咨询
                                              <input name="qtype" type="radio" value="支付咨询" />支付咨询
                                              <input name="qtype" type="radio" value="配送快递咨询" />配送快递咨询
                                              <input name="qtype" type="radio" value="订单咨询" />订单咨询
                                              <input name="qtype" type="radio" value="售后咨询" />售后咨询
                                              <input name="qtype" type="radio" value="售前问题" />售前问题<br>
                                    咨询内容：<textarea name="qtext" cols="80" rows="3" id="blogtext"></textarea> <br>                           
                                                                             
                                    <input name="" type="submit" value="" class="qita_right_down4_t3_td3"/></form></td>
                              </tr>
                        </table>

                    </td>
                  </tr>
            </table>
    </td>
    </tr>
</table>
</div></div>
        <div class="TabbedPanelsContent"><div id="qita_right_down5">
  <img src="images/down5top-2.gif" width="748" height="232" border="0" usemap="#Map" />
  <map name="Map" id="Map">
    <area shape="rect" coords="126,166,200,179" href="#" />
  </map>
  <img src="images/down5down.gif" width="748" height="591" border="0" usemap="#Map2" />
  <map name="Map2" id="Map2">
    <area shape="rect" coords="187,73,334,85" href="#" />
    <area shape="rect" coords="289,438,459,452" href="#" />
    <area shape="rect" coords="304,527,441,537" href="#" />
  </map>
</div></div>
        <div class="TabbedPanelsContent"><div id="qita_right_down6">
  <img src="images/down6top.gif" width="748" height="284" />
  <img src="images/down6down.gif" width="748" height="590" border="0" usemap="#Map3" />
  <map name="Map3" id="Map3">
    <area shape="rect" coords="166,351,251,364" href="#" />
  </map>
</div></div>
</div>
</div>
   </td> 
  </tr>
</table> 

<script type="text/javascript">
<!--
var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1");
//-->
</script>

</div>
<!--右结束-->
</div>
<!--其他信息结束-->
<!--footer 开始-->
<div style="margin-top:20px;">
<%@ include file="footer.jsp" %>
</div>
<!--footer 结束-->
<s:if test="${param.acmsg==1 }">
     <script>alert("收藏成功！")</script>
</s:if>
<s:if test="${param.acmsg==0 }">
     <script>alert("您已收藏过！")</script>
</s:if>
<s:if test="${param.qmg==1 }">
     <script>alert("咨询成功！")</script>
</s:if>
<s:if test="${param.qmg==0 }">
     <script>alert("咨询失败！")</script>
</s:if>
</body>
</html>
