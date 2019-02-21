package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

public interface InsertRequestDaoInter {
	int insertRequest(ApplyRefund are);
	List<ApplyRefund> searchAll(Page page);
	List<ApplyRefund> searchAll(String keyword,Page page);
	//�������Ŀ��
	int searchNumber();
	//����һ��������Ϣ
	ApplyRefund searchById(String arid);
	//�޸������˿���Ϣ�ķ���
	int update(ApplyRefund ar);
	//�������Ĳ�ѯ�˿�״̬
	List<ApplyRefund> selectRequ(String uid);
	

}
