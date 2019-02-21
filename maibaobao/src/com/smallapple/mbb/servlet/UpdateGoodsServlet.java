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


public class UpdateGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public UpdateGoodsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �ϴ�
		SmartUpload su=new SmartUpload("utf-8");
		su.initialize(this.getServletConfig(), request, response);
		//����

		try {
			su.setDeniedFilesList("exe");//���ò������ϴ�������
			su.setAllowedFilesList("jpg,jpeg,gif,png,docx");//�����ϴ�����
			su.setMaxFileSize(2048*1024);//�����ļ���С 100kb

			//�ϴ�
			su.upload();

			//��ȡ�ϴ����ļ�
			SmartFiles fileList=su.getFiles();//�����ϴ����ļ�����

			SmartFile file=fileList.getFile(0);//��ȡ��һ���ļ�
			String path="images";
			//�ļ����������� ��ϵͳ��ǰʱ��������
			Date dt=new Date();//�����ϵͳ��ǰ����
			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
			String name=sdf.format(dt);//��ʱ�䰴��ָ����ʽת�����ַ���
			//��������Ӻ�׺��

			name+="."+file.getFileExt();

			//�����ļ�
			file.saveAs(path+"/"+name);

			//������д�뵽���ݿ�
			//��ǰ̨�ύ�����ݷ�װ��Goods������
			Goods gds=new Goods();
			gds.setGimage(path+"/"+name);

			//��su��ȡ�������
			SmartRequest re=su.getRequest();
			gds.setGid(Integer.parseInt(re.getParameter("gid")));
			gds.setGname(re.getParameter("gname"));

			GoodsType gt=new GoodsType();
			gt.setGtid(Integer.parseInt(re.getParameter("gtid")));
			gds.setGtype(gt);

			gds.setGaddress(re.getParameter("gaddress"));
			gds.setGtext(re.getParameter("gtext"));
			gds.setGprice(Float.parseFloat(re.getParameter("gprice")));
			gds.setGnumber(Integer.parseInt(re.getParameter("gnumber")));
			//�������Book���biz�㣬��book���󴫹�ȥ
			//����biz��
			GoodsBizInter biz=new GoodsBiz(); 
			boolean flag=biz.update(gds);
			//������
			if(flag){
				response.sendRedirect("showGoods?upmsg=1");
			}else{
				response.sendRedirect("showGoods?upmsg=0");
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
