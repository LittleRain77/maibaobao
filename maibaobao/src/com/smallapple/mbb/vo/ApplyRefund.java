package com.smallapple.mbb.vo;

public class ApplyRefund {
	private int arid;
	private String uid;
	private int gid;
	private String arreason;
	private String artext;
	private String arstatus;
	public int getArid() {
		return arid;
	}
	public void setArid(int arid) {
		this.arid = arid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getArreason() {
		return arreason;
	}
	public void setArreason(String arreason) {
		this.arreason = arreason;
	}
	public String getArtext() {
		return artext;
	}
	public void setArtext(String artext) {
		this.artext = artext;
	}
	public String getArstatus() {
		return arstatus;
	}
	public void setArstatus(String arstatus) {
		this.arstatus = arstatus;
	}
	public ApplyRefund(int arid, String uid, int gid, String arreason,
			String artext, String arstatus) {
		super();
		this.arid = arid;
		this.uid = uid;
		this.gid = gid;
		this.arreason = arreason;
		this.artext = artext;
		this.arstatus = arstatus;
	}
	public ApplyRefund() {
		super();
	}
	public ApplyRefund(int gid, String arstatus) {
		super();
		this.gid = gid;
		this.arstatus = arstatus;
	}
	

}
