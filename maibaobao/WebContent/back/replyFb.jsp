<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="k"%>
<script src="../ckeditor/ckeditor.js"></script>
<style type="text/css">

.big{
	width:1020px;
	min-height:600px;
	}
.small{
	margin-left:190px;
	margin-top:40px;
	width:700px;
	min-height:400px;
	}
.td1{
   font-size:18px;
   font-family:Terminal, System, Fixedsys, 'Arial Unicode MS', '幼圆';
}
 </style>
<div class="big"  >
<div class="small" >
<form action="ReplyFbServlet"  method="post">
<table>
  <caption style="font-size:25px;color:#069;" height="30">"麦包包"网店——回复留言</caption>     
     <tr><td colspan="2"><hr/></td>
		</tr>
     <tr height="30"><td align="right" class="td1">留言编号：</td>
				<td>${finfo.fid }<input type="hidden" name="fid"
					value="${finfo.fid }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">留言人： </td>
				<td>${finfo.uid }<input type="hidden" name="uid"
					value="${finfo.uid }" /></td>
			</tr>
			<tr height="30"><td align="right" class="td1">留言内容： </td>
				<td>${finfo.ftext}<input type="hidden" name="ftext"
					value="${finfo.ftext}" /></td>
			</tr>
			 <tr height="30"><td class="td1"> 回复：</td><td><textarea id="editor" rows="10" cols="80" name="rtext"> 请输入
            </textarea>
            <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace( 'editor' );
            </script></td></tr> 
			<tr height="30"><td colspan="2" align="center">  <input type="submit" name="sub" value="添加" />&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" name="re" value="重置"  /><br/></td></tr>
</table>
<hr/>
	<a href="ShowFeedbackServlet">返回留言列表</a>
</form>
</div>
</div>
<k:if test="${param.delmsg==1 }">
     <script>alert("删除成功！")</script>
</k:if>
<k:if test="${param.delmsg==0 }">
     <script>alert("删除失败！")</script>
</k:if>