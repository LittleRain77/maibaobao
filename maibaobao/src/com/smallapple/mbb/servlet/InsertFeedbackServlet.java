package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.FeedbackBiz;
import com.smallapple.mbb.biz.inter.FeedbackBizInter;
import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.User;

/**
 *留言板插入数据
 */
public class InsertFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		//获取留言板信息
		Feedback fb=new Feedback();
		//留言人
		User us=(User)session.getAttribute("user");
		fb.setUid(us.getUid());
		//留言类型
		fb.setFtype(request.getParameter("feedback"));
		//留言内容
		fb.setFtext(request.getParameter("ftext"));
		//手机号
		fb.setFphone(request.getParameter("fphone"));
		//qq
		fb.setfQQ(request.getParameter("fQQ"));
		//邮箱
        fb.setFemail(request.getParameter("femail"));
		//旺旺
        fb.setFwang(request.getParameter("fwang"));
		//留言时间,获取系统时间，并按指定格式转换
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		fb.setFtime(sdf.format(dt));
		//调用biz层，添加留言到数据库
		FeedbackBizInter biz=new FeedbackBiz();
		boolean flag=biz.insertFeedBack(fb);
		if(flag){
			//成功
			response.sendRedirect("feedback.jsp?mg=1");
		}else{
			//失败
			response.sendRedirect("feedback.jsp?mg=0");
		}
	}

}
