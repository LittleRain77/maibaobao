<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>会员注册 - 麦包包网</title>
<link href="styles/global.css" type="text/css" rel="stylesheet" />
<link href="styles/zhuce.css" type="text/css" rel="stylesheet" />
<link href="styles/toubu.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/SpryMenuBarHorizontal.css" rel="stylesheet" type="text/css" />
<link href="SpryAssets/wodemaibaobao.css" rel="stylesheet" type="text/css" />
<link href="styles/footer.css" type="text/css" rel="stylesheet" />
<script src="SpryAssets/wodemaibaobao.js" type="text/javascript"></script>
<script src="SpryAssets/SpryMenuBar.js" type="text/javascript"></script>
<script src="js/jilian.js"></script>
<script src="js/register.js"></script>
<script language="javascript"></script>
</head>

<body>
<!--头部开始-->
  <div>
    <%@ include file="head.jsp" %>
  </div>
<!--头部结束-->



<!--注册开始-->
<!--注册整体div-->
<div id="zhuce">
<!--内部上层div-->
    <div id="zhuce_top" >
         <div id="leftcontainer">
                    <div id="type">
                        <div id="type1" class="type1_1">
                        </div>
                        <div id="type2" class="type2_3">
                        </div>                 
                          <hr width="550" color="#afd0ec" />
                    </div>
    </div>
<!--内部左边div-->
<!-- 表单1开始 -->
<div id="form">
   <div id="form1">
           <form action="RegisterServlet?flag=email"method="post" onsubmit="return checkAll1();">
                        <table cellspacing="15px">
                            <tr>
                                <td><font color="#FF0000">*</font>我的邮箱</td>
                                <td><input type="text" class="inp" id="m_mail" name="m_mail" /></td>
                                <td width="145px"><div id="m_mailmessage"></div></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>创建密码</td>
                                <td><input type="password" class="inp" id="m_password" name="m_pwd" /></td>
                                <td><div id="m_passwordmessage"></div><span class="w" id="m_passwordweight"></span></td>
                            </tr>
                        <tr>
                                <td><font color="#FF0000">*</font>昵称</td>
                                <td><input type="text" class="inp" id="m_name" name="m_username"/></td>
                                <td><div id="m_namemessage"></div></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>性别</td>
                                <td><input type="radio" name="m_sex" value="男" checked="checked" />男&nbsp;&nbsp;<input type="radio" name="m_sex" value="女" />女</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>所在地</td>
                                <td><select id='m_prov' name ='m_prov' class="sele"></select>
                                    <select id='m_city' name = 'm_city'  class="sele" ></select>   
                                </td>
                                <td><div id="m_passwordmessage"></div></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>验证码</td>
                               <td ><input type="text" class="inp" id="m_yzm" name="unum" style="width:95px;!important" />
                                              
                                 <img src= "valcode.jsp"  width="60" height="32" id="mm" onclick=this.src=this.src+'?' />
                                                <a href="#">换一换,请点击图片</a>
                                                <div id="m_passwordmessage"></div>
                                                <div>
                                                <cc:if test="${param.msg==2 }">
    	                                                 验证码不正确
    	                                        </cc:if>
                                                </div>
                                </td>
                            </tr>
                           
                            <tr>
                             
                                <td><input type="submit" id="btn" name="btn" value=" 提交注册 "  />   </td>
                                <td>《卖包包使用协议》</td> 
     
                             
                                
                            </tr>
                        </table>
                        </form>
</div>
<!-- 表单2开始 -->

  <div id="form2" style="display:none" >
                    <form action="RegisterServlet?flag=phone" method="post" onsubmit="return checkAll2();">
                    <table cellspacing="15px"  >
                            <tr>
                                <td><font color="#FF0000">*</font>我的手机号</td>
                                <td><input type="text" class="inp" id="p_phone" name="p_phone" /></td>
                                <td width="170px"><div id="p_phonemessage"></div></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>创建密码</td>
                                <td><input type="password" class="inp" id="p_password" name="p_password" /></td>
                                <td><div id="p_passwordmessage"></div><span class="w" id="p_passwordweight"></span></td>
                            </tr>
                             <tr>
                                <td><font color="#FF0000">*</font>昵称</td>
                                <td><input type="text" class="inp" id="p_name" name="p_name" /></td>
                                <td><div id="p_namemessage"></div></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>性别</td>
                                <td><input type="radio" name="p_sex" value="男" checked="checked" />男&nbsp;&nbsp;<input type="radio" name="p_sex" value="女" />女</td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>所在地</td>
                                <td><select id='p_prov' name ='p_prov' class="sele"></select>
                                    <select id='p_city' name = 'p_city'  class="sele" ></select>   
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <td><font color="#FF0000">*</font>手机验证码</td>
                                <td width="95px" valign="top" >
                                <div style="float:left; width:95px; display:inline; position:relative;">
                                  		<input type="text" class="inp" id="p_yzm" name="p_yzm" style="width:95px;!important" />
                                       
                                       
                                       <div style="position:absolute; left:105px; top:-12px; width:300px">
                                  <p>1分钟内手机还没有收到验证码，请点击此处<a id="resendcode" href="javascript:void(0);">重发</a></p>                                <p><em>尝试多次仍收不到验证码，请使用<a id="mail_register1" href="#">电子邮箱注册</a></em></p>
                                  </div> 
                                 </div> 	
                                  
                                 </td>    
                                 
                            </tr>
                          <tr>
                             
                                <td><input type="submit" id="btn" name="btn" value=" 提交注册 "  />   </td>
                                <td>《卖包包使用协议》</td> 
     
                             
                                
                            </tr>
                        </table>
                        </form>
                  </div>
                  <!--表单2结束-->

<!--内部右边div-->
    <div id="zhuce_right">
    <table width="300" border="0" cellspacing="0" cellpadding="0" id="zhuce_right_t1">
          <tr>
            <td height="15" align="center">我已经注册，现在就登陆</td>
          </tr>
          <tr>
            <td height="54" align="center"><a href="denglu.jsp"><input name="" type="button" value="登录" /></a></td>
          </tr>
          <tr>
            <td align="center">我已用邮箱注册，我要<a href="#">绑定手机</a></td>
          </tr>
          <tr>
            <td align="center">我已用手机注册，我要<a href="#">绑定邮箱</a></td>
          </tr>
    </table>
    </div>
</div>
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
