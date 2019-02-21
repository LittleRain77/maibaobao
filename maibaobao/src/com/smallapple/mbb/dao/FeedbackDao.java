package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;

import com.smallapple.mbb.dao.inter.FeedbackDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Page;

public class FeedbackDao implements FeedbackDaoInter {
	private DBHelp hp;


	public FeedbackDao() {
		hp=new DBHelp();
	}


	@Override
	public int insertFeedBack(Feedback fb) {
		// 插入留言
		String sql="insert into feedback(uid,ftext,ftime,ftype,fphone,fQQ,femail,fwang) values(?,?,?,?,?,?,?,?)";
		int temp=-1;
		try {
			temp=hp.update(sql, fb.getUid(),fb.getFtext(),fb.getFtime(),fb.getFtype(),fb.getFphone(),fb.getfQQ(),fb.getFemail(),fb.getFwang());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}


	@Override
	public List<Feedback> select(Page page) {
		// 查询所有
		String sql="select fid,uid,ftext,ftime,ftype,fphone,fQQ,femail,fwang from feedback limit ?,?";
		List<Feedback> list=new ArrayList<Feedback>();
		try {
			ResultSet rs=hp.select(sql,page.getSelectIndex(),page.getShowNumber() );
			while(rs.next()){
				list.add(new Feedback(rs.getInt("fid"),rs.getString("uid"),rs.getString("ftext"),rs.getString("ftime"),rs.getString("ftype"),rs.getString("fphone"),rs.getString("fQQ"),rs.getString("femail"),rs.getString("fwang")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public List<Feedback> select(String keyword, Page page) {
		//模糊查询
		String sql="select fid,uid,ftext,ftime,ftype,fphone,fQQ,femail,fwang from feedback where ftype like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<Feedback> list=new ArrayList<Feedback>();
		try {
			ResultSet rs=hp.select(sql,keyword,page.getSelectIndex(),page.getShowNumber() );
			while(rs.next()){
				list.add(new Feedback(rs.getInt("fid"),rs.getString("uid"),rs.getString("ftext"),rs.getString("ftime"),rs.getString("ftype"),rs.getString("fphone"),rs.getString("fQQ"),rs.getString("femail"),rs.getString("fwang")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public Feedback selectByFid(String fid) {
		// 为回复查询一条留言
		String sql="select fid,uid,ftext from feedback where fid=?";
		Feedback fb=new Feedback();
		try {
			ResultSet rs=hp.select(sql,fid);
			if(rs.next()){
				fb=new Feedback(rs.getInt("fid"),rs.getString("uid"),rs.getString("ftext"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fb;
	}


	@Override
	public int getNumber() {
		//查询总条目数
		String sql="select count(*) from feedback";
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



}
