package com.smallapple.mbb.biz;

import com.smallapple.mbb.biz.inter.BackLoginBizInter;
import com.smallapple.mbb.dao.BackLoginDao;
import com.smallapple.mbb.dao.inter.BackLoginDaoInter;
import com.smallapple.mbb.vo.Admin;

public class BackLoginBiz implements BackLoginBizInter {
	private BackLoginDaoInter dao;
	public BackLoginBiz() {
		dao=new BackLoginDao();
	}

	//ºóÌ¨µÇÂ½
	public Admin BackLoginBiz(String aid,String apass) {
		return dao.backLogin(aid,apass);
	}

}
