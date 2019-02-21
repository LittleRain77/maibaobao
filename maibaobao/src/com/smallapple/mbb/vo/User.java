package com.smallapple.mbb.vo;

public class User {
	private String uid;
	private String unickname;
	private String upass;
	private String usex;
	private String ubirthday;
	private String ustatus;
	private String uimage;
	private String uphone;
	private String uemail;
	private String uaddress;
	private String uprovince;
	private String ucity;
	private int ubeen;
	private int upower;
	
	public String getUnickname() {
		return unickname;
	}
	public void setUnickname(String unickname) {
		this.unickname = unickname;
	}
	public String getUprovince() {
		return uprovince;
	}
	public void setUprovince(String uprovince) {
		this.uprovince = uprovince;
	}
	public String getUcity() {
		return ucity;
	}
	public void setUcity(String ucity) {
		this.ucity = ucity;
	}
	public String getUstatus() {
		return ustatus;
	}
	public void setUstatus(String ustatus) {
		this.ustatus = ustatus;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(String ubirthday) {
		this.ubirthday = ubirthday;
	}
	public String getUimage() {
		return uimage;
	}
	public void setUimage(String uimage) {
		this.uimage = uimage;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUaddress() {
		return uaddress;
	}
	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}
	public int getUbeen() {
		return ubeen;
	}
	public void setUbeen(int ubeen) {
		this.ubeen = ubeen;
	}
	public int getUpower() {
		return upower;
	}
	public void setUpower(int upower) {
		this.upower = upower;
	}

	public User(String uid, String usex, String ubirthday, String ustatus,
			String uimage, String uphone, String uemail, String uaddress,
			int ubeen, int upower) {
		super();
		this.uid = uid;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.ustatus = ustatus;
		this.uimage = uimage;
		this.uphone = uphone;
		this.uemail = uemail;
		this.uaddress = uaddress;
		this.ubeen = ubeen;
		this.upower = upower;
	}
	public User() {
		super();
	}
	public User(String uid, String upass) {
		super();
		this.uid = uid;
		this.upass = upass;
	}
	public User(String uid, String unickname, String upass, String usex,
			String ubirthday, String ustatus, String uimage, String uphone,
			String uemail, String uaddress, String uprovince, String ucity,
			int ubeen, int upower) {
		super();
		this.uid = uid;
		this.unickname = unickname;
		this.upass = upass;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.ustatus = ustatus;
		this.uimage = uimage;
		this.uphone = uphone;
		this.uemail = uemail;
		this.uaddress = uaddress;
		this.uprovince = uprovince;
		this.ucity = ucity;
		this.ubeen = ubeen;
		this.upower = upower;
	}
	public User(String uid, String uimage, int ubeen,
			int upower, String unickname) {
		super();
		this.uid = uid;
		this.unickname = unickname;
		this.uimage = uimage;
		this.ubeen = ubeen;
		this.upower = upower;
	}
	

}
