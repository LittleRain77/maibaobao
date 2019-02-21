package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.GoodsInfoBiz;
import com.smallapple.mbb.biz.inter.GoodsInfoBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

/**
 * 前台商品信息显示
 */
public class SearchGoodsInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchGoodsInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pg=request.getParameter("pg");
		int pageNum=1;
		if(pg!=null && !"".equals(pg)){
			pageNum=Integer.parseInt(pg);			
		}
		GoodsInfoBizInter biz = new GoodsInfoBiz();
		int count=biz.countGoodsBiz();
		Page page=new Page(pageNum,10,count);
		List<Goods> list=biz.searchGoodsInfo(page);
		
		request.setAttribute("page", page);
		request.setAttribute("goods", list);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
