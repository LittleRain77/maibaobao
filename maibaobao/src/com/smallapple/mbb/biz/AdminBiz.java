package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.AdminBizInter;
import com.smallapple.mbb.dao.AdminDao;
import com.smallapple.mbb.dao.inter.AdminDaoInter;
import com.smallapple.mbb.vo.Admin;
import com.smallapple.mbb.vo.Page;

public class AdminBiz implements AdminBizInter {
	private AdminDaoInter dao;
	public AdminBiz() {
		dao=new AdminDao();
	}
	@Override
	public List<Admin> getAllAdminInfo(Page page) {
		// ��ѯ����
		return dao.searchAll( page);
	}
	@Override
	public List<Admin> getAllAdminInfo(String keyword,Page page) {
		// ģ����ѯ
		return dao.searchAll(keyword, page);
	}
	@Override
	public int getNumber() {
		// ����Ŀ��
		return dao.searchNumber();
	}
	@Override
	public boolean deleteAdmin(String aid) {
		// ɾ��
		int num=dao.deleteAdmin(aid);
		if(num>0){
			return true;
		}
		return false;
	}
	@Override
	public boolean insertAdmin(Admin admin) {
		// ����
		int temp=dao.insertAdmin(admin);
		if(temp>0){
			return true;
		}
		return false;
	}
	@Override
	public Admin getOneAdminInfo(String aid) {
		//���ݹ���Ա�˺Ų�ѯһ��
		return dao.searchById(aid);
	}
	@Override
	public boolean updateAdmin(Admin admin) {
		// �޸�
		int temp=dao.update(admin);
		if(temp>0){
			return true;
		}
		return false;
	
	}
	@Override
	public int isHaveAdmin(String aid) {
		// TODO Auto-generated method stub
		Admin ad=dao.searchById(aid);
		if(ad==null){
			return 1;
		}
		return 0;
	}

	//����Ա������Ϣ�޸Ĳ�ѯģ��
	public Admin searchChangeAdmin(String aid) {
		return dao.selectChangeAdmin(aid);
	}

	//����Ա������Ϣ�޸Ĳ���ģ��
	public boolean insertChangeAdmin(Admin admin) {
		int temp=dao.insertChangeAdmin(admin);
		if(temp>0){
			return true;
		}
		return false;
	}

}
