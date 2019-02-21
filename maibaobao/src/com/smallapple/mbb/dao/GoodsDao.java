package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.GoodsDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsType;
import com.smallapple.mbb.vo.Page;

public class GoodsDao implements GoodsDaoInter {
	private DBHelp hp;


	public GoodsDao() {
		hp=new DBHelp();
	}

	@Override
	public int searchNumber() {
		//查商品总条目数
		String sql="select count(*) from goods";
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
	public int insert(Goods goods) {
		// 增
		String sql="insert into goods(gname,gtid,gnumber,gtext,gimage,gaddress,gprice) values(?,?,?,?,?,?,?) ";
		int temp=-1;
		try {
			temp=hp.update(sql,goods.getGname(),goods.getGtype().getGtid(),goods.getGnumber(),goods.getGtext(),goods.getGimage(),goods.getGaddress(),goods.getGprice());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public int delete(int gid) {
		//删
		String sql="delete from goods where gid=?";
		int temp=-1;
		try {
			temp=hp.update(sql, gid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return temp;
	}

	@Override
	public int update(Goods gds) {
		// 改
		String sql="update goods set gname=?,gtid=?,gnumber=?,gtext=?,gimage=?,gaddress=?,gprice=? where gid=?";
		int temp=-1;
		try {
			temp=hp.update(sql,gds.getGname(),gds.getGtype().getGtid(),gds.getGnumber(),gds.getGtext(),gds.getGimage(),gds.getGaddress(),gds.getGprice(),gds.getGid());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;	
	}

	@Override
	public List<Goods> select(Page page) {
		//查询所有
		String sql="SELECT g.gid,t.gtid,t.gtname,g.gname,g.gnumber,g.gtext,g.gimage,g.gaddress,g.gprice FROM goods AS g INNER JOIN goodstype AS t ON g.gtid = t.gtid limit ?,?";
		List<Goods> list=new ArrayList<Goods>();
		try {
			ResultSet rs=hp.select(sql, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Goods gds=new Goods();
				gds.setGid(rs.getInt("g.gid"));

				GoodsType gtype=new GoodsType();
				gtype.setGtid(rs.getInt("t.gtid"));
				gtype.setGtname(rs.getString("t.gtname"));
				gds.setGtype(gtype);

				gds.setGname(rs.getString("gname"));
				gds.setGnumber(rs.getInt("gnumber"));
				gds.setGtext(rs.getString("gtext"));
				gds.setGimage(rs.getString("gimage"));
				gds.setGaddress(rs.getString("gaddress"));
				gds.setGprice(rs.getFloat("gprice"));
				list.add(gds);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Goods> select(String keyword, Page page) {
		//模糊查询
		String sql=" SELECT g.gid,t.gtid,t.gtname,g.gname,g.gnumber,g.gtext,g.gimage,g.gaddress,g.gprice FROM goods AS g INNER JOIN goodstype AS t ON g.gtid = t.gtid where g.gname like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<Goods> list=new ArrayList<Goods>();
		try {
			ResultSet rs=hp.select(sql,keyword, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Goods gds=new Goods();
				gds.setGid(rs.getInt("g.gid"));

				GoodsType gtype=new GoodsType();
				gtype.setGtid(rs.getInt("t.gtid"));
				gtype.setGtname(rs.getString("t.gtname"));
				gds.setGtype(gtype);

				gds.setGname(rs.getString("gname"));
				gds.setGnumber(rs.getInt("gnumber"));
				gds.setGtext(rs.getString("gtext"));
				gds.setGimage(rs.getString("gimage"));
				gds.setGaddress(rs.getString("gaddress"));
				gds.setGprice(rs.getFloat("gprice"));
				list.add(gds);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public Goods selectByBid(String gid) {
		// 查询一个
		String sql=" SELECT g.gid,t.gtid,t.gtname,g.gname,g.gnumber,g.gtext,g.gimage,g.gaddress,g.gprice FROM goods AS g INNER JOIN goodstype AS t ON g.gtid = t.gtid where g.gid=?";
		Goods gds=new Goods();
		try {
			ResultSet rs=hp.select(sql, gid);
			if(rs.next()){
				gds.setGid(rs.getInt("g.gid"));

				GoodsType gtype=new GoodsType();
				gtype.setGtid(rs.getInt("t.gtid"));
				gtype.setGtname(rs.getString("t.gtname"));
				gds.setGtype(gtype);

				gds.setGname(rs.getString("g.gname"));
				gds.setGnumber(rs.getInt("g.gnumber"));
				gds.setGtext(rs.getString("g.gtext"));
				gds.setGimage(rs.getString("g.gimage"));
				gds.setGaddress(rs.getString("g.gaddress"));
				gds.setGprice(rs.getFloat("g.gprice"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return gds;
	}
	//加入购物车
	public Goods select(String gid) {
		String sql="SELECT gt.gtid,g.gid,g.gname,g.gnumber,g.gtext,g.gimage,g.gaddress,g.gprice FROM goods AS g INNER JOIN goodstype AS gt ON g.gtid = gt.gtid where g.gid=?";
		Goods goods=new Goods();
		try {
			ResultSet rs=hp.select(sql, gid);
			if(rs.next()){


				GoodsType gtype=new GoodsType();
				gtype.setGtid(rs.getInt("gt.gtid"));
				goods.setGtype(gtype);

				goods.setGid(rs.getInt("g.gid"));
				goods.setGname(rs.getString("g.gname"));
				goods.setGnumber(rs.getInt("g.gnumber"));
				goods.setGtext(rs.getString("g.gtext"));
				goods.setGimage(rs.getString("g.gimage"));
				goods.setGaddress(rs.getString("g.gaddress"));
				goods.setGprice(rs.getFloat("g.gprice"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
	}

}
