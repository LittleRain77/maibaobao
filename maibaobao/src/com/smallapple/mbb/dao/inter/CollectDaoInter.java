package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Page;

public interface CollectDaoInter {
	List<Collect> selectCollect( Page page,String uid);
	//����ܵ���Ŀ��
	int searchNumber();
	//����ղ�
	int insert(Collect co);
	//��
	List<Collect> select(Page page);
	List<Collect> select(String keyword,Page page);
	//�ж��Ƿ����
	Collect select(String uid,String gid);

}
