package com.smallapple.mbb.vo;

public class Feedback {
	private int fid;
	private String uid;
	private String ftext;
	private String ftime;
	private String ftype;
	private String fphone;
	private String fQQ;
	private String femail;
	private String fwang;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getFtext() {
		return ftext;
	}
	public void setFtext(String ftext) {
		this.ftext = ftext;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	public String getFtype() {
		return ftype;
	}
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	public String getFphone() {
		return fphone;
	}
	public void setFphone(String fphone) {
		this.fphone = fphone;
	}
	public String getfQQ() {
		return fQQ;
	}
	public void setfQQ(String fQQ) {
		this.fQQ = fQQ;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getFwang() {
		return fwang;
	}
	public void setFwang(String fwang) {
		this.fwang = fwang;
	}
	public Feedback() {
		super();
	}
	public Feedback(int fid, String uid, String ftext, String ftime,
			String ftype, String fphone, String fQQ, String femail, String fwang) {
		super();
		this.fid = fid;
		this.uid = uid;
		this.ftext = ftext;
		this.ftime = ftime;
		this.ftype = ftype;
		this.fphone = fphone;
		this.fQQ = fQQ;
		this.femail = femail;
		this.fwang = fwang;
	}
	public Feedback(int fid, String uid, String ftext) {
		super();
		this.fid = fid;
		this.uid = uid;
		this.ftext = ftext;
	}
	
	
	

}
