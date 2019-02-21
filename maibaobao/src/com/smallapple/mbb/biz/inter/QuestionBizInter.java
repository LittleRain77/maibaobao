package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Question;

public interface QuestionBizInter {
	//获得总的条目数
	int searchNumber();
	//添加咨询
	boolean  insert(Question qst);
	//查
	List<Question> select(Page page);
	List<Question> select(String keyword,Page page);
}
