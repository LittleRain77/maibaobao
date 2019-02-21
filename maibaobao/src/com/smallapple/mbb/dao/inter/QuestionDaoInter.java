package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Question;

public interface QuestionDaoInter {
	//获得总的条目数
	 int searchNumber();
	//添加咨询
    int insert(Question qst);
    //查
    List<Question> select(Page page);
    List<Question> select(String keyword,Page page);
}
