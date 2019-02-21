<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>热卖包包123导航_淘宝网京东商城卓越亚马逊拉手网最新热销包包推荐 - 麦包包网</title>
<link href="styles/global.css" rel="stylesheet" type="text/css" />
<link href="styles/toubu.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<link type="text/css" rel="stylesheet" href="styles/daohang.css">

</head>

<body>

<!--最外层div控制整体内容居中-->
<!-- 头部开始 -->
<div>
<%@ include file="head.jsp" %>
</div>
<!--头部结束-->
<div style="margin-left:195px;">
    <!--中部 内容开始-->
    <div id="dh_div_left"><!--中部左边div-->
    	<table width="220" border="0" cellspacing="0" cellpadding="0" id="dh_left_tb1">
          <tr>
            <td class="dh_left_td1">推荐主题</td>
          </tr>
          <tr>
            <td><a href="#"><img src="images/xiaoqingxin.jpg" width="210" height="140" border="0px"/></a></td>
          </tr>
          <tr>
            <td class="dh_left_td2">夏日里的小清新</td>
          </tr>
        </table>
        <table width="220" border="0" cellspacing="0" cellpadding="0" id="dh_left_tb2">
          <tr>
            <td class="dh_left_td3">向天空一样纯净，像雨后一样清新，在小清新拂过的盛夏，我们要向扶桑花一样在绽放，打造一个与众不同的小清新</td>
          </tr>
          <tr>
            <td><a href="#"><img src="images/chengse.jpg" width="210" height="140" border="0px"/></a></td>
          </tr>
          <tr>
            <td class="dh_left_td2">明媚的加州亮橙</td>
          </tr>
          <tr>
            <td class="dh_left_td3">健康，明媚的橙色，是春夏季节的时尚常客，至纯的高饱和度没有一丝杂质通过时尚的渲染，足够明媚你的眼！</td>
          </tr>
        </table>
	</div>
    <div id="dh_div_right"><!--中部右边的div-->
          <!-- 热门频道开始段-->
        <table width="710" border="0" cellspacing="0" cellpadding="0" id="dh_right_tb2">
  		   <tr>
            <td class="dh_right_td21">热门频道</td>
            <td class="dh_right_td22"><a href="#">新品</a><strong>（</strong>每周二上新）</td>
            <td class="dh_right_td23"><a href="#">促销</a>（现实抢购天天抢）</td>
            <td class="dh_right_td24"><a href="#">风云榜</a>（包包热卖排行榜）</td>
           </tr>
        </table>
        <s:forEach var="temp" items="${listbag }">
        <div class="sou">
        <img src="${temp.gimage }" alt="" width="152px" height="152px;"/>
        </div>
        </s:forEach>
        <table border="0" width="700px" style="margin-top:560px;">
          <tr><td align="right" class="yii"><a href="SearchBagServlet1?pg=1">首页 </a> <a href="SearchBagServlet1?pg=${bagpage.prePage }">上一页</a>  <a href="SearchBagServlet1?pg=${bagpage.nextPage }">下一页</a>  当前 ${bagpage.curPage }  页/共 ${bagpage.totalNumber}    页</td></tr>
        </table style>
         <!-- 热门频道结束-->
 

	</div>
	<!--  中右部结束-->
</div>
</div>
<!--中部结束-->
</div>
<!--尾部开始-->
<div style="margin-top:700px;">
<%@ include file="footer.jsp" %>
</div>
<!--尾部结束-->
</body>
</html>
