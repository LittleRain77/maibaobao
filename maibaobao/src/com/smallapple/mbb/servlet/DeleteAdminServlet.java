package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Admin;


public class DeleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ǰ̨������idֵ
		String  aid=request.getParameter("id");
		//���ε�½�˻� ����session�л�õ�½�˻���Ϣ
         Admin admin=(Admin) request.getSession().getAttribute("admin");
         if(aid.equals(admin.getAid())){
        	 response.sendRedirect("ShowAdminServlet?delmsg=2");
        	 return ;
         }
         //����biz�����ɾ��
         AdminBizInter biz=new AdminBiz();
         boolean flag=biz.deleteAdmin(aid);
         //ɾ���󷵻ز�ѯԱ����Ϣ��servlet��
         if(flag){
        	 response.sendRedirect("ShowAdminServlet?delmsg=1");
         }else{
        	 response.sendRedirect("ShowAdminServlet?delmsg=0");
         }
	}

}
