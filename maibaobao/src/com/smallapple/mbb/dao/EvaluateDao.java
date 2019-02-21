package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.EvaluateDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public class EvaluateDao implements EvaluateDaoInter {

	private DBHelp hp;


	public EvaluateDao() {
		hp=new DBHelp();
	}

	@Override
	public int searchNumber() {
		// 查总条目数
		String sql="select count(*) from evaluate";
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
	public int insert(Evaluate evalue) {
		// 添加评论
		String sql="insert into evaluate(uid,gid,etext,etime) values(?,?,?,?)";
		int temp=-1;
		try {
			temp=hp.update(sql, evalue.getUid(),evalue.getGds().getGid(),evalue.getEtext(),evalue.getEtime());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public List<Evaluate> select(Page page) {
		// 查询所有
		String sql="SELECT e.eid,e.uid,g.gname,e.etext,e.etime FROM evaluate AS e INNER JOIN goods AS g ON e.gid = g.gid limit ?,?";
		List<Evaluate> list=new ArrayList<Evaluate>();
		try {
			ResultSet rs=hp.select(sql, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Evaluate evalue=new Evaluate();
				evalue.setEid(rs.getInt("e.eid"));
				evalue.setUid(rs.getString("e.uid"));

				Goods gds=new Goods();
				gds.setGname(rs.getString("g.gname"));
				evalue.setGds(gds);
               
				evalue.setEtext(rs.getString("e.etext"));
				evalue.setEtime(rs.getString("e.etime"));

				list.add(evalue);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Evaluate> select(String keyword, Page page) {
		// 根据商品名称模糊查询
		String sql="SELECT e.eid,e.uid,g.gname,e.etext,e.etime FROM evaluate AS e INNER JOIN goods AS g ON e.gid = g.gid where g.gname like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<Evaluate> list=new ArrayList<Evaluate>();
		try {
			ResultSet rs=hp.select(sql,keyword, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Evaluate evalue=new Evaluate();
				evalue.setEid(rs.getInt("e.eid"));
				evalue.setUid(rs.getString("e.uid"));

				Goods gds=new Goods();
				gds.setGname(rs.getString("g.gname"));
				evalue.setGds(gds);

				evalue.setEtext(rs.getString("e.etext"));
				evalue.setEtime(rs.getString("e.etime"));

				list.add(evalue);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
