package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Page;

public interface EvaluateDaoInter {
	//����ܵ���Ŀ��
	int searchNumber();
	//�������
	int insert(Evaluate evalue);
	//��
	List<Evaluate> select(Page page);
	List<Evaluate> select(String keyword,Page page);
}
