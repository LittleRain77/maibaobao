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

		// 获取数据	
				HttpSession session=request.getSession();
				//准备存放商品的车
				Map<Object,Car> map=null;//声明了map对象
				//从session获得map对象
				map=(Map<Object,Car>)session.getAttribute("cars");
				String gid=request.getParameter("gid");
				String method=request.getParameter("method");
				if("remove".equals(method)){
				map.remove(gid);
				}else if("clear".equals(method)){
					map.clear();
				}
				//将购物车放回到session中
				session.setAttribute("cars",map);
				//跳转到购物车显示的页面
				response.sendRedirect("shopping_cart.jsp");
	}

}
