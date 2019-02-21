package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.QuestionBiz;
import com.smallapple.mbb.biz.inter.QuestionBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Question;
import com.smallapple.mbb.vo.User;

public class InsertQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public InsertQuestionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session=request.getSession();
		//��ȡǰ̨�ύ������,����װ��Question������
		Question qst=new Question();
		//��ѯ��
		User us=(User)session.getAttribute("user");
		qst.setUid(us.getUid());
		//��Զ���
		Goods gds=new Goods();
		String gid=request.getParameter("gid");
		gds.setGid(Integer.parseInt(gid));
		qst.setGds(gds);
		//��ѯ����
		qst.setQtype(request.getParameter("qtype"));
		//��ѯ����
		qst.setQtext(request.getParameter("qtext"));
		//��ѯʱ��
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		qst.setQtime(sdf.format(dt));
		
		//����biz��
		QuestionBizInter biz=new QuestionBiz();
		boolean flag=biz.insert(qst);
		if(flag){
			//�ɹ�
			request.setAttribute("gid", gid);
			request.getRequestDispatcher("SelectDetailServlet?qmg=1").forward(request, response);
		}else{
			//ʧ��
			request.setAttribute("gid", gid);
			request.getRequestDispatcher("SelectDetailServlet?qmg=0").forward(request, response);
		}
		

	}

}
