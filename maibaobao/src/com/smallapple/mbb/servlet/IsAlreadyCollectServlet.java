package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.biz.CollectBiz;
import com.smallapple.mbb.biz.inter.CollectBizInter;
import com.smallapple.mbb.vo.User;


public class IsAlreadyCollectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public IsAlreadyCollectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * �жϸ��û��Ƿ����ղع�����Ʒ
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		// ���ǰ̨�ύ������
		String gid=request.getParameter("gid");
		//��session�л��uid
		User us=(User)session.getAttribute("user");
		String uid=us.getUid();
		//����biz�㣬��ѯ�Ƿ��ղع�
		
		CollectBizInter biz=new CollectBiz();
		int rs=biz.isHave(uid, gid);
		
		if(rs==1){
			request.setAttribute("gid", gid);
			request.setAttribute("uid", uid);
			request.getRequestDispatcher("AddCollectServlet").forward(request, response);

		}else{
			request.setAttribute("gid",gid);
			request.getRequestDispatcher("SelectDetailServlet?acmsg=0").forward(request, response);
		}
		
	}

}
