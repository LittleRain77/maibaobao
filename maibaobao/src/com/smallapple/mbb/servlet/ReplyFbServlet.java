package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.ReplyBiz;
import com.smallapple.mbb.biz.inter.ReplyBizInter;
import com.smallapple.mbb.vo.Admin;
import com.smallapple.mbb.vo.Reply;


public class ReplyFbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ReplyFbServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		// 获得前台提交的数据，并封装到Reply对象中
		Reply reply=new Reply();
		reply.setFid(Integer.parseInt(request.getParameter("fid")));
		
		Admin ad=(Admin)session.getAttribute("admin");
		reply.setAid(ad.getAid());
		reply.setRtext(request.getParameter("rtext"));
		//按指定格式转换系统时间
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		reply.setRtime(sdf.format(dt));
		//调用Biz层，添加到数据库
		ReplyBizInter biz=new ReplyBiz();
		boolean flag=biz.insert(reply);
		if(flag){
			//成功
			response.sendRedirect("ShowFeedbackServlet");
		}else{
			//失败
			response.sendRedirect("replyFb.jsp?mg=0");
		}
		

	}

}
