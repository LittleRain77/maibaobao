<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link href="styles/person.css" rel="stylesheet" type="text/css" />
<link href="styles/toubu.css" type="text/css" rel="stylesheet" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<script src="ckeditor/ckeditor.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>
<script type="text/javascript">
function openDiv(ff){
var upDiv = document.getElementById("upDiv");
var formDIV = document.getElementById("dd");
formDIV.value=ff;
upDiv.style.display = "block";
}
function openreDiv(tt){
	var reDiv=document.getElementById("reDiv");
	var formDiv1 = document.getElementById("kk");
	formDiv1.value=tt;
	reDiv.style.display="block";
}
function closeDIV(){
	var upDiv = document.getElementById("upDiv");
	upDiv.style.display = "none";
	}
function closereDiv(){
	var reDiv = document.getElementById("reDiv");
	reDiv.style.display = "none";
	}
</script>
<style type="text/css">
#upDiv{
width:500px;
height:400px;
display:none;
position:absolute;
top:0;
left:0;
z-index:9999;

}
#reDiv{
width:500px;
height:400px;
display:none;
position:absolute;
top:0;
left:0;
z-index:999;

}
#requestDiv{
 display:none;   
}
.form{
position:absolute;
left:45%;
top:55%;
width:800px;
height:300px;
z-index:1000;
}
.form1{
position:absolute;
left:45%;
top:65%;
width:800px;
height:300px;
z-index:1000;
background-color: #F3F3F3;
}
</style>
<body>
 <div>
 <%@ include file="head.jsp" %>
 </div>
<!--整体开始-->
<div id="content">
   <div id="content_1">
   <!--上部开始-->
   <div class="top_0">
    <table>
	   <tr>
	     <td style="font-size:24px;">我的麦包包</td>
		 <td style="width:120px;" align="center">我的主页</td>
		 <td>社区</td>
		 <td align="right" id="order_font" width="875px"><a href="#">支持有礼</a></td>
	   </tr>
	 </table>
   </div>
   <!--上部结束-->
   <!--左侧开始-->
      <div class="left">
	  <h3>&nbsp;我的交易</h3>
	  <ul>
	    <li>我的订单</li>
		<li>我的本地生活</li>
		<li>我的定期送</li>
		<li>我的订单</li> 
		<li>我的订单</li>
	   </ul>
	   <h5>&nbsp;我的交易</h5>
	  <ul>
	    <li>我的订单</li>
		<li>我的本地生活</li>
		<li>我的定期送</li>
		<li>我的订单</li> 
		<li>我的订单</li>
	   </ul>
	   <h5>&nbsp;我的交易</h5>
	  <ul>
	    <li>我的订单</li>
		<li>我的本地生活</li>
		<li>我的定期送</li>
		<li>我的订单</li> 
		<li>我的订单</li>
	   </ul>
	   <h5>&nbsp;我的交易</h5>
	  <ul>
	    <li>我的订单</li>
		<li>我的本地生活</li>
		<li>我的定期送</li>
		<li>我的订单</li> 
		<li>我的订单</li>
	   </ul>	
	  </div>
	  <!--左侧结束-->
	  <!--中间开始-->
	  <!--中间上开始-->
	  <div class="center">
	  <div class="center_top">
	  <div style="float:left;">
	    <table>
		   <tr>
		     <td class="img"><img src="${userper.uimage}"/></td>
			 <td>&nbsp;</td>
			 <td width="200px" >
				  <span style="font-size:24px; padding-bottom:5px;">${userper.uid }</span><br/>
				  <p style="color:#717171; font-size:10px;">每天都是新开始，微笑加油哦！</p><br/>
				  <br/>
				  <br/>
			 </td>
		   </tr>
		</table>
		</div>
		<div class="one">
		  <div class="one_1" style="line-height:25px;">
		    <p style="margin-left:8px;"><span class="ont_1_font">昨天收益</span><br />
			<span style="font-size:20px; color:#F7062B;">0.00</span><br />
			<span class="ee"><a href="#">转入小金库</a></span></p>
		  </div>
		  <div class="one_1">
		    <p style="margin-left:8px;"><span class="ont_1_font">余额：0.00<br />&nbsp;<br />
			麦豆：${userper.ubeen }&nbsp;<br /></a></span></p>
		  </div>
		  <div class="one_1">
		    <p style="margin-left:8px;"><span class="ont_1_font">会员卡：0<br />&nbsp;<br />
			优惠劵：0</span></p>
		  </div>
		</div>
		
	  </div>
	  <!--中间上结束-->
	  <!--中间中开始-->
	    <div class="center_bottom_1">
		   <table>
	   <tr>
	     <td style="font-size:18px; font-weight:bold;">我的订单</td>
		 <td id="order_font">
		 &nbsp;&nbsp;&nbsp;<a href="#">代付款</a>&nbsp;&nbsp;&nbsp;<a href="#"> 待确认收获</a>          &nbsp;&nbsp;&nbsp; <a href="#">待评价</a></td>
		 <td class="order_font_2" align="right" width="370px"><a href="#">查看全部订单</a></td>
	   </tr>
	 </table>
	 <s:forEach var="orders" items="${listorder }">
	 
	 <div class="shop">
	      <div class="shop_1">
	          <a href="SelectDetailServlet?gid=${orders.goods.gid }"><img src="${orders.goods.gimage }" width="100px" height="100px" /></a>
		  </div>
		  <div class="shop_1" style="line-height:23px;">
		      <p style="margin-top:10px;">${orders.goods.gname }</p>
		  </div>
		  <div class="shop_1" style="line-height:20px;">
		  <p>${orders.orders.opaymenttype }<br />
		      ￥${orders.goods.gprice }</p>
		  </div>
		  <div class="shop_1" style="line-height:20px;">
		      <p style="margin-top:10px;">${orders.orders.otime }</p>
		  </div>
		  <div class="shop_1" style="line-height:46px;">
		      ${orders.orders.ousername }
			  
		  </div>
		  <div class="shop_1" style="line-height:19px; font-size:10px;">
		      <br />
			  <a href="SureOrders?oid=${orders.orders.oid }">确认收货</a>|<a href="#" onclick="openDiv(${orders.goods.gid })">评价</a><br/>
			  <a href="#">${orders.orders.ostatus }</a><br/>
			  <a href="#" onclick="openreDiv(${orders.goods.gid })">申请退款</a><br/>
			  
		  </div>
		
	 </div>
	 </s:forEach>
             
			 
			 
	 
		</div>
	  <!--中间中结束-->
	  <!--中间下结束-->
	  <div class="center_bottom_2">
	     <table>
	   <tr>
	     <td style="font-size:18px; font-weight:bold;">我关注的商品</td>
		 <td id="order_font">
		 &nbsp;&nbsp;&nbsp;<a href="#">降价商品</a>&nbsp;&nbsp;&nbsp;<a href="#"> 促销商品</a>          &nbsp;&nbsp;&nbsp; <a href="#">待现货商品</a></td>
		 <td class="order_font_2" align="right" width="300px"><a href="#">查看更多</a></td>
	   </tr>
	 </table>
	 <div class="focus">
	  <s:forEach var="collect" items="${listcol }">
	   <div class="focus_1">
	     <a href="SelectDetailServlet?gid=${collect.gds.gid }"><img src="${collect.gds.gimage }" width="107px" height="107px" /></a><br/>
		 ￥${collect.gds.gprice }
	   </div>
	  </s:forEach>
	 </div>
	  </div>
	  <!--中间下结束-->
	  </div>
	  <!--中间结束-->
	  <!--右侧开始-->
	  <div class="right">
	    <a href="#"><img src="images/ooo.png" /></a>
	  </div>
	  <!--右侧结束-->
	  <!--右侧2开始-->
	  <div class="right_2">
	  </div>
	  <!--右侧2结束-->
   </div>

</div>

<!--评价浮动框开始 -->
<div id="upDiv">
<div class="form">
  <form action="InsertEvaluateServlet" method="post" name="f1">
          
            <textarea name="editor" id="editor" rows="40" cols="80">
                请输入您的评论！
            </textarea>
            <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace( 'editor' );
            </script>
            <input type="hidden" name="gid"  id="dd" />
            <input type="submit" value="提交">
            <input type="button" value="关闭" onclick="closeDIV();"/>;
        </form>
 </div>       
</div>
<div id="reDiv">
<div class="form1">
  <form action="InsertRequestServlet" method="post" name="f2">
         <div class="tuikuan">
          <input name="qtype" type="checkbox" value="质量不好" />质量不好
          <input name="qtype" type="checkbox" value="有色差" />有色差
          <input name="qtype" type="checkbox" value="支有损坏" />有损坏
          <input name="qtype" type="checkbox" value="配重复下单" />重复下单
          <input name="qtype" type="checkbox" value="其他" />其他
          </div>
            <textarea name="editor1" id="editor1" rows="40" cols="80">
                请输入您的退款理由！
            </textarea>
            <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace( 'editor1' );
            </script>
            <input type="hidden" name="gid"  id="kk" />
            <input type="submit" value="提交">
            <input type="button" value="关闭" onclick="closereDiv();"/>;
        </form>
 </div>       
</div>
<!--评价浮动框结束-->

<div style="margin-top:20px;">
<%@ include file="footer.jsp" %>
</div>
</body>
</html>
<s:if test="${param.mig==1 }">
  <script>
    alert("评论成功！")
  </script>
</s:if>
<s:if test="${param.mig==0 }">
  <script>
    alert("评论失败！")
  </script>
</s:if>
<s:if test="${param.mre==1 }">
  <script>
    alert("提交申请成功,等待审核！")
  </script>
</s:if>
<s:if test="${param.mre==0 }">
  <script>
    alert("提交申请失败！")
  </script>
</s:if>
