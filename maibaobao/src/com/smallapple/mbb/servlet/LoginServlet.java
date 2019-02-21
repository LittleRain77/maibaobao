package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.UserLoginBiz;
import com.smallapple.mbb.biz.inter.UserLoginBizInter;
import com.smallapple.mbb.dbutil.CookieUtil;
import com.smallapple.mbb.vo.User;

/**
 * 前台登陆
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		String unum=request.getParameter("unum");
		String seven=request.getParameter("seven");
		
		//调用biz层
		
		UserLoginBizInter biz=new UserLoginBiz(); 
		User us=biz.login(username, pwd);
		HttpSession session=request.getSession();
		session.setAttribute("user", us);
		if(!session.getAttribute("valcode").equals(unum)||unum==null||"".equals(unum)){
			response.sendRedirect("login.jsp?msg=2");
			return;
		}
		 if(us!=null&&session.getAttribute("valcode").equals(unum)&&seven==null){
			response.sendRedirect("index.jsp");
			return;
		}
		 if(us!=null&&session.getAttribute("valcode").equals(unum)&&seven!=null){
			 CookieUtil.addCookie("user", username+"!"+pwd+"?", 3, response);
			
			response.sendRedirect("index.jsp");
		}else {
			response.sendRedirect("login.jsp?msg=1");
		}
	
	}

}
