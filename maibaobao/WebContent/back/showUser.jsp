<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="s"%>
<div align="center" style="width:1065px">   
<table border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
   <caption style="font-size:23px;" height="30">"麦包包"网店——用户信息列表</caption>
		<tr>
			<td height="32" colspan="10">
				<form action="SelectUserServlet" method="post" name="f1">
					按用户账号查询：<input type="text" name="userkey" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
   <tr bgcolor="#99CCCC"  height="23">
      <td width="100">用户ID</td>
      <td width="40">性别</td>
      <td width="40">身份</td>
      <td width="80">出生年月</td>
      <td width="100">电话</td>
      <td width="100">邮箱</td>
      <td width="100">地址</td>
      <td width="30">麦豆</td>
      <td width="30">权限</td>
      <td width="100">操作</td>
   </tr>
   <s:forEach var="utemp" items="${userinfo }">
       <tr>
       <td>${utemp.uid }</td>
      <td>${utemp.usex }</td>
      <td>${utemp.ustatus }</td>
      <td>${utemp.ubirthday }</td>
      <td>${utemp.uphone }</td>
      <td>${utemp.uemail }</td>
      <td>${utemp.uaddress }</td>
      <td>${utemp.ubeen }</td>
      <td>${utemp.upower }</td>
      
      <td><a href="SelectChangeUserServlet?uid=${utemp.uid }">编辑</a><img src="images/edit.gif" width="12" height="12" />&nbsp;&nbsp;&nbsp;&nbsp;
      <a href="DeleteUserServlet?uid=${utemp.uid }">删除</a><img src="images/X.gif" width="12" height="12" /></td>
   </tr>
   </s:forEach>
   <tr><td colspan="10" align="right">
   <a href="SelectUserServlet?pg=1">首页 </a> &nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="SelectUserServlet?pg=${userpage.prePage }">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="SelectUserServlet?pg=${userpage.nextPage }">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
   <a href="SelectUserServlet?pg=${userpage.totalNumber}">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;     
     当前 ${userpage.curPage }  页/共 ${userpage.totalNumber}页&nbsp;&nbsp;&nbsp;</td></tr>
</table>
</div> 
   <s:if test="${param.msg==1 }">
      <script>alert("成功！")</script>
   </s:if>
   <s:if test="${param.msg==0}">
      <script>alert("失败！")</script>
   </s:if>