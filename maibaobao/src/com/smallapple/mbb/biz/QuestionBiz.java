package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.QuestionBizInter;
import com.smallapple.mbb.dao.QuestionDao;
import com.smallapple.mbb.dao.inter.QuestionDaoInter;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Question;

public class QuestionBiz implements QuestionBizInter {
	private QuestionDaoInter dao; 
	

	public QuestionBiz() {
		dao=new QuestionDao();
	}

	@Override
	public int searchNumber() {
		// ��ѯ����Ŀ��
		return dao.searchNumber();
	}

	@Override
	public boolean insert(Question qst) {
		// �����ѯ
		int temp=dao.insert(qst);
		if(temp>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Question> select(Page page) {
		// ��ѯ����
		return dao.select(page);
	}

	@Override
	public List<Question> select(String keyword, Page page) {
		// ������ѯ��Ʒ���ƽ���ģ����ѯ
		return dao.select(keyword, page);
	}

}
