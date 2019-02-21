package com.smallapple.mbb.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartFile;
import com.jspsmart.upload.SmartFiles;
import com.jspsmart.upload.SmartRequest;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.smallapple.mbb.biz.GoodsBiz;
import com.smallapple.mbb.biz.inter.GoodsBizInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsType;

public class AddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public AddGoodsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//上传
		SmartUpload su=new SmartUpload("utf-8");
		su.initialize(this.getServletConfig(),request,response);
		//设置
		try {
			su.setDeniedFilesList("exe");//设置不允许上传的类型
			su.setAllowedFilesList("jpg,jpeg,gif,png,docx");//设置允许上传的类型
			su.setMaxFileSize(2048*1024);//设置文件大小2048kb

			//上传
			su.upload();
			//获取上传的文件
			SmartFiles fileList=su.getFiles();//返回上传的文件集合
			SmartFile file=fileList.getFile(0);//提取第一个文件
			String path="images";
			//以系统当前时间来文件命名
			Date dt=new Date();//获得系统时间
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
			String name=sdf.format(dt);//将时间按照指定格式转换成字符串
			//添加后缀名
			name+="."+file.getFileExt();
			//保存文件
			file.saveAs(path+"/"+name);
			//将数据库写入到数据库
			//将前台提交的数据封装到Goods对象中
			Goods gds=new Goods();
			gds.setGimage(path+"/"+name);
          
			//从su提取请求对象
			SmartRequest sr=su.getRequest();
			gds.setGname(sr.getParameter("gname"));

			GoodsType gt=new GoodsType();
			gt.setGtid(Integer.parseInt(sr.getParameter("gtid")));
			gds.setGtype(gt);

			gds.setGnumber(Integer.parseInt(sr.getParameter("gnumber")));
			gds.setGtext(sr.getParameter("gtext"));
			gds.setGaddress(sr.getParameter("gaddress"));
			gds.setGprice(Float.parseFloat(sr.getParameter("gprice")));
            
			//调用针对Goods表的biz层，将Goods对象传过去
			GoodsBizInter biz=new GoodsBiz();
			boolean flag=biz.insert(gds);
			//判断
			if(flag){
				//成功
				response.sendRedirect("sInfoFAddGoods?abmsg=1");
			}else{
				//失败
				response.sendRedirect("sInfoFAddGoods?abmsg=0");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
