package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.CollectDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public class CollectDao implements CollectDaoInter {
	private DBHelp hp;
	public CollectDao() {
		hp= new DBHelp();
	}
	//个人中心查询关注的商品
	public List<Collect> selectCollect(Page page,String uid) {
		List<Collect> list = new ArrayList<Collect>();
		String sql="SELECT g.gid,g.gname,g.gprice,g.gimage,c.cid FROM goods AS g INNER JOIN collect AS c ON c.gid = g.gid where uid=? limit ?,?";
		try {
			ResultSet rs=hp.select(sql,uid,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Collect collect = new Collect();
				Goods goods=new Goods();
				goods.setGid(rs.getInt("g.gid"));
				goods.setGname(rs.getString("g.gname"));
				goods.setGprice(rs.getFloat("g.gprice"));
				goods.setGimage(rs.getString("g.gimage"));
				collect.setGds(goods);
				collect.setCid(rs.getInt("cid"));
				list.add(collect);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public int searchNumber() {
		// 查总条目数
		String sql="select count(*) from collect";
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
	public int insert(Collect co) {
		// 插入收藏
		String sql="insert into collect(uid,gid) values(?,?)";
		int temp=-1;
		try {
			temp=hp.update(sql,co.getUid(),co.getGds().getGid());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public List<Collect> select(Page page) {
		// 查询所有
		String sql="SELECT c.cid,c.uid,g.gname,g.gimage FROM collect AS c INNER JOIN goods AS g ON c.gid = g.gid limit ?,?";
		List<Collect> list=new ArrayList<Collect>();
		try {
			ResultSet rs=hp.select(sql, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Collect co=new Collect();
				co.setCid(rs.getInt("c.cid"));
				co.setUid(rs.getString("c.uid"));

				Goods gds=new Goods();
				gds.setGname(rs.getString("g.gname"));
				gds.setGimage(rs.getString("g.gimage"));
				co.setGds(gds);

				list.add(co);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Collect> select(String keyword, Page page) {
		//按商品名称查询
		String sql="SELECT c.cid,c.uid,g.gname,g.gimage FROM collect AS c INNER JOIN goods AS g ON c.gid = g.gid where g.gname like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<Collect> list=new ArrayList<Collect>();
		try {
			ResultSet rs=hp.select(sql,keyword, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Collect co=new Collect();
				co.setCid(rs.getInt("c.cid"));
				co.setUid(rs.getString("c.uid"));

				Goods gds=new Goods();
				gds.setGname(rs.getString("g.gname"));
				gds.setGimage(rs.getString("g.gimage"));
				co.setGds(gds);

				list.add(co);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Collect select(String uid, String gid) {
		// 查一个是否存在
		Collect co=null;
		String sql="select c.cid,c.uid,g.gid from  collect AS c INNER JOIN goods AS g ON c.gid = g.gid where c.uid=? and g.gid=?";
		try {
			ResultSet rs=hp.select(sql, uid,gid);
			if(rs.next()){
				co=new Collect();
				co.setCid(rs.getInt("c.cid"));
				co.setUid(rs.getString("c.uid"));

				Goods gds=new Goods();
				gds.setGid(rs.getInt("g.gid"));
				co.setGds(gds);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return co;
	}

}
