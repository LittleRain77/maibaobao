package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

public interface InsertRequestBizInter {
	boolean insertRequest(ApplyRefund are);
	List<ApplyRefund> searchAll(Page page);
	List<ApplyRefund> searchAll(String keyword,Page page);
	//�������Ŀ��
	int searchNumber();
	//����һ��������Ϣ
	ApplyRefund searchById(String arid);
	//�޸������˿���Ϣ�ķ���
	boolean update(ApplyRefund ar);
	List<ApplyRefund> searchReque(String uid);

}
