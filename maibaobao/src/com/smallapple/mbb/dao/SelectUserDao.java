package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.SelectUserDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;

public class SelectUserDao implements SelectUserDaoInter {
	private DBHelp hp;
	public SelectUserDao() {
		hp=new DBHelp();
	}

	//查询用户
	public List<User> selectUserDao(Page page) {
		List<User> list = new ArrayList<User>();
		String sql="select * from user limit ?,?";
		try {
			ResultSet rs=hp.select(sql, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				list.add(new User(rs.getString("uid"),rs.getString("usex"),rs.getString("ubirthday"),rs.getString("ustatus"),rs.getString("uimage"),rs.getString("uphone"),rs.getString("uemail"),rs.getString("uaddress"),rs.getInt("ubeen"),rs.getInt("upower")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//查询数据条数总数（分页使用）
	public int countUser() {
		int temp=0;
		String sql="select count(*) from user";
		try {
			ResultSet rs=hp.select(sql);
			if(rs.next()){
				temp=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}

	//有条件查询用户
	public List<User> selectUserKey(String userkey, Page page) {
		List<User> list = new ArrayList<User>();
		String sql="select * from user where uid like ? limit ?,?";
		try {
			ResultSet rs=hp.select(sql,userkey,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				list.add(new User(rs.getString("uid"),rs.getString("usex"),rs.getString("ubirthday"),rs.getString("ustatus"),rs.getString("uimage"),rs.getString("uphone"),rs.getString("uemail"),rs.getString("uaddress"),rs.getInt("ubeen"),rs.getInt("upower")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//删除用户
	public int deleteUserDao(String uid) {
		int temp=-1;
		String sql="delete from user where uid=?";
		try {
			temp=hp.update(sql, uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	//修改用户查询模块
	public User selectChangeUser(String uid) {
		User user=null;
		String sql="select * from user where uid=?";
		try {
			ResultSet rs=hp.select(sql, uid);
			if(rs.next()){
				user=new User(rs.getString("uid"),rs.getString("usex"),rs.getString("ubirthday"),rs.getString("ustatus"),rs.getString("uimage"),rs.getString("uphone"),rs.getString("uemail"),rs.getString("uaddress"),rs.getInt("ubeen"),rs.getInt("upower"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	//修改用户插入模块
	public int insertChangeUser(User uid) {
		int temp=-1;
		String sql="update user set usex=?,ubirthday=?,ustatus=?,uphone=?,uemail=?,uaddress=?,ubeen=?,upower=? where uid=?";
		try {
			temp=hp.update(sql,uid.getUsex(),uid.getUbirthday(),uid.getUstatus(),uid.getUphone(),uid.getUemail(),uid.getUaddress(),uid.getUbeen(),uid.getUpower(),uid.getUid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	//个人中心查询
	public User selectPerson(String uid) {
		User user=null;
		String sql="select uid,uimage,ubeen,upower,unickname from user where uid=?";
		try {
			ResultSet rs=hp.select(sql, uid);
			if(rs.next()){
				user=new User(rs.getString("uid"),rs.getString("uimage"),rs.getInt("ubeen"),rs.getInt("upower"),rs.getString("unickname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

}
