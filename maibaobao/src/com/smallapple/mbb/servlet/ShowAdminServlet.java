package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Page;


public class ShowAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //��ȡ��ѯ����
		String keyword=request.getParameter("keyword");
		//��ȡ��ǰҳ��
		String pg=request.getParameter("pg");
		
		int pgNum=1;//��ŵ�ǰҳ����
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//��biz���ȡԱ����Ϣ
		AdminBizInter biz=new AdminBiz();
		//����ǰҳ����Ϣ��װ��Page�����У�ͨ��biz��������Ŀ��
		Page page=new Page(pgNum,10,biz.getNumber());
		//�жϹؼ����Ƿ���ֵ
		List<com.smallapple.mbb.vo.Admin> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.getAllAdminInfo(page);
		}else{
			list=biz.getAllAdminInfo(keyword,page);
		}
        //�ж��Ƿ���ɾ���ķ�����Ϣ
		String delmsg=request.getParameter("delmsg");
		String path="backindex.jsp?app=showAdmin";
		if(delmsg!=null){
			path+="&delmsg="+delmsg;
		}
		request.setAttribute("infos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher(path).forward(request, response);

	}

}
