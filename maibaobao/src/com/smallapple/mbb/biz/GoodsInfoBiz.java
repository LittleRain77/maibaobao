package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.GoodsInfoBizInter;
import com.smallapple.mbb.dao.GoodsImageDao;
import com.smallapple.mbb.dao.GoodsInfoDao;
import com.smallapple.mbb.dao.inter.GoodsImageDaoInter;
import com.smallapple.mbb.dao.inter.GoodsInfoDaoInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsDetail;
import com.smallapple.mbb.vo.Page;

public class GoodsInfoBiz implements GoodsInfoBizInter {
	private GoodsInfoDaoInter dgoods;
	private GoodsImageDaoInter dimage;
	public GoodsInfoBiz() {
		dgoods=new GoodsInfoDao();
		dimage=new GoodsImageDao();
	}

	//前台商品显示查询
	public List<Goods> searchGoodsInfo(Page page) {
		return dgoods.selectGoodsInfo(page);
	}

	//商品总条数（分页）
	public int countGoodsBiz() {
		return dgoods.countGoods();
	}

	//商品详情查询
	public Goods searchGoodsDetail(String gid) {
		return dgoods.selectGoodsDetail(gid);
	}

	//商品详情图片查询
	public List<GoodsDetail> searchGoodsImage(int gid) {
		
		return dimage.selectImage(gid);
	}

	//男包前台显示查询
	public List<Goods> searchLady(String gtid) {
		return dgoods.selectLady(gtid);
	}
	

}
