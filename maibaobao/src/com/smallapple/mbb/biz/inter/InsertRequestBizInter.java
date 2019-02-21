package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.ApplyRefund;
import com.smallapple.mbb.vo.Page;

public interface InsertRequestBizInter {
	boolean insertRequest(ApplyRefund are);
	List<ApplyRefund> searchAll(Page page);
	List<ApplyRefund> searchAll(String keyword,Page page);
	//获得总条目数
	int searchNumber();
	//返回一条数据信息
	ApplyRefund searchById(String arid);
	//修改申请退款信息的方法
	boolean update(ApplyRefund ar);
	List<ApplyRefund> searchReque(String uid);

}
