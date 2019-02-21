package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.smallapple.mbb.biz.OrdersBiz;
import com.smallapple.mbb.biz.inter.OrdersBizInter;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;

/**
 * 订单显示的servlet
 * 接受订单的传来信息
 */
public class ShowOrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowOrdersServlet() {
		super();

	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//按条件查询
		String keyword=request.getParameter("keyword");
		//获得当前页数
		String pg=request.getParameter("pg");
		int pgNum=1;//存放当前的变量
		if(pg!=null&&!"".equals("pg")){
			pgNum=Integer.parseInt(pg);
		}
		//从biz层获取人员信息集合
		OrdersBizInter biz=new OrdersBiz();
		//将当前页的信息封装到Page对象中，通过biz层获得总的条目数
		Page page=new Page(pgNum,1,biz.getNumber() );
		//判断关键字是否有值
	
		List<Orders> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.getAll(page);
		}else{
			//进行条件查询
			list=biz.getAll(keyword,page);
		}
		//利用转发将数据转发给页面

		request.setAttribute("infos",list);//用户信息的集合属性
		request.setAttribute("pgInfos", page);
		request.getRequestDispatcher("backindex.jsp?app=showOrders").forward(request,response);
	}
}


