package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.smallapple.mbb.biz.OrdersBiz;
import com.smallapple.mbb.biz.inter.OrdersBizInter;
import com.smallapple.mbb.vo.Car;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.User;

/**
 * Servlet implementation class OrdersServlet
 */
public class OrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		//获得订单的信息，订单号，表单数据，登录用户，时间
		Orders or=new Orders();
		//设置订单号，以当前系统时间的毫秒数为订单号
		Date dt=new Date();
		SimpleDateFormat sdf2=new SimpleDateFormat("hhmmss");
		String time=sdf2.format(dt);
		or.setOid(time);
		//收货地址
		or.setOaddress(request.getParameter("oaddress"));
		//收货人
		or.setOusername(request.getParameter("ousername"));
		//电话
		or.setOphone(request.getParameter("ophone"));
		//付款的方式
		or.setOpaymenttype(request.getParameter("opaymenttype"));
		//购买用户的id
		User us=(User)session.getAttribute("user");
		//us.setUid(request.getParameter("uid"));
		or.setUid(us.getUid());
		
		//按指定格式转化系统时间
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		or.setOtime(sdf.format(dt));
		//设置订单状态
		or.setOstatus("未发货");
		//设置商品列表
		Map<Object,Car> map=(Map<Object,Car>)session.getAttribute("cars");
		or.setList(map.values());
		//将or传给OrderBiz进程处理
		OrdersBizInter biz=new OrdersBiz();
		boolean flag=biz.addOrder(or);
		//跳转到订单浏览页面
		if(flag){
			response.sendRedirect("submit_success.jsp");
		}else{
			response.sendRedirect("information.jsp");
		}
	}

}
