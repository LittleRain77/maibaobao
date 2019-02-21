<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">  
<head>
<link href="styles/backIndex.css" rel="stylesheet" type="text/css" />
<link href="styles/leftIndex.css" rel="stylesheet" type="text/css" />
<script src="js/prototype.lite.js" type="text/javascript"></script>
<script src="js/moo.fx.js" type="text/javascript"></script>
<script src="js/moo.fx.pack.js" type="text/javascript"></script>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript" src="js/add.js"></script>
<title>后台管理</title>
</head>
    <body>
      <div class="headType">
		<%@ include file="admin_top.jsp"%>
	</div>
	<div class="leftType">
		<%@ include file="left.jsp"%>
	</div>
	<div class="rightType">
	    <%-- <c:if test="${empty param.app }">
			<jsp:include page="right.jsp"></jsp:include>
		</c:if> --%>
		<c:if test="${!empty param.app }">
			<jsp:include page="${param.app }.jsp"></jsp:include>
		</c:if>
	</div>
	<div class="footType clearFloat"></div>
    </body>
</html>
