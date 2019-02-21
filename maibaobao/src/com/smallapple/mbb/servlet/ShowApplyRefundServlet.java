package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.InsertRequestBiz;
import com.smallapple.mbb.biz.inter.InsertRequestBizInter;
import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

/**
 * 查看申请退款列表
 */
public class ShowApplyRefundServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowApplyRefundServlet() {
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
		InsertRequestBizInter biz=new InsertRequestBiz();
		//将当前页信息封装到Page对象中，通过Biz层获得总条目数
		Page page=new Page(pgNum,10,biz.searchNumber());
		//判断关键字是否有值
		List<ApplyRefund> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.searchAll(page);
		}else{
			list=biz.searchAll(keyword, page);
		}
		//设置属性，并转发
		request.setAttribute("arinfos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher("backindex.jsp?app=showApplyRefund").forward(request, response);

	}

}
