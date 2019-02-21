package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface SearchBagBizInter {
	//有条件查询
	List<Goods> searchSou(String key,Page page);
	//无条件查询
	List<Goods> searchBag(Page page);
	int countBiz1();
	int countBiz2();
	int countBiz3();
	int countBiz();
}
