package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.GoodsDetail;

public interface GoodsImageDaoInter {
	List<GoodsDetail> selectImage(int gid);

}
