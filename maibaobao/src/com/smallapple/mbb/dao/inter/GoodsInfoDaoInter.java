package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface GoodsInfoDaoInter {
	//ǰ̨��ʾͼƬ��ѯ
	List<Goods> selectGoodsInfo(Page page);
	//��Ʒ������������ҳ��
	int countGoods();
	//��Ʒ��ת����ҳ��
	Goods selectGoodsDetail(String gid);
	//�а�ҳ����ʾ��ѯ
	List<Goods> selectLady(String gtid);

}
