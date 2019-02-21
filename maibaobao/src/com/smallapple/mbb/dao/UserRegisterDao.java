package com.smallapple.mbb.dao;

import java.sql.SQLException;

import com.smallapple.mbb.dao.inter.UserRegisterDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.User;


public class UserRegisterDao implements UserRegisterDaoInter {

	@Override
	public int addUserByMail(User user) {
		// TODO Auto-generated method stub
		int temp=-1;
		DBHelp hp=new DBHelp();
		
		String sql="insert into user(uid,unickname,upass,usex,uemail,uprovince,ucity) value(?,?,?,?,?,?,?)";
		try {
			System.out.print("aa");
			temp=hp.update(sql,user.getUemail(),user.getUnickname(),user.getUpass(),user.getUsex(),user.getUemail(),user.getUprovince(),user.getUcity());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public int addUserByMail(User user, String method) {
		// TODO Auto-generated method stub
		  int temp=0;
		if("phone".equals(method)){
			  String sql="insert into user(uid,upass.uphone) value(?,?,?)";
			 
			DBHelp hp=new DBHelp();
				try {
					temp=hp.update(sql,user.getUphone(),user.getUpass(),user.getUphone());
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		return temp;
		
	}

}
