package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.smallapple.mbb.dao.inter.UserLoginDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.User;

public class UserLoginDao implements UserLoginDaoInter {

	@Override
	public User login(String username,String pwd) {
		// TODO Auto-generated method stub
		String sql="select uid,upass from user where uid=? and upass=?";
		DBHelp hp=new DBHelp();
		User us=null;
		try {
			ResultSet rs=hp.select(sql, username,pwd);
			while(rs.next()){
				  us=new User(rs.getString("uid"),rs.getString("upass"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return us;
	}

}
