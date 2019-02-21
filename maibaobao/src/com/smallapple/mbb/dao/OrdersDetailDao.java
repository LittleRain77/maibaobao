package com.smallapple.mbb.dao;

import java.sql.SQLException;

import com.smallapple.mbb.dao.inter.OrdersDetailDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Car;

public class OrdersDetailDao implements OrdersDetailDaoInter {
	private DBHelp hp;
	public OrdersDetailDao(){
		hp=new DBHelp();
	}

	@Override
	public int insert(String oid, Car item) {
		String sql="insert into goodsandorders values(?,?,?)";
		int temp=-1;
		try {
			temp=hp.update(sql,item.getGoods().getGid(),oid,item.getNumber());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

}
