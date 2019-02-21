package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.GoodsAndOrders;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;


public interface SelectUserBizInter {
	//��ѯ�û�
	List<User> searchUser(Page page);
	//��������ѯ�û�
	List<User> searchUserKey(String userkey,Page page);
	//��ѯ����������������ҳʹ�ã�
	int countUser();
	//ɾ���û�
	boolean deleteUserBiz(String uid);
	//�޸��û���ѯģ��
	User searchChangeUser(String uid);
	//�޸��û�����ģ��
	boolean insertChangeUser(User uid);
	//�������Ĳ�ѯ��
	User searchPerson(String uid);
	//�������Ķ�����ѯ
	List<GoodsAndOrders> searchPersonOrder(Page page,String uid);
	//ȷ���ջ��޸�״̬
	boolean updateStatus(Orders orders);
	
	

}
