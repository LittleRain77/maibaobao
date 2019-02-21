package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Admin;
import com.smallapple.mbb.vo.Page;

public interface AdminBizInter {
	//获得所有员工信息
	List<Admin> getAllAdminInfo(Page page);
	//按条件获得所有员工信息
	List<Admin> getAllAdminInfo(String keyword,Page page);
	//获得总的条目数
	int getNumber();
	//删除员工
	boolean deleteAdmin(String aid);
	//添加员工
	boolean insertAdmin(Admin admin);
	//获得一个员工信息
	Admin getOneAdminInfo(String aid);
	//修改员工信息
	boolean updateAdmin(Admin admin);
	//判断用户是否存在
	int isHaveAdmin(String aid);
	//管理员个人信息修改查询模块
	Admin searchChangeAdmin(String aid);
	//管理员个人信息修改插入模块
	boolean insertChangeAdmin(Admin admin);

}
