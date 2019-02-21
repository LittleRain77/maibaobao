<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>会员登录/注册 - 麦包包网</title>
<link href="styles/global.css" type="text/css" rel="stylesheet" />
<link href="styles/denglu.css" type="text/css" rel="stylesheet" />
<link href="styles/toubu.css" rel="stylesheet" type="text/css" />
<link href="styles/zhuce.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>

</head>


<body>
<meta http-equiv="Refresh" content="3;URL=login.jsp" />
<!--头部开始-->
 <div>
   <%@ include file="head.jsp" %>
 </div>
<!--头部结束-->



<!--注册开始-->
<!--注册整体div-->
<div id="zhuce">
<!--内部上层div-->
    <div id="zhuce_top">
        <table width="912" border="0" cellspacing="0" cellpadding="0" id="zhece_top_t1">
          <tr>
            <td align="left" id="zhuce_top_t1_td1"><b>欢迎注册麦包包网站</b></td>
            <td align="center" id="zhuce_top_t1_td2"> 注册成功</td>
            <td align="right" id="zhuce_top_t1_td3"><a href="#">登陆注册改版了，大家有任何疑问都请反馈给我们哦~</a></td>
          </tr>
        </table>
    </div>
<!--内部左边div-->
<div id="zhuce_left">
    <form name="form1" action="" method="get">
        <table width="598" border="0" cellspacing="0" cellpadding="5" id="zhuce_left_t1">
          <tr>
              <td width="164" align="right">&nbsp;</td>
              <td colspan="2">&nbsp;</td>
              <td width="114">&nbsp;</td>
          </tr>
          <tr>
              <td align="right">&nbsp;</td>
              <td width="198" colspan="2" rowspan="3"><h2><font color="#FF0000">恭喜您已经注册成功！</font></h2>
              <h4>页面3秒钟后自动跳转到登陆页面...</h4></td>
              <td width="114">&nbsp;</td>
          </tr>
          <tr>
              <td align="right">&nbsp;</td>
              <td width="114">&nbsp;</td>
          </tr>
          <tr>
              <td align="right">&nbsp;</td>
              <td class="zhuce_left_t1_td" valign="bottom">&nbsp;</td>
          </tr>
        </table>
    <table width="598" border="0" cellspacing="0" cellpadding="10" id="zhuce_left_t2">
      <tr>
         <td></tr>
      <tr>
        <td align="center">&nbsp;</td>
      </tr>
    </table>
</form>
</div>
<!--内部右边div-->
    <div id="zhuce_right">
    <table width="300" border="0" cellspacing="0" cellpadding="0" id="zhuce_right_t1">
          <tr>
            <td height="15" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td height="54" align="center">&nbsp;</td>
          </tr>
          <tr>
            <td align="center">&nbsp;</td>
          </tr>
          <tr>
            <td align="center">&nbsp;</td>
          </tr>
    </table>
    </div>
</div>
<!--注册结束-->
<!--footer 开始-->
 <div style="margin-top:20px;">
<%@ include file="footer.jsp" %>
</div>
<!--footer 结束-->

</body>
</html>
