package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Admin;
import com.smallapple.mbb.vo.Page;

public interface AdminDaoInter {
	List<Admin> searchAll(Page page);
	List<Admin> searchAll(String keyword,Page page);
	//获得总条目数
	int searchNumber();
	//删除
	int deleteAdmin(String aid);
	//添加
	int insertAdmin(Admin admin);
	//返回一个员工的信息
	Admin searchById(String aid);
	//修改员工信息的方法
	int update(Admin admin);
	//管理员修改个人信息查询模块
	Admin selectChangeAdmin(String aid);
	//管理员修改个人信息插入模块
	int insertChangeAdmin(Admin admin);

}
