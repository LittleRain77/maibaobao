package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.SelectUserBiz;
import com.smallapple.mbb.biz.inter.SelectUserBizInter;
import com.smallapple.mbb.vo.User;

/**
 * 修改用户插入模块
 */
public class InsertChangeUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertChangeUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=request.getParameter("uid");
		String usex=request.getParameter("usex");
		String ubirthday=request.getParameter("ubirthday");
		String ustatus=request.getParameter("ustatus");
		String uphone=request.getParameter("uphone");
		String uemail=request.getParameter("uemail");
		String uaddress=request.getParameter("uaddress");
		int ubeen=Integer.parseInt(request.getParameter("ubeen"));
		int upower=Integer.parseInt(request.getParameter("upower"));
		User user=new User();
		user.setUid(uid);
		user.setUsex(usex);
		user.setUbirthday(ubirthday);
		user.setUstatus(ustatus);
		user.setUphone(uphone);
		user.setUemail(uemail);
		user.setUaddress(uaddress);
		user.setUbeen(ubeen);
		user.setUpower(upower);
		SelectUserBizInter biz = new SelectUserBiz();
		boolean bool=biz.insertChangeUser(user);
		if(bool){
			response.sendRedirect("SelectUserServlet?msg=1");
		}else{
			response.sendRedirect("backindex.jsp?app=showUser&msg=0");
		}
		
		
		
	}

}
