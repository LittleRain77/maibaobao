package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Page;

public interface CollectBizInter {
	//����ܵ���Ŀ��
	int searchNumber();
	//����ղ�
	boolean insert(Collect co);
	//��
	List<Collect> select(Page page);
	List<Collect> select(String keyword,Page page);
	//�ж��Ƿ����
	int isHave(String uid,String gid);
	//���������ղز�ѯ
	List<Collect> searchCollect(Page page,String uid);
}
