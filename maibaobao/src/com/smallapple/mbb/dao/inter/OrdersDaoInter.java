package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.GoodsAndOrders;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;

public interface OrdersDaoInter {
	//查询的方法
	List<Orders>selectAll(Page page);
	//按条件查询
	List<Orders>selectAll(String keyword ,Page page);;
	//获得总的条目数
	int searchNumber();
	//返回一个订单的信息
	Orders searchById(String oid);
	//修改订单信息的方法
	int update(Orders order);
	//添加订单的方法
	int insert(Orders order);
	int delete(String oid);
	//查询个人中心订单
	List<GoodsAndOrders> selectPersonOrder(Page page,String uid);
	//确认收货修改订单状态
	int updateStatus(Orders orders);

}
