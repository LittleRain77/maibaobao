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
import com.smallapple.mbb.biz.AdminBiz;
import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.vo.Admin;

/**
 *管理员个人信息修改插入模块
 */
public class InsertChangeAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InsertChangeAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SmartUpload su=new SmartUpload("UTF-8");
		su.initialize(this.getServletConfig(), request, response);		
		try {
			su.setAllowedFilesList("jpg,jsp,jpeg,doc");
			su.setDeniedFilesList("exe");
			su.setMaxFileSize(2048*1024);
			su.upload();
			SmartFiles filelist=su.getFiles();
		    SmartFile file=filelist.getFile(0);
			String path="imageS";
			Date dt=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
			String name=sdf.format(dt);//将时间转换成字符串
			name+="."+file.getFileExt();
			file.saveAs(path+"/"+name);
			//将前台提交的数据写入到数据库
			//将数据封装到book中
			Admin admin=new Admin();
			admin.setAimage(path+"/"+name);
			SmartRequest re=su.getRequest();
			admin.setAname(re.getParameter("aname"));
			admin.setApass(re.getParameter("apass"));
			admin.setAsex(re.getParameter("asex")	);
			admin.setApower(re.getParameter("apower"));
			admin.setAid(re.getParameter("aid"));
			AdminBizInter biz=new AdminBiz();
			boolean bool=biz.insertChangeAdmin(admin);
			if(bool){
				response.sendRedirect("backindex.jsp?app=updateOneAdmin&msg=6");


			}else{
				System.out.println("失败");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
