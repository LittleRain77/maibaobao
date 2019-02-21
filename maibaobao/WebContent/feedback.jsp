<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>visitor's book</title>
<link href="styles/visitorbook.css" rel="stylesheet" type="text/css"/>
<link href="styles/toubu.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
</head>

<body>
 <div>
 <%@ include file="head.jsp" %>
 </div>
<!--头部结束-->
<div id="contain" >
<!--正文头部开始-->
	<div id="top_header">
    </div>
<!--正文头部结束-->
  
<!--正文开始 --> 
    <div id="main">
        <!--正文左侧-开始-->
        <div id="main_left">
            
         <div id="left-1">
             <img src="images/floor_logo.jpg" width="235" height="112" />
         </div>
            
            
            <div class="left_1">
            常见问题：想修改一下送货时间，是否可以？ 
            </div>
            
            <div class="left_2">
           	 <img src="images/vi_1.gif" width="14" height="13" /> 
             回复：您好，您可以在下单的时候选择您需要的配送时间，
              对于发货后的包包建议您联系我们4006-528-528热线处理，感谢您对麦包包的支持!
            </div>
            
            <div class="left_1">
            常见问题：可以自己选择快递吗？ 
            </div>
            
            <div class="left_2"><img src="images/vi_1.gif" width="14" height="13" /> 	
            回复：您好，嘉兴仓库合作的快递有：汇通、申通、邮政EMS、韵达、中通。北京仓库合作的快递有：
            邮政EMS和韵达。广州仓库合作的有：邮政E邮宝、中通、广州邮政EMS。您可以根据所在城市备注所需快递。
         	</div>
            
            <div class="left_1">
            常见问题：我是货到付款已经签收了，为什么订单状态是未支付呢？ 
            </div>
            
            <div class="left_2"><img src="images/vi_1.gif" width="14" height="13" /> 
            回复：您好，快递会在您签收包包后的2-3天导入签收数据到我们公司，
            届时可同步支付信息，请耐心等待一下。（如果在签收2-3天后未更新，
            麻烦你在留言板或者联系4006-528-528热线咨询，我们在查实签收信息后及时更新支付信息，给您带来不变，还请谅解）
            </div>
            
            <div class="left_1">
            常见问题：下单时忘记开发票了，是否可以补寄？ 
            </div>
            
            <div class="left_2"><img src="images/vi_1.gif" width="14" height="13" /> 
            回复：您好，三个月内订单的都支持寄发票，补寄发票您可以选择：
            留言板和4006热线联系并告知发票抬头，我们会尽快补寄发票，
            从2011年12月开始，发票统一用平信的形式给客户邮寄，感谢您对麦包包的支持！
            </div>       
      	</div>
        <!--正文左侧-结束-->
        
        
        <!--正文右侧-开始-->
        <div id="main_right">
        <form action="InsertFeedback" method="post">
            <div>
            <img src="images/floor_logo2.jpg" width="397" height="100"/>
            </div>
            
            <div id=right_1>
            
<table width="446" border="0" align="right" cellpadding="0" cellspacing="0">
                      <tr>
                        <td width="78" height="23" class="words"> 留言分类：</td>
                        <td width="79"><input type="radio" name="feedback" value="售后问题" id="留言分类_0" />
                    售后问题</td>
                        <td width="84"><input type="radio" name="feedback" value="产品咨询" id="留言分类_1" />
                    产品咨询</td>
                        <td width="82"><input type="radio" name="feedback" value="活动咨询" id="留言分类_2" />
                    活动咨询</td>
                        <td width="123"><input type="radio" name="feedback" value="配送快递咨询" id="留言分类_3" />
                    配送快递咨询</td>
                      </tr>
                      <tr>
                        <td height="21">&nbsp;</td>
                        <td><input type="radio" name="feedback" value="支付咨询" id="留言分类_4" />
                    支付咨询</td>
                        <td><input type="radio" name="feedback" value="订单咨询" id="留言分类_5" />
                    订单咨询</td>
                        <td><input type="radio" name="feedback" value="售前问题" id="留言分类_6" />
                    售前问题</td>
                        <td>&nbsp;</td>
                      </tr>
                    </table>

          </div>
          
          <div id="right_2">
          <span class="words">留言内容：</span>（300字以内）
          <textarea name="ftext" cols="60" rows="10"></textarea>
          </div>
          
          <div id="right_3">
            <table width="420" border="0" align="left" cellpadding="0" cellspacing="0">
                      <tr>
                        <td width="80" height="34">手机号码：</td>
                        <td width="340"><input type="text" name="fphone" id="textfield" />
                          <span class="words">*</span><span class="words_1">真实号码</span></td>
                      </tr>
                      <tr>
                        <td height="34">QQ：</td>
                        <td>
                          <input type="text" name="fQQ" id="textfield2" />
                        </td>
                      </tr>
                      <tr>
                        <td height="45">邮箱：</td>
                        <td><input type="text" name="femail" id="textfield3" />
                          <span class="words_1">请填写常用邮箱</span></td>
                      </tr>
                      <tr>
                        <td height="44">旺旺：</td>
                        <td><input type="text" name="fwang" id="textfield4" />
                          <span class="words_1">                          阿里旺旺用户名</span></td>
                      </tr>
            </table>

          </div>
          
          
          <div id="right_4" align="center"><input type="submit" name="sub" value="提交留言" />
          </div>
        </form>
        </div>
        <!--正文右侧-结束-->

<div class="bottom_v" >
   <img src="images/footer_img2.jpg" width="930" height="49" />
    <img src="images/footer_img.jpg" width="929" height="179" />
    </div></div>
    
<!--正文结束-->
</div>
<div style="margin-top:20px;">
<%@ include file="footer.jsp" %>
</div>


</body>
</html>
<s:if test="${param.mg==1 }">
  <script>
    alert("留言成功！")
  </script>
</s:if>
<s:if test="${param.mg==0 }">
  <script>
    alert("留言失败！")
  </script>
</s:if>
