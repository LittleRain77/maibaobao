package com.smallapple.mbb.vo;

public class GoodsDetail {
	private int gdid;
	private Goods gid;
	private String gdimage;
	
	public int getGdid() {
		return gdid;
	}
	public void setGdid(int gdid) {
		this.gdid = gdid;
	}
	public Goods getGid() {
		return gid;
	}
	public void setGid(Goods gid) {
		this.gid = gid;
	}
	public String getGdimage() {
		return gdimage;
	}
	public void setGdimage(String gdimage) {
		this.gdimage = gdimage;
	}
	public GoodsDetail() {
		super();
	}
	public GoodsDetail(int gdid, Goods gid, String gdimage) {
		super();
		this.gdid = gdid;
		this.gid = gid;
		this.gdimage = gdimage;
	}

	

}
