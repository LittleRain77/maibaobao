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
<form action="InsertChangeUserServlet"  method="post">
   <table>
   <caption style="font-size:25px;color:#069;" height="30">用户信息修改</caption>
      <tr><td colspan="2"><hr/></td>
		</tr>
      <tr height="30"><td algin="right" class="td1">用户名：</td>       
         <td><input type="hidden" name="uid" value="${chauser.uid }">${chauser.uid }</td>
      </tr>
      <tr height="30"><td align="right" class="td1">性别：</td>
         <td><input type="text" name="usex" value="${chauser.usex }"></td>
      </tr>
      <tr height="30"><td align="right" class="td1">出生日期：</td>
         <td><input type="text" name="ubirthday" value="${chauser.ubirthday }"></td>
      </tr>
      <tr height="30"><td align="right" class="td1">状态：</td>
         <td><input type="text" name="ustatus" value="${chauser.ustatus }"></td>
      </tr>
      <tr height="30"><td align="right" class="td1">电话：</td>
         <td><input type="text" name="uphone" value="${chauser.uphone }"></td>
      </tr>
      <tr height="30"><td align="right" class="td1">邮箱：</td>
         <td><input type="text" name="uemail" value="${chauser.uemail }"></td>
      </tr>
      <tr height="30"><td align="right" class="td1">地址：</td>
         <td><input type="text" name="uaddress" value="${chauser.uaddress }"></td>
      </tr>
      <tr height="30"><td align="right" class="td1">麦豆：</td>
         <td><input type="text" name="ubeen" value="${chauser.ubeen }"></td>
      </tr>
      <tr height="30"><td align="right" class="td1">权限：</td>
         <td><input type="text" name="upower" value="${chauser.upower }"></td>
      </tr>
      <tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
   </table>
   <hr/>
	<a href="ShowUserServlet">返回用户信息列表</a>
</form>
</div>
</div>