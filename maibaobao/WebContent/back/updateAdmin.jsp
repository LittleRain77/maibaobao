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
	width:350px;
	min-height:400px;
	}
.td1{
   font-size:18px;
   font-family:Terminal, System, Fixedsys, 'Arial Unicode MS', '幼圆';
}
 </style>
<div class="big"  >
<div class="small" >
  <form action="updateAdmin" method="post" name="f1" onsubmit="return isSubmit()">
  <table>
  <caption style="font-size:25px;color:#069;">"麦包包"管理员修改</caption>
      <tr><td colspan="3">&nbsp;</td>
		</tr>
     <tr style="border-style:hidden"  height="30"> 
       <td align="right" class="td1">账号：</td><td><input type="hidden" name="aid" value="${adInfo.aid }"  size="24"  height="26" />${adInfo.aid }</td>
       
     </tr>
      <tr height="30"><td align="right" class="td1"> 姓名：</td><td><input type="text" name="aname" value="${adInfo.aname }" size="24"  height="26"/></td></tr>
      <tr height="30"><td  align="right" class="td1"> 密码：</td><td><input type="password" name="apass"  value="${adInfo.apass }" size="24"  height="26" id="h" onblur="isNull('h')"/>*<span id="msgh"></span>*</td></tr>
      <tr height="30"><td  align="right" class="td1"> 性别：</td><td><input type="radio" name="asex" value="男" checked="checked"/>男&nbsp;<input type="radio" name="asex" value="女"/>女</td></tr>
      <tr height="30"><td  align="right" class="td1"> 权限：</td><td><input type="text" name="apower"  value="${adInfo.apower }" size="24"  height="26"/></td></tr>
      <tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
 </table>
 <hr/>
	<a href="ShowAdminServlet">返回管理员信息列表</a>
  </form>
  </div>
</div> 
 