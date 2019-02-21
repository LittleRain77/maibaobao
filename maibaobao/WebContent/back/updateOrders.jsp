<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style type="text/css">

.big{
	width:1020px;
	min-height:600px;
	}
.small{
	margin-left:310px;
	margin-top:40px;
	width:400px;
	min-height:400px;
	}
.td1{
   font-size:18px;
   font-family:Terminal, System, Fixedsys, 'Arial Unicode MS', '幼圆';
}
 </style>
<div class="big"  >
<div class="small" >
	<form action="UpdateOrdersStatusServlet" method="post" name="f1">
		<table>
		   <caption style="font-size:25px;color:#069;">订单详情修改</caption>
			<tr><td>&nbsp;</td></tr>
			<tr height="30"><td align="right" class="td1">订单编号：</td>
				<td>${adInfo.oid }<input type="hidden" name="oid"
					value="${adInfo.oid }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">用户账号：</td>
				<td>${adInfo.uid }<input type="hidden" name="uid"
					value="${adInfo.uid }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">收货人姓名：</td>
				<td>${adInfo.ousername }<input type="hidden" name="ousername"
					value="${adInfo.ousername }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">收货人电话：</td>
				<td>${adInfo.ophone }<input type="hidden" name="ophone"
					value="${adInfo.ophone }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">下单时间：</td>
				<td>${adInfo.otime }<input type="hidden" name="otime"
					value="${adInfo.otime }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">付款方式：</td>
				<td>${adInfo.opaymenttype }<input type="hidden" name="opaymenttype"
					value="${adInfo.opaymenttype }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">送货地址：</td>
				<td>${adInfo.oaddress }<input type="hidden" name="oaddress"
					value="${adInfo.oaddress }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">订单状态：</td>
				<td><input type="text" name="ostatus"
					value="${adInfo.ostatus }" /></td>
			</tr>
			<tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
            <tr><td>&nbsp;</td></tr>
		</table>
	<a href="ShowOrderServlet">返回订单详情信息列表</a>
	</form>
</div>
</div>
