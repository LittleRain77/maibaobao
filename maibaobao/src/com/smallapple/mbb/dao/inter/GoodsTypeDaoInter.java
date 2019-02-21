package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.GoodsType;

public interface GoodsTypeDaoInter {
   //查询所有类型
	List<GoodsType> select();
}
