package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public interface GoodsDaoInter {
	//����ܵ���Ŀ��
		 int searchNumber();
	   //���ͼ��
		int insert(Goods goods);
		//ɾ
		int delete(int gid);
		//��
		int update(Goods gds);
		//��
		List<Goods> select(Page page);
		List<Goods> select(String keyword,Page page);
		//��һ��ͼ�����Ϣ
		Goods selectByBid(String gid);
		//���빺�ﳵ
		Goods select(String gid);
		
}
