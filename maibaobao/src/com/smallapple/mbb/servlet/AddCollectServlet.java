package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.CollectBiz;
import com.smallapple.mbb.biz.inter.CollectBizInter;
import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.User;


public class AddCollectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddCollectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * ����ղ�
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		// ����ύ������
		Collect co=new Collect();
		User us=(User)session.getAttribute("user");
		co.setUid(us.getUid());
		Goods gds=new Goods();
		String gid=request.getParameter("gid");
		gds.setGid(Integer.parseInt(gid));
		co.setGds(gds);
		//����biz�㣬���
		CollectBizInter biz=new CollectBiz();
		boolean flag=biz.insert(co);
		if(flag){
			request.setAttribute("gid",gid);
			request.getRequestDispatcher("SelectDetailServlet?acmsg=1").forward(request, response);
		}else{
			request.setAttribute("gid",gid);
			request.getRequestDispatcher("SelectDetailServlet?acmsg=0").forward(request, response);
		}
		
	}

}
