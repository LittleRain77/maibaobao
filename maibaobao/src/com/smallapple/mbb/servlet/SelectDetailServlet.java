package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.GoodsInfoBiz;
import com.smallapple.mbb.biz.inter.GoodsInfoBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsDetail;

/**
 *点击图片跳到商品详情
 */
public class SelectDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gid=request.getParameter("gid");
		GoodsInfoBizInter biz= new GoodsInfoBiz();
		Goods goods=biz.searchGoodsDetail(gid);
		List<GoodsDetail> list=biz.searchGoodsImage(Integer.parseInt(gid));
		List<String> lt= new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			GoodsDetail gd=new GoodsDetail();
			String gdim=gd.getGdimage();
			lt.add(gdim);
		}
		//判断是否咨询返回的信息
		String qmg=request.getParameter("qmg");
		String path="goods_details.jsp";
		if(qmg!=null){
			path+="?qmg="+qmg;
		}
		//判断是否是收藏返回的信息
		String acmsg=request.getParameter("acmsg");
		if(acmsg!=null){
			path+="?acmsg="+acmsg;
		}
		
		request.setAttribute("goods", goods);
		request.setAttribute("goodsimg", lt);
		request.setAttribute("qmg", qmg);
		request.setAttribute("acmsg", acmsg);
		System.out.println(list.size());
		request.getRequestDispatcher(path).forward(request, response);
	}

}
