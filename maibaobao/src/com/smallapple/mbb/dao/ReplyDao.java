package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.ReplyDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Reply;

public class ReplyDao implements ReplyDaoInter {

	private DBHelp hp;

	public ReplyDao() {
		hp=new DBHelp();
	}

	@Override
	public int insert(Reply reply) {
		// 添加回复
		String sql="insert into reply(fid,aid,rtext,rtime) values(?,?,?,?) ";
		int temp=-1;
		try {
			temp=hp.update(sql,reply.getFid(),reply.getAid(),reply.getRtext(),reply.getRtime());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;

	}

	@Override
	public List<Reply> select(Page page) {
		// 查询所有
		String sql="SELECT r.rid,r.aid,r.rtext,r.rtime,f.uid,f.ftext,f.ftime FROM reply AS r INNER JOIN feedback AS f ON r.fid = f.fid limit ?,?";
		List<Reply> list=new ArrayList<Reply>();
		try {
			ResultSet rs=hp.select(sql, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Reply reply=new Reply();
				reply.setRid(rs.getInt("r.rid"));
				reply.setAid(rs.getString("r.aid"));
				reply.setRtext(rs.getString("r.rtext"));
				reply.setRtime(rs.getString("r.rtime"));

				Feedback fb=new Feedback();
				fb.setUid(rs.getString("f.uid"));
				fb.setFtext(rs.getString("f.ftext"));
				fb.setFtime(rs.getString("f.ftime"));
				reply.setFb(fb);
				list.add(reply);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Reply> select(String keyword, Page page) {
		// 按管理员（回复人）模糊查询
		String sql="SELECT r.rid,r.aid,r.rtext,r.rtime,f.uid,f.ftext,f.ftime FROM reply AS r INNER JOIN feedback AS f ON r.fid = f.fid where r.aid like ? limit ?,?";
		List<Reply> list=new ArrayList<Reply>();
		keyword="%"+keyword+"%";
		try {
			ResultSet rs=hp.select(sql,keyword, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Reply reply=new Reply();
				reply.setRid(rs.getInt("r.rid"));
				reply.setAid(rs.getString("r.aid"));
				reply.setRtext(rs.getString("r.rtext"));
				reply.setRtime(rs.getString("r.rtime"));

				Feedback fb=new Feedback();
				fb.setUid(rs.getString("f.uid"));
				fb.setFtext(rs.getString("f.ftext"));
				fb.setFtime(rs.getString("f.ftime"));
				reply.setFb(fb);
				list.add(reply);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}


	@Override
	public int searchNumber() {
		//查总条目数
		String sql="select count(*) from reply";
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
	public List<Reply> searchByFid(String fid) {
		// 根据留言编号查询其所有回复
		String sql="SELECT r.rid,r.aid,r.rtext,r.rtime,f.fid,f.uid,f.ftext,f.ftime FROM reply AS r INNER JOIN feedback AS f ON r.fid = f.fid where f.fid=?";
		List<Reply> list=new ArrayList<Reply>();
		try {
			ResultSet rs=hp.select(sql,fid);
			while(rs.next()){
				Reply reply=new Reply();
				reply.setRid(rs.getInt("r.rid"));
				reply.setAid(rs.getString("r.aid"));
				reply.setRtext(rs.getString("r.rtext"));
				reply.setRtime(rs.getString("r.rtime"));

				Feedback fb=new Feedback();
				fb.setFid(rs.getInt("f.fid"));
				fb.setUid(rs.getString("f.uid"));
				fb.setFtext(rs.getString("f.ftext"));
				fb.setFtime(rs.getString("f.ftime"));
				reply.setFb(fb);
				list.add(reply);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
