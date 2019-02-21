<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="q"%>

<div align="center" style="width:1065px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——管理员列表</caption>
		<tr>
			<td height="32" colspan="6">
				<form action="ShowAdminServlet" method="post" name="f1">
					按账户查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="28">
		    <td width="110">员工账户</td>
			<td width="92">员工姓名</td>
			<td width="100">员工密码</td>
			<td width="80">员工性别</td>
			<td width="99">员工权限</td>
			<td width="120">操作</td>
		</tr>
		<q:forEach var="adm" items="${infos}">
			<tr>
			    <td>${adm.aid}</td>
				<td>${adm.aname}</td>
				<td>${adm.apass}</td>
				<td>${adm.asex}</td>
				<td>${adm.apower}</td>
				<td><a href="SAdminInfoFUp?id=${adm.aid }">编辑</a><img src="images/edit.gif" width="12" height="12" />&nbsp;&nbsp;  <a href="DeleteAdminServlet?id=${adm.aid }">删除</a><img src="images/X.gif" width="12" height="12" /></td>
			</tr>
		</q:forEach>
		<td colspan="6" align="right">
		<a href="ShowAdminServlet?pg=1"> 首页</a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowAdminServlet?pg=${pgInfo.prePage }">上一页 </a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowAdminServlet?pg=${pgInfo.nextPage }">下一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowAdminServlet?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>
   <q:if test="${param.delmsg==2 }">
     <script>alert("该账号已登录，无法删除！")</script>
   </q:if>
   <q:if test="${param.delmsg==1 }">
     <script>alert("删除成功！")</script>
   </q:if>
   <q:if test="${param.delmsg==0 }">
     <script>alert("删除失败！")</script>
   </q:if>
   <q:if test="${param.upmsg==1 }">
     <script>alert("修改成功！")</script>
   </q:if>
   <q:if test="${param.upmsg==0 }">
     <script>alert("修改失败！")</script>
   </q:if>
 