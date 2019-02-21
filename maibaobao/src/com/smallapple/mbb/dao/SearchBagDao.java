package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.SearchBagDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsType;
import com.smallapple.mbb.vo.Page;

public class SearchBagDao implements SearchBagDaoInter{
      private DBHelp hp;
      public SearchBagDao(){
    	  hp=new DBHelp();
      }
	//查询
	public List<Goods> selectsou(String key,Page page) {
		List<Goods> list=new ArrayList<Goods>();
		String sql="SELECT g.gid,g.gname,g.gprice,g.gimage,gt.gtid,gt.gtname FROM goods AS g INNER JOIN goodstype AS gt ON g.gtid = gt.gtid where gt.gtname like ? limit ?,?";
		key="%"+key+"%";
			try {
				ResultSet rs=hp.select(sql, key,page.getSelectIndex(),page.getShowNumber());
				while(rs.next()){
					Goods goods=new Goods();
					goods.setGid(rs.getInt("g.gid"));
					goods.setGname(rs.getString("g.gname"));
					goods.setGprice(rs.getFloat("g.gprice"));
					goods.setGimage(rs.getString("g.gimage"));
					GoodsType gt=new GoodsType();
					gt.setGtid(rs.getInt("gt.gtid"));
					gt.setGtname(rs.getString("gt.gtname"));
					goods.setGtype(gt);
					list.add(goods);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		return list;
	}
	public int getNumber() {
		// TODO Auto-generated method stub
		String sql="select count(*) from goods";
		int temp=0;
		try {
			ResultSet rs=hp.select(sql);
			while(rs.next()){
			temp=rs.getInt(1);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	public int getNumber1() {
		// TODO Auto-generated method stub
		String sql="select count(*) from goods gtid=1";
		int temp=0;
		try {
			ResultSet rs=hp.select(sql);
			while(rs.next()){
			temp=rs.getInt(1);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	public int getNumber2() {
		// TODO Auto-generated method stub
		String sql="select count(*) from goods where gtid=2";
		int temp=0;
		try {
			ResultSet rs=hp.select(sql);
			while(rs.next()){
			temp=rs.getInt(1);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	@Override
	public int getNumber3() {
		// TODO Auto-generated method stub
		String sql="select count(*) from goods where gtid=3";
		int temp=0;
		try {
			ResultSet rs=hp.select(sql);
			while(rs.next()){
			temp=rs.getInt(1);}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	//无条件搜索
	public List<Goods> selectAll(Page page) {
		List<Goods> list=new ArrayList<Goods>();
		String sql="SELECT g.gid,g.gname,g.gprice,g.gimage FROM goods AS g limit ?,?";
		try {
			ResultSet rs=hp.select(sql, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Goods goods=new Goods();
				goods.setGid(rs.getInt("g.gid"));
				goods.setGname(rs.getString("g.gname"));
				goods.setGprice(rs.getFloat("g.gprice"));
				goods.setGimage(rs.getString("g.gimage"));
				list.add(goods);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}