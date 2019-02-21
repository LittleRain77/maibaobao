package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.InsertRequestBiz;
import com.smallapple.mbb.biz.inter.InsertRequestBizInter;
import com.smallapple.mbb.vo.ApplyRefund;

/**
 * ��ѯһ�������˿�������
 */
public class SearchARInfoForCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchARInfoForCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ǰ̨�ύ����
		String arid=request.getParameter("id");
		//����biz��
		InsertRequestBizInter biz=new InsertRequestBiz();
		ApplyRefund ar=biz.searchById(arid);
		//ת��
		request.setAttribute("arInfo", ar);
		request.getRequestDispatcher("backindex.jsp?app=updateApplyRefund").forward(request, response);
	}

}
