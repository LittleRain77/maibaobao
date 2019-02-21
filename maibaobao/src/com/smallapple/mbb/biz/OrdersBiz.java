package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.OrdersBizInter;
import com.smallapple.mbb.dao.OrdersDao;
import com.smallapple.mbb.dao.OrdersDetailDao;
import com.smallapple.mbb.dao.inter.OrdersDaoInter;
import com.smallapple.mbb.dao.inter.OrdersDetailDaoInter;
import com.smallapple.mbb.vo.Car;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;

public class OrdersBiz implements OrdersBizInter {
	private OrdersDaoInter dao;
	private OrdersDetailDaoInter odt;
	
	public OrdersBiz(){
		odt=new OrdersDetailDao();
		dao=new OrdersDao();
	}

	@Override
	public List<Orders> getAll(Page page) {
		// 获得所有订单信息
		return dao.selectAll(page);
	}

	@Override
	public List<Orders> getAll(String keyword, Page page) {
		// 按条件获得订单信息
		return dao.selectAll(keyword,page);
	}

	@Override
	public int getNumber() {
		// 获得所有数目
		return dao.searchNumber();
	}

	@Override
	public Orders getOneOrderInfo(String oid) {
		// TODO Auto-generated method stub
		return dao.searchById(oid);
	}

	@Override
	public boolean updateOrder(Orders order) {
		int temp=dao.update(order);
		if(temp>0){
			return true;
		}
		
		return false;
	}

	@Override
	public boolean addOrder(Orders order) {
		int temp=dao.insert(order);
		int sum=0;
		if(temp>0){
			for(Car cit:order.getList()){
				sum+=odt.insert(order.getOid(), cit);
			}
			if(sum==order.getList().size()){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}
	@Override
	public boolean deleteOrder(String oid) {
		int num=dao.delete(oid);
		if(num>0){
			return true;
		}
		return false;
	}

}
