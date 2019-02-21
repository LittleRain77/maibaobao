package com.smallapple.mbb.biz;

import com.smallapple.mbb.biz.inter.UserRegisterBizInter;
import com.smallapple.mbb.dao.UserRegisterDao;
import com.smallapple.mbb.dao.inter.UserRegisterDaoInter;
import com.smallapple.mbb.vo.User;


public class UserRegisterBiz implements UserRegisterBizInter {

	@Override
	public boolean registByMail(User user) {
		// TODO Auto-generated method stub
	      UserRegisterDaoInter dao=new UserRegisterDao();
	      int temp=dao.addUserByMail(user);
	      if(temp>0){
	    	  return true;
	      }else{
	    	  return false;
	      }
		
	}

	public boolean registByPhone(String nickname, String phone, String pwd) {
		// TODO Auto-generated method stub
		int temp2=-1;
		User user=new User();
		user.setUnickname(nickname);
		user.setUphone(phone);
		user.setUpass(pwd);
		 UserRegisterDaoInter dao=new UserRegisterDao();
		temp2=dao.addUserByMail(user, "phone");
			if(temp2>0){
				return true;
			}else{
				return false;
			}
	}

	

}
