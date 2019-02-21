<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>填写核对订单信息 - 麦包包</title>
<link rel="stylesheet" type="text/css" href="styles/tianxieheduixinxi.css"/>
<script type="text/javascript" src="js/sitedata_bas.js" charset="GBK"></script>
<script type="text/javascript" src="js/ajax1.js"></script>
<script type="text/javascript" src="js/addinformation.js"></script>
<script language="javascript">
</script>
</head>
<body>
<!--这是核对信息 top开始-->
<c:if test="${user==null }">
		<c:redirect url="login.jsp?msg=3"></c:redirect>
	</c:if>
<div id="top">
        <table width="900" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="323" rowspan="3"><a href="#"><img src="images/logo.png" width="304" height="39" border="0" /></a></td>
                <td width="124" rowspan="3">&nbsp;</td>
                <td width="453">&nbsp;</td>
              </tr>
              <tr>
                <td><img src="images/daohang2.gif" width="438" height="27" /></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
              </tr>
        </table>
       </div>
       
<!--这是核对信息 top结束-->

     <form action="OrdersServlet" method="post" name="f1" onsubmit="return isSubmit()">     
<!--这是核对信息 main开始-->
<div id="tianxieheduixinxi" style="background-color:#F3F3F3;">
    <div><font size="4">填写收货信息</font></div>
    <table width="303" align="left">
      <tr>
        <td height="30"><font color="#FF0000" >*</font><font size="3"> 收 货 人：</font></td>
        <td colspan="2"><input type="text" name="ousername" id="ousername"  onblur="isNullName()" />
            <span id="msg1"></span> </td>
      </tr>
      <br/>
      <tr>
        <td height="30"><font color="#FF0000">*</font> <font size="3">详细地址：</font> </td>
        <td colspan="2"><input type="text" name="oaddress" id="oaddress"onblur="isNullOaddress()"/>
            <span id="msg2"></span> </td>
        <br/>
      </tr>
      <tr>
        <td height="30"><font color="#FF0000">* </font><font size="3">电话号码：</font></td>
        <td colspan="2"><input type="text"  name="ophone"id="ophone" onblur="isNullOphone()" />
            <span id="msg3"></span> </td>
      </tr>
      <tr>
        <td colspan="4" align="right"><a href="#"></a></td>
      </tr>
    </table>
 
       <div id="tianxieheduixinxi_main_2"></div>
      <div id="tianxieheduixinxi_main_3_2">
<table width="900" border="0" cellspacing="0" cellpadding="0"><font size="5">确认订单信息</font>
      <hr  color="#dddddd"  />

	
	   <tr align="center">
          <td width="115"bgcolor="#e7e7e7"></td>
          <td bgcolor="#e7e7e7" width="100">商品名称</td>  
          <td width="150" bgcolor="#e7e7e7">数量</td>
          <td width="150" bgcolor="#e7e7e7">单价</td>
          <td width="150" bgcolor="#e7e7e7">小计</td>
          
      </tr>
        	<c:if test="${cars!=null }">
        	<c:forEach var="item" items="${cars }">
        <tr height="124px" align="center">
          <td><img src="${item.value.goods.gimage }"width="111" height="124"  border="0"/></td>
          <td height="37" class="shangpin"><a href="goods_details.jsp"> ${item.value.goods.gname } </a></td>
      
          <td>
					${item.value.number }
</td>
          <td>￥${item.value.goods.gprice }</td>
          <td>￥${item.value.number*item.value.goods.gprice}</td>
         
        </tr>
        
        </c:forEach>
           </c:if>
  </table>
    </div>
      
      
    <div id="tianxieheduixinxi_main_3">
   <font size="5">支付方式</font>
      <hr  color="#dddddd"  />
    <div id="tianxieheduixinxi_main_3_1">

              <input type="radio" name="opaymenttype"value="货到付款" checked="checked" />货到付款<br/>
               <input type="radio" name="opaymenttype" value="在线支付"/>在线支付
               <br/>
     
        <!-- <hr color="#dddddd" /> -->
    <!-- 	
    <div id="tianxieheduixinxi_main_3_2">
<table width="900" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="115"><img src="images/xinxi_shangpinxinxi.gif" width="107" height="20" /></td>
                <td width="785"><a href="#"><img src="images/xinxi_fanhuigouwuche.gif" width="170" height="20"  border="0"/></a></td>
              </tr>
      </table>
    </div> -->
    
    <div id="tianxieheduixinxi_main_3_3" align="right">
     <%
 float totalPrice=(Float)session.getAttribute("totalPrice");
%>
<tr><font size="5">小计：</font> </tr>
   
    <tr><font size="5" color="red">￥<%= totalPrice %></font></tr><br/>
     <tr><a href="shopping_cart.jsp">返回购物车</a></tr>
    <tr><input type="submit" name="sub" value="确认订单" size="12"/>    </tr>
   </div>
    
 </form>   
     <!-- <table width="860"  height="98" border="1" cellspacing="0" cellpadding="0" bordercolor="#dddddd" id="tb" font>
              <tr align="center">
                <td width="27" height="28"  bgcolor="#dddddd" >&nbsp;</td>
                <td width="173"  bgcolor="#dddddd">商品名称</td>
                <td width="27"  bgcolor="#dddddd">&nbsp;</td>
                <td width="130"  bgcolor="#dddddd">麦包价</td>
                <td width="86"  bgcolor="#dddddd">数量</td>
                <td width="119"  bgcolor="#dddddd">优惠</td>
                <td width="86"  bgcolor="#dddddd">小计</td>
                <td width="240"  bgcolor="#dddddd">预计发货仓库</td>
              </tr>
              <tr align="center">
                <td ><img src="images/01.jpg" width="111" height="124" /></td>
                <td colspan="2">[卓妮尔]灵动春夏系列珠片褶皱手提包 </td>
                <td>￥1828</td>
                <td>1</td>
                <td>￥1100</td>
                <td>￥728</td>
                <td>天津仓</td>
              </tr>
        </table>
 -->    </div>
   <!--  <div id="tianxieheduixinxi_main_3_4">
        <table width="900" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td> <input name="" type="checkbox" value="" />使用优惠券/现金券</td>
              </tr>
              <tr>
                <td><input name="" type="checkbox" value="" />使用礼品券</td>
              </tr>
        </table>
        <hr color="#dddddd" />
    </div>

    <div id="tianxieheduixinxi_main_4"><img src="images/xinxi_jiesuanxinxi.gif" width="110" height="21" />
    <div id="tianxieheduixinxi_main_4_1">
        <table width="900" height="60"  border="0" cellspacing="0" cellpadding="0"  >
              <tr>
                <td align="right" >商品件数：1件 合计重量：2.06kg 商品金额：￥ 1868.00 运费：￥ 0.00 - 优惠：￥ 1100.00 </td>
          </tr>
                <tr>
                <td align="right" bordercolor="#FFCC33"><font color="#FF0000">应付总金额：￥768.00</font></td>
             </tr>
        </table>
     </div>
     <div id="tianxieheduixinxi_main_4_3">
<table width="900" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><input name="" type="checkbox" value="" />发票</td>
              </tr>
              <tr>
                <td height="70"><input name="" type="checkbox" value="" />订单留言 <font size="-1" color="#999999">字数请控制在100以内 </font></td>
          </tr>
        </table>
        <hr color="#dddddd" />

     </div>
     </div>

    
    
    
       <div id="tianxieheduixinxi_main_5">
<table width="900" border="0" cellspacing="0" cellpadding="0" align="right">
              <tr>
                <td align="right"><a href="chenggongxinxi.html"> <img src="images/heduixinxi_querenxinxi.gif" width="137" height="41" border="0"/></a></td>
              </tr>
        </table>
      </div> -->
</div>
<!--这是核对信息 main结束-->

 <!--这是核对信息 footer开始-->
   <!-- <div id="heduixinxi_footer">

        <table width="900" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><img src="images/shoucang_foot_1.gif" width="180" height="41" /></td>
                <td><img src="images/shoucang_foot_2.gif" width="180" height="41" /></td>
                <td><img src="images/shoucang_foot_3.gif" width="180" height="41" /></td>
                <td><img src="images/shoucang_foot_4.gif" width="180" height="41" /></td>
                <td><img src="images/shoucang_foot_5.gif" width="180" height="41" /></td>
              </tr>
        </table>
    </div>
        <div>
                <table width="800" border="0" cellspacing="0" cellpadding="0" align="center">
                      <tr>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td><font size="-1">©2007-2012Mbaobao All Rights Reserved.嘉兴麦宝科技信息有限公司   版权所有，禁止非法复制 <a href="#">经营许可证编号：浙B2-20100425</a></font></td>
                  </tr>
                      <tr>
                        <td>&nbsp;</td>
                      </tr>
            </table>
        </div> -->
<div align="right"id="tianxieheduixinxi_main_3"></div>
<!--这是核对信息 footer结束-->
 
 