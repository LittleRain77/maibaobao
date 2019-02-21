package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.OrdersBiz;
import com.smallapple.mbb.biz.inter.OrdersBizInter;
import com.smallapple.mbb.vo.Orders;

/**
 * 获得一个订单的信息
 */
public class SearchOrderForUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public SearchOrderForUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oid=request.getParameter("oid");
		OrdersBizInter biz=new OrdersBiz();
		Orders order=biz.getOneOrderInfo(oid);
		request.setAttribute("adInfo", order);
		request.getRequestDispatcher("backindex.jsp?app=updateOrders").forward(request, response);
	}

}
