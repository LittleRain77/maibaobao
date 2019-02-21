package com.smallapple.mbb.vo;

public class Collect {
	private int cid;
	private String uid;
	private Goods gds;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Goods getGds() {
		return gds;
	}
	public void setGds(Goods gds) {
		this.gds = gds;
	}
	public Collect(int cid, String uid, Goods gds) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.gds = gds;
	}
	public Collect() {
		super();
	}

	

}
