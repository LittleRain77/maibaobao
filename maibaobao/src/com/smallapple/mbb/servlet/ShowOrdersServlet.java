package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.smallapple.mbb.biz.OrdersBiz;
import com.smallapple.mbb.biz.inter.OrdersBizInter;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;

/**
 * ������ʾ��servlet
 * ���ܶ����Ĵ�����Ϣ
 */
public class ShowOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowOrdersServlet() {
		super();

	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��������ѯ
		String keyword=request.getParameter("keyword");
		//��õ�ǰҳ��
		String pg=request.getParameter("pg");
		int pgNum=1;//��ŵ�ǰ�ı���
		if(pg!=null&&!"".equals("pg")){
			pgNum=Integer.parseInt(pg);
		}
		//��biz���ȡ��Ա��Ϣ����
		OrdersBizInter biz=new OrdersBiz();
		//����ǰҳ����Ϣ��װ��Page�����У�ͨ��biz�����ܵ���Ŀ��
		Page page=new Page(pgNum,1,biz.getNumber() );
		//�жϹؼ����Ƿ���ֵ
	
		List<Orders> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.getAll(page);
		}else{
			//����������ѯ
			list=biz.getAll(keyword,page);
		}
		//����ת��������ת����ҳ��

		request.setAttribute("infos",list);//�û���Ϣ�ļ�������
		request.setAttribute("pgInfos", page);
		request.getRequestDispatcher("backindex.jsp?app=showOrders").forward(request,response);
	}
}


