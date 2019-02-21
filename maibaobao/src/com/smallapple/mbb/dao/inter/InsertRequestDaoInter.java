package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

public interface InsertRequestDaoInter {
	int insertRequest(ApplyRefund are);
	List<ApplyRefund> searchAll(Page page);
	List<ApplyRefund> searchAll(String keyword,Page page);
	//获得总条目数
	int searchNumber();
	//返回一条数据信息
	ApplyRefund searchById(String arid);
	//修改申请退款信息的方法
	int update(ApplyRefund ar);
	//个人中心查询退款状态
	List<ApplyRefund> selectRequ(String uid);
	

}
