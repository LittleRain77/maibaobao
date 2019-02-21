package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.CollectBiz;
import com.smallapple.mbb.biz.InsertRequestBiz;
import com.smallapple.mbb.biz.SelectUserBiz;
import com.smallapple.mbb.biz.inter.CollectBizInter;
import com.smallapple.mbb.biz.inter.InsertRequestBizInter;
import com.smallapple.mbb.biz.inter.SelectUserBizInter;
import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.GoodsAndOrders;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;

/**
 *个人中心,我的账户
 */
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PersonServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pg=request.getParameter("pg");
		User us=(User)request.getSession().getAttribute("user");
		String uid=us.getUid();
		int pgnum=1;
		if(pg!=null && !"".equals(pg)){
			pgnum=Integer.parseInt(pg);
		}
		SelectUserBizInter biz= new SelectUserBiz();
		CollectBizInter biz1=new CollectBiz();
		InsertRequestBizInter biz2=new InsertRequestBiz();

		Page page = new Page(pgnum,2,biz.countUser());
		Page page1=new Page(pgnum,5,biz1.searchNumber());

		User user=biz.searchPerson(uid);
		List<GoodsAndOrders> listorder=biz.searchPersonOrder(page, uid);
		List<Collect> listcollect=biz1.searchCollect(page1, uid);
		List<ApplyRefund> listreq=biz2.searchReque(uid);

		//判断是否是收藏返回的信息
		String mre=request.getParameter("mre");
		String path="person.jsp";
		if(mre!=null){
			path+="?mre="+mre;
		}
		request.setAttribute("listorder", listorder);
		request.setAttribute("userper", user);
		request.setAttribute("listcol", listcollect);
		request.setAttribute("listreq", listreq);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
