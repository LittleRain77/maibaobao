<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单</title>
</head>
<body>
	<c:if test="${user==null }">
	    
		<c:redirect url="login.jsp?msg=1"></c:redirect>
		
	</c:if>
	<table border="1" align="center" width="70%">
	<caption>订单明细</caption>
	<tr>
	  <td>商品名称</td>
	  <td>数量</td>
	  <td>单价</td>
	  <td>总价</td>
	</tr>
	<c:if test="${cars!=null }">
			<c:forEach var="item" items="${cars }">
				<tr>
					<td>${item.value.goods.gname }</td>
					<td>${item.value.number }</td>
					<td>${item.value.goods.gprice }</td>
					<td>${item.value.number*item.value.goods.gprice}</td>
				</tr>

			</c:forEach>

		</c:if>
	</table>
	<form action="OrdersServlet" method="post" name="f1">
		收货地址：<input type="text" name="oaddress" /><br /> 
		联系人：<input type="text" name="ousername" /><br /> 
		联系人电话：<input type="text" name="ophone" /><br /> 
		付款方式：<input type="radio" name="opaymenttype"value="货到付款" checked="checked" />货到付款
               <input type="radio" name="opaymenttype" value="在线支付"/>在线支付
               <br/>
               <input type="submit" name="sub" value="提交订单">
	</form>
	 <a href="DeleteOrdersServlet"> <input type="submit" name="sub" value="取消订单"></a>
	<hr/>
</body>
</html>