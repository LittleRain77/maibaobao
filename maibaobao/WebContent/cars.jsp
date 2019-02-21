<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车显示页面</title>
</head>
<body>

<table>

		<tr>
			<td>商品名称</td>
			<td>图片</td>
			<td>数量</td>
			<td>单价</td>
			<td>总价</td>
			<td>操作</td>
		</tr>
	<c:if test="${cars!=null }">
			<c:forEach var="item" items="${cars }">
				<tr>
					<td>${item.value.goods.gname }</td>
					<td><img src="${item.value.goods.gimage }"/></td>
					<td><a href="ReduceServlet?gid=${item.value.getGoods().getGid() }&method=add"><input name="add" type="button"  value="+"/></a>
					${item.value.number }
					<a href="ReduceServlet?gid=${item.value.getGoods().getGid() }&method=reduce"><input name="reduce" type="button" value="-" /></a></td>
					<td>${item.value.goods.gprice }</td>
					<td>${item.value.number*item.value.goods.gprice}</td>
					<td><a href="DeleteCarServlet?gid=${item.value.getGoods().getGid() }&method=remove">删除</a></td>
				</tr>

			</c:forEach>

		</c:if>

		<tr>
			<td colspan="5" align="right"><a href="index.jsp">继续购物</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="DeleteCarServlet?method=clear">清空购物车</a>
			<a href="orders.jsp">进行结算</a>
			</td>
		</tr>
	</table>

</body>
</html>