<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="y"%>
<div align="center" style="width:1067px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——留言列表</caption>
		<tr>
			<td height="32" colspan="10">
				<form action="ShowFeedbackServlet" method="post" name="f1">
					按留言类型查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="23">
			<td width="55">留言编号</td>
			<td width="100">留言人</td>
			<td width="56">留言类型</td>
			<td width="200">留言内容</td>
			<td width="85">手机号</td>
			<td width="85">QQ</td>
			<td width="100">邮箱</td>
			<td width="90">旺旺</td>
			<td width="130">留言时间</td>
			<td width="110">操作</td>
		</tr>
		<y:forEach var="ff" items="${infos}">
			<tr>
				<td>${ff.fid}</td>
				<td>${ff.uid}</td>
				<td>${ff.ftype}</td>
				<td>${ff.ftext}</td>
				<td>${ff.fphone}</td>
				<td>${ff.fQQ}</td>
				<td>${ff.femail}</td>
				<td>${ff.fwang}</td>
				<td>${ff.ftime}</td>
				<td><a href="SearchFbInfoForReplyServlet?id=${ff.fid }">回复</a><img src="images/edit.gif" width="12" height="12" />
				  &nbsp;&nbsp;  <a href="SearchReplyFbInfoServlet?id=${ff.fid}">查回复</a><img src="images/pic7.gif" width="12" height="12" />
				</td>
			</tr>
		</y:forEach>
		<td colspan="10" align="right">
		<a href="ShowFeedbackServlet?pg=1"> 首页</a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowFeedbackServlet?pg=${pgInfo.prePage }">上一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowFeedbackServlet?pg=${pgInfo.nextPage }">下一页 </a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowFeedbackServlet?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>
<y:if test="${param.upmsg==1 }">
     <script>alert("修改成功！")</script>
</y:if>
<y:if test="${param.upmsg==0 }">
     <script>alert("修改失败！")</script>
</y:if>