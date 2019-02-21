package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.GoodsAndOrders;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;


public interface SelectUserBizInter {
	//查询用户
	List<User> searchUser(Page page);
	//有条件查询用户
	List<User> searchUserKey(String userkey,Page page);
	//查询数据条数总数（分页使用）
	int countUser();
	//删除用户
	boolean deleteUserBiz(String uid);
	//修改用户查询模块
	User searchChangeUser(String uid);
	//修改用户插入模块
	boolean insertChangeUser(User uid);
	//个人中心查询、
	User searchPerson(String uid);
	//个人中心订单查询
	List<GoodsAndOrders> searchPersonOrder(Page page,String uid);
	//确认收货修改状态
	boolean updateStatus(Orders orders);
	
	

}
