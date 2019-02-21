package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.GoodsBiz;
import com.smallapple.mbb.biz.inter.GoodsBizInter;


public class DeleteGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ǰ̨��������Ϣ
		String gid=request.getParameter("id");
		//����biz��ɾ������Ʒ
		int g=Integer.parseInt(gid);
		GoodsBizInter biz=new GoodsBiz();
		boolean flag=biz.delete(g);
		//�жϷ��ز�ѯ��Ʒ��Ϣ��servlet
		if(flag){
			response.sendRedirect("showGoods?delmsg=1");
		}else{
			response.sendRedirect("showGoods?delmsg=0");
		}
	}

}
