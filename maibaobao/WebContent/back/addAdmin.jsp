<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="r" %>
 <style type="text/css">

.big{
	width:1020px;
	min-height:600px;
	}
.small{
	margin-left:310px;
	margin-top:40px;
	width:400px;
	min-height:400px;
	}
.td1{
   font-size:18px;
   font-family:Terminal, System, Fixedsys, 'Arial Unicode MS', '幼圆';
}
 </style>
<div class="big"  >
<div class="small" >
  <form action="AddAdminServlet" method="post" name="f1" onsubmit="return isSubmit">
  <table>
  <caption style="font-size:25px;color:#069;">"麦包包"管理员添加</caption>
  <tr><td colspan="2"><hr/></td>
		</tr>
     <tr style="border-style:hidden"  height="30"> 
       <td align="right" class="td1">账号：</td><td><input type="text" name="aid" size="24"  height="26"id="aid" onblur="isSameAid()"/>*<span id="msg1"></span></td>
     </tr>
      <tr height="30"><td align="right" class="td1"> 姓名：</td><td><input type="text" name="aname" size="24"  height="26"/></td></tr>
      <tr height="30"><td  align="right" class="td1"> 密码：</td><td><input type="password" name="apass" id="apass"  onblur="isNullPass()" size="24"  height="26"/>* <span id="msg2"></span></td></tr>
      <tr height="30"><td  align="right" class="td1"> 性别：</td><td><input type="radio" name="asex" value="男" checked="checked"/>男&nbsp;<input type="radio" name="asex" value="女"/>女</td></tr>
      <tr height="30"><td  align="right" class="td1"> 权限：</td><td><input type="text" name="apower" size="24"  height="26"/></td></tr>
      <tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
 </table>
 <hr/>
	<a href="ShowAdminServlet">返回管理员信息列表</a>
  </form>
  </div>
</div> 
 
<r:if test="${param.admsg==1 }">
     <script>alert("添加成功！")</script>
   </r:if>
   <r:if test="${param.admsg==0 }">
     <script>alert("添加失败！")</script>
   </r:if>