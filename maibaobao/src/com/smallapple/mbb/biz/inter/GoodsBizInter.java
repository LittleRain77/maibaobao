package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface GoodsBizInter {
	//获得总的条目数
	 int searchNumber();
  //添加图书
	boolean insert(Goods goods);
	//删
	boolean delete(int gid);
	//改
	boolean update(Goods gds);
	//查
	List<Goods> select(Page page);
	List<Goods> select(String keyword,Page page);
	//查一个图书的信息
	Goods getOneGoodsInfo(String gid);
	//加入购物车
	Goods search(String gid);
}
