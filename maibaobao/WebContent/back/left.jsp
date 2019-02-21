<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<table width="100%" height="280" border="0" cellpadding="0" cellspacing="0" bgcolor="#EEF2FB">
  <tr>
    <td width="182" valign="top"><div id="container">
      <h1 class="type"><a href="javascript:void(0)">商品管理</a></h1>
      <div class="content">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><img src="images/menu_topline.gif" width="182" height="5" /></td>
          </tr>
        </table>
        <ul class="MM">
          <li><a href="sInfoFAddGoods">添加商品</a></li>
          <li><a href="showGoods">查看商品</a></li>
        </ul>
      </div>
      <h1 class="type"><a href="javascript:void(0)">管理员管理</a></h1>
      <div class="content">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><img src="images/menu_topline.gif" width="182" height="5" /></td>
          </tr>
        </table>
        <ul class="MM">
          <li><a href="backindex.jsp?app=addAdmin">添加管理员</a></li>
          <li><a href="ShowAdminServlet">查看管理员</a></li>
        </ul>
      </div>
      <h1 class="type"><a href="javascript:void(0)">用户管理</a></h1>
      <div class="content">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><img src="images/menu_topline.gif" width="182" height="5" /></td>
          </tr>
        </table>
        <ul class="MM">
		  <li><a href="SelectUserServlet">查看用户</a></li>
        </ul>
      </div>
      <h1 class="type"><a href="javascript:void(0)">消息管理</a></h1>
      <div class="content">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td><img src="images/menu_topline.gif" width="182" height="5" /></td>
          </tr>
        </table>
        <ul class="MM">
          <li><a href="ShowCollectServlet">查看收藏</a></li>
          <li><a href="ShowEvaluateServlet">查看评论</a></li>
          <li><a href="ShowQuestionServlet">查看咨询</a></li>
          <li><a href="ShowFeedbackServlet">查看留言板</a></li>
          <li><a href="ShowReplyServlet">查看留言回复</a></li>
        </ul>
      </div>
    </div>
        <h1 class="type"><a href="javascript:void(0)">订单管理</a></h1>
      <div class="content">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td><img src="images/menu_topline.gif" width="182" height="5" /></td>
            </tr>
          </table>
        <ul class="MM">
            <li><a href="ShowOrdersServlet">查看订单</a></li>
             <li><a href="ShowApplyRefundServlet">申请退款信息列表</a></li>
        </ul>
      </div>
      </div>
      <h1 class="type"><a href="javascript:void(0)">系统管理</a></h1>
      <div class="content">
          <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td><img src="images/menu_topline.gif" width="182" height="5" /></td>
            </tr>
          </table>
        <ul class="MM">
            <li><a href="SelectChangeAdminServlet?aid=${admin.aid }">修改个人信息</a></li>
            <li><a href="RemoveAdminServlet" >退出</a></li>
        </ul>
      </div>
      </div>
        <script type="text/javascript">
		var contents = document.getElementsByClassName('content');
		var toggles = document.getElementsByClassName('type');
	
		var myAccordion = new fx.Accordion(
			toggles, contents, {opacity: true, duration: 400}
		);
		myAccordion.showThisHideOpen(contents[0]);
	</script>
        </td>
  </tr>
</table>

