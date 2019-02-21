package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.GoodsBizInter;
import com.smallapple.mbb.dao.GoodsDao;
import com.smallapple.mbb.dao.inter.GoodsDaoInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public class GoodsBiz implements GoodsBizInter {
    private GoodsDaoInter dao;
    
	public GoodsBiz() {
		dao=new GoodsDao();
	}

	@Override
	public int searchNumber() {
		// TODO Auto-generated method stub
		return dao.searchNumber();
	}

	@Override
	public boolean insert(Goods goods) {
		int temp=dao.insert(goods);
		if(temp>0){
			return true;
		}
		return  false;
	}

	@Override
	public boolean delete(int gid) {
		int temp=dao.delete(gid);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Goods gds) {
		int temp=dao.update(gds);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Goods> select(Page page) {
		// ��ѯ��Ʒ������Ϣ������ҳ
		return dao.select(page);
	}

	@Override
	public List<Goods> select(String keyword, Page page) {
		// ����Ʒ����ģ����ѯ
		return dao.select(keyword, page);
	}

	@Override
	public Goods getOneGoodsInfo(String gid) {
		// ����Ż��һ����Ʒ��Ϣ
		return dao.selectByBid(gid);
	}

	//���빺�ﳵ
	public Goods search(String gid) {
		// TODO Auto-generated method stub
		return dao.select(gid);
	}

}
