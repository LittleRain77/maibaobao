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
		// ��ӻظ�
		int temp=dao.insert(reply);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Reply> select(Page page) {
		// ��ѯ����
		return dao.select(page);
	}

	@Override
	public List<Reply> select(String keyword, Page page) {
		//����������ģ����ѯ
		return dao.select(keyword, page);
	}

	@Override
	public int searchNumber() {
		// ��ѯ����Ŀ��
		return dao.searchNumber();
	}

	@Override
	public List<Reply> searchByFid(String fid) {
		// ��ѯ���������лظ�
		return dao.searchByFid(fid);
	}


}
