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
	 * 根据留言编号进行回复
	 */
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取前台传来的数据
		String fid=request.getParameter("id");
		//调用biz层，查询该留言的信息
		FeedbackBizInter biz=new FeedbackBiz();
		Feedback  fb=biz.selectByFid(fid);
		//设置属性并转发给replyFb.jsp
		request.setAttribute("finfo", fb);
		request.getRequestDispatcher("backindex.jsp?app=replyFb").forward(request, response);
	}

}
