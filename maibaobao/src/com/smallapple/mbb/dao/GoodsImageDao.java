package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.GoodsImageDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsDetail;

public class GoodsImageDao implements GoodsImageDaoInter {
	private DBHelp hp;
	public GoodsImageDao() {
		hp=new DBHelp();
	}

	//≤È—Ø…Ã∆∑Õº∆¨
	public List<GoodsDetail> selectImage(int gid) {
		List<GoodsDetail> list=new ArrayList<GoodsDetail>();
		String sql="select * from goodsdetail where gid=?";
		try {
			ResultSet rs=hp.select(sql, gid);
			while(rs.next()){
				GoodsDetail gd=new GoodsDetail();
				Goods goods=new Goods();
				goods.setGid(rs.getInt("gid"));
				gd.setGid(goods);
				gd.setGdid(rs.getInt("gdid"));
				gd.setGdimage(rs.getString("gdimage"));
				
				list.add(gd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
