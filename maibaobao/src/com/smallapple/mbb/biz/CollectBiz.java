package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.CollectBizInter;
import com.smallapple.mbb.dao.CollectDao;
import com.smallapple.mbb.dao.inter.CollectDaoInter;
import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Page;

public class CollectBiz implements CollectBizInter {
    private CollectDaoInter dao;
    
	public CollectBiz() {
		dao=new CollectDao();
	}

	@Override
	public int searchNumber() {
		// 查总条目数
		return dao.searchNumber();
	}

	@Override
	public boolean insert(Collect co) {
		// 插入收藏
		int temp=dao.insert(co);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Collect> select(Page page) {
		// 查询所有
		return dao.select(page);
	}

	@Override
	public List<Collect> select(String keyword, Page page) {
		//按商品名称查
		return dao.select(keyword, page);
	}

	@Override
	public int isHave(String uid, String gid) {
		// 查一个是否存在
		Collect co=dao.select(uid, gid);
		if(co==null){
			
			return 1;
			
		}
		System.out.println("+++++");
		return 0;
	}
	//个人中心收藏查询
		public List<Collect> searchCollect(Page page,String uid) {
			
			return dao.selectCollect(page, uid);
		}

}
