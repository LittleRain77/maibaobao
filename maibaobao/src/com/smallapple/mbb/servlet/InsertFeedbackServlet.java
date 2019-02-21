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
 *���԰��������
 */
public class InsertFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		//��ȡ���԰���Ϣ
		Feedback fb=new Feedback();
		//������
		User us=(User)session.getAttribute("user");
		fb.setUid(us.getUid());
		//��������
		fb.setFtype(request.getParameter("feedback"));
		//��������
		fb.setFtext(request.getParameter("ftext"));
		//�ֻ���
		fb.setFphone(request.getParameter("fphone"));
		//qq
		fb.setfQQ(request.getParameter("fQQ"));
		//����
        fb.setFemail(request.getParameter("femail"));
		//����
        fb.setFwang(request.getParameter("fwang"));
		//����ʱ��,��ȡϵͳʱ�䣬����ָ����ʽת��
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		fb.setFtime(sdf.format(dt));
		//����biz�㣬������Ե����ݿ�
		FeedbackBizInter biz=new FeedbackBiz();
		boolean flag=biz.insertFeedBack(fb);
		if(flag){
			//�ɹ�
			response.sendRedirect("feedback.jsp?mg=1");
		}else{
			//ʧ��
			response.sendRedirect("feedback.jsp?mg=0");
		}
	}

}
