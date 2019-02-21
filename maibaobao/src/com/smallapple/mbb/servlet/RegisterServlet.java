package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.UserRegisterBiz;
import com.smallapple.mbb.biz.inter.UserRegisterBizInter;
import com.smallapple.mbb.vo.User;

/**
 * 用户注册
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		String flag=request.getParameter("flag");
		if("email".equals(flag)){
			//进入邮箱验证
			String num=request.getParameter("unum");
			//String s_checkcode=(String) request.getSession().getAttribute("scheckcode");
			//String [] info=request.getParameterValues("mail");
			//这里用info【0】info【1】info【2】分别表示邮箱，密码，账户
		    String nickname=request.getParameter("m_username'");//获取用户名
		    String password=request.getParameter("m_pwd");//获取密码
			String email=request.getParameter("m_mail");//获取邮箱
			String sex=request.getParameter("m_sex");//获取性别
			String province=request.getParameter("m_prov");//获取省份
			String city=request.getParameter("m_city");//获取城市
			User user=new User();
			user.setUnickname(nickname);
			user.setUpass(password);
			user.setUemail(email);
			user.setUsex(sex);
			user.setUprovince(province);
			user.setUcity(city);
			UserRegisterBizInter biz=new UserRegisterBiz(); 
			boolean temp=biz.registByMail(user);
			//response.sendRedirect("register_success.jsp");
		
		//验证码判断
			if(!request.getSession().getAttribute("valcode").equals(num)||num==null||"".equals(num)){
				response.sendRedirect("register.jsp?msg=2");
			}else{
				response.sendRedirect("register_success.jsp?");
			}
			
		}//手机注册
		else if("phone".equals(flag)){
			 /**
			  *  手机用户注册
			  * **/
			String phone=request.getParameter("p_phone");
			String sex=request.getParameter("p_sex").trim();//获取性别
			String province=request.getParameter("p_prov").trim();//获取省份
			String city=request.getParameter("p_city").trim();//获取城市
			String nickname=request.getParameter("p_name").trim();//获取用户名
			String password=request.getParameter("p_password").trim();//获取密码
			String yanzheng=request.getParameter("p_yzm").trim();//获取验证码
			
			UserRegisterBizInter biz=new UserRegisterBiz(); 
			boolean re=biz.registByPhone(nickname, phone, password);
			if(re==true)
			{
				response.sendRedirect("register_success.jsp");
				
			}
		}
	
		
		
	}

}
