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
		//获得前台提交的员工信息，并封装到Admin对象中去
		Admin admin=new Admin();
		admin.setAid(request.getParameter("aid"));
		admin.setAname(request.getParameter("aname"));
		admin.setApass(request.getParameter("apass"));
		admin.setAsex(request.getParameter("asex"));
		admin.setApower(request.getParameter("apower"));
		//调用biz层，将数据存储到数据库中
		AdminBizInter biz=new AdminBiz();
		boolean flag=biz.insertAdmin(admin);
		if(flag){
			//成功
		   response.sendRedirect("backindex.jsp?app=addAdmin&admsg=1");	
		}else{
			//失败
			response.sendRedirect("backindex.jsp?app=addAdmin&admsg=0");
		}
	}

}
