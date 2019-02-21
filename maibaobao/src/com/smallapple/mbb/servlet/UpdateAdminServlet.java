package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Admin;


public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// ���ǰ̨�ύ�ĸ�����Ϣ,����װ��Admin������ȥ
		Admin admin=new Admin();
		admin.setAid(request.getParameter("aid"));
		admin.setAname(request.getParameter("aname")); 
		admin.setApass(request.getParameter("apass"));
		admin.setAsex(request.getParameter("asex"));
		admin.setApower(request.getParameter("apower"));
		//����biz��
		AdminBizInter biz=new AdminBiz();
		boolean flag=biz.updateAdmin(admin);
		//�ж�
		 if(flag){
	       	 response.sendRedirect("ShowAdminServlet?upmsg=1");
	        }else{
	       	 response.sendRedirect("ShowAdminServlet?upmsg=0");
	        }
	}

}
