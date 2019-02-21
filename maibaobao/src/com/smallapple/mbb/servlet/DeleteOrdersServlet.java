package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.OrdersBiz;
import com.smallapple.mbb.biz.inter.OrdersBizInter;

/**
 * Servlet implementation class DeleteOrdersServlet
 */
public class DeleteOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteOrdersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获得前台传来的id值
		String oid=request.getParameter("oid");
	
		
		//调用biz层进行删除
		OrdersBizInter biz=new OrdersBiz();
		boolean flag=biz.deleteOrder(oid);
		//删除后回到订单信息的Servlet
		if(flag){
			
			response.sendRedirect("index.jsp?delmsg=1");
			
		}else{
			response.sendRedirect("index.jsp?delmsg=0");
		}
		
		
	}

}