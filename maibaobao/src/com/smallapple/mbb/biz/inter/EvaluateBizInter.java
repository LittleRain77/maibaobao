package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Page;

public interface EvaluateBizInter {
	//获得总的条目数
	int searchNumber();
	//添加评论
	boolean  insert(Evaluate evalue);
	//查
	List<Evaluate> select(Page page);
	List<Evaluate> select(String keyword,Page page);
}
