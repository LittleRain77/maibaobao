package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smallapple.mbb.vo.Car;

/**
 * Servlet implementation class ReduceServlet
 */
public class ReduceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReduceServlet() {
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
				//���û��mapʵ�����򴴽�
				if(map==null){
					map=new HashMap<Object,Car>();
					
				}
				//��ǰ̨��ȡ��Ʒ��idֵ
				String gid=request.getParameter("gid");
				String method=request.getParameter("method");
				//�жϹ��ﳵ���Ƿ����ͬһ��Ʒ�������������Ŀ��һ�������ڣ����½���Ŀ��ӵ����ﳵ
				if(map.containsKey(gid)){
					//����
					//�ӹ��ﳵ�����Ʒ��item
					if("reduce".equals(method)){
					map.get(gid).redeucNumber();
						
					}else if("add".equals(method)){
						map.get(gid).addNumber();
					}
				}
				float totalPrice=0;
				for(Car car2:map.values()){
				  totalPrice += car2.getTotalPrice();
				}
				session.setAttribute("totalPrice", totalPrice);
				//�����ﳵ�Żص�session��
				session.setAttribute("cars",map);
				//��ת�����ﳵ��ʾ��ҳ��
				response.sendRedirect("shopping_cart.jsp");
	}

}
