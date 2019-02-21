<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="h"%>
<style type="text/css">

.big{
	width:1020px;
	min-height:600px;
	}
.small{
	margin-left:180px;
	margin-top:40px;
	width:700px;
	background-color:#FFFFFF;
	
	border: #99CCCC 1px solid;
	}
 </style>
<div class="big"  >
<div class="small" >
	<table  bgcolor="#FFFFFF">
		<tr style="font-size:20px"><td colspan="3" width="700" height="52">留言：${fbinfo.ftext}</td></tr>
		<tr bgcolor="#4D9B9F"  height="28">
	      <td>留言编号：${fbinfo.fid}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                            留言人:${fbinfo.uid}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                 留言时间:${fbinfo.ftime}</td>	
		</tr>
		<tr><td colspan="3"><hr/></td>
		</tr>
		<h:forEach var="rl" items="${rfinfo}">
		<tr>
		  <td colspan="3"  height="42">回复内容：${rl.rtext}</td>
		</tr>
		<tr bgcolor="#9ACDC7">
		    <td>回复编号：${rl.rid}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			回复人：${rl.aid}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			回复时间：${rl.rtime}</td>
		</tr>
		</h:forEach>
	</table>
	<hr/><hr/>
	<a href="ShowFeedbackServlet">返回留言列表</a>
	</div>
</div>			