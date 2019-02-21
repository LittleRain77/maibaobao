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
	<form action="UpdateApplyRefundServlet" method="post" name="f1">
		<table>
		   <caption style="font-size:25px;color:#069;">申请退款的审核</caption>
			<tr><td>&nbsp;</td></tr>
			<tr height="30"><td align="right" class="td1">申请编号：</td>
				<td>${arInfo.arid }<input type="hidden" name="arid"
					value="${arInfo.arid }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">用户账号：</td>
				<td>${arInfo.uid }<input type="hidden" name="uid"
					value="${arInfo.uid }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">商品编号：</td>
				<td>${arInfo.gid }<input type="hidden" name="gid"
					value="${arInfo.gid }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">退款理由：</td>
				<td>${arInfo.arreason }<input type="hidden" name="arreason"
					value="${arInfo.arreason }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">具体理由：</td>
				<td>${arInfo.artext }<input type="hidden" name="artext"
					value="${arInfo.artext }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">订单状态：</td>
				<td><input type="text" name="arstatus"
					value="${arInfo.arstatus }" /></td>
			</tr>
			<tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
            <tr><td>&nbsp;</td></tr>
		</table>
	<a href="ShowApplyRefundServlet">返回订单详情信息列表</a>
	</form>
</div>
</div>
