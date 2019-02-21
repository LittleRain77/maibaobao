package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface GoodsBizInter {
	//����ܵ���Ŀ��
	 int searchNumber();
  //���ͼ��
	boolean insert(Goods goods);
	//ɾ
	boolean delete(int gid);
	//��
	boolean update(Goods gds);
	//��
	List<Goods> select(Page page);
	List<Goods> select(String keyword,Page page);
	//��һ��ͼ�����Ϣ
	Goods getOneGoodsInfo(String gid);
	//���빺�ﳵ
	Goods search(String gid);
}
