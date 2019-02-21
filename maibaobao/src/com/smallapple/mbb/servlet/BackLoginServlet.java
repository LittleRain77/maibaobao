package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.BackLoginBiz;
import com.smallapple.mbb.biz.inter.BackLoginBizInter;
import com.smallapple.mbb.vo.Admin;

/**
 * 后台管理员登陆
 */
public class BackLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BackLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession  session=request.getSession();
		String aid=request.getParameter("aid");
		String apass=request.getParameter("apass");
		String code=request.getParameter("code");
		//获取验证码
		
		String valcode=session.getAttribute("valcode").toString();
		if(!valcode.equals(code)){
			response.sendRedirect("backlogin.jsp");
			return;
		}
		BackLoginBizInter biz = new BackLoginBiz();	
		Admin admin=biz.BackLoginBiz(aid,apass);
		if(admin!=null){
			session.setAttribute("admin",admin);
			response.sendRedirect("back/backindex.jsp");
		}else{
			response.sendRedirect("backlogin.jsp");
		}
	}

}
