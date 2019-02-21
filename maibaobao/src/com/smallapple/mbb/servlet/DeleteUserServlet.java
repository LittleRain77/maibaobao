package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.SelectUserBiz;
import com.smallapple.mbb.biz.inter.SelectUserBizInter;

/**
 * É¾³ýÓÃ»§
 */
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=request.getParameter("uid");
		SelectUserBizInter biz=new SelectUserBiz();
		boolean bool=biz.deleteUserBiz(uid);
		if(bool){
			response.sendRedirect("backindex.jsp?app=showUser&msg=1");
		}else{
			response.sendRedirect("backindex.jsp?app=showUser&msg=0");
		}
	}

}
