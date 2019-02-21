package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.EvaluateBizInter;
import com.smallapple.mbb.dao.EvaluateDao;
import com.smallapple.mbb.dao.inter.EvaluateDaoInter;
import com.smallapple.mbb.vo.Evaluate;
import com.smallapple.mbb.vo.Page;

public class EvaluateBiz implements EvaluateBizInter {
    private EvaluateDaoInter dao;
    public EvaluateBiz() {
    	dao=new EvaluateDao();
    }
	@Override
	public int searchNumber() {
		// 查询总条目数
		return dao.searchNumber();
	}

	@Override
	public boolean insert(Evaluate evalue) {
		//插入评论
		int temp=dao.insert(evalue);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Evaluate> select(Page page) {
		// 查询所有
		return dao.select(page);
	}

	@Override
	public List<Evaluate> select(String keyword, Page page) {
		// 按商品名称查询
		return dao.select(keyword, page);
	}

}
