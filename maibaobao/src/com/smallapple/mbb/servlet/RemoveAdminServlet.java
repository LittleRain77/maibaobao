package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * �˳�ϵͳ
 */
public class RemoveAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RemoveAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�˳��˻�
				HttpSession session=request.getSession();
				session.removeAttribute("admin");		
				response.sendRedirect("backlogin.jsp");
	}

}
