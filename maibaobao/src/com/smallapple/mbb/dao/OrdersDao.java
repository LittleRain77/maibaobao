package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.OrdersDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsAndOrders;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;

public class OrdersDao implements OrdersDaoInter {
	private DBHelp hp;
	public OrdersDao(){
		hp=new DBHelp();
	}

	@Override
	public List<Orders> selectAll(Page page) {
		//查询订单
		String sql="SELECT o.oid,o.uid,o.otime,o.opaymenttype,o.ousername,o.oaddress,o.ophone,o.ostatus FROM orders AS o limit ?,?";
		List<Orders> list=new ArrayList<Orders>();
		try {
			ResultSet rs=hp.select(sql,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Orders order=new Orders();
				order.setOid(rs.getString("o.oid"));
				order.setUid(rs.getString("o.uid"));

				order.setOtime(rs.getString("o.otime"));
				order.setOpaymenttype(rs.getString("o.opaymenttype"));
				order.setOusername(rs.getString("o.ousername"));
				order.setOaddress(rs.getString("o.oaddress"));
				order.setOphone(rs.getString("o.ophone"));
				order.setOstatus(rs.getString("o.ostatus"));
				list.add(order);



			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Orders> selectAll(String keyword, Page page) {
		// 条件查询
		String sql="SELECT o.oid,o.uid,o.otime,o.opaymenttype,o.ousername,o.oaddress,o.ophone,o.ostatus FROM orders AS o where ousername like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<Orders> list=new ArrayList<Orders>();
		try {
			ResultSet rs=hp.select(sql,keyword,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Orders order=new Orders();
				order.setOid(rs.getString("o.oid"));

				order.setUid(rs.getString("o.uid"));

				order.setOtime(rs.getString("o.otime"));
				order.setOpaymenttype(rs.getString("o.opaymenttype"));
				order.setOusername(rs.getString("o.ousername"));
				order.setOaddress(rs.getString("o.oaddress"));
				order.setOphone(rs.getString("o.ophone"));
				order.setOstatus(rs.getString("o.ostatus"));
				list.add(order);


			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int searchNumber() {
		//查询总的数目
		String sql="select count(*) from orders";
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
	public Orders searchById(String oid) {
		String sql="SELECT o.oid,o.uid,o.otime,o.opaymenttype,o.ousername,o.oaddress,o.ophone,o.ostatus FROM orders AS o where o.oid=?";
		Orders order=null;
		try {
			ResultSet rs=hp.select(sql,oid);
			if(rs.next()){
				order=new Orders();
				order.setOid(rs.getString("o.oid"));

				order.setUid(rs.getString("o.uid"));

				order.setOtime(rs.getString("o.otime"));
				order.setOpaymenttype(rs.getString("o.opaymenttype"));
				order.setOusername(rs.getString("o.ousername"));
				order.setOaddress(rs.getString("o.oaddress"));
				order.setOphone(rs.getString("o.ophone"));
				order.setOstatus(rs.getString("o.ostatus"));



			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return order;
	}

	@Override
	public int update(Orders order) {
		// 修改
		String sql="update orders set ostatus=? where oid=?";
		int temp=-1;
		try {
			temp=hp.update(sql,order.getOstatus(),order.getOid());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;

	}

	@Override
	public int insert(Orders order) {
		String sql="insert into orders values(?,?,?,?,?,?,?,?)";
		int temp=-1;
		try {
			temp=hp.update(sql,order.getOid(),order.getUid(),order.getOtime(),order.getOpaymenttype(),order.getOusername(),order.getOaddress(),order.getOphone(),order.getOstatus());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public int delete(String oid) {
		//删除订单
		String sql="delete from orders where oid=?";
		int temp=-1;
		try {
			temp=hp.update(sql, oid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	//查询个人中心订单
	public List<GoodsAndOrders> selectPersonOrder(Page page,String uid) {
		List<GoodsAndOrders> list=new ArrayList<GoodsAndOrders>();
		String sql="SELECT o.oid,o.otime,o.opaymenttype,o.uid,o.ostatus,o.ousername,gao.number,g.gid,g.gname,g.gprice,g.gimage FROM goods AS g INNER JOIN goodsandorders AS gao ON gao.gid = g.gid INNER JOIN orders AS o ON gao.oid = o.oid where o.uid=? limit ?,?";
		try {
			ResultSet rs=hp.select(sql,uid,page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				GoodsAndOrders gao=new GoodsAndOrders();
				Orders orders=new Orders();
				orders.setOid(rs.getString("o.oid"));
				orders.setOtime(rs.getString("o.otime"));
				orders.setOpaymenttype(rs.getString("o.opaymenttype"));
				orders.setUid(rs.getString("o.uid"));
				orders.setOstatus(rs.getString("o.ostatus"));
				orders.setOusername(rs.getString("o.ousername"));
				gao.setOrders(orders);
				gao.setNumber(rs.getInt("gao.number"));
				
				Goods goods = new Goods();
				goods.setGid(rs.getInt("g.gid"));
				goods.setGname(rs.getString("g.gname"));
				goods.setGprice(rs.getFloat("g.gprice"));
				goods.setGimage(rs.getString("g.gimage"));
				gao.setGoods(goods);
				list.add(gao);
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//确认收货修改订单状态
	public int updateStatus(Orders orders) {
		int temp=-1;
		String sql="update orders set ostatus=? where oid=?";
		System.out.println("==================");
		try {
			temp=hp.update(sql,orders.getOstatus(),orders.getOid());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

}

     

