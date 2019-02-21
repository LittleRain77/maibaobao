package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.EvaluateBiz;
import com.smallapple.mbb.biz.inter.EvaluateBizInter;
import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.User;

/**
 * Ìí¼ÓÆÀÂÛ
 */
public class InsertEvaluateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertEvaluateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String editor=request.getParameter("editor");
		Evaluate evalue=new Evaluate();
		Goods gds=new Goods();
		gds.setGid(Integer.parseInt(request.getParameter("gid")));
		evalue.setGds(gds);
		User us=(User)request.getSession().getAttribute("user");
		String user=us.getUid();
		evalue.setUid(user);
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		evalue.setEtime(sdf.format(dt));
		evalue.setEtext(editor);
		EvaluateBizInter biz = new EvaluateBiz();
		boolean bool=biz.insert(evalue);
		if(bool){
			response.sendRedirect("PersonServlet?mig=1");
		}else{
			response.sendRedirect("PersonServlet?mig=0");
		}
		
		
	}

}
