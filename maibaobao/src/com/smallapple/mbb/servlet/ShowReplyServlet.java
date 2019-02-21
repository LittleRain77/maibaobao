package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.ReplyBiz;
import com.smallapple.mbb.biz.inter.ReplyBizInter;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Reply;


public class ShowReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowReplyServlet() {
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
		//��biz���ȡ�ظ�����Ϣ
		ReplyBizInter biz=new ReplyBiz();
		//����ǰҳ����Ϣ��װ��Page�����У�ͨ��biz��������Ŀ��
		Page page=new Page(pgNum,3,biz.searchNumber());
        //�жϹؼ����Ƿ���ֵ
		List<Reply> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.select(page);
		}else{
			list=biz.select(keyword, page);
		}
		//�������Բ�ת��
		request.setAttribute("infos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showReply").forward(request, response);

	}

}
