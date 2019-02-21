package com.smallapple.mbb.biz.inter;

import com.smallapple.mbb.vo.User;

public interface UserRegisterBizInter {
	//通过邮箱注册
	boolean registByMail(User user);
	//通过手机注册
	boolean registByPhone(String nickname, String phone, String password);
}
