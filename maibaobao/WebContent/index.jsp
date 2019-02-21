<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.smallapple.mbb.dbutil.CookieUtil" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>麦包包官方网站 - 中国最大的时尚箱包在线商城，购物满99免运费，支持货到付款</title>
<link href="styles/global.css" type="text/css" rel="stylesheet" />
<link href="styles/shouye.css" type="text/css" rel="stylesheet" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<link href="styles/toubu.css" type="text/css" rel="stylesheet" />
<link href="SpryAssets/SpryTabbedPanels.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />

<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<script src="SpryAssets/SpryTabbedPanels.js" type="text/javascript"></script>
<script src="js/shouye.js" type="text/javascript"></script>

</head>
<s:if test="${goods==null }">
     <jsp:forward page="SearchGoodsInfoServlet"></jsp:forward>
 </s:if>
 <s:if test="${goods!=null }">
<%--  <%
 String user=(String)session.getAttribute("user");
 if(user==null){
	 CookieUtil cs=new CookieUtil();
	 cs.findCookiebyName(user, request);
	 session.setAttribute("user", user);
 }
 %> --%>
<%-- <%
 String user=(String)session.getAttribute("user");
 if(user==null){
	 Cookie[] cs=request.getCookies();
	 String v=null;
	 if(cs!=null){
		 for(int i=0;i<cs.length;i++){
			 if(cs[i].getName().equals("user"));
			 v=cs[i].getValue();
			 session.setAttribute("user", v);
			 out.println(v+"nihao");
		 }
	 }
	 
 }
	 

 
 %>  --%>
 

	<body onload="MM_preloadImages('images/hotneirong1_1.jpg','images/hotneirong2_1.gif','images/hotneirong3_1.jpg','images/hotneirong4_1.jpg')">
	<!--首页  顶部+头部  开始-->
 <div>
 <%@ include file="head.jsp" %>
 </div>
	<!--首页  顶部+头部  结束-->

	<!--首页  广告1  开始-->
	<div id="banner1">
     <a href="#">
     <img src="images/banner1.JPG" width="960" height="70" border="0" title="年中庆终极秒杀 2.7折起" />
     </a>
	</div>
 	<!--首页  广告1  结束-->
    <!--首页  广告2  开始-->
    <div id="banner2">
            <!--首页  广告2 左侧 开始-->
            <div id="banner2_left">
                <a target=_self href="javascript:goUrl()"> <span class="f14b">
                <script type="text/javascript">
                <!--			
                imgUrl1="images/banner2_1.jpg";
                imgtext1=""
                imgLink1=escape("lilang.html");
                imgUrl2="images/banner2_2.jpg";
                imgtext2=""
                imgLink2=escape("lilang.html");
                imgUrl3="images/banner2_3.jpg";
                imgtext3=""
                imgLink3=escape("lilang.html");
                imgUrl4="images/banner2_4.jpg";
                imgtext4=""
                imgLink4=escape("lilang.html");
                imgUrl5="images/banner2_5.jpg";
                imgtext5=""
                imgLink5=escape("lilang.html");		
                 var focus_width=698
                 var focus_height=338
                 var text_height=0
                 var swf_height = focus_height+text_height		 
                 var pics=imgUrl1+"|"+imgUrl2+"|"+imgUrl3+"|"+imgUrl4+"|"+imgUrl5
                 var links=imgLink1+"|"+imgLink2+"|"+imgLink3+"|"+imgLink4+"|"+imgLink5
                 var texts=imgtext1+"|"+imgtext2+"|"+imgtext3+"|"+imgtext4+"|"+imgtext5		 
                 document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ focus_width +'" height="'+ swf_height +'">');
                 document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#F0F0F0">');
                 document.write('<param name="menu" value="false"><param name=wmode value="opaque">');
                 document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');
                 document.write('<embed src="pixviewer.swf" wmode="opaque" FlashVars="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'" menu="false" bgcolor="#F0F0F0" quality="high" width="'+ focus_width +'" height="'+ focus_height +'" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />');  document.write('</object>');
                -->
                </script>
                </span>
                </a>
        	</div>
        <!--首页  广告2 左侧 结束-->
        <!--首页  广告2 右侧 开始-->
        <div id="banner2_right">
         
         	<!--首页  广告2 右侧 下部分 开始-->
       	  <div id="banner2_right_2">
       	  
          <img src="images/banner_box.png" width="248"  border="0" usemap="#Map" />
          <map name="Map" id="Map">
            <area shape="rect" coords="7,5,121,89" href="#" />
            <area shape="rect" coords="132,4,239,89" href="#" />
            <area shape="rect" coords="7,97,117,179" href="#" />
            <area shape="rect" coords="130,98,238,180" href="#" />
          </map>
          <img src="images/banner_box1.png" width="248"  border="0" usemap="#Map" />
          <map name="Map" id="Map">
            <area shape="rect" coords="7,5,121,89" href="#" />
            <area shape="rect" coords="132,4,239,89" href="#" />
            <area shape="rect" coords="7,97,117,179" href="#" />
            <area shape="rect" coords="130,98,238,180" href="#" />
          </map>
		</div>
            <!--首页  广告2 右侧 下部分 结束-->
        </div>
        <!--首页  广告2 右侧 结束-->
    </div>
    <!--首页  广告2  结束-->
    <!--首页  热门分类  开始-->
    <div id="hotpartition">
    	<!--首页  热门分类 左侧 开始-->
    	<div id="hotpartition_left">
        	<!--首页  热门分类 左侧 标题 开始-->
        	<div id="hotpartition_left_biaoti">
                <table width="130" border="0" cellspacing="0" cellpadding="0"  height="38px">
                  <tr>
                    <td width="20px" class="hot_floor">■</td>
                    <td width="110px" class="hot_floor_name">热门分类</td>
                  </tr>
                </table>
            </div>
            <!--首页  热门分类 左侧 标题 结束-->
            <!--首页  热门分类 左侧 内容 开始-->
            	<div id="hotpartition_left_neirong">
                	<table width="678" border="0" cellspacing="0" cellpadding="0">
                      <tr>
                        <td rowspan="3" class="hotpic"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('hotneirong1','','images/hotneirong1_1.jpg',1)"><img src="images/hotneirong1.gif" name="hotneirong1" width="68" height="80" border="0" id="hotneirong1" /></a></td>
                        <td class="hotneirong">
                        <a href="#">单肩包</a>
                        <a href="#">手提包</a>
                        <a href="#">双肩包</a>
                        <a href="#">单肩/斜挎两用包</a>
                        </td>
                        <td rowspan="3" class="hotpic"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image130','','images/hotneirong2_1.jpg',1)"><img src="images/hotneirong2.gif" name="hotneirong2" width="68" height="80" border="0" id="Image130" /></a></td>
                        <td class="hotneirong">
                        <a href="#">手提包</a> 
                        <a href="#">钱包</a>
                        <a href="#">单肩包</a> 
                        <a href="#">腰包</a>
                        <a href="#">斜挎包</a>
                        </td>
                      </tr>
                      <tr>
                        <td class="hotneirong">
                        <a href="#">手提/斜跨两用包</a>
                        <a href="#">手拿包</a>
                        <a href="#">化妆包</a>
                        <a href="#">钱包</a></td>
                        <td class="hotneirong">
                        <a href="#">手提/斜跨两用包</a> 
                        <a href="#">双肩包</a> 
                        <a href="#">牛皮公文包</a>
                        </td>
                      </tr>
                      <tr>
                        <td class="hotneirong">
                        <a href="#">斜挎包</a>
                        <a href="#">牛皮包</a>
                        <a href="#">PU包</a>
                        <a href="#">帆布包</a>
                        </td>
                        <td class="hotneirong">
                        <a href="#">经典商务</a> 
                        <a href="#">潮流个性</a> 
                        <a href="#">休闲随意</a> 
                        <a href="#">时尚运动</a>
                        </td>
                      </tr>
                      <tr>
                      <tr>
                      <td colspan="6" height="10px;"></td>
                      </tr>
                        <td rowspan="3" class="hotpic"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('hotneirong3','','images/hotneirong3_1.jpg',1)"><img src="images/hotneirong3.gif" name="hotneirong3" width="68" height="80" border="0" id="hotneirong3" /></a></td>
                        <td class="hotneirong">
                        <a href="#">拉杆箱</a> 
                        <a href="#">登山包</a> 
                        <a href="#">旅行包</a> 
                        <a href="#">儿童书包</a>
                        </td>
                        <td rowspan="3" class="hotpic"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('hotneirong4','','images/hotneirong4_1.jpg',1)"><img src="images/hotneirong4.gif" name="hotneirong4" width="68" height="80" border="0" id="hotneirong4" /></a></td>
                        <td class="hotneirong">
                        <a href="#">豹纹包</a> 
                        <a href="#">水桶包</a> 
                        <a href="#">鳄鱼纹</a> 
                        <a href="#">流苏包</a> 
                        <a href="#">编织包</a>
                        </td>
                      </tr>
                      <tr>
                        <td class="hotneirong">
                        <a href="#">电脑包</a> 
                        <a href="#">相机包</a> 
                        <a href="#">运动包</a> 
                        <a href="#">摄影包</a>
                        </td>
                        <td class="hotneirong">
                        <a href="#">复古包</a> 
                        <a href="#">邮差包</a> 
                        <a href="#">撞色包</a> 
                        <a href="#">新娘包</a> 
                        <a href="#">橙色</a>
                        </td>
                      </tr>
                      <tr>
                        <td class="hotneirong">
                        <a href="#">宴会包</a> 
                        <a href="#">配饰</a> 
                        <a href="#">皮带</a>
                        </td>
                        <td class="hotneirong">
                        <a href="#">丝巾包</a> 
                        <a href="#">糖果色包</a> 
                        <a href="#">蝴蝶结</a> 
                        <a href="#">褶皱</a>
                        </td>
                      </tr>
                </table>
                </div>
            <!--首页  热门分类 左侧 内容 结束-->
            
        </div>
        <!--首页  热门分类 左侧 结束-->
        <!--首页  热门分类 右侧 开始-->
        <div id="hotpartition_right">
         <a href="#">
         <img src="images/hotright.jpg" width="248" height="238"  title="[阿尔法]楚楚佳人精致细节" border="0"/>
         </a>
      	</div>
        <!--首页  热门分类 右侧 结束-->
    </div>
    <!--首页  热门分类  结束-->
    <!--首页  广告3  开始-->
        <div id="banner3"> 
        <a href="#">
        <img src="images/banner3.jpg" width="960" height="70" border="0" title="积分专场 1元起超值换购" />
        </a>
        </div>
    <!--首页  广告3  结束-->
    <!--首页  2F  开始-->
    	<!--首页  2F楼层导航  开始-->
		 <div class="floor_div">
        <a href="#">
        <span class="floor">2F</span>
        <span class="floor_name">热门品牌</span>
        </a>
        <span class="floor_more floor_gengduo"><a href="#">更多品牌》</a></span>
    	</div>
        <!--首页  2F楼层导航  结束-->
        <!--首页  2F楼层内容  开始-->
       		<!--首页  2F楼层内容 图片部分 开始-->
            <div id="floor2_tupian" style="filter:alpha(opacity=100)">
			 <table cellpadding="0" cellspacing="0" border="0" id="img_tb">
                <tr>
                    <td><a href="#"><img src="images/floor2_1.jpg" width="240" height="366" title="DUDU 源自意大利的真皮风尚" style="filter:alpha(opacity=85)" onmouseover="moveon()" onmouseout="moveout()"
             /></a>
                    </td>
                    <td><a href="#"><img src="images/floor2_2.jpg" width="480" height="183"  title="浪美 自由行走间的风尚标"  style="filter:alpha(opacity=85)"
             onmouseover="moveon()" onmouseout="moveout()"/></a><a href="#"><img src="images/floor2_3.jpg" width="240" height="183" title="戈尔本 成就男士商务之旅" style="filter:alpha(opacity=85)"
             onmouseover="moveon()" onmouseout="moveout()"/></a><a href="#"><img src="images/floor2_4jpg.jpg" width="240" height="183" title="卓妮尔 当优雅与摩登不期而遇/卓妮尔"  style="filter:alpha(opacity=85)"
             onmouseover="moveon()" onmouseout="moveout()"/></a><a href="#"><img src="images/floor2_5.jpg" width="240" height="183"  title="阿尔法·阿蒂斯特 经时之作 尚流典藏/阿尔法·阿蒂斯特"  style="filter:alpha(opacity=85)"
            onmouseover="moveon()" onmouseout="moveout()"/></a><a href="#"><img src="images/floor2_6.jpg" width="240" height="183"  title="希夏邦马 运动与旅行的完美结合"  style="filter:alpha(opacity=85)"
            onmouseover="moveon()" onmouseout="moveout()"/></a>
                    </td>
                </tr>
              </table>
            </div>
            <!--首页  2F楼层内容 图片部分 结束-->
            <!--首页  2F楼层内容 logo部分 开始-->
           	 <div id="floor2_logo">
                <table border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td class="you xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo11','','images/logo_111.gif',0)"><img src="images/logo_11.jpg" name="logo11" width="135" height="36" border="0" id="logo11" /></a></td>
                    <td class="you xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo12','','images/logo_121.gif',0)"><img src="images/logo_12.jpg" name="logo12" width="138" height="36" border="0" id="logo12" /></a></td>
                    <td class="you xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo13','','images/logo_131.gif',0)"><img src="images/logo_13.jpg" name="logo13" width="138" height="36" border="0" id="logo13" /></a></td>
                    <td class="you xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo14','','images/logo_141.gif',0)"><img src="images/logo_14.jpg" name="logo14" width="138" height="36" border="0" id="logo14" /></a></td>
                    <td class="you xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo15','','images/logo_151.gif',0)"><img src="images/logo_15.jpg" name="logo15" width="138" height="36" border="0" id="logo15" /></a></td>
                    <td class="you xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo16','','images/logo_161.gif',0)"><img src="images/logo_16.jpg" name="logo16" width="138" height="36" border="0" id="logo16" /></a></td>
                    <td class="xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo17','','images/logo_171.gif',0)"><img src="images/logo_17.jpg" name="logo17" width="129" height="36" border="0" id="logo17" /></a></td>
                  </tr>
                  <tr>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo21','','images/logo_211.gif',0)"><img src="images/logo_21.jpg" name="logo21" width="135" height="36" border="0" id="logo21" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo22','','images/logo_221.gif',0)"><img src="images/logo_22.jpg" name="logo22" width="138" height="36" border="0" id="logo22" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo23','','images/logo_231.gif',0)"><img src="images/logo_23.jpg" name="logo23" width="138" height="36" border="0" id="logo23" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo24','','images/logo_241.gif',0)"><img src="images/logo_24.jpg" name="logo24" width="138" height="36" border="0" id="logo24" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo25','','images/logo_251.gif',0)"><img src="images/logo_25.jpg" name="logo25" width="138" height="36" border="0" id="logo25" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo26','','images/logo_261.gif',0)"><img src="images/logo_26.jpg" name="logo26" width="138" height="36" border="0" id="logo26" /></a></td>
                    <td class="xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo27','','images/logo_271.gif',0)"><img src="images/logo_27.jpg" name="logo27" width="129" height="36" border="0" id="logo27" /></a></td>
                  </tr>
                  <tr>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo31','','images/logo_311.gif',0)"><img src="images/logo_31.jpg" name="logo31" width="135" height="36" border="0" id="logo31" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo32','','images/logo_321.gif',0)"><img src="images/logo_32.jpg" name="logo32" width="138" height="36" border="0" id="logo32" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo33','','images/logo_331.gif',0)"><img src="images/logo_33.jpg" name="logo33" width="138" height="36" border="0" id="logo33" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo34','','images/logo_341.gif',0)"><img src="images/logo_34.jpg" name="logo34" width="138" height="36" border="0" id="logo34" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo35','','images/logo_351.gif',0)"><img src="images/logo_35.jpg" name="logo35" width="138" height="36" border="0" id="logo35" /></a></td>
                    <td class="xia you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo36','','images/logo_361.gif',0)"><img src="images/logo_36.jpg" name="logo36" width="138" height="36" border="0" id="logo36" /></a></td>
                    <td class="xia"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo37','','images/logo_371.gif',0)"><img src="images/logo_37.jpg" name="logo37" width="129" height="36" border="0" id="logo37" /></a></td>
                  </tr>
                  <tr>
                  	<td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo41','','images/logo_411.gif',0)"><img src="images/logo_41.jpg" name="logo41" width="135" height="36" border="0" id="logo41" /></a></td>
                    <td class="you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo42','','images/logo_421.gif',0)"><img src="images/logo_42.jpg" name="logo42" width="138" height="36" border="0" id="logo42" /></a></td>
                    <td class="you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo43','','images/logo_431.gif',0)"><img src="images/logo_43.jpg" name="logo43" width="138" height="36" border="0" id="logo43" /></a></td>
                    <td class="you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo44','','images/logo_441.gif',0)"><img src="images/logo_44.jpg" name="logo44" width="138" height="36" border="0" id="logo44" /></a></td>
                    <td class="you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo45','','images/logo_451.gif',0)"><img src="images/logo_45.jpg" name="logo45" width="138" height="36" border="0" id="logo45" /></a></td>
                    <td class="you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo46','','images/logo_461.gif',0)"><img src="images/logo_46.jpg" name="logo46" width="138" height="36" border="0" id="logo46" /></a></td>
                    <td class="you"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('logo47','','images/logo_471.gif',0)"><img src="images/logo_47.jpg" name="logo47" width="129" height="36" border="0" id="logo47" /></a></td>
                  </tr>
                </table>
			 </div>
			<!--首页  2F楼层内容 logo部分 结束-->
            <!--首页  2F楼层内容 广告 开始-->
            <div id="floor2_banner"> 
            <a href="#"><img src="images/floor2_banner.jpg" width="960" height="69"  border="0"/></a>
            </div>
            <!--首页  2F楼层内容 广告 结束-->
		<!--首页  2F楼层内容  结束-->
	<!--首页  2F  结束-->
	<!--首页  3F  结束-->
    <!--首页  4F  开始-->
    	<!--首页  4F楼层导航  开始-->
        <div class="floor_div">
        <a href="men.html">
        <span class="floor">4F</span>
        <span class="floor_name">男包</span>
        </a>
        <span class="floor_more">
        <a href="#">经典商务</a> <img src="images/fengexian.gif" width="1" height="12" />
        <a href="#">休闲随意</a> <img src="images/fengexian.gif" width="1" height="12" />
        <a href="#">男士钱包</a> <img src="images/fengexian.gif" width="1" height="12" />
        <span class="floor_gengduo"><a href="#">更多》</a>
        </span>
        </span>
    	</div>
        <!--首页  4F楼层导航  结束-->
        <!--首页  4F楼层 图片部分 开始-->
        <div id="floor4_tupian">
        	<div id="floor4_left"> 
            <a href="#" title="双肩时代"><img src="images/floor4_tupianleft.jpg" width="280" height="330" />
            </a>
    		</div>
            
            <div id="floor4_main">
           	    <a target=_self href="javascript:goUrl()"> <span class="f14b">
				<script type="text/javascript">
                <!--			
                imgUrl1="images/floor4_maintupian1.jpg";
                imgtext1=""
                imgLink1=escape("lilang.html");
                imgUrl2="images/floor4_maintupian2.jpg";
                imgtext2=""
                imgLink2=escape("lilang.html");
                imgUrl3="images/floor4_maintupian3.jpg";
                imgtext3=""
                imgLink3=escape("lilang.html");
        
                 var focus_width=465
                 var focus_height=330
                 var text_height=0
                 var swf_height = focus_height+text_height		 
                 var pics=imgUrl1+"|"+imgUrl2+"|"+imgUrl3
                 var links=imgLink1+"|"+imgLink2+"|"+imgLink3
                 var texts=imgtext1+"|"+imgtext2+"|"+imgtext3 
                 document.write('<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,0,0" width="'+ focus_width +'" height="'+ swf_height +'">');
                 document.write('<param name="allowScriptAccess" value="sameDomain"><param name="movie" value="focus.swf"><param name="quality" value="high"><param name="bgcolor" value="#F0F0F0">');
                 document.write('<param name="menu" value="false"><param name=wmode value="opaque">');
                 document.write('<param name="FlashVars" value="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'">');
                 document.write('<embed src="pixviewer.swf" wmode="opaque" FlashVars="pics='+pics+'&links='+links+'&texts='+texts+'&borderwidth='+focus_width+'&borderheight='+focus_height+'&textheight='+text_height+'" menu="false" bgcolor="#F0F0F0" quality="high" width="'+ focus_width +'" height="'+ focus_height +'" allowScriptAccess="sameDomain" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />');  document.write('</object>');
                -->
				</script>
				</span>
   				 </a>
            </div>
            
            <div id="floor4_right">
                <table  border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td class="xia you"><a href="#"><img src="images/floor4_right11.gif" width="66" height="82" /></a></td>
                    <td class="xia you"><a href="#"><img src="images/floor4_right12.gif" width="66" height="82" /></a></td>
                    <td class="xia"><a href="#"><img src="images/floor4_right13.jpg" width="66" height="82" /></a></td>
                  </tr>
                  <tr>
                    <td class="xia you"><a href="#"><img src="images/floor4_right21.gif" width="66" height="82" /></a></td>
                    <td class="xia you"><a href="#"><img src="images/floor4_right22.gif" width="66" height="82" /></a></td>
                    <td class="xia"><a href="#"><img src="images/floor4_right23.gif" width="66" height="82" /></a></td>
                  </tr>
                  <tr>
                    <td class="xia you"><a href="#"><img src="images/floor4_right31.gif" width="66" height="82" /></a></td>
                    <td class="xia you"><a href="#"><img src="images/floor4_right32.gif" width="66" height="82" /></a></td>
                    <td class="xia"><a href="#"><img src="images/floor4_right33.gif" width="66" height="82" /></a></td>
                  </tr>
                  <tr>
                    <td class="you"><a href="#"><img src="images/floor4_right41.gif" width="66" height="82" /></a></td>
                    <td class="you"><a href="#"><img src="images/floor4_right42.gif" width="66" height="82" /></a></td>
                    <td><a href="#"><img src="images/floor4_right43.gif" width="66" height="82" /></a></td>
                  </tr>
                </table>
			</div>
        </div>
        <!--首页  4F楼层 图片部分 结束-->
        <!--首页  4F楼层 商品部分 开始-->
        <div id="floor4_gooods" >
        
        <s:forEach var="temp" items="${goods }">
           <div class="fo">
             <span class="goods_paddingright goods_paddingtop"><a href="SelectDetailServlet?gid=${temp.gid }"><img src="${temp.gimage }" width="174" height="174"/></a></span><br/>
             
             <span class="goods_miaoshu">${temp.gname } <br/>
                                             麦包价:</span>
             <span class="goods_price">￥${temp.gprice }</span>
           </div>
           </s:forEach>
        
		</div>
        <!--首页  4F楼层 商品部分 结束-->
    
    <!--首页  4F  结束-->
  
    <!--首页  尾部  开始-->
    <!--首页  尾部  结束-->
<div style="margin-top:20px;">
<%@ include file="footer.jsp" %>
</div>
    
    
    <!--我的消息 div开始-->
   	<div id="message">
        <table width="188" border="0" cellspacing="0" cellpadding="0" align="center" height="30">
          <tr>
            <td style="border-right:1px solid #c0c0c0" align="center" valign="middle"><a href="#">我的消息</a></td>
            <td align="center" valign="middle"><a href="#">我的私囊</a></td>
          </tr>
        </table>
	</div>
    <!--我的消息 div结束-->
			<script type="text/javascript">
        var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1");
            </script>
            
</body>
</s:if>
</html>
