package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Feedback;
import com.smallapple.mbb.vo.Page;

public interface FeedbackBizInter {
	//插入留言
	boolean insertFeedBack(Feedback fb);
	//获得总的条目数
	int getNumber();
	//查看留言板
	List<Feedback> select(Page page);
	List<Feedback> select(String keyword,Page page);
	//为回复查询一条留言
	Feedback selectByFid(String fid);
}
