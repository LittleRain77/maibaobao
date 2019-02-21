package com.smallapple.mbb.vo;

public class Admin {
	private String aid;
	private String aname;
	private String apass;
	private String asex;
	private String aimage;
	private String apower;
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	public String getAsex() {
		return asex;
	}
	public void setAsex(String asex) {
		this.asex = asex;
	}
	public String getAimage() {
		return aimage;
	}
	public void setAimage(String aimage) {
		this.aimage = aimage;
	}
	public String getApower() {
		return apower;
	}
	public void setApower(String apower) {
		this.apower = apower;
	}
	public Admin() {
		super();
	}
	public Admin(String aid, String aname, String apass, String asex,
			String aimage, String apower) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.apass = apass;
		this.asex = asex;
		this.aimage = aimage;
		this.apower = apower;
	}
	public Admin(String aid, String apass) {
		super();
		this.aid = aid;
		this.apass = apass;
	}
	
	
	public Admin(String aid, String aname, String apass, String asex,
			 String apower) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.apass = apass;
		this.asex = asex;
		this.apower = apower;
	}
	

}
