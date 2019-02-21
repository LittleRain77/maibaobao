package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface SearchBagDaoInter {
	//条件搜索
	List<Goods> selectsou(String key,Page page);
	//无条件搜索
	List<Goods> selectAll(Page page);
	int getNumber1();
	int getNumber2();
	int getNumber3();
	int getNumber();
       
}
