package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.GoodsDetail;
import com.smallapple.mbb.vo.Page;

public interface GoodsInfoBizInter {
	//ǰ̨��Ʒ��ʾ��ѯ
	List<Goods> searchGoodsInfo(Page page);
	//��Ʒ������������ҳ��
	int countGoodsBiz();
	//��Ʒ������ʾ��ѯ
	Goods searchGoodsDetail(String gid);
	//��Ʒ����ͼƬ��ʾ
	List<GoodsDetail> searchGoodsImage(int gid);
	//�а�ǰ̨��ʾ��ѯ
	List<Goods> searchLady(String gtid);

}
