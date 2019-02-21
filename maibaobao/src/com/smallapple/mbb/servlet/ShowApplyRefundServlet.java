package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.InsertRequestBiz;
import com.smallapple.mbb.biz.inter.InsertRequestBizInter;
import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

/**
 * �鿴�����˿��б�
 */
public class ShowApplyRefundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowApplyRefundServlet() {
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
		InsertRequestBizInter biz=new InsertRequestBiz();
		//����ǰҳ��Ϣ��װ��Page�����У�ͨ��Biz��������Ŀ��
		Page page=new Page(pgNum,10,biz.searchNumber());
		//�жϹؼ����Ƿ���ֵ
		List<ApplyRefund> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.searchAll(page);
		}else{
			list=biz.searchAll(keyword, page);
		}
		//�������ԣ���ת��
		request.setAttribute("arinfos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showApplyRefund").forward(request, response);

	}

}
