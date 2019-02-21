package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.FeedbackBizInter;
import com.smallapple.mbb.dao.FeedbackDao;
import com.smallapple.mbb.dao.inter.FeedbackDaoInter;
import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Page;

public class FeedbackBiz implements FeedbackBizInter {
    private FeedbackDaoInter dao;
    
	public FeedbackBiz() {
		dao=new FeedbackDao();
	}

	@Override
	public boolean insertFeedBack(Feedback fb) {
		// 插入留言
		int temp=dao.insertFeedBack(fb);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Feedback> select(Page page) {
		// 查询所有
		return dao.select(page);
	}

	@Override
	public List<Feedback> select(String keyword, Page page) {
		//按内容模糊查询
		return dao.select(keyword, page);
	}

	@Override
	public Feedback selectByFid(String fid) {
		// 为回复查询一条留言
		return dao.selectByFid(fid);
	}

	@Override
	public int getNumber() {
		// 查询总条目数
		return dao.getNumber();
	}

}
