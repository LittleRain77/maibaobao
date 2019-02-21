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
	 * �жϹ���Ա�˺��Ƿ��Ѵ���
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ǰ̨�ύ������
		String aname=request.getParameter("aid");
		PrintWriter out=response.getWriter();
		AdminBizInter biz=new AdminBiz();
		int rs=biz.isHaveAdmin(aname);
		out.println(rs);
		out.flush();
	}

}
