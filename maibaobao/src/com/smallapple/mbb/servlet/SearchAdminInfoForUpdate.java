package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Admin;


public class SearchAdminInfoForUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SearchAdminInfoForUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡǰ̨�ύ������
		String aid=request.getParameter("id");
		//����biz
		AdminBizInter biz=new AdminBiz();
		Admin admin=biz.getOneAdminInfo(aid);
		//��Admin����ӵ�request������ȥ��Ȼ��ת��
		request.setAttribute("adInfo", admin);
		request.getRequestDispatcher("backindex.jsp?app=updateAdmin").forward(request, response);
		
	}

}
