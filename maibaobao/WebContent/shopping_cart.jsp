<%@page import="com.smallapple.mbb.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>我的购物车</title>
<link rel="stylesheet" type="text/css" href="styles/wodegouwuche.css"/>
<link rel="stylesheet" type="text/css" href="style.css" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<link href="styles/toubu.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="js/order.js"></script>

</head>

<body>
 <!--头部第一层开始-->
        <div  id="header1">
        <table width="960" height="100%" border="0" cellspacing="0" cellpadding="0" id="header1_tab1">
          <tr>
            <td width="106"><img src="images/wujiaoxing.gif" width="14" height="13" />收藏麦包包</td>
            <td width="222"><img src="images/dianhua.gif" width="15" height="15" />订购热线:<img src="images/dianhuahaoma.gif" width="100" height="14" /></td>
            <td width="162"><img src="images/shouji.gif" width="9" height="16" /><a href="mobile_bags.jsp">手机麦包包</a></td>
            <td width="96">
            <ul id="MenuBar2" class="MenuBarHorizontal">
              <li><a class="MenuBarItemSubmenu" href="#">我的麦包包</a>
                <ul>
                  <li><a href="#">我的麦豆</a></li>
                  <li><a href="#">我的收藏</a></li>
                </ul>
              </li>
              
            </ul>
				<script type="text/javascript">
                var MenuBar1 = new Spry.Widget.MenuBar("MenuBar2", {imgDown:"SpryAssets/SpryMenuBarDownHover.gif", imgRight:"SpryAssets/SpryMenuBarRightHover.gif"});
                </script>
			</td>
            <td width="67">
            <a href="PersonServlet?uid=${user.uid }">我的帐户</a>
            </td>
            <td width="65"><a href="daohang.html">网站导航</a></td>
            <td width="170">您好，<%User user=(User)session.getAttribute("user");out.print(user.getUid());%>!<a href="RemoveUserServlet">&nbsp;[退出]</a></td>
            <td width="99" align="right" class="dengluyanse">[ <b><a href="login.jsp" target="_self">登录</a></b>/<b><a href="register.jsp" target="_self">注 册</a></b> ]</td>
          </tr>
        </table>
        </div>
        <!--头部第一层结束-->
<%
 float totalPrice=(Float)session.getAttribute("totalPrice");
%>
<!--这是我的购物车 头部开始-->
       <div id="gouwuche_top">
        <table width="900" border="0" cellspacing="0" cellpadding="0">
              <tr>
               <td width="322" rowspan="3"><a href="index.jsp"><img src="images/logo.png" width="304" height="39" border="0" /></a></td>
                <td width="127" rowspan="3">&nbsp;</td>
                <td width="451">&nbsp;</td>
              </tr>
              <tr>
                <td><img src="images/daohang1.gif" width="438" height="19" /></td>
              </tr>
              <tr>
                <td>&nbsp;</td>
              </tr>
        </table>
        <hr />
       </div>
       

<!--这是我的购物车 头部结束-->
<!--这是我的购物车 main开始-->
<div id="gouwuche_main">
    <div id="gouwuche_main_1">
        <table width="900"cellspacing="0" cellpadding="0">
          <tr>
            <td ><font color="#f14e54" size="+2"><strong>我的购物车</strong></font></td>
          </tr>
        </table>
        <table width="900" height="30" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><font color="#f14e54" size="-1">提示：</font><font color="#999999" size="-1">加入购物车的商品无法为您保留库存，请及时下                                                                               单购买，商品价格以订单提交时的价格为准。</font></td>
          </tr>
        </table>
    </div>
    <div id="gouwuche_main_2">
      <table width="900" height="124" border="1" cellspacing="0" cellpadding="0" bordercolor="#cccccc">
        <tr align="center">
          <td width="115"bgcolor="#e7e7e7"></td>
          <td bgcolor="#e7e7e7" width="150">商品名称</td>  
          <td width="150" bgcolor="#e7e7e7">数量</td>
          <td width="150" bgcolor="#e7e7e7">单价</td>
          <td width="150" bgcolor="#e7e7e7">小计</td>
          <td width="52" bgcolor="#e7e7e7">操作</td>
        </tr>
        	<c:if test="${cars!=null }">
        	<c:forEach var="item" items="${cars }">
        <tr height="124px" align="center">
          <td><img src="${item.value.goods.gimage }"width="111" height="124"  border="0"/></td>
          <td height="37" class="shangpin"><a href="goods_details.jsp"> ${item.value.goods.gname } </a></td>
      
          <td><a href="ReduceServlet?gid=${item.value.getGoods().getGid() }&method=add"><input name="add" type="button"  value="+"/></a>
					${item.value.number }
					<a href="ReduceServlet?gid=${item.value.getGoods().getGid() }&method=reduce"><input name="reduce" type="button" value="-" /></a></td>
          <td>${item.value.goods.gprice }</td>
          <td>${item.value.number*item.value.goods.gprice}</td>
          <td class="shanchu"><a href="DeleteCarServlet?gid=${item.value.getGoods().getGid() }&method=remove"><font color="#FF0000">删除</font></a></td>
        </tr>
        
        </c:forEach>
           </c:if>
           <tr bgcolor="#e7e7e7" align="right">
          <td colspan="6">商品总金额（不包含运费）：￥<%= totalPrice %>元</td>
        </tr>
      </table>
   
</div>
    <div id="gouwuche_main_3">
        <table width="900" height="50" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td align="left"><a href="index.jsp">继续购物</a></td>
                 <td align="left"><a href="DeleteCarServlet?gid=${item.value.getGoods().getGid() }&method=clear">清除购物车</a></td>
                <td align="right"><a href="information.jsp">	进行结算</a></td>
              </tr>
        </table>
    </div>
  <div id="gouwuche_main_3">
    <table width="800" height="30"border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><img src="images/hougdian.gif" width="9" height="9" /><font color="#747474">您还可以选购以下商品</font></td>
              </tr>
      </table>
    <hr color="#999999" />
  </div>
    <div id="gouwuche_main_3">
        <div id="gouwuche_main_3_1">
            <table width="145" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td align="center"><a href="shouye2.html"><img src="images/01(1).jpg" width="144" height="141"  border="0"/></a></td>
                      </tr>
                      <tr>
                        <td align="center">￥19.00</td>
                      </tr>
                      <tr>
                        <td align="center"><a href="#"><img src="images/jiaru.gif" width="79" height="23" border="0"/></a></td>
                      </tr>
          </table>
      </div>
        
       <div id="gouwuche_main_3_2"> 
             <table width="145" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td align="center"><a href="#"><img src="images/01(2).jpg" width="144" height="141" border="0"/></a></td>
                      </tr>
                      <tr>
                        <td align="center">￥209.00</td>
                      </tr>
                      <tr>
                        <td align="center"><a href="#"><img src="images/jiaru.gif" width="79" height="23" border="0"/></a></td>
                      </tr>
             </table>
       </div>
       
       <div id="gouwuche_main_3_3"> 
             <table width="145" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td align="center"><a href="#"><img src="images/01(3).jpg" width="145" height="145" border="0" /></a></td>
                      </tr>
                      <tr>
                        <td align="center">￥289.00</td>
                      </tr>
                      <tr>
                        <td align="center"><a href="#"><img src="images/jiaru.gif" width="79" height="23" border="0"/></a></td>
                      </tr>
             </table>
       </div>
       
       <div id="gouwuche_main_3_4"> 
             <table width="145" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td align="center"><a href="#"><img src="images/01(4).jpg" width="145" height="145"  border="0"/></a></td>
                      </tr>
                      <tr>
                        <td align="center">￥279.00</td>
                      </tr>
                      <tr>
                        <td align="center"><a href="#"><img src="images/jiaru.gif" width="79" height="23" border="0"/></a></td>
                      </tr>
             </table>
       </div>
       
       <div id="gouwuche_main_3_5"> 
             <table width="145" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td align="center"><a href="#"><img src="images/01(5).jpg" width="145" height="145"  border="0"/></a></td>
                      </tr>
                      <tr>
                        <td align="center">￥109.00</td>
                      </tr>
                      <tr>
                        <td align="center"><a href="#"><img src="images/jiaru.gif" width="79" height="23" border="0"/></a></td>
                      </tr>
             </table>
       </div>
       
       <div id="gouwuche_main_3_6"> 
             <table width="145" border="0" cellspacing="0" cellpadding="0" >
                      <tr>
                        <td align="center"><a href="#"><img src="images/01(6).jpg" width="145" height="145"  border="0	"/></a></td>
                      </tr>
                      <tr>
                        <td align="center">￥420.00</td>
                      </tr>
                      <tr>
                        <td align="center"><a href="#"><img src="images/jiaru.gif" width="79" height="23" border="0"/></a></td>
                      </tr>
             </table>
       </div>
       
    </div>

    <div id="gouwuche_main_4">
    <table width="900" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td>&nbsp;</td>
          </tr>
    </table>
    </div>

        </div>

</div>
 
<!--这是我的购物车 main结束-->
<!--这是我的购物车 footer开始-->
<div style="margin-top:180px;">
<%@ include file="footer.jsp" %>
</div>
<!--这是我的购物车 footer结束-->
</body>
</html>
