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
		// 获取数据	
				HttpSession session=request.getSession();
				//准备存放商品的车
				Map<Object,Car> map=null;//声明了map对象
				//从session获得map对象
				map=(Map<Object,Car>)session.getAttribute("cars");
				//如果没有map实例，则创建
				if(map==null){
					map=new HashMap<Object,Car>();
					
				}
				//从前台获取商品的id值
				String gid=request.getParameter("gid");
				String method=request.getParameter("method");
				//判断购物车中是否存在同一商品，如果存在则数目甲一，不存在，则新建项目添加到购物车
				if(map.containsKey(gid)){
					//存在
					//从购物车获得商品的item
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
				//将购物车放回到session中
				session.setAttribute("cars",map);
				//跳转到购物车显示的页面
				response.sendRedirect("shopping_cart.jsp");
	}

}
