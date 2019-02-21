package com.smallapple.mbb.biz;

import java.util.List;

import com.smallapple.mbb.biz.inter.InsertRequestBizInter;
import com.smallapple.mbb.dao.InsertRequestDao;
import com.smallapple.mbb.dao.inter.InsertRequestDaoInter;
import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

public class InsertRequestBiz implements InsertRequestBizInter {
	private InsertRequestDaoInter dao;
	public InsertRequestBiz() {
		dao=new InsertRequestDao();
	}

	@Override
	public boolean insertRequest(ApplyRefund are) {
		int temp=dao.insertRequest(are);
		if(temp>0){
			return true;
		}
		return false;
	}
	

	@Override
	public List<ApplyRefund> searchAll(Page page) {
		//������
		return dao.searchAll(page);
	}

	@Override
	public List<ApplyRefund> searchAll(String keyword, Page page) {
		// ������ѯ
		return dao.searchAll(keyword, page);
	}

	@Override
	public int searchNumber() {
		// ������Ŀ��
		return dao.searchNumber();
	}



	@Override
	public ApplyRefund searchById(String arid) {
		// ��һ��Ϊ��
		return dao.searchById(arid);
	}

	@Override
	public boolean update(ApplyRefund ar) {
		// ��
		int temp=dao.update(ar);
		if(temp>0){
			return true;
		}
		return false;
	}

	//���������˿��ѯ
	public List<ApplyRefund> searchReque(String uid) {
		return dao.selectRequ(uid);
	}

}
