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
	 * 判断该用户是否已收藏过该商品
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		// 获得前台提交的数据
		String gid=request.getParameter("gid");
		//从session中获得uid
		User us=(User)session.getAttribute("user");
		String uid=us.getUid();
		//调用biz层，查询是否收藏过
		
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
