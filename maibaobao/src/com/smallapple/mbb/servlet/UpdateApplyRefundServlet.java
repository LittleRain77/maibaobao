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
 * �޸��˿���˽��
 */
public class UpdateApplyRefundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateApplyRefundServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡǰ̨�ύ������
		ApplyRefund ar=new ApplyRefund();
		ar.setArid(Integer.parseInt(request.getParameter("arid")));
		ar.setUid(request.getParameter("uid"));
		ar.setGid(Integer.parseInt(request.getParameter("gid")));
		ar.setArreason(request.getParameter("arreason"));
		ar.setArtext(request.getParameter("artext"));
		ar.setArstatus(request.getParameter("arstatus"));
		//����biz��
		InsertRequestBizInter biz=new InsertRequestBiz();
		boolean flag=biz.update(ar);

		if(flag){
			response.sendRedirect("ShowApplyRefundServlet?uarmsg=1");

		}else{
			response.sendRedirect("ShowOrdersServlet?uarmsg=0");
		}


	}

}
