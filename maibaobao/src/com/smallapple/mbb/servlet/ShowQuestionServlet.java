package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.QuestionBiz;
import com.smallapple.mbb.biz.inter.QuestionBizInter;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Question;


public class ShowQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ShowQuestionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// ��ȡ��ѯ����
		String keyword=request.getParameter("keyword");
		//��ȡ��ǰҳ��
		String pg=request.getParameter("pg");
		int pgNum=1;//��ŵ�ǰҳ����
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//��biz���ȡ��Ʒ��Ϣ
		QuestionBizInter biz=new QuestionBiz();
		//����ǰҳ��Ϣ��װ��Page�����У�ͨ��Biz��������Ŀ��
		Page page=new Page(pgNum,10,biz.searchNumber());
		//�жϹؼ����Ƿ���ֵ
		List<Question> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.select(page);
		}else{
			list=biz.select(keyword, page);
		}
		//�������ԣ���ת��
		request.setAttribute("qinfos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showQuestion").forward(request, response);
	}

}
