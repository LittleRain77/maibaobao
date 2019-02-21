<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y"%>
<div align="center" style="width:1065px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——留言回复列表</caption>
		<tr>
			<td height="32" colspan="8">
				<form action="ShowReplyServlet" method="post" name="f1">
					按管理员账号查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="30">
			<td width="50">回复编号</td>
			<td width="110">管理员（回复人）</td>
			<td width="280">回复内容</td>
			<td width="140">回复时间</td>
			<td width="110">留言人</td>
			<td width="250">留言内容</td>
			<td width="130">留言时间</td>

		</tr>
		<y:forEach var="rl" items="${infos}">
			<tr height="32">
				<td>${rl.rid}</td>
				<td>${rl.aid}</td>
				<td>${rl.rtext}</td>
				<td>${rl.rtime}</td>
				<td>${rl.fb.uid}</td>
				<td>${rl.fb.ftext}</td>
				 <td>${rl.fb.ftime}</td> 
				
			</tr>
		</y:forEach>
		<td colspan="8" align="right">
		<a href="ShowReplyServlet?pg=1"> 首页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowReplyServlet?pg=${pgInfo.prePage }">上一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowReplyServlet?pg=${pgInfo.nextPage }">下一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowReplyServlet?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>
<y:if test="${param.upmsg==1 }">
     <script>alert("回复成功！")</script>
</y:if>
<y:if test="${param.upmsg==0 }">
     <script>alert("回复失败！")</script>
</y:if>