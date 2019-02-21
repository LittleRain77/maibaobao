package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;

public interface SelectUserDaoInter {
	//查询用户
	List<User> selectUserDao(Page page);
	//有条件查询用户
	List<User> selectUserKey(String userkey,Page page);
	//查询数据条数总数（分页使用）
	int countUser();
	//删除用户
	int deleteUserDao(String uid);
	//修改用户查询模块
	User selectChangeUser(String uid);
	//修改用户插入模块
	int insertChangeUser(User uid);
	//个人中心查询
	User selectPerson(String uid);

}
