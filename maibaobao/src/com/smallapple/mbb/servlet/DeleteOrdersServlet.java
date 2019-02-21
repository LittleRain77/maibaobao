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
		//���ǰ̨������idֵ
		String oid=request.getParameter("oid");
	
		
		//����biz�����ɾ��
		OrdersBizInter biz=new OrdersBiz();
		boolean flag=biz.deleteOrder(oid);
		//ɾ����ص�������Ϣ��Servlet
		if(flag){
			
			response.sendRedirect("index.jsp?delmsg=1");
			
		}else{
			response.sendRedirect("index.jsp?delmsg=0");
		}
		
		
	}

}