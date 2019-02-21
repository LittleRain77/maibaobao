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
 * �û�ע��
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
			//����������֤
			String num=request.getParameter("unum");
			//String s_checkcode=(String) request.getSession().getAttribute("scheckcode");
			//String [] info=request.getParameterValues("mail");
			//������info��0��info��1��info��2���ֱ��ʾ���䣬���룬�˻�
		    String nickname=request.getParameter("m_username'");//��ȡ�û���
		    String password=request.getParameter("m_pwd");//��ȡ����
			String email=request.getParameter("m_mail");//��ȡ����
			String sex=request.getParameter("m_sex");//��ȡ�Ա�
			String province=request.getParameter("m_prov");//��ȡʡ��
			String city=request.getParameter("m_city");//��ȡ����
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
		
		//��֤���ж�
			if(!request.getSession().getAttribute("valcode").equals(num)||num==null||"".equals(num)){
				response.sendRedirect("register.jsp?msg=2");
			}else{
				response.sendRedirect("register_success.jsp?");
			}
			
		}//�ֻ�ע��
		else if("phone".equals(flag)){
			 /**
			  *  �ֻ��û�ע��
			  * **/
			String phone=request.getParameter("p_phone");
			String sex=request.getParameter("p_sex").trim();//��ȡ�Ա�
			String province=request.getParameter("p_prov").trim();//��ȡʡ��
			String city=request.getParameter("p_city").trim();//��ȡ����
			String nickname=request.getParameter("p_name").trim();//��ȡ�û���
			String password=request.getParameter("p_password").trim();//��ȡ����
			String yanzheng=request.getParameter("p_yzm").trim();//��ȡ��֤��
			
			UserRegisterBizInter biz=new UserRegisterBiz(); 
			boolean re=biz.registByPhone(nickname, phone, password);
			if(re==true)
			{
				response.sendRedirect("register_success.jsp");
				
			}
		}
	
		
		
	}

}
