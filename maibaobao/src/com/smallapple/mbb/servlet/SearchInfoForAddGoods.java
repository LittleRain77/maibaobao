package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.GoodsTypeBiz;
import com.smallapple.mbb.biz.inter.GoodsTypeBizInter;
import com.smallapple.mbb.vo.GoodsType;


public class SearchInfoForAddGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public SearchInfoForAddGoods() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 调用biz层，获取所有类型信息
		GoodsTypeBizInter biz=new GoodsTypeBiz();
		List<GoodsType> list=biz.search();

		//设置属性
		request.setAttribute("gtInfo",list);
		//转发
		request.getRequestDispatcher("backindex.jsp?app=addGoods").forward(request, response);
	}
}
