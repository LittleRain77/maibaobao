package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.FeedbackBiz;
import com.smallapple.mbb.biz.ReplyBiz;
import com.smallapple.mbb.biz.inter.FeedbackBizInter;
import com.smallapple.mbb.biz.inter.ReplyBizInter;
import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Reply;


public class SearchReplyFbInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public SearchReplyFbInfoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 根据留言编号查所有回复
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取前台传来的数据
	    String fid=request.getParameter("id");
		//调用biz层，查询该留言的回复信息
		Feedback fb=new Feedback();
		FeedbackBizInter fbiz=new FeedbackBiz();
		fb=fbiz.selectByFid(fid);
		List<Reply> list=null;
		ReplyBizInter biz=new ReplyBiz();
		list=biz.searchByFid(fid);
		System.out.println("aaaa=="+list.get(0).getRtext());
		//设置属性并转发给showReplyForOne.jsp 
		request.setAttribute("fbinfo", fb);
		request.setAttribute("rfinfo", list);
		request.getRequestDispatcher("backindex.jsp?app=showReplyForOne").forward(request, response);
	}
}


