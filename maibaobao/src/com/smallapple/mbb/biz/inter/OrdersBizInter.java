package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;

public interface OrdersBizInter {
	//获取所有订单信息的方法声明
	List<Orders> getAll(Page page);
	//按条件查询订单信息
	List<Orders> getAll(String keyword,Page page);
	//获得所有条目数
	int getNumber();
	//获得一个订单的信息
	Orders getOneOrderInfo(String oid);
	//修改订单状态的方法
	boolean updateOrder(Orders order);
	//插入订单的
	boolean addOrder(Orders order);
	//删除订单
	boolean deleteOrder(String oid);

}
