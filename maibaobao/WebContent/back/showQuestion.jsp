<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>
<div align="center" style="width:1065px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——咨询列表</caption>
		<tr>
			<td height="32" colspan="6">
				<form action="ShowQuestionServlet" method="post" name="f1">
					按咨询的商品名称查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="28">
			<td width="60" height="28">咨询编号</td>
			<td width="100">用户</td>
			<td width="240">咨询的商品名称</td>
			<td width="80">咨询类型</td>
			<td width="260">咨询内容</td>
			<td width="140">咨询时间</td>
		</tr>
		<b:forEach var="quest" items="${qinfos}">
			<tr  height="28">
				<td>${quest.qid}</td>
				<td>${quest.uid}</td>
				<td>${quest.gds.gname}</td>
				<td>${quest.qtype}</td>
				<td>${quest.qtext}</td>
				<td>${quest.qtime}</td>	
			</tr>
		</b:forEach>
		<td colspan="6" align="right">
		<a href="showQuestionServlet?pg=1"> 首页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowQuestionServlet?pg=${pgInfo.prePage }">上一页 </a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowQuestionServlet?pg=${pgInfo.nextPage }">下一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowQuestionServlet?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>
<b:if test="${param.upmsg==1 }">
     <script>alert("回复成功！")</script>
</b:if>
<b:if test="${param.upmsg==0 }">
     <script>alert("回复失败！")</script>
</b:if>