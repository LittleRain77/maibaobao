package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Page;

public interface EvaluateBizInter {
	//����ܵ���Ŀ��
	int searchNumber();
	//�������
	boolean  insert(Evaluate evalue);
	//��
	List<Evaluate> select(Page page);
	List<Evaluate> select(String keyword,Page page);
}
