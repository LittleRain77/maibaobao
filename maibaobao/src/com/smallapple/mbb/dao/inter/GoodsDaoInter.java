package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface GoodsDaoInter {
	//获得总的条目数
		 int searchNumber();
	   //添加图书
		int insert(Goods goods);
		//删
		int delete(int gid);
		//改
		int update(Goods gds);
		//查
		List<Goods> select(Page page);
		List<Goods> select(String keyword,Page page);
		//查一个图书的信息
		Goods selectByBid(String gid);
		//加入购物车
		Goods select(String gid);
		
}
