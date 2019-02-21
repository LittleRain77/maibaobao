package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;

public interface OrdersBizInter {
	//��ȡ���ж�����Ϣ�ķ�������
	List<Orders> getAll(Page page);
	//��������ѯ������Ϣ
	List<Orders> getAll(String keyword,Page page);
	//���������Ŀ��
	int getNumber();
	//���һ����������Ϣ
	Orders getOneOrderInfo(String oid);
	//�޸Ķ���״̬�ķ���
	boolean updateOrder(Orders order);
	//���붩����
	boolean addOrder(Orders order);
	//ɾ������
	boolean deleteOrder(String oid);

}
