<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="w"%>
<div align="center" style="width:1065px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——评价列表</caption>
		<tr>
			<td height="32" colspan="6">
				<form action="ShowEvaluateServlet" method="post" name="f1">
					按评价的商品名称查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="28">
			<td width="40">评价编号</td>
			<td width="110">评价人</td>
			<td width="250">评价的商品名称</td>
			<td width="300">评价内容</td>
			<td width="140">评价时间</td>
		</tr>
		<w:forEach var="evalue" items="${einfos}">
			<tr height="28">
				<td>${evalue.eid}</td>
				<td>${evalue.uid}</td>
				<td>${evalue.gds.gname}</td>
				<td>${evalue.etext}</td>
				<td>${evalue.etime}</td>	
			</tr>
		</w:forEach>
		<td colspan="6" align="right">
		<a href="showEvaluateServlet?pg=1"> 首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowEvaluateServlet?pg=${pgInfo.prePage }">上一页 </a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowEvaluateServlet?pg=${pgInfo.nextPage }">下一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowEvaluateServlet?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>