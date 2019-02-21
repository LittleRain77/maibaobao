package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.EvaluateBiz;
import com.smallapple.mbb.biz.inter.EvaluateBizInter;
import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Page;

/**
 * 后台查看评论列表
 */
public class ShowEvaluateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShowEvaluateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取查询条件
				String keyword=request.getParameter("keyword");
				//获取当前页数
				String pg=request.getParameter("pg");
				int pgNum=1;//存放当前页变量
				if(pg!=null&&!"".equals(pg)){
					pgNum=Integer.parseInt(pg);
				}
				//从biz层获取商品信息
				EvaluateBizInter biz=new EvaluateBiz();
				//将当前页信息封装到Page对象中，通过Biz层获得总条目数
				Page page=new Page(pgNum,10,biz.searchNumber());
				//判断关键字是否有值
				List<Evaluate> list=null;
				if(keyword==null||"".equals(keyword)){
					list=biz.select(page);
				}else{
					list=biz.select(keyword, page);
				}
				//设置属性，并转发
				request.setAttribute("einfos", list);
				request.setAttribute("pgInfo", page);
				request.getRequestDispatcher("backindex.jsp?app=showEvaluate").forward(request, response);
	}

}
