<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
    <s:if test="${param.msg==6 }">
    <script>alert("修改成功！")</script>
    </s:if>

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
  <form action="InsertChangeAdminServlet" method="post" name="f1" enctype="multipart/form-data">
  <table>
  <caption style="font-size:25px;color:#069;">个人资料修改</caption>
     <tr><td colspan="2"><hr/></td>
		</tr>
     <tr style="border-style:hidden"  height="30"> 
       <td align="right" class="td1">账号：</td><td><input type="hidden" name="aid" value="${admininfo.aid }"  size="24"  height="26"/>${admininfo.aid }</td>
     </tr>
      <tr height="30"><td align="right" class="td1"> 姓名：</td><td><input type="text" name="aname" value="${admininfo.aname }" size="24"  height="26"/></td></tr>
      <tr height="30"><td  align="right" class="td1"> 密码：</td><td><input type="password" name="apass"  value="${admininfo.apass }"  size="24"  height="26"/>*</td></tr>
       <tr height="30"><td  align="right" class="td1"> 性别：</td><td><input type="text" name="asex"  value="${admininfo.asex }" size="24"  height="26"/></td></tr>
      <tr height="30"><td  align="right" class="td1"> 头像：</td><td><input type="file" name="aimage"  value="${admininfo.aimage }" size="24"  height="26"/></td></tr>
      <tr height="30"><td  align="right" class="td1"> 权限：</td><td><input type="text" name="apower"  value="${admininfo.apower }" size="24"  height="26"/></td></tr>
      <tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
 </table>
  </form>
  </div>
</div> 