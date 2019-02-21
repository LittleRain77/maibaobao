package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Collect;
import com.smallapple.mbb.vo.Page;

public interface CollectDaoInter {
	List<Collect> selectCollect( Page page,String uid);
	//获得总的条目数
	int searchNumber();
	//添加收藏
	int insert(Collect co);
	//查
	List<Collect> select(Page page);
	List<Collect> select(String keyword,Page page);
	//判断是否存在
	Collect select(String uid,String gid);

}
