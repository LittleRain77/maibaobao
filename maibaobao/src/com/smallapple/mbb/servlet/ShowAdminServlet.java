package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Page;


public class ShowAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //获取查询条件
		String keyword=request.getParameter("keyword");
		//获取当前页数
		String pg=request.getParameter("pg");
		
		int pgNum=1;//存放当前页变量
		if(pg!=null&&!"".equals(pg)){
			pgNum=Integer.parseInt(pg);
		}
		//从biz层获取员工信息
		AdminBizInter biz=new AdminBiz();
		//将当前页的信息封装到Page对象中，通过biz层获得总条目数
		Page page=new Page(pgNum,10,biz.getNumber());
		//判断关键字是否有值
		List<com.smallapple.mbb.vo.Admin> list=null;
		if(keyword==null||"".equals(keyword)){
			list=biz.getAllAdminInfo(page);
		}else{
			list=biz.getAllAdminInfo(keyword,page);
		}
        //判断是否是删除的返回信息
		String delmsg=request.getParameter("delmsg");
		String path="backindex.jsp?app=showAdmin";
		if(delmsg!=null){
			path+="&delmsg="+delmsg;
		}
		request.setAttribute("infos", list);
		request.setAttribute("pgInfo", page);
		request.getRequestDispatcher(path).forward(request, response);

	}

}
