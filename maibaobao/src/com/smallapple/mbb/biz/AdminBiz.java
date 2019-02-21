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
		// 查询所有
		return dao.searchAll( page);
	}
	@Override
	public List<Admin> getAllAdminInfo(String keyword,Page page) {
		// 模糊查询
		return dao.searchAll(keyword, page);
	}
	@Override
	public int getNumber() {
		// 总条目数
		return dao.searchNumber();
	}
	@Override
	public boolean deleteAdmin(String aid) {
		// 删除
		int num=dao.deleteAdmin(aid);
		if(num>0){
			return true;
		}
		return false;
	}
	@Override
	public boolean insertAdmin(Admin admin) {
		// 插入
		int temp=dao.insertAdmin(admin);
		if(temp>0){
			return true;
		}
		return false;
	}
	@Override
	public Admin getOneAdminInfo(String aid) {
		//根据管理员账号查询一个
		return dao.searchById(aid);
	}
	@Override
	public boolean updateAdmin(Admin admin) {
		// 修改
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

	//管理员个人信息修改查询模块
	public Admin searchChangeAdmin(String aid) {
		return dao.selectChangeAdmin(aid);
	}

	//管理员个人信息修改插入模块
	public boolean insertChangeAdmin(Admin admin) {
		int temp=dao.insertChangeAdmin(admin);
		if(temp>0){
			return true;
		}
		return false;
	}

}
