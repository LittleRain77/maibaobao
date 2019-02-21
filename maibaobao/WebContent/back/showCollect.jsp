<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cl"%>
<div align="center" style="width:1000px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——收藏列表</caption>
		<tr>
			<td height="32" colspan="6">
				<form action="ShowCollectServlet" method="post" name="f1">
					按评价的商品名称查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="25">
			<td width="100">收藏编号</td>
			<td width="130">收藏人</td>
			<td width="250">收藏的商品名称</td>
			<td width="100">商品图片</td>
		</tr>
		<cl:forEach var="cl" items="${cinfos}">
			<tr>
				<td>${cl.cid}</td>
				<td>${cl.uid}</td>
				<td>${cl.gds.gname}</td>
				<td><img alt="a" src="../${cl.gds.gimage}" width="50" height="50"></td>	
			</tr>
		</cl:forEach>
		<td colspan="6" align="right">
		<a href="showCollectServlet?pg=1"> 首页</a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowCollectServlet?pg=${pgInfo.prePage }">上一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ShowCollectServlet?pg=${pgInfo.nextPage }">下一页 </a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="ShowCollectServlet?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>