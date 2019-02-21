package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.InsertRequestDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

public class InsertRequestDao implements InsertRequestDaoInter {
	private DBHelp hp;
	public InsertRequestDao() {
		hp=new DBHelp();
	}

	//申请退款
	public int insertRequest(ApplyRefund are) {
		int temp=-1;
		String sql="insert into applyrefund set uid=?,gid=?,arreason=?,artext=?";
		try {
			temp=hp.update(sql,are.getUid(),are.getGid(),are.getArreason(),are.getArid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	
	
	@Override
	public List<ApplyRefund> searchAll(Page page) {
		// 查询所有
		String sql="select * from applyrefund limit ?,?";
		List<ApplyRefund> list=new ArrayList<ApplyRefund>();
		try {
			ResultSet rs=hp.select(sql,page.getSelectIndex(),page.getShowNumber() );
			while(rs.next()){
				list.add(new ApplyRefund(rs.getInt("arid"),rs.getString("uid"),rs.getInt("gid"),rs.getString("arreason"),rs.getString("artext"),rs.getString("arstatus")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<ApplyRefund> searchAll(String keyword, Page page) {
		// 按申请原因查询
		String sql="select * from applyrefund where arreason like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<ApplyRefund> list=new ArrayList<ApplyRefund>();
		try {
			ResultSet rs=hp.select(sql,keyword,page.getSelectIndex(),page.getShowNumber() );
			while(rs.next()){
				list.add(new ApplyRefund(rs.getInt("arid"),rs.getString("uid"),rs.getInt("gid"),rs.getString("arreason"),rs.getString("artext"),rs.getString("arstatus")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int searchNumber() {
		// 查总条目数
		String sql="select count(*) from applyrefund";
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
	public ApplyRefund searchById(String arid) {
		// 查一个为了审核
		String sql="select * from applyrefund where arid=?";
		ApplyRefund ar=new ApplyRefund();
		try {
			ResultSet rs=hp.select(sql,arid);
			if(rs.next()){
				ar=new ApplyRefund(rs.getInt("arid"),rs.getString("uid"),rs.getInt("gid"),rs.getString("arreason"),rs.getString("artext"),rs.getString("arstatus"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;

	}

	@Override
	public int update(ApplyRefund ar) {
		// 修改状态
		String sql="update applyrefund set arstatus=? where arid=?";
		int temp=-1;
		try {
			temp=hp.update(sql,ar.getArstatus(),ar.getArid());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	//个人中心查询退款
	public List<ApplyRefund> selectRequ(String uid) {
		List<ApplyRefund> list= new ArrayList<ApplyRefund>();
		String sql="select gid,arstatus from applyrefund where uid=?";
		try {
			ResultSet rs=hp.select(sql, uid);
			while(rs.next()){
				list.add(new ApplyRefund(rs.getInt("gid"),rs.getString("arstatus")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
