<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ar"%>
<div align="center" style="width:1000px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"—申请退款列表</caption>
		<tr>
			<td height="32" colspan="7">
				<form action="ShowApplyRefundServlet" method="post" name="f1">
					按退款原因查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="25">
			<td width="100">申请退款编号</td>
			<td width="130">申请人</td>
			<td width="200">所买商品</td>
			<td width="100">退款原因</td>
			<td width="130">具体原因</td>
			<td width="100">状态</td>
			<td width="110">操作</td>
		</tr>
		<ar:forEach var="ar" items="${arinfos}">
			<tr>
				<td>${ar.arid}</td>
				<td>${ar.uid}</td>
				<td>${ar.gid}</td>
				<td>${ar.arreason}</td>
				<td>${ar.artext}</td>
				<td>${ar.arstatus}</td>
				<td><a href="SearchARInfoForCheckServlet?id=${ar.arid }">审核</a><img src="images/edit.gif" width="12" height="12" /></td>
			</tr>
		</ar:forEach>
		<td colspan="7" align="right">
		<a href="ShowApplyRefundServlet?pg=1"> 首页</a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowApplyRefundServlet?pg=${pgInfo.prePage }">上一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowApplyRefundServlet?pg=${pgInfo.nextPage }">下一页 </a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowApplyRefundServlet?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>
<ar:if test="${param.uarmsg==1 }">
     <script>alert("修改成功！")</script>
</ar:if>
<ar:if test="${param.uarmsg==0 }">
     <script>alert("修改失败！")</script>
</ar:if>