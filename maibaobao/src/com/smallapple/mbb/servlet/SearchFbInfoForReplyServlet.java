package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.FeedbackBiz;
import com.smallapple.mbb.biz.inter.FeedbackBizInter;
import com.smallapple.mbb.vo.Feedback;


public class SearchFbInfoForReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SearchFbInfoForReplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * �������Ա�Ž��лظ�
	 */
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡǰ̨����������
		String fid=request.getParameter("id");
		//����biz�㣬��ѯ�����Ե���Ϣ
		FeedbackBizInter biz=new FeedbackBiz();
		Feedback  fb=biz.selectByFid(fid);
		//�������Բ�ת����replyFb.jsp
		request.setAttribute("finfo", fb);
		request.getRequestDispatcher("backindex.jsp?app=replyFb").forward(request, response);
	}

}
