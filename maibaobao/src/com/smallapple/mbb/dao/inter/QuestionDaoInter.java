package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Question;

public interface QuestionDaoInter {
	//����ܵ���Ŀ��
	 int searchNumber();
	//�����ѯ
    int insert(Question qst);
    //��
    List<Question> select(Page page);
    List<Question> select(String keyword,Page page);
}
