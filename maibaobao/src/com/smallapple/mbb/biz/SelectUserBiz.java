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

	//��ѯ�û�
	public List<User> searchUser(Page page) {
		return dao.selectUserDao(page);
	}

	//��ѯ����������������ҳʹ�ã�
	public int countUser() {
		return dao.countUser();
	}

	//��������ѯ�û�
	public List<User> searchUserKey(String userkey, Page page) {
		return dao.selectUserKey(userkey, page);
	}

	//ɾ���û�
	public boolean deleteUserBiz(String uid) {
		int temp=dao.deleteUserDao(uid);
		if(temp>0){
			return true;
		}
		return false;
	}

	//�޸��û���ѯģ��
	public User searchChangeUser(String uid) {
		return dao.selectChangeUser(uid);
	}

	//�޸��û��Ĳ���ģ��
	public boolean insertChangeUser(User uid) {
		int temp=dao.insertChangeUser(uid);
		if(temp>0){
			return true;
		}
		return false;
	}
    //���������޸�
	public User searchPerson(String uid) {
		return dao.selectPerson(uid);
	}

	//�������Ķ�����ѯ
	public List<GoodsAndOrders> searchPersonOrder(Page page, String uid) {
		return odi.selectPersonOrder(page, uid);
	}

	//ȷ���ջ��޸Ķ���״̬
	public boolean updateStatus( Orders orders) {
		int temp=odi.updateStatus(orders);
		if(temp>0){
			return true;
		}
		return false;
	}

	
	

}
