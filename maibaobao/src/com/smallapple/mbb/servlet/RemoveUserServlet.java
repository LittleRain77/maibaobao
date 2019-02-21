package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.dbutil.CookieUtil;


/**
 *ÓÃ»§ÍË³ö
 */
public class RemoveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RemoveUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CookieUtil.deleteCookie("user", response);
		
		HttpSession session=request.getSession();
		session.removeAttribute("user");
		response.sendRedirect("login.jsp");
	}

}
