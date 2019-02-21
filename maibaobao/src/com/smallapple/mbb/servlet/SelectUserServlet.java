package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.SelectUserBiz;
import com.smallapple.mbb.biz.inter.SelectUserBizInter;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;

/**
 * ≤È—Ø”√ªß
 */
public class SelectUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pg=request.getParameter("pg");
		String userkey=request.getParameter("userkey");
		List<User> user=null;
		int pgnum=1;
		if(pg!=null && !"".equals(pg)){
			pgnum=Integer.parseInt(pg);
		}
		SelectUserBizInter biz = new SelectUserBiz();
		Page page = new Page(pgnum,7,biz.countUser());
		if(userkey==null || "".equals(userkey)){
			user=biz.searchUser(page);
		}else{
			user=biz.searchUserKey(userkey, page);
		}
		 
		request.setAttribute("userinfo", user);
		request.setAttribute("userpage", page);
		request.getRequestDispatcher("backindex.jsp?app=showUser").forward(request, response);
	}

}
