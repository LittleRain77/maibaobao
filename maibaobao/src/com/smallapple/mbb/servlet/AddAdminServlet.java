package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Admin;


public class AddAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddAdminServlet() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		//���ǰ̨�ύ��Ա����Ϣ������װ��Admin������ȥ
		Admin admin=new Admin();
		admin.setAid(request.getParameter("aid"));
		admin.setAname(request.getParameter("aname"));
		admin.setApass(request.getParameter("apass"));
		admin.setAsex(request.getParameter("asex"));
		admin.setApower(request.getParameter("apower"));
		//����biz�㣬�����ݴ洢�����ݿ���
		AdminBizInter biz=new AdminBiz();
		boolean flag=biz.insertAdmin(admin);
		if(flag){
			//�ɹ�
		   response.sendRedirect("backindex.jsp?app=addAdmin&admsg=1");	
		}else{
			//ʧ��
			response.sendRedirect("backindex.jsp?app=addAdmin&admsg=0");
		}
	}

}
