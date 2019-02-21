package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.smallapple.mbb.dao.inter.BackLoginDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Admin;

public class BackLoginDao implements BackLoginDaoInter {
	private DBHelp hp;
	public BackLoginDao() {
		hp=new DBHelp();
	}

	//ºóÌ¨µÇÂ½
	public Admin backLogin(String aid,String apass) {
		Admin admin=null;
		String sql="select aid,apass from admin where aid=? and apass=?";
		try {
			ResultSet rs =hp.select(sql, aid,apass);			
			if(rs.next()){
				admin=new Admin(rs.getString("aid"),rs.getString("apass"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return admin;
	}

}
