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
		//查所有
		return dao.searchAll(page);
	}

	@Override
	public List<ApplyRefund> searchAll(String keyword, Page page) {
		// 条件查询
		return dao.searchAll(keyword, page);
	}

	@Override
	public int searchNumber() {
		// 查总条目数
		return dao.searchNumber();
	}



	@Override
	public ApplyRefund searchById(String arid) {
		// 差一个为改
		return dao.searchById(arid);
	}

	@Override
	public boolean update(ApplyRefund ar) {
		// 改
		int temp=dao.update(ar);
		if(temp>0){
			return true;
		}
		return false;
	}

	//个人中心退款查询
	public List<ApplyRefund> searchReque(String uid) {
		return dao.selectRequ(uid);
	}

}
