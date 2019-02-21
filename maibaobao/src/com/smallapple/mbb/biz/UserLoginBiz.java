package com.smallapple.mbb.biz;


import com.smallapple.mbb.biz.inter.UserLoginBizInter;
import com.smallapple.mbb.dao.UserLoginDao;
import com.smallapple.mbb.dao.inter.UserLoginDaoInter;
import com.smallapple.mbb.vo.User;

public class UserLoginBiz implements UserLoginBizInter {

	@Override
	public User login(String username,String pwd) {
		// TODO Auto-generated method stub
		UserLoginDaoInter dao=new UserLoginDao();
		return dao.login(username, pwd);
	}

}
