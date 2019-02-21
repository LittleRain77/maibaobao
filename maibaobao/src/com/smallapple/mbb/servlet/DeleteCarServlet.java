package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.vo.Car;

/**
 * Servlet implementation class DeleteCarServlet
 */
public class DeleteCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// ��ȡ����	
				HttpSession session=request.getSession();
				//׼�������Ʒ�ĳ�
				Map<Object,Car> map=null;//������map����
				//��session���map����
				map=(Map<Object,Car>)session.getAttribute("cars");
				String gid=request.getParameter("gid");
				String method=request.getParameter("method");
				if("remove".equals(method)){
				map.remove(gid);
				}else if("clear".equals(method)){
					map.clear();
				}
				//�����ﳵ�Żص�session��
				session.setAttribute("cars",map);
				//��ת�����ﳵ��ʾ��ҳ��
				response.sendRedirect("shopping_cart.jsp");
	}

}
