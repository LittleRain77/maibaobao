package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.AdminDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Admin;
import com.smallapple.mbb.vo.Page;

public class AdminDao implements AdminDaoInter {
	private DBHelp hp;
	public AdminDao() {
		hp=new DBHelp();
	}
	@Override
	public List<Admin> searchAll(Page page) {
                //��ѯ����
		String sql="SELECT aid ,aname, apass, asex ,apower FROM admin limit ?,?";
		List<Admin> list=new ArrayList<Admin>();
		try {
			ResultSet rs=hp.select(sql,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				list.add(new Admin(rs.getString("aid"),rs.getString("aname"),rs.getString("apass"),rs.getString("asex"),rs.getString("apower")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public List<Admin> searchAll(String keyword,Page page) {
		// ģ����ѯ
		String sql="SELECT aid ,aname, apass, asex ,apower FROM admin where aid like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<Admin> list=new ArrayList<Admin>();
		try {
			ResultSet rs=hp.select(sql,keyword,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				list.add(new Admin(rs.getString("aid"),rs.getString("aname"),rs.getString("apass"),rs.getString("asex"),rs.getString("apower")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	@Override
	public int searchNumber() {
                //������Ŀ
		String sql="select count(*) from admin";
		int temp=0;
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
	@Override
	public int deleteAdmin(String aid) {
		String sql="delete from admin where aid=?";
		int temp=-1;
		try {
			temp=hp.update(sql, aid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	@Override
	public int insertAdmin(Admin admin) {
		String sql="insert into admin(aid ,aname, apass, asex ,apower) values(?,?,?,?,?)";
		int temp=-1;
		try {
			temp=hp.update(sql,admin.getAid(),admin.getAname(),admin.getApass(),admin.getAsex(),admin.getApower());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	@Override
	public Admin searchById(String aid) {
		String sql="SELECT aid ,aname, apass, asex ,apower FROM admin where aid=? ";
		Admin adm=null;
		try {
			ResultSet rs=hp.select(sql, aid);
			if(rs.next()){
				
				adm=new Admin(rs.getString("aid"),rs.getString("aname"),rs.getString("apass"),rs.getString("asex"),rs.getString("apower"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return adm;

	}
	@Override
	public int update(Admin admin) {
		String sql="update admin set aname=?,apass=?,asex=?,apower=? where aid=?";
		int temp=-1;
		try {
			temp=hp.update(sql,admin.getAname(),admin.getApass(),admin.getAsex(),admin.getApower(),admin.getAid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;

	}
	//����Ա�޸ĸ�����Ϣ��ѯģ��
	public Admin selectChangeAdmin(String aid) {
		Admin admin=null;
		String sql="select * from admin where aid=? ";
		try {
			ResultSet rs=hp.select(sql, aid);
			if(rs.next()){
				admin=new Admin(rs.getString("aid"),rs.getString("aname"),rs.getString("apass"),rs.getString("asex"),rs.getString("aimage"),rs.getString("apower"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return admin;
	}

	//����Ա������Ϣ�޸Ĳ���ģ��
	public int insertChangeAdmin(Admin admin) {
		int temp=-1;
		String sql="update admin set aname=?,apass=?,asex=?,aimage=?,apower=? where aid=?";
		try {
			temp=hp.update(sql, admin.getAname(),admin.getApass(),admin.getAsex(),admin.getAimage(),admin.getApower(),admin.getAid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

}
