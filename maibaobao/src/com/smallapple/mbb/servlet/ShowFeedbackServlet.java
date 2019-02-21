package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.FeedbackBiz;
import com.smallapple.mbb.biz.inter.FeedbackBizInter;
import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Page;

public class ShowFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ShowFeedbackServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//��ȡ��ѯ����
		String keyword=request.getParameter("keyword");
		//��ȡ��ǰҳ��
		String pg=request.getParameter("pg");
		int pgNum=1;//��ŵ�ǰҳ����
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//��biz���ȡͼ����Ϣ
		FeedbackBizInter biz=new FeedbackBiz();
		//����ǰҳ����Ϣ��װ��Page�����У�ͨ��biz��������Ŀ��
		Page page=new Page(pgNum,3,biz.getNumber());
        //�жϹؼ����Ƿ���ֵ
		List<Feedback> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.select(page);
		}else{
			list=biz.select(keyword, page);
		}
		//�������Բ�ת��
		request.setAttribute("infos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showFeedback").forward(request, response);

	}

}
