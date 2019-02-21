<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="o"%>
<div align="center" style="width:1065px">
	<table  border="1"  align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——商品列表</caption>
		<tr>
			<td height="32" colspan="9">
				<form action="showGoods" method="post" name="f1">
					按商品名称查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查找" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="23">
			<td width="30">商品编号</td>
			<td width="50">商品类型</td>
			<td width="200">商品名称</td>
			<td width="65">数量</td>
			<td width="200">商品简介</td>
			<td width="80">图片</td>
			<td width="118">出产地</td>
			<td width="101">价格</td>
			<td width="100">操作</td>
		</tr>
		<o:forEach var="goods" items="${infos}">
			<tr>
				<td>${goods.gid}</td>
				<td>${goods.gtype.gtname}</td>
				<td>${goods.gname}</td>
				<td>${goods.gnumber}</td>
				<td>${goods.gtext}</td>
				<td><img alt="a" src="../${goods.gimage}" width="50" height="50"></td>
				<td>${goods.gaddress}</td>
				<td>${goods.gprice}</td>
				<td><a href="sInfoForUpGoods?id=${goods.gid }">编辑</a><img src="images/edit.gif" width="12" height="12" />&nbsp;&nbsp;<a href="deleteGoods?id=${goods.gid }">删除</a><img src="images/X.gif" width="12" height="12" /></td>
			</tr>
		</o:forEach>
		<td colspan="9" align="right">
		<a href="showGoods?pg=1"> 首页</a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="showGoods?pg=${pgInfo.prePage }">上一页 </a>&nbsp;&nbsp;&nbsp;&nbsp; 
		<a href="showGoods?pg=${pgInfo.nextPage }">下一页 </a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="showGoods?pg=${pgInfo.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		当前${pgInfo.curPage}页 /共 ${pgInfo.totalNumber}页&nbsp;&nbsp;&nbsp;
		</td>
	</table>
</div>
<o:if test="${param.delmsg==1 }">
     <script>alert("删除成功！")</script>
</o:if>
<o:if test="${param.delmsg==0 }">
     <script>alert("删除失败！")</script>
</o:if>
<o:if test="${param.upmsg==1 }">
     <script>alert("修改成功！")</script>
</o:if>
<o:if test="${param.upmsg==0 }">
     <script>alert("修改失败！")</script>
</o:if>