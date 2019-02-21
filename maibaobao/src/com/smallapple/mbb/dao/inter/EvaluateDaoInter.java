package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Page;

public interface EvaluateDaoInter {
	//获得总的条目数
	int searchNumber();
	//添加评论
	int insert(Evaluate evalue);
	//查
	List<Evaluate> select(Page page);
	List<Evaluate> select(String keyword,Page page);
}
