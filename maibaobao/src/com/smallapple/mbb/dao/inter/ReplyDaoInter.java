package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Reply;

public interface ReplyDaoInter {
	//����ܵ���Ŀ��
	int searchNumber();
	//��
	int insert(Reply reply);	
	//��
	List<Reply> select(Page page);
	List<Reply> select(String keyword,Page page);
	//��ѯ���������лظ�
	List<Reply> searchByFid(String fid);
}
