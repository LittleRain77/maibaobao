package com.smallapple.mbb.biz.inter;

import com.smallapple.mbb.vo.User;

public interface UserRegisterBizInter {
	//ͨ������ע��
	boolean registByMail(User user);
	//ͨ���ֻ�ע��
	boolean registByPhone(String nickname, String phone, String password);
}
