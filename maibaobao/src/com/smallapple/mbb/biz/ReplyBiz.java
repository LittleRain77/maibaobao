package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.ReplyBizInter;
import com.smallapple.mbb.dao.ReplyDao;
import com.smallapple.mbb.dao.inter.ReplyDaoInter;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Reply;

public class ReplyBiz implements ReplyBizInter {
     private ReplyDaoInter dao;
     
	public ReplyBiz() {
		dao=new ReplyDao();
	}

	@Override
	public boolean insert(Reply reply) {
		// 添加回复
		int temp=dao.insert(reply);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Reply> select(Page page) {
		// 查询所有
		return dao.select(page);
	}

	@Override
	public List<Reply> select(String keyword, Page page) {
		//按留言内容模糊查询
		return dao.select(keyword, page);
	}

	@Override
	public int searchNumber() {
		// 查询总条目数
		return dao.searchNumber();
	}

	@Override
	public List<Reply> searchByFid(String fid) {
		// 查询该留言所有回复
		return dao.searchByFid(fid);
	}


}
