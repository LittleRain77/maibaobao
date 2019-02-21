package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.GoodsAndOrders;
import com.smallapple.mbb.vo.Orders;
import com.smallapple.mbb.vo.Page;

public interface OrdersDaoInter {
	//��ѯ�ķ���
	List<Orders>selectAll(Page page);
	//��������ѯ
	List<Orders>selectAll(String keyword ,Page page);;
	//����ܵ���Ŀ��
	int searchNumber();
	//����һ����������Ϣ
	Orders searchById(String oid);
	//�޸Ķ�����Ϣ�ķ���
	int update(Orders order);
	//��Ӷ����ķ���
	int insert(Orders order);
	int delete(String oid);
	//��ѯ�������Ķ���
	List<GoodsAndOrders> selectPersonOrder(Page page,String uid);
	//ȷ���ջ��޸Ķ���״̬
	int updateStatus(Orders orders);

}
