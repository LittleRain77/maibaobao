package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.GoodsTypeBizInter;
import com.smallapple.mbb.dao.GoodsTypeDao;
import com.smallapple.mbb.dao.inter.GoodsTypeDaoInter;
import com.smallapple.mbb.vo.GoodsType;

public class GoodsTypeBiz implements GoodsTypeBizInter {
    private GoodsTypeDaoInter dao;
    
	public GoodsTypeBiz() {
	    dao=new GoodsTypeDao();
	}

	@Override
	public List<GoodsType> search() {
		// �õ���������
		return dao.select();
	}

	
    
}
