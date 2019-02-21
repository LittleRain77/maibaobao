package com.smallapple.mbb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.ServletUtils;

/**
 * ÎÄ¼þÏÂÔØ
 */
public class DowloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public DowloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filepath="e:/ETC/workspace/maibaobao/dowload/";
		String filename="iphoneapp.zip";
		String guessCharset="gbk";
		String isofilename=new String(filename.getBytes(guessCharset),"iso-8859-1");
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename="+isofilename);
		ServletOutputStream out=null;
		out=response.getOutputStream();
		ServletUtils.returnFile(filepath+filename,out);
	}

}
