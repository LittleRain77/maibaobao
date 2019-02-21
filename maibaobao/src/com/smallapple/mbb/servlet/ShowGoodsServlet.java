package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.GoodsBiz;
import com.smallapple.mbb.biz.inter.GoodsBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;


public class ShowGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ShowGoodsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");
		//获取查询条件
		String keyword=request.getParameter("keyword");
		//获取当前页数，
		String pg=request.getParameter("pg");
		int pgNum=1;//存放当前页变量
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//从biz层获取商品信息
		GoodsBizInter biz=new GoodsBiz();
		//将当前页信息封装到Page对象中，通过Biz层获得总条目数
		Page page=new Page(pgNum,6,biz.searchNumber());
		//判断关键字是否有值
		List<Goods> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.select(page);
		}else{
			list=biz.select(keyword, page);
		}
		 //判断是否是删除的返回信息
		String delmsg=request.getParameter("delmsg");
		String path="backindex.jsp?app=showGoods";
		if(delmsg!=null){
			path+="&delmsg="+delmsg;
		}
		request.setAttribute("infos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showGoods").forward(request, response);
	}

}
