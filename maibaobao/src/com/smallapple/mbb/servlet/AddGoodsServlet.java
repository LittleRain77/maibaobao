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

		//�ϴ�
		SmartUpload su=new SmartUpload("utf-8");
		su.initialize(this.getServletConfig(),request,response);
		//����
		try {
			su.setDeniedFilesList("exe");//���ò������ϴ�������
			su.setAllowedFilesList("jpg,jpeg,gif,png,docx");//���������ϴ�������
			su.setMaxFileSize(2048*1024);//�����ļ���С2048kb

			//�ϴ�
			su.upload();
			//��ȡ�ϴ����ļ�
			SmartFiles fileList=su.getFiles();//�����ϴ����ļ�����
			SmartFile file=fileList.getFile(0);//��ȡ��һ���ļ�
			String path="images";
			//��ϵͳ��ǰʱ�����ļ�����
			Date dt=new Date();//���ϵͳʱ��
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
			String name=sdf.format(dt);//��ʱ�䰴��ָ����ʽת�����ַ���
			//��Ӻ�׺��
			name+="."+file.getFileExt();
			//�����ļ�
			file.saveAs(path+"/"+name);
			//�����ݿ�д�뵽���ݿ�
			//��ǰ̨�ύ�����ݷ�װ��Goods������
			Goods gds=new Goods();
			gds.setGimage(path+"/"+name);
          
			//��su��ȡ�������
			SmartRequest sr=su.getRequest();
			gds.setGname(sr.getParameter("gname"));

			GoodsType gt=new GoodsType();
			gt.setGtid(Integer.parseInt(sr.getParameter("gtid")));
			gds.setGtype(gt);

			gds.setGnumber(Integer.parseInt(sr.getParameter("gnumber")));
			gds.setGtext(sr.getParameter("gtext"));
			gds.setGaddress(sr.getParameter("gaddress"));
			gds.setGprice(Float.parseFloat(sr.getParameter("gprice")));
            
			//�������Goods���biz�㣬��Goods���󴫹�ȥ
			GoodsBizInter biz=new GoodsBiz();
			boolean flag=biz.insert(gds);
			//�ж�
			if(flag){
				//�ɹ�
				response.sendRedirect("sInfoFAddGoods?abmsg=1");
			}else{
				//ʧ��
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
