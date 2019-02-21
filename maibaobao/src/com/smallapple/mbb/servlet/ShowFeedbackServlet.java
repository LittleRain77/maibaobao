package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.FeedbackBiz;
import com.smallapple.mbb.biz.inter.FeedbackBizInter;
import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Page;

public class ShowFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public ShowFeedbackServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//获取查询条件
		String keyword=request.getParameter("keyword");
		//获取当前页数
		String pg=request.getParameter("pg");
		int pgNum=1;//存放当前页变量
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//从biz层获取图书信息
		FeedbackBizInter biz=new FeedbackBiz();
		//将当前页的信息封装到Page对象中，通过biz层获得总条目数
		Page page=new Page(pgNum,3,biz.getNumber());
        //判断关键字是否有值
		List<Feedback> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.select(page);
		}else{
			list=biz.select(keyword, page);
		}
		//设置属性并转发
		request.setAttribute("infos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showFeedback").forward(request, response);

	}

}
