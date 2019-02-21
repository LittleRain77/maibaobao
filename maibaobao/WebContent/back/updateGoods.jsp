<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ab"  %>
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
	background-color:#EFF8F8;
	}
.td1{
   font-size:18px;
   font-family:Terminal, System, Fixedsys, 'Arial Unicode MS', '幼圆';
}
 </style>
<div class="big"  >
<div class="small" >
  <form action="updateGoods" method="post" name="f1" enctype="multipart/form-data" onsubmit="return isSubmit()">
  <table>
  <caption style="font-size:25px;color:#069;" height="30">"麦包包"网店——商品的修改</caption>
     <tr><td colspan="2"><hr/></td>
		</tr>
     <tr height="30"> 
       <td class="td1">商品编号：</td><td><input type="hidden" name="gid" value="${gInfo.gid}" size="24"  height="98"/> ${gInfo.gid}</td>
     </tr>
     <tr height="30"> 
       <td class="td1">商品名称：</td><td><input type="text" name="gname" value="${gInfo.gname }" size="24"  height="98" id="d" onblur="isNull('d')"/>*<span id="msgd"></span>*</td>
     </tr>
     <tr height="30">
       <td class="td1">商品类型：</td> <td><select name="gtid">
         <option value="${gInfo.gtype.gtid}" >${gInfo.gtype.gtname}</option>
          <ab:forEach var="gtype" items="${gtInfo }" >
           <ab:if test="${gtype.gtname!=gInfo.gtype.gtname}">
           <option value="${gtype.gtid }" >${gtype.gtname}</option>
           </ab:if>
           </ab:forEach>
         </select></td>
     </tr>
      <tr height="30"><td align="right" class="td1"> 库存数量：</td><td><input type="text" name="gnumber" value="${gInfo.gnumber}" size="24"  height="35"  id="e" onblur="isNull('e')"/>*<span id="msge"></span>*</td></tr>
      <tr height="30"><td  align="right" class="td1"> 价格：</td><td><input type="text" name="gprice" value="${gInfo.gprice}" size="24"  height="35" id="f" onblur="isNull('f')"/>*<span id="msgf"></span>*</td></tr>
      <tr height="30"><td  align="right" class="td1"> 出产地：</td><td><input type="text" name="gaddress" value="${gInfo.gaddress}" size="24"  height="35"/></td></tr>
      <tr height="30"><td class="td1">上传图片：</td><td><input type="file" name="gimage" /></td></tr>
      <tr height="30"><td class="td1"> 商品描述：</td><td><textarea rows="8" cols="32" name="gtext">${gInfo.gtext }</textarea></td></tr> 
      <tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
 </table>
 <hr/>
	<a href="showGoods">返回商品信息列表</a>
  </form>
  </div>
</div>