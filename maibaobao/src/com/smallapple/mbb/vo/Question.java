package com.smallapple.mbb.vo;

public class Question {
	private int qid;
	private String uid;
	private Goods gds;
	private String qtype;
	private String qtext;
	private String qtime;
	
	public int getQid() {
		return qid;
	}
	
	public void setQid(int qid) {
		this.qid = qid;
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
	
	public String getQtype() {
		return qtype;
	}
	
	public void setQtype(String qtype) {
		this.qtype = qtype;
	}
	
	public String getQtext() {
		return qtext;
	}
	
	public void setQtext(String qtext) {
		this.qtext = qtext;
	}
	
	public String getQtime() {
		return qtime;
	}
	
	public void setQtime(String qtime) {
		this.qtime = qtime;
	}

	public Question() {
		super();
	}

	public Question(int qid, String uid, Goods gds, String qtype, String qtext,
			String qtime) {
		super();
		this.qid = qid;
		this.uid = uid;
		this.gds = gds;
		this.qtype = qtype;
		this.qtext = qtext;
		this.qtime = qtime;
	}
	

}
