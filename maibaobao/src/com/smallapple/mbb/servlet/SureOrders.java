package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.SelectUserBiz;
import com.smallapple.mbb.biz.inter.SelectUserBizInter;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.User;

/**
 * 确认收货
 */
public class SureOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SureOrders() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		User us=(User)request.getSession().getAttribute("user");
		String user=us.getUid();
		request.setAttribute("user", user);
		SelectUserBizInter biz = new SelectUserBiz();
		String oid=request.getParameter("oid");
		String status="已完成";
		Orders orders=new Orders();
		orders.setOstatus(status);
		orders.setOid(oid);
		
		boolean bool=biz.updateStatus(orders);
		
		if(bool){
			System.out.println(user);
			request.getRequestDispatcher("PersonServlet?uid=user");
		}else{
		    response.sendRedirect("person.jsp?msgstatus=1");
		}
	}

}
