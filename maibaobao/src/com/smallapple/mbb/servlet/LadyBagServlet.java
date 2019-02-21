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

/**
 * ²éÑ¯Å®°ü
 */
public class LadyBagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LadyBagServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gtid=request.getParameter("gtid");
		GoodsInfoBizInter biz = new GoodsInfoBiz();
		List<Goods> list=biz.searchLady(gtid);
		
		request.setAttribute("menbag", list);
		request.getRequestDispatcher("men.jsp").forward(request, response);
	}

}
