package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.InsertRequestBiz;
import com.smallapple.mbb.biz.inter.InsertRequestBizInter;
import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.User;

/**
 * …Í«Î∏∂øÓ
 */
public class InsertRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gid=request.getParameter("gid");
		String check=request.getParameter("qtype");
		String editor=request.getParameter("editor1");
		ApplyRefund ar = new ApplyRefund();
		ar.setGid(Integer.parseInt(gid));
		User us=(User)request.getSession().getAttribute("user");
		ar.setUid(us.getUid());
		ar.setArreason(check);
		ar.setArtext(check);
		InsertRequestBizInter biz=new InsertRequestBiz();
		boolean bool=biz.insertRequest(ar);
		if(bool){
			response.sendRedirect("PersonServlet?mre=1");
			
		}else{
			response.sendRedirect("PersonServlet?mre=0");
		}
		
	
	}

}
