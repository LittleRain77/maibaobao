package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Question;

public interface QuestionBizInter {
	//����ܵ���Ŀ��
	int searchNumber();
	//������ѯ
	boolean  insert(Question qst);
	//��
	List<Question> select(Page page);
	List<Question> select(String keyword,Page page);
}