package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Admin;

/**
 * 后台修改个人信息查询模块
 */
public class SelectChangeAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectChangeAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String aid=request.getParameter("aid");
		AdminBizInter biz=new AdminBiz();
		Admin admin=biz.searchChangeAdmin(aid);
		request.setAttribute("admininfo", admin);
		request.getRequestDispatcher("backindex.jsp?app=updateOneAdmin").forward(request, response);
	}

}
