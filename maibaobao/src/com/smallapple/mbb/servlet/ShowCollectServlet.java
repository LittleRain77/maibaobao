package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.CollectBiz;
import com.smallapple.mbb.biz.inter.CollectBizInter;
import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Page;

/**
 * ��ʾ�ղ��б�
 */
public class ShowCollectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowCollectServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ��ѯ����
		String keyword=request.getParameter("keyword");
		//��ȡ��ǰҳ��
		String pg=request.getParameter("pg");
		int pgNum=1;//��ŵ�ǰҳ����
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//��biz���ȡ��Ʒ��Ϣ
		CollectBizInter biz=new CollectBiz();
		//����ǰҳ��Ϣ��װ��Page�����У�ͨ��Biz��������Ŀ��
		Page page=new Page(pgNum,10,biz.searchNumber());
		//�жϹؼ����Ƿ���ֵ
		List<Collect> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.select(page);
		}else{
			list=biz.select(keyword, page);
		}
		//�������ԣ���ת��
		request.setAttribute("cinfos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showCollect").forward(request, response);
	}
}


