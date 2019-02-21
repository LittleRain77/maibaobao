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

	//ǰ̨��Ʒ��ʾ��ѯ
	public List<Goods> searchGoodsInfo(Page page) {
		return dgoods.selectGoodsInfo(page);
	}

	//��Ʒ����������ҳ��
	public int countGoodsBiz() {
		return dgoods.countGoods();
	}

	//��Ʒ�����ѯ
	public Goods searchGoodsDetail(String gid) {
		return dgoods.selectGoodsDetail(gid);
	}

	//��Ʒ����ͼƬ��ѯ
	public List<GoodsDetail> searchGoodsImage(int gid) {
		
		return dimage.selectImage(gid);
	}

	//�а�ǰ̨��ʾ��ѯ
	public List<Goods> searchLady(String gtid) {
		return dgoods.selectLady(gtid);
	}
	

}
