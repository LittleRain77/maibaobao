package com.smallapple.mbb.vo;

import java.util.Collection;

public class Orders {
	private String oid;
	private String uid;
	private String oaddress;
	private String ousername;
	private String ophone;
	private String opaymenttype;
	private String otime;
	private String ostatus;
	private Collection<Car> list;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getOaddress() {
		return oaddress;
	}
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}
	public String getOusername() {
		return ousername;
	}
	public void setOusername(String ousername) {
		this.ousername = ousername;
	}
	public String getOphone() {
		return ophone;
	}
	public void setOphone(String ophone) {
		this.ophone = ophone;
	}
	public String getOpaymenttype() {
		return opaymenttype;
	}
	public void setOpaymenttype(String opaymenttype) {
		this.opaymenttype = opaymenttype;
	}
	public String getOtime() {
		return otime;
	}
	public void setOtime(String otime) {
		this.otime = otime;
	}
	public String getOstatus() {
		return ostatus;
	}
	public void setOstatus(String ostatus) {
		this.ostatus = ostatus;
	}
	public Collection<Car> getList() {
		return list;
	}
	public void setList(Collection<Car> list) {
		this.list = list;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(String oid, String uid, String oaddress, String ousername,
			String ophone, String opaymenttype, String otime, String ostatus,
			Collection<Car> list) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.oaddress = oaddress;
		this.ousername = ousername;
		this.ophone = ophone;
		this.opaymenttype = opaymenttype;
		this.otime = otime;
		this.ostatus = ostatus;
		this.list = list;
	}
	
	
}
