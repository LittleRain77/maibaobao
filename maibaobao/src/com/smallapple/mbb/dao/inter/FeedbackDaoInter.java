package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Page;

public interface FeedbackDaoInter {
	//��������
	int insertFeedBack(Feedback fb);
	//����ܵ���Ŀ��
	int getNumber();
	//�鿴���԰�
	List<Feedback> select(Page page);
	List<Feedback> select(String keyword,Page page);
	//Ϊ�ظ���ѯһ������
	Feedback selectByFid(String fid);
}
