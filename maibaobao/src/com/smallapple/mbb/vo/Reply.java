package com.smallapple.mbb.vo;

public class Reply {
    private int rid;
    private int fid;
    private String aid;
    private String rtext;
    private String rtime;
    private Feedback fb;
    
	
	public Feedback getFb() {
		return fb;
	}
	
	public void setFb(Feedback fb) {
		this.fb = fb;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getRtext() {
		return rtext;
	}
	public void setRtext(String rtext) {
		this.rtext = rtext;
	}
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	public Reply() {
		super();
	}

	public Reply(int rid, int fid, String aid, String rtext, String rtime,
			Feedback fb) {
		super();
		this.rid = rid;
		this.fid = fid;
		this.aid = aid;
		this.rtext = rtext;
		this.rtime = rtime;
		this.fb = fb;
	}
	
    
}
