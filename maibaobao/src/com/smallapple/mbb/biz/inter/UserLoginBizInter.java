package com.smallapple.mbb.biz.inter;

import com.smallapple.mbb.vo.User;

public interface UserLoginBizInter {
    User login(String username,String pwd);
    
}
