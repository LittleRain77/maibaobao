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
		// ��������
		int temp=dao.insertFeedBack(fb);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Feedback> select(Page page) {
		// ��ѯ����
		return dao.select(page);
	}

	@Override
	public List<Feedback> select(String keyword, Page page) {
		//������ģ����ѯ
		return dao.select(keyword, page);
	}

	@Override
	public Feedback selectByFid(String fid) {
		// Ϊ�ظ���ѯһ������
		return dao.selectByFid(fid);
	}

	@Override
	public int getNumber() {
		// ��ѯ����Ŀ��
		return dao.getNumber();
	}

}
