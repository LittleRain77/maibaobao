package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface SearchBagBizInter {
	//��������ѯ
	List<Goods> searchSou(String key,Page page);
	//��������ѯ
	List<Goods> searchBag(Page page);
	int countBiz1();
	int countBiz2();
	int countBiz3();
	int countBiz();
}
