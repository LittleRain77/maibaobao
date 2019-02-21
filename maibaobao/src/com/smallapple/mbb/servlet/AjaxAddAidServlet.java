package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;

public class AjaxAddAidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AjaxAddAidServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * 判断管理员账号是否已存在
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获得前台提交的数据
		String aname=request.getParameter("aid");
		PrintWriter out=response.getWriter();
		AdminBizInter biz=new AdminBiz();
		int rs=biz.isHaveAdmin(aname);
		out.println(rs);
		out.flush();
	}

}
