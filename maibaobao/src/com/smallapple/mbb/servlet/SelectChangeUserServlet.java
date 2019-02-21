package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.SelectUserBiz;
import com.smallapple.mbb.biz.inter.SelectUserBizInter;
import com.smallapple.mbb.vo.User;

/**
 * 修改用户查询模块
 */
public class SelectChangeUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public SelectChangeUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=request.getParameter("uid");
		SelectUserBizInter biz = new SelectUserBiz();
		User user=biz.searchChangeUser(uid);
		request.setAttribute("chauser", user);
		request.getRequestDispatcher("backindex.jsp?app=updateUser").forward(request, response);
	}

}
