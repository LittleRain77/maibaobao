package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.SelectUserBizInter;
import com.smallapple.mbb.dao.CollectDao;
import com.smallapple.mbb.dao.OrdersDao;
import com.smallapple.mbb.dao.SelectUserDao;
import com.smallapple.mbb.dao.inter.CollectDaoInter;
import com.smallapple.mbb.dao.inter.OrdersDaoInter;
import com.smallapple.mbb.dao.inter.SelectUserDaoInter;
import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.GoodsAndOrders;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;

public class SelectUserBiz implements SelectUserBizInter {
	private SelectUserDaoInter dao;
	private OrdersDaoInter odi;
	private CollectDaoInter cdi;
	public SelectUserBiz() {
		dao=new SelectUserDao();
		odi=new OrdersDao();
		cdi=new CollectDao();
	}

	//查询用户
	public List<User> searchUser(Page page) {
		return dao.selectUserDao(page);
	}

	//查询数据条数总数（分页使用）
	public int countUser() {
		return dao.countUser();
	}

	//有条件查询用户
	public List<User> searchUserKey(String userkey, Page page) {
		return dao.selectUserKey(userkey, page);
	}

	//删除用户
	public boolean deleteUserBiz(String uid) {
		int temp=dao.deleteUserDao(uid);
		if(temp>0){
			return true;
		}
		return false;
	}

	//修改用户查询模块
	public User searchChangeUser(String uid) {
		return dao.selectChangeUser(uid);
	}

	//修改用户的插入模块
	public boolean insertChangeUser(User uid) {
		int temp=dao.insertChangeUser(uid);
		if(temp>0){
			return true;
		}
		return false;
	}
    //个人中心修改
	public User searchPerson(String uid) {
		return dao.selectPerson(uid);
	}

	//个人中心订单查询
	public List<GoodsAndOrders> searchPersonOrder(Page page, String uid) {
		return odi.selectPersonOrder(page, uid);
	}

	//确认收货修改订单状态
	public boolean updateStatus( Orders orders) {
		int temp=odi.updateStatus(orders);
		if(temp>0){
			return true;
		}
		return false;
	}

	
	

}
