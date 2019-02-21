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
	 * �������Ա�Ų����лظ�
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡǰ̨����������
	    String fid=request.getParameter("id");
		//����biz�㣬��ѯ�����ԵĻظ���Ϣ
		Feedback fb=new Feedback();
		FeedbackBizInter fbiz=new FeedbackBiz();
		fb=fbiz.selectByFid(fid);
		List<Reply> list=null;
		ReplyBizInter biz=new ReplyBiz();
		list=biz.searchByFid(fid);
		System.out.println("aaaa=="+list.get(0).getRtext());
		//�������Բ�ת����showReplyForOne.jsp 
		request.setAttribute("fbinfo", fb);
		request.setAttribute("rfinfo", list);
		request.getRequestDispatcher("backindex.jsp?app=showReplyForOne").forward(request, response);
	}
}


