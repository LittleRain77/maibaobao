<!-- //后台显示订单页面
//从left中查看订单，在页面右侧显示 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<div align="center" style="width:1065px">
	<table border="1" align="center" bgcolor="#FFFFFF" bordercolor="#00356A">
		<caption style="font-size:23px;" height="30">"麦包包"网店——订单列表</caption>
		<tr>
			<td height="32" colspan="9">
				<form action="ShowOrdersServlet" method="post" name="f1">
					按条件查询：<input type="text" name="keyword" /> <input type="submit"
						name="sub" value="查询" />
				</form>
			</td>
		</tr>
		<tr bgcolor="#99CCCC"  height="28">
			<td width="110">订单编号</td>
			<td width="110">用户账号</td>
			<td width="80">收货人姓名</td>
			<td width="80">收货人电话</td>
			<td width="140">下单时间</td>
			<td width="50">付款方式</td>
			<td width="120">收货地址</td>
			<td width="50">订单状态</td>
			<td width="60">操作</td>
		</tr>
		<a:forEach var="sun" items="${infos }">
			<tr>
				<td>${sun.oid }</td>
				<td>${sun.uid }</td>
				<td>${sun.ousername }</td>
				<td>${sun.ophone }</td>
				<td>${sun.otime }</td>
				<td>${sun.opaymenttype }</td>
				<td>${sun.oaddress}</td>
				<td>${sun.ostatus }</td>
				<td><a href="SearchOrderForUpdateServlet?oid=${sun.oid }">编辑</a><img src="images/edit.gif" width="12" height="12" />
				</td>
			</tr>
		</a:forEach>
		<tr>
			<td colspan="9" align="right"><a href="ShowOrdersServlet?pg=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
			<a href="ShowOrdersServlet?pg=${pgInfos.prePage }">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
			
			<a href="ShowOrdersServlet?pg=${pgInfos.nextPage }">下一页</a> &nbsp;&nbsp;&nbsp;&nbsp;
			 <a href="ShowOrdersServlet?pg=${pgInfos.totalNumber }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			 当前 ${pgInfos.curPage }页 /共${pgInfos.totalNumber }页&nbsp;&nbsp;&nbsp;</td>
		</tr>
	</table>
</div>