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
		// 获得前台传来的id值
		String  aid=request.getParameter("id");
		//屏蔽登陆账户 ，从session中获得登陆账户信息
         Admin admin=(Admin) request.getSession().getAttribute("admin");
         if(aid.equals(admin.getAid())){
        	 response.sendRedirect("ShowAdminServlet?delmsg=2");
        	 return ;
         }
         //调用biz层进行删除
         AdminBizInter biz=new AdminBiz();
         boolean flag=biz.deleteAdmin(aid);
         //删除后返回查询员工信息的servlet中
         if(flag){
        	 response.sendRedirect("ShowAdminServlet?delmsg=1");
         }else{
        	 response.sendRedirect("ShowAdminServlet?delmsg=0");
         }
	}

}
