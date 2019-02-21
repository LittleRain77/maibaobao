package com.smallapple.mbb.dao.inter;

import com.smallapple.mbb.vo.User;

public interface UserRegisterDaoInter {
       int addUserByMail(User user);

	int addUserByMail(User user, String method);
}
