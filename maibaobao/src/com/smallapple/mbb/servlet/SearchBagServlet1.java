package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.SearchBagBiz;
import com.smallapple.mbb.biz.inter.SearchBagBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

/**
 * 搜索
 */
public class SearchBagServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchBagServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key=request.getParameter("key");
		String pg=request.getParameter("pg");
		List<Goods> listbag=null;
		//调用biz层获得总的条目数
		int pageNum=1;
		if(pg!=null && !"".equals(pg)){
			pageNum=Integer.parseInt(pg);			
		}
		SearchBagBizInter biz=new SearchBagBiz();
		int count=biz.countBiz();
		int count1=biz.countBiz1();
		Page page=new Page(pageNum,12,count);
		Page page1=new Page(pageNum,12,count1);
		if(key==null || "".equals(key)){
			listbag=biz.searchBag(page);
		}else{
			 listbag=biz.searchSou(key, page1);
		}
		
		request.setAttribute("bagpage",page);
		request.setAttribute("listbag", listbag);
		request.getRequestDispatcher("navigation.jsp").forward(request, response);
	
	}

}
