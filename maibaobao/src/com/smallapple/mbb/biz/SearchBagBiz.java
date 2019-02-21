package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.SearchBagBizInter;
import com.smallapple.mbb.dao.SearchBagDao;
import com.smallapple.mbb.dao.inter.SearchBagDaoInter;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;

public class SearchBagBiz implements SearchBagBizInter {
       private SearchBagDaoInter dao;
       public SearchBagBiz(){
    	   dao=new SearchBagDao();
       }
	//ËÑË÷
	public List<Goods> searchSou(String key,Page page) {
		return dao.selectsou(key, page);
	}
	//type=1
	public int countBiz1() {
		return dao.getNumber1();
	}
	//ÎÞÌõ¼þËÑË÷
	public List<Goods> searchBag(Page page) {
		return dao.selectAll(page);
	}
	@Override
	public int countBiz2() {
		// TODO Auto-generated method stub
		return dao.getNumber2();
	}
	@Override
	public int countBiz3() {
		// TODO Auto-generated method stub
		return dao.getNumber3();
	}
	@Override
	public int countBiz() {
		// TODO Auto-generated method stub
		return dao.getNumber();
	}
	

}
