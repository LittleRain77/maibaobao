package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.GoodsBiz;
import com.smallapple.mbb.biz.inter.GoodsBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;


public class ShowGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ShowGoodsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
		//��ȡ��ѯ����
		String keyword=request.getParameter("keyword");
		//��ȡ��ǰҳ����
		String pg=request.getParameter("pg");
		int pgNum=1;//��ŵ�ǰҳ����
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//��biz���ȡ��Ʒ��Ϣ
		GoodsBizInter biz=new GoodsBiz();
		//����ǰҳ��Ϣ��װ��Page�����У�ͨ��Biz��������Ŀ��
		Page page=new Page(pgNum,6,biz.searchNumber());
		//�жϹؼ����Ƿ���ֵ
		List<Goods> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.select(page);
		}else{
			list=biz.select(keyword, page);
		}
		 //�ж��Ƿ���ɾ���ķ�����Ϣ
		String delmsg=request.getParameter("delmsg");
		String path="backindex.jsp?app=showGoods";
		if(delmsg!=null){
			path+="&delmsg="+delmsg;
		}
		request.setAttribute("infos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showGoods").forward(request, response);
	}

}
