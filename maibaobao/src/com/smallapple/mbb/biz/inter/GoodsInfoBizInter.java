package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsDetail;
import com.smallapple.mbb.vo.Page;

public interface GoodsInfoBizInter {
	//前台商品显示查询
	List<Goods> searchGoodsInfo(Page page);
	//商品数据条数（分页）
	int countGoodsBiz();
	//商品详情显示查询
	Goods searchGoodsDetail(String gid);
	//商品详情图片显示
	List<GoodsDetail> searchGoodsImage(int gid);
	//男包前台显示查询
	List<Goods> searchLady(String gtid);

}
