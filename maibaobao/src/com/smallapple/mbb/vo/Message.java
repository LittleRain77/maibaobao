package com.smallapple.mbb.vo;

public class Message {
	private int mid;
	private String mtext;
	private String mtime;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMtext() {
		return mtext;
	}
	public void setMtext(String mtext) {
		this.mtext = mtext;
	}
	public String getMtime() {
		return mtime;
	}
	public void setMtime(String mtime) {
		this.mtime = mtime;
	}
	public Message(int mid, String mtext, String mtime) {
		super();
		this.mid = mid;
		this.mtext = mtext;
		this.mtime = mtime;
	}
	public Message(int mid, String mtext) {
		super();
		this.mid = mid;
		this.mtext = mtext;
	}
	public Message() {
		super();
	}

}
