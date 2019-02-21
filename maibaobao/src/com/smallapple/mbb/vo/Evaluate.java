package com.smallapple.mbb.vo;

public class Evaluate {
	private int eid;
	private Goods gds;
	private String uid;
	private String etext;
	private String etime;
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public Goods getGds() {
		return gds;
	}
	
	public void setGds(Goods gds) {
		this.gds = gds;
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getEtext() {
		return etext;
	}
	
	public void setEtext(String etext) {
		this.etext = etext;
	}
	
	public String getEtime() {
		return etime;
	}
	
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public Evaluate() {
		super();
	}
	public Evaluate(int eid, Goods gds, String uid, String etext, String etime) {
		super();
		this.eid = eid;
		this.gds = gds;
		this.uid = uid;
		this.etext = etext;
		this.etime = etime;
	}
	
}
