package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Page;

public interface CollectBizInter {
	//获得总的条目数
	int searchNumber();
	//添加收藏
	boolean insert(Collect co);
	//查
	List<Collect> select(Page page);
	List<Collect> select(String keyword,Page page);
	//判断是否存在
	int isHave(String uid,String gid);
	//个人中心收藏查询
	List<Collect> searchCollect(Page page,String uid);
}
