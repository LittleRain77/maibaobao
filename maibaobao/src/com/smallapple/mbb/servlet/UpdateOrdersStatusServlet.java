package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.OrdersBiz;
import com.smallapple.mbb.biz.inter.OrdersBizInter;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.User;

/**
 * ÐÞ¸Ä¶©µ¥×´Ì¬µÄServlet
 */
public class UpdateOrdersStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public UpdateOrdersStatusServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Orders or=new Orders();
		or.setOid(request.getParameter("oid"));
		or.setUid(request.getParameter("uid"));
		or.setOaddress(request.getParameter("oaddress"));
		or.setOpaymenttype(request.getParameter("opaymenttype"));
		or.setOphone(request.getParameter("ophone"));
		or.setOstatus(request.getParameter("ostatus"));
		or.setOtime(request.getParameter("otime"));
		or.setOusername(request.getParameter("ousername"));
		OrdersBizInter biz=new OrdersBiz();
		boolean flag=biz.updateOrder(or);

		if(flag){
			response.sendRedirect("ShowOrdersServlet?delmsg=1");

		}else{
			response.sendRedirect("ShowOrdersServlet?delmsg=0");
		}



	}
}