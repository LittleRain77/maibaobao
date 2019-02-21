<%@page import="com.smallapple.mbb.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
   <!--头部开始-->
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
            <a href="PersonServlet?uid=${sessionScope.user.uid }">我的帐户</a>
            </td>
            <td width="65"><a href="daohang.html">网站导航</a></td>
            <td width="170">您好，${sessionScope.user.uid }!<a href="RemoveUserServlet">&nbsp;[退出]</a></td>
            <td width="99" align="right" class="dengluyanse">[ <b><a href="login.jsp" target="_self">登录</a></b>/<b><a href="register.jsp" target="_self">注 册</a></b> ]</td>
          </tr>
        </table>
        </div>
        <!--头部第一层结束-->
         <!--头部第二层开始-->
        <div id="banner">
  <div class="logo111" style="float:left;">
    <a href="index.jsp"><img src="images/logo111.png"/></a>
  </div>
  
  <div class="search">
  <form action="SearchBagServlet1" method="post">
     <input type="text" class="input" name="key"/>
	 <input type="submit" class="button" value="" />
	 </form>
	 <div class="sea_font">
	   <ul>
	     <li><a href="#">热门搜索:</a></li>
		 <li><a href="#">热门搜索</a></li>
		 <li><a href="#">热门搜索</a></li>
		 <li><a href="#">热门搜索</a></li>
		 <li><a href="#">热门搜索</a></li>
		 <li><a href="#">热门搜索</a></li>
	   </ul>
	 </div>
	  
  </div>
  <div class="po">
     <a href="shopping_cart.jsp">去购物车结算</a>
  </div>
  <div class="po">
          <a href="PersonServlet?uid=${sessionScope.user.uid }">我的麦包包</a>
  </div>

</div>
 <!--头部第二层结束-->
        
        <!--头部第三层开始-->
<div id=daohang>
<div id="dao">
<a href="index.jsp"><div class="daohang_font"><span class="padd">首页</span></div></a>
<a href="LadyBagServlet?gtid=1"><div class="daohang_font">男包</div></a>
<a href="#"><div class="daohang_font">女包</div></a>
<a href="#"><div class="daohang_font">真皮包</div></a>
<a href="#"><div class="daohang_font">旅行包</div></a>
<a href="#"><div class="daohang_font">数码包</div></a>
<a href="#"><div class="daohang_font">钱包</div></a>
</div>
</div>
        <!--头部第三层结束-->
      
        <!--头部结束--> 