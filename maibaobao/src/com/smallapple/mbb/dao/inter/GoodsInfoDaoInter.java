package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface GoodsInfoDaoInter {
	//前台显示图片查询
	List<Goods> selectGoodsInfo(Page page);
	//商品数量条数（分页）
	int countGoods();
	//商品跳转详情页面
	Goods selectGoodsDetail(String gid);
	//男包页面显示查询
	List<Goods> selectLady(String gtid);

}
