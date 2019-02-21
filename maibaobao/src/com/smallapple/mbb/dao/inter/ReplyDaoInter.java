package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Reply;

public interface ReplyDaoInter {
	//获得总的条目数
	int searchNumber();
	//增
	int insert(Reply reply);	
	//查
	List<Reply> select(Page page);
	List<Reply> select(String keyword,Page page);
	//查询该留言所有回复
	List<Reply> searchByFid(String fid);
}
