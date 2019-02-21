package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.GoodsBiz;
import com.smallapple.mbb.biz.GoodsTypeBiz;
import com.smallapple.mbb.biz.inter.GoodsBizInter;
import com.smallapple.mbb.biz.inter.GoodsTypeBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsType;


public class SearchInfoForUpdateGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SearchInfoForUpdateGoods() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ǰ̨�ύ������ 
		String gid=request.getParameter("id");
		//����biz�㣬��ȡ����Ʒ����Ϣ����װ��Goods������
	    GoodsBizInter biz=new GoodsBiz();
	    Goods gds=biz.getOneGoodsInfo(gid);
	    
	    GoodsTypeBizInter tbiz=new GoodsTypeBiz();
	    List<GoodsType> list=tbiz.search();
	    //����request����
	    request.setAttribute("gtInfo", list);
	    request.setAttribute("gInfo", gds);
	    //ת��
	    request.getRequestDispatcher("backindex.jsp?app=updateGoods").forward(request, response);
	}

}
