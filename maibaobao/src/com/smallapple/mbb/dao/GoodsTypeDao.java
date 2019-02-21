package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.GoodsTypeDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.GoodsType;

public class GoodsTypeDao implements GoodsTypeDaoInter {

	
		private DBHelp hp;

		public GoodsTypeDao() {
			hp=new DBHelp();
		}

		@Override
		public List<GoodsType> select() {
			//查询所有类型
			String sql="select gtid,gtname from goodstype";
			List<GoodsType> list=new ArrayList<GoodsType>();
			try {
				ResultSet rs=hp.select(sql);
				while(rs.next()){
					list.add(new GoodsType(rs.getInt("gtid"),rs.getString("gtname")));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
}
