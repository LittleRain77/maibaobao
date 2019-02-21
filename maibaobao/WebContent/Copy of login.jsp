<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>会员登录/注册 - 麦包包网</title>
<link href="styles/global.css" type="text/css" rel="stylesheet" />
<link href="styles/denglu.css" type="text/css" rel="stylesheet" />
<link href="styles/toubu.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<script type="text/javascript"></script>
<script type="text/javascript">
function qvdiao(){
	var a=document.getElementById("yonghuming");
	a.value="";
	}
</script>


</head>

<body>
<!--头部开始-->
  <div>
    <%@ include file="head.jsp" %>
  </div>
<!--头部结束-->



<!--登陆开始-->
<!--登陆整体div-->
<div id="denglu">
<!--内部上层div-->
<div id="denglu_top">
<table width="912" border="0" cellspacing="0" cellpadding="0" id="denglu_top_t1">
  <tr>
    <td align="left" id="denglu_top_t1_td1"><b>用户登录</b></td>
    <td align="right" id="denglu_top_t1_td2"><a href="#">登陆注册改版了，大家有任何疑问都请反馈给我们哦~</a></td>
  </tr>
</table>
</div>
<!--内部左边div-->
<div id="denglu_left">
<form action="LoginServlet"  id="dianjidenglu" name="f1">
<table width="598" border="0" cellspacing="0" cellpadding="16" id="denglu_left_t1">
  <tr>
      <td width="77">用户名:</td>
      <td colspan="2"><input name="username" id="username" type="text" value="" /></td>
      <td width="201" class="denglu_left_t1_td"><span id="yonghumingtishi"></span></td>
  </tr>
  <tr>
      <td>登录密码：</td>
      <td colspan="2"><input name="pwd" id="pwd" type="password"/></td>
      <td class="denglu_left_t1_td">忘记密码？</td>
  </tr>
  <tr>
      <td>验证码：</td>
      <td width="71" class="denglu_left_t1_td"><input name="unum" type="text" id="unum" /></td>
      <td width="121" class="denglu_left_t1_td"><img src= "valcode.jsp"  width="54" height="29" onclick=this.src=this.src+'?' /></td>
      <td class="denglu_left_t1_td"><span id="yanzhengmatishi"  >换一张？ 请点击图片</span></td>
      </tr>
      <tr>
    <td align="center" id="denglu_left_t2"><input name="sub" type="submit" value="登录" /></td>
    <td id="denglu_left_t2">
    	<c:if test="${ param.msg==1}">
    	     用户名或密码错误
    	</c:if>
    	<c:if test="${param.msg==2 }">
    	     验证码不正确
    	</c:if>
    
  </tr>
</table>
</form>
<table width="598" border="0" cellspacing="0" cellpadding="8" id="denglu_left_t2">
  
  <tr>
    <td>使用合作网站账号登录麦包包</td>
  </tr>
  <tr>
    <td id="denglu_left_t2_td"><img src="images/sina.gif" width="98" height="25" /><img src="images/139.gif" width="99" height="25" /><img src="images/renren.gif" width="99" height="25" /><img src="images/zhifubao.gif" width="99" height="25" /></td>
  </tr>
</table>	

</div>
<!--内部右边div-->
<div id="denglu_right">
<form action="register.jsp" >
<table width="300" border="0" cellspacing="0" cellpadding="0" id="denglu_right_t1">
  <tr>
    <td align="center">现在还不是麦包包网站会员？</td>
  </tr>
  <tr>
    <td align="center"><input name="s" type="submit" value="注册新用户" /></td>
  </tr>
</table>
</form>
</div>
</div>
<!--登陆结束-->
<!--footer 开始-->
<div style="margin-top:20px;">
<%@ include file="footer.jsp" %>
</div>
<!--footer 结束-->
</body>
</html>
