package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.GoodsInfoDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsType;
import com.smallapple.mbb.vo.Page;

public class GoodsInfoDao implements GoodsInfoDaoInter {
	private DBHelp hp;
	public GoodsInfoDao() {
		hp=new DBHelp();
	}

	//前台显示查询商品
	public List<Goods> selectGoodsInfo(Page page) {
		List<Goods> list = new ArrayList<Goods>();
		
		String sql="SELECT g.gid,gt.gtid,gt.gtname,g.gname,g.gimage,g.gnumber,g.gtext,g.gaddress,g.gprice FROM goods AS g INNER JOIN goodstype AS gt ON g.gtid = gt.gtid limit ?,?";
		
		try {
			ResultSet rs=hp.select(sql,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Goods goods=new Goods();
				goods.setGid(rs.getInt("g.gid"));
				GoodsType gt=new GoodsType();
				gt.setGtid(rs.getInt("gt.gtid"));
				gt.setGtname(rs.getString("gt.gtname"));
				goods.setGtype(gt);					
				goods.setGname(rs.getString("g.gname"));
				goods.setGimage(rs.getString("g.gimage"));
				goods.setGnumber(rs.getInt("g.gnumber"));
				goods.setGtext(rs.getString("g.gtext"));
				goods.setGaddress(rs.getString("g.gaddress"));
				goods.setGprice(rs.getInt("g.gprice"));
				list.add(goods);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	//查询数据条数总数（分页使用）
	public int countGoods() {
		int temp=0;
		String sql="select count(*) from goods";
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

	//跳转到详情页面
	public Goods selectGoodsDetail(String gid) {
		Goods goods=new Goods();
		String sql="SELECT g.gid,gt.gtid,gt.gtname,g.gname,g.gimage,g.gnumber,g.gtext,g.gaddress,g.gprice FROM goods AS g INNER JOIN goodstype AS gt ON g.gtid = gt.gtid where g.gid=?";
		try {
			ResultSet rs=hp.select(sql, gid);
			while(rs.next()){
				
				goods.setGid(rs.getInt("g.gid"));
				GoodsType gt=new GoodsType();
				gt.setGtid(rs.getInt("gt.gtid"));
				gt.setGtname(rs.getString("gt.gtname"));
				goods.setGtype(gt);					
				goods.setGname(rs.getString("g.gname"));
				goods.setGimage(rs.getString("g.gimage"));
				goods.setGnumber(rs.getInt("g.gnumber"));
				goods.setGtext(rs.getString("g.gtext"));
				goods.setGaddress(rs.getString("g.gaddress"));
				goods.setGprice(rs.getInt("g.gprice"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
	}

	//查询男包
	public List<Goods> selectLady(String gtid) {
		List<Goods> list=new ArrayList<Goods>();
		String sql="SELECT g.gid,gt.gtid,gt.gtname,g.gname,g.gimage,g.gnumber,g.gtext,g.gaddress,g.gprice FROM goods AS g INNER JOIN goodstype AS gt ON g.gtid = gt.gtid where gt.gtid=?";
		try {
			ResultSet rs=hp.select(sql, gtid);
			while(rs.next()){
				Goods goods=new Goods();
				goods.setGid(rs.getInt("g.gid"));
				GoodsType gt=new GoodsType();
				gt.setGtid(rs.getInt("gt.gtid"));
				gt.setGtname(rs.getString("gt.gtname"));
				goods.setGtype(gt);					
				goods.setGname(rs.getString("g.gname"));
				goods.setGimage(rs.getString("g.gimage"));
				goods.setGnumber(rs.getInt("g.gnumber"));
				goods.setGtext(rs.getString("g.gtext"));
				goods.setGaddress(rs.getString("g.gaddress"));
				goods.setGprice(rs.getInt("g.gprice"));
				list.add(goods);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
